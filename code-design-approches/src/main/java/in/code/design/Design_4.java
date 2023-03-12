package in.code.design;

public class Design_4 {
	
	/*
	 * You should give boolean methods or varibales names meaningfully like
	 * - canUse
	 * - hasRole
	 * - isPublic
	 * - etc....
	 */
	
	public static void doSomething(String content) {
		if (content == null) {
			return; // if content is null then I don't want to throw any exception , I just want to return control so below code will not
			        // exceute if content is null
		}
		
		System.out.println("Data processing....");
	}
	
	public static void doSomeThingWithClassType(Class<?> classType) { // This is how we can take class type as method parameter 
		                                                             // ? means any type
		System.out.println(classType);
	}
	
	public static void main(String[] args) {
		doSomeThingWithClassType(String.class); // This is how we can pass class type as method parameter
		doSomeThingWithClassType(Design_1.class);
	}

}
