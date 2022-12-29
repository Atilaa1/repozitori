package cs101.dz13;

public class FormException extends Exception {

    public FormException() {
    }

    public FormException(String string) {
        super(string);
    }

    public FormException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public FormException(Throwable thrwbl) {
        super(thrwbl);
    }

    public FormException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
