package jp.setlist.app.exception;
/**
 * 
 * アプリ共通例外クラス
 * @author kohei
 *
 */
public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errMsg = "";
	private Exception exception = null;
	
	
	public AppException(Exception exception,String errMsg){
		this.setErrMsg(errMsg);
		this.setException(exception);
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}


	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}
	
}
