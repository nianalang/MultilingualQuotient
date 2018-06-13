package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品保存方式表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemSaveMethod implements Serializable {

	/*
	 * 商品保存方式表id
	 */
	private Integer upload_item_save_method_id;
	/*
	 * 保存方式
	 */
	private String upload_item_save_method;

	@Override
	public String toString() {
		return "UploadItemSaveMethod [upload_item_save_method_id=" + upload_item_save_method_id
				+ ", upload_item_save_method=" + upload_item_save_method + "]";
	}

	public Integer getUpload_item_save_method_id() {
		return upload_item_save_method_id;
	}

	public void setUpload_item_save_method_id(Integer upload_item_save_method_id) {
		this.upload_item_save_method_id = upload_item_save_method_id;
	}

	public String getUpload_item_save_method() {
		return upload_item_save_method;
	}

	public void setUpload_item_save_method(String upload_item_save_method) {
		this.upload_item_save_method = upload_item_save_method;
	}
}
