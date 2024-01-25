package seminar4;

public class CheckTheIdentificationData {
    static boolean CheckLoginPassword(String login, String password, String confirm) throws WrongLoginException, WrongPasswordException{

        if (login.length()>20){
            throw new WrongLoginException(login, 20);
        }
        if (password.length()>20 || !password.equals(confirm))
            throw new WrongPasswordException(password, confirm, 20);

        return true;
    }
}
