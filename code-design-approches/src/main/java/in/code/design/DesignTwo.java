package in.code.design;

public class DesignTwo {
	
	/*
	 * Learnig things
	 * - Usage of continue
	 * - Naming convention for utility class
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue; // if i = 5 then telling that continue for loop by skipping below code
			}
			System.out.println("Reached here for index :: " + i); // for index 5 it will not reach here
		}
	}

}

/*
 * You can name your util class by sufixed with 'Util'
 */
class DateTimeUtil{
	
}
