package Day7ExceptionPractice;

public class NameFormatException extends RuntimeException{
    //细节:1.运行时:RuntimeException:由于参数错误导致的异常
    //2.编译时异常:Exception:提醒程序员检查本地异常

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }

    public NameFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameFormatException(Throwable cause) {
        super(cause);
    }

    public NameFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
