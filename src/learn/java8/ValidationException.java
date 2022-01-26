package learn.java8;

public class ValidationException extends RuntimeException {

	public ValidationException(String message) {
		System.out.println(message);
	}
}
