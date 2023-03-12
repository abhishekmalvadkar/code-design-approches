package in.code.design;

public class Design_3 {
	
	public static void main(String[] args) {
		System.out.println(SingletonClass.getInstance().hashCode());// 305808283
		System.out.println(SingletonClass.getInstance().hashCode());// 305808283
	}

}

class SingletonClass {
	
	private static final SingletonClass SINGLETON = new SingletonClass();

	public static SingletonClass getInstance() {
		return SINGLETON;
	}
	
	
	
}
