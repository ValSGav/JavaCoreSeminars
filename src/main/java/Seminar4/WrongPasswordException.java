package Seminar4;

public class WrongPasswordException extends WrongLoginException{


    protected boolean itDoesntMatch;

    @Override
    public String getMessage() {

        return String.format("%s%s%s %s"
                , itSWrong ? "Wrong!" : ""
                , "The password must be less than 20 characters long."
                , itSWrong ? "" : " That's right!"
                , itDoesntMatch ? "; Password and confirm don't match": "");
    }

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String password, String confirm, int maxLength) {
        super(password, maxLength);
        itDoesntMatch = !password.equals(confirm);
    }

    public WrongPasswordException(String password, String confirm){
        this(password, confirm, 20);
    }
}
