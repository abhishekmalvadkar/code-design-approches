package in.code.design;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Design_6 {

	public static void main(String[] args) {
		try {
			System.out.println(getDiscountOnAge(-12));
		} catch (Exception e) {
			log.error("Exception occured : ", e);
		}
		System.out.println(getDiscountOnAge(65));
		System.out.println(getDiscountOnAge(45));
		System.out.println(getDiscountOnAge(34));

	}

	/*
	 * Here learnig is that , As we can see every if statement has return statement
	 * so we can put last throw statement direclty outside of any if or else like
	 * below
	 */
	public static int getDiscountOnAge(Integer age) {
		if (age > 60) {
			return 5;
		} else if (age > 45) {
			return 10;
		} else if (age > 30) {
			return 15;
		}
		throw new RuntimeException("age should not be negative"); // Handling negative scenaries is a good job

		// Bad code
		//		if (age > 60) {
		//			return 5;
		//		} else if (age > 45) {
		//			return 10;
		//		} else if (age > 30) {
		//			return 15;
		//		} else {
		//			throw new RuntimeException("age should not be negative"); // Handling negative scenaries is a good job
		//		}
	}

}
