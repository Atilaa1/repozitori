package cs101.dz13;

public class PasswordException extends FormException {

    public PasswordException() {
    }

    public PasswordException(String string) {
        super(string);
    }

    public PasswordException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PasswordException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PasswordException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
