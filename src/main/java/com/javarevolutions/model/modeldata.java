package com.javarevolutions.model;

import java.io.Serializable;

public class modeldata implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1521510045806422753L;
    private int code;
    private String mensaje;
    private boolean status;
    
    public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
