package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品产地省级表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemOrigin implements Serializable {
	/*
	 * 产地表id
	 */
	private Integer upload_item_origin_id;
	/*
	 * 产地名称
	 */
	private String upload_item_origin_name;

	@Override
	public String toString() {
		return "UploadItemOrigin [upload_item_origin_id=" + upload_item_origin_id + ", upload_item_origin_name="
				+ upload_item_origin_name + "]";
	}

	public Integer getUpload_item_origin_id() {
		return upload_item_origin_id;
	}

	public void setUpload_item_origin_id(Integer upload_item_origin_id) {
		this.upload_item_origin_id = upload_item_origin_id;
	}

	public String getUpload_item_origin_name() {
		return upload_item_origin_name;
	}

	public void setUpload_item_origin_name(String upload_item_origin_name) {
		this.upload_item_origin_name = upload_item_origin_name;
	}

}
