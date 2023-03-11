package in.code.design;

/*
 * 
 * Company project compyrights will come here just after package statement
 * 
 */
// imports comes here just after copy right comment
import java.util.HashMap;

/**
 * About Responsibiities of this class
 * 
 * @see HashMap - you can give other classes refernce using see anotation so developer can go by ctrl+
 * 			       click
 * 
 * - You can give multiple authors using author annotations
 * @author Abhishek Malvadkar
 * @author Rushikesh Malvadkar
 *
 */
public class DesignOne {
	
	/*
	 * Here we have learned how to return control from method
	 */
	
	public void doSomething(Integer number) {
		if (number < 0) {
			return; // Returning control
		}
		
		System.out.println("Data processed....");
		
	}
	
	public static void main(String[] args) {
		DesignOne designOne = new DesignOne();
		designOne.doSomething(1);
		designOne.doSomething(-1);
		designOne.doSomething(2);
		
	}
	


}
