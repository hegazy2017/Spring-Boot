package com.Academia.error;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.Academia.entity.MsgStatus;




@ControllerAdvice
public class ErrorResponse {

	private String msg_code;
	private String trx_id;
	private LocalDateTime date;
	private MsgStatus status;
	private List<String> details;
	
	public ErrorResponse(String msg_code, String trx_id,MsgStatus status) {
		super();
		this.msg_code = msg_code;
		this.trx_id = trx_id;
		this.date=LocalDateTime.now();
		this.status = status;
		
	}
	public ErrorResponse(String msg_code,List<String> details) {
		super();
		this.msg_code = msg_code;
		this.date=LocalDateTime.now();
		this.details = details;
		
	}
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the msg_code
	 */
	public String getMsg_code() {
		return msg_code;
	}
	/**
	 * @param msg_code the msg_code to set
	 */
	public void setMsg_code(String msg_code) {
		this.msg_code = msg_code;
	}
	/**
	 * @return the trx_id
	 */
	public String getTrx_id() {
		return trx_id;
	}
	/**
	 * @param trx_id the trx_id to set
	 */
	public void setTrx_id(String trx_id) {
		this.trx_id = trx_id;
	}
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @return the status
	 */
	public MsgStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(MsgStatus status) {
		this.status = status;
	}
	/**
	 * @return the details
	 */
	public List<String> getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	

}