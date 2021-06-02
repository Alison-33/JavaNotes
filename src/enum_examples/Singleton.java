package enum_examples;

public class Singleton {
	
	
	// A private constructor to prevent the object from being created from outside.
	private Singleton() {
	
	}
	
	public enum SingletonEnum{
		
		SEED; // the only enum
		
		private Singleton singleton;
		
		SingletonEnum(){
			
			// the actual object is constructed here!
			singleton = new Singleton(); 
		}
		
		
		public Singleton getInstance() {
			return singleton;
		}
		
		
	}
	
	// the only way that can get the object from outside
	public static Singleton getInstance() {
		return SingletonEnum.SEED.getInstance();
	}

}
