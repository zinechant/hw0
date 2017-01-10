package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {

	private HW0Runner() {}
	//TODO you likely will need to add member variable
	private static final Containers<Integer, String> SingletonContainers =
			new MyContainer<Integer, String>();
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return SingletonContainers;
	}

	public static void main(String[] args){
		
	}
}
