package com.jason.pandaLock.core.exception;
/**
 * @author 作者 E-mail:ruanjianlxm@sina.com
 * @version 创建时间：2015年9月11日 下午10:55:51
 * 类说明
 */
public class PandaLockException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PandaLockException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PandaLockException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PandaLockException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PandaLockException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PandaLockException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
