package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;

public class MyContainer<T, S> implements Containers<T, S> {
	private Map<S, T> mymap;
	
//	public void MyContrainer<T, S>(){
//		mymap = null;
//	}
	
	// Create and return a set that stores the array of T objects
	// You do not need to create your own set implementation and 
	// can use an existing set class.
	public Set<T> initSet(T[] tArray){
		HashSet<T> newHashSet = new HashSet<T>();
		for (int i = 0; i <  tArray.length; i++){
			newHashSet.add(tArray[i]);
		}
		return newHashSet;
	}
	
	// Create and return a list that stores an the array of T objects
	// You do not need to create your own list implementation and 
	// can use an existing list class.
	public List<T> initList(T[] tArray){
		LinkedList<T> newLinkedList = new LinkedList<T>();
		for (int i = 0; i < tArray.length; i++){
			newLinkedList.add(tArray[i]);
		}
		return newLinkedList;
	}
	
	// Create and return an empty map that will use type S as keys, and T as values
	// You do not need to create your own map implementation and 
	// can use an existing map class.
	public Map<S,T> initEmptyMap(){
		return new HashMap<S, T>();
	}
	
	// Store the map in a local field variable -- often called a setter
	public void storeMap(Map<S,T> mapToStoreInClass){
		mymap = mapToStoreInClass;
	}
	
	// Add a key value to the stored/local map with a boolean indicating whether to overwrite existing value
	// The return value indicates if you added the key value pair to the map
	// You do not need to check if the value changed or not (e.g. no need to compare values)
	public boolean addToMap(S key, T value, boolean overwriteExistingKey){
		if (mymap.containsKey(key) && !overwriteExistingKey) return false;
		mymap.put(key, value);
		return true;
	}
	
	// Return a value from the stored/local map based on the key
	public T getValueFromMap(S key){
		return mymap.get(key);
	}
	
	// An overloaded function to get a value from the store/local map, but with a default value
	// if the key is not present in the map.
	public T getValueFromMap(S key, T defaultValue){
		if (mymap.containsKey(key))	return mymap.get(key);
		return defaultValue;
	}

}
