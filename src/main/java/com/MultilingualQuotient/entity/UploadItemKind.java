package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 *	商品种类表
 * @author runner
 *
 */
@SuppressWarnings("serial")
public class UploadItemKind implements Serializable{

	/*
	 * 种类表id
	 */
	private Integer upload_item_kind_id;
	/*
	 * 商品种类名称
	 */
	private String upload_item_kind_name;


	public Integer getUpload_item_kind_id() {
		return upload_item_kind_id;
	}
	
	public void setUpload_item_kind_id(Integer upload_item_kind_id) {
		this.upload_item_kind_id = upload_item_kind_id;
	}
	public String getUpload_item_kind_name() {
		return upload_item_kind_name;
	}
	public void setUpload_item_kind_name(String upload_item_kind_name) {
		this.upload_item_kind_name = upload_item_kind_name;
	}
	@Override
	public String toString() {
		return "UploadItemKind [upload_item_kind_id=" + upload_item_kind_id + ", upload_item_kind_name="
				+ upload_item_kind_name + "]";
	}
}
