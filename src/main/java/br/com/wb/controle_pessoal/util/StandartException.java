package br.com.wb.controle_pessoal.util;

/**
 *
 * @author will
 */
public class StandartException extends Exception {

	private static final long serialVersionUID = 1L;

	public StandartException() {}
    
    public StandartException(String arg) {
        super(arg);
    }
    
    public StandartException(Throwable arg) {
        super(arg);
    }
    
    public StandartException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
}
