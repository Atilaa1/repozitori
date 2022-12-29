package cs101.dz13;

public class UsernameException extends FormException {

    public UsernameException() {
    }

    public UsernameException(String string) {
        super(string);
    }

    public UsernameException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public UsernameException(Throwable thrwbl) {
        super(thrwbl);
    }

    public UsernameException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
