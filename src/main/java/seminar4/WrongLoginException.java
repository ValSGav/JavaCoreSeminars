package seminar4;

public class WrongLoginException extends RuntimeException {

    protected boolean itSWrong;

    @Override
    public String getMessage() {
        return String.format("%sThe login must be less than 20 characters long.%s"
                , itSWrong ? "Wrong!" : ""
                , itSWrong ? "" : " That's right!");
    }

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String login, int maxlength) {
        this();
        itSWrong = login.length() > maxlength;
    }

    public WrongLoginException(String login) {
        this(login, 20);
    }
}
