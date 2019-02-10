package com.what.eat.domain;


import java.io.Serializable;
import java.util.List;

public class Result<E> implements Serializable{

	private static final long serialVersionUID = -7088674517561698718L;

	private boolean isSuccessfull;
	
	private int statusCode=200;

	private E entity;
	
	private List<E> entities;
	

	private String message;
	private String code;

	private Integer pageNum = 0;
	private Integer totalNum = 0;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Result(){}

	public Result(int statusCode, boolean isSuccessfull){
		this.isSuccessfull=isSuccessfull;
		this.statusCode=statusCode;
	}

	public Result(String message, String code) {
		this.message = message;
		this.code = code;
	}

	public Result(boolean isSuccessfull, String code) {
		this.isSuccessfull = isSuccessfull;
		this.code = code;
	}

	public boolean isSuccessfull() {
		return isSuccessfull;
	}

	public void setSuccessfull(boolean isSuccessfull) {
		this.isSuccessfull = isSuccessfull;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public E getEntity() {
		return entity;
	}

	public void setEntity(E entity) {
		this.entity = entity;
	}

	public List<E> getEntities() {
		return entities;
	}

	public void setEntities(List<E> entities) {
		this.entities = entities;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setFaildResult( String code,String message){
		this.isSuccessfull=false;
		this.code=code;
		this.message=message;
	};
	
}
