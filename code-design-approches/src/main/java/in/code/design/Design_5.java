package in.code.design;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Design_5 {
	
	public static void main(String[] args)  {
		try {
			System.out.println(getDiscountOnAge(-12));
		} catch (Exception e) {
			log.error("Exception occured : " , e);
		}
		System.out.println(getDiscountOnAge(65));
		System.out.println(getDiscountOnAge(45));
		System.out.println(getDiscountOnAge(34));
		
		
	}
	
	/*
	 * Here learning is that your code should be able to respond for postive and negative both cases
	 * Your code should be in posistion to handle negative scenarios also like in this case if age is passed as negative value 
	 * then what will happend just think it beofore assuming that it's done
	 */
	public static int getDiscountOnAge(Integer age) {
		if (age > 60) {
			return 5;
		} else if (age > 45) {
			return 10;
		} else if (age > 30) {
			return 15;
		} else {
			throw new RuntimeException("age should not be negative"); // Handling negative scenaries is a good job
		}
	}

}
