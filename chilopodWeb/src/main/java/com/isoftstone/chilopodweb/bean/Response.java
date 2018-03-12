package com.isoftstone.chilopodweb.bean;

public class Response {

	private String code;
	
	private String msg;
	
	private Object data;

	public Response() {
		
	}
	
	public Response(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Response(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
