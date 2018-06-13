package com.MultilingualQuotient.dto;

import java.io.Serializable;

/**
 * 
 * @author 郎媛勤 DTO:完成WEB层到Service层的数据传递 所有的ajax请求的返回类型封装JSON结果
 * @param <T>
 */
@SuppressWarnings("serial")
public class MultilingualQuotientResult<T> implements Serializable {

	/**
	 * 成功的标志
	 */
	private boolean success;

	/**
	 * 数据
	 */
	private T data;

	/**
	 * 错误的原因
	 */
	private String error;

	/**
	 * 上传商品的id，查询时使用
	 */
	private int uploadId;

	public int getUploadId() {
		return uploadId;
	}

	public void setUploadId(int uploadId) {
		this.uploadId = uploadId;
	}

	/**
	 * 正确的数据
	 * 
	 * @param success
	 * @param data
	 */
	public MultilingualQuotientResult(boolean success, T data, int uploadId) {
		super();
		this.success = success;
		this.data = data;
		this.uploadId = uploadId;
	}

	/**
	 * 正确的数据
	 * 
	 * @param success
	 * @param data
	 */
	public MultilingualQuotientResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	/**
	 * 错误的标志和原因
	 * 
	 * @param success
	 * @param error
	 */
	public MultilingualQuotientResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
