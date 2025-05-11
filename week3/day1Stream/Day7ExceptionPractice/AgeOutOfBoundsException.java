package Day7ExceptionPractice;

public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException(String message) {
        super(message);
    }

    public AgeOutOfBoundsException() {
    }
}
