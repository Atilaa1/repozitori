/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mile
 */
public class NoOperandException extends Exception 
{

    public NoOperandException() {
    }

    public NoOperandException(String message) {
        super(message);
    }

    public NoOperandException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoOperandException(Throwable cause) {
        super(cause);
    }

    public NoOperandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
