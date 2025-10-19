/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

/**
 *
 * @author Usuario
 */
public class EdadInvalidaException extends RuntimeException {

    public EdadInvalidaException() {
    }

    public EdadInvalidaException(String message) {
        super("La edad debe ser valida! Mayor de 0 y no negativa");
    }

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }

    public EdadInvalidaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
