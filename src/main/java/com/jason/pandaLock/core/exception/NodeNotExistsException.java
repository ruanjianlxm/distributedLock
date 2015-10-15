package com.jason.pandaLock.core.exception;
/**
 * @author 作者 E-mail:ruanjianlxm@sina.com
 * @version 创建时间：2015年9月11日 下午4:58:26
 * 类说明  当节点出现不存在时抛出此异常
 */
public class NodeNotExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NodeNotExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NodeNotExistsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NodeNotExistsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NodeNotExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NodeNotExistsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
