package except;

public class InsufficientBankAccountException extends Exception {
	public InsufficientBankAccountException (String message) {
		super(message);
	}

}
