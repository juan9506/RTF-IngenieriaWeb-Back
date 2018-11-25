package co.udea.iw.exception;
import org.apache.log4j.Logger;

/**
 * Excepcion propia para capturar tods las excepciones generadas y almacenarlas mediante log4j
 * @author Juan Esteban Andrade - Luis Marin
 *
 */
public class Exception extends java.lang.Exception {

	Logger log = Logger.getLogger(getClass());
	
	public Exception() {
		// TODO Auto-generated constructor stub
	}

	public Exception(String arg0) {
		super(arg0);
		log.error(arg0);
	}

	public Exception(Throwable arg0) {
		super(arg0);
		log.error(arg0);
	}

	public Exception(String arg0, Throwable arg1) {
		super(arg0, arg1);
		log.error(arg0, arg1);
	}

	public Exception(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		log.error(arg0, arg1);
	}

}
