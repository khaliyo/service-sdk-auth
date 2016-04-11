package com.ai.paas.ipaas.auth.constants;


/**
 *  认证层运行异常定义
 *
 */

public class UserClientException extends RuntimeException {
	private static final long serialVersionUID = -8886495803406807620L;
	private String errCode;
	private String errDetail;

	public UserClientException(String errDetail) {
		super(errDetail);
		this.errDetail = errDetail;
	}

	public UserClientException(String errCode, String errDetail) {
		super(errCode + ":" + errDetail);
		this.errCode = errCode;
		this.errDetail = errDetail;
	}

	public UserClientException(String errCode, Exception ex) {
		super(errCode + ":" + errCode, ex);
		this.errCode = errCode;
	}

	public UserClientException(String errCode, String errDetail, Exception ex) {
		super(errCode + ":" + errDetail, ex);
		this.errCode = errCode;
		this.errDetail = errDetail;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrDetail() {
		return errDetail;
	}

	public void setErrDetail(String errDetail) {
		this.errDetail = errDetail;
	}

}
