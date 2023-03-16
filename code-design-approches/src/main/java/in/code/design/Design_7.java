package in.code.design;

class SomethingHappenWrongException extends RuntimeException {

	private static final long serialVersionUID = -5182977898214873245L;

	/*
	 * This constructor is for if caller is not having any message to set OR he
	 * don't want to set any message he just want to raise exception
	 */
	public SomethingHappenWrongException() {
		super();
	}

	/*
	 * This constructor is for when you are wraping any exception then if you want yo give any messgae for debug purpose
	 * then also you can give that message here (Check below example of main method , we did same)
	 */
	public SomethingHappenWrongException(String message, Throwable cause) {
		super(message, cause);
	}

	/*
	 * This constructor is for if caller is having any message to set
	 */
	public SomethingHappenWrongException(String message) {
		super(message);
	}

	/*
	 * This constructor is for if caller want to wrap any other exception inside
	 * this exception like we are wraping any checked exception to make them as
	 * unchecked
	 */
	public SomethingHappenWrongException(Throwable cause) {
		super(cause);
	}

}

public class Design_7 {

	public static void main(String[] args) {

		doSomething();

	}

	public static void doSomething() {
		try {
			doSomethingMore();
		} catch (Exception e) {
			throw new SomethingHappenWrongException("Wraping it and make unchecked", e);
		}
	}

	public static void doSomethingMore() throws Exception {
		throw new Exception("Checked exception throwing with message");
	}

}

/* ===================================== OUTPUT =======================================================
 * Exception in thread "main" in.code.design.SomethingHappenWrongException: Wraping it and make unchecked at
 * in.code.design.Design_7.doSomething(Design_7.java:49) at
 * in.code.design.Design_7.main(Design_7.java:41)
 * 
 * Caused by: java.lang.Exception: Checked exception throwing with message at
 * in.code.design.Design_7.doSomethingMore(Design_7.java:54) at
 * in.code.design.Design_7.doSomething(Design_7.java:47) ... 1 more
 */