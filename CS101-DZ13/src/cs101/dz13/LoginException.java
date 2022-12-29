package cs101.dz13;

public class LoginException extends Exception {

    public LoginException() {
    }

    public LoginException(String string) {
        super(string);
    }

    public LoginException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public LoginException(Throwable thrwbl) {
        super(thrwbl);
    }

    public LoginException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
