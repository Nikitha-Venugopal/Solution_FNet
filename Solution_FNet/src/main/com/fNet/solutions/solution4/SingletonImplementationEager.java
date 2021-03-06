package main.com.fNet.solutions.solution4;

/*
 * Eager Initialization for Singleton implementation
 * 
 * */
public class SingletonImplementationEager {
	// Here the instance is created as "final" ensuring only 1 instance exists
	private static final SingletonImplementationEager instance = new SingletonImplementationEager();

	private SingletonImplementationEager() {
		/*
		 * Constructor here is made private to ensure that no one can
		 * instantiate this class
		 */
	}

	public static SingletonImplementationEager getSingletonInstance() {
		return instance;
	}

}
