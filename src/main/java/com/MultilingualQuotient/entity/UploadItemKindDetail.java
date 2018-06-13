package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品种类细节表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemKindDetail implements Serializable {
	/*
	 * 商品种类细节表id
	 */
	private Integer upload_item_kind_detail_id;
	/*
	 * 商品种类细节名称
	 */
	private String upload_item_kind_detail_name;

	/*
	 * 商品种类名称
	 */
	private String upload_item_kind_name;

	public String getUpload_item_kind_name() {
		return upload_item_kind_name;
	}

	public void setUpload_item_kind_name(String upload_item_kind_name) {
		this.upload_item_kind_name = upload_item_kind_name;
	}

	public Integer getUpload_item_kind_detail_id() {
		return upload_item_kind_detail_id;
	}

	public void setUpload_item_kind_detail_id(Integer upload_item_kind_detail_id) {
		this.upload_item_kind_detail_id = upload_item_kind_detail_id;
	}

	public String getUpload_item_kind_detail_name() {
		return upload_item_kind_detail_name;
	}

	public void setUpload_item_kind_detail_name(String upload_item_kind_detail_name) {
		this.upload_item_kind_detail_name = upload_item_kind_detail_name;
	}
}
