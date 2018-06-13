package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品产地市级表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemOriginCity implements Serializable {

	/*
	 * 产地市级表id
	 */
	private Integer upload_item_origin_city_id;

	/*
	 * 产地市级名称
	 */
	private String upload_item_origin_city_name;
	
	
	/*
	 * 产地省级名称
	 */
	private String upload_item_origin_name;

	public String getUpload_item_origin_name() {
		return upload_item_origin_name;
	}

	public void setUpload_item_origin_name(String upload_item_origin_name) {
		this.upload_item_origin_name = upload_item_origin_name;
	}

	public Integer getUpload_item_origin_city_id() {
		return upload_item_origin_city_id;
	}

	public void setUpload_item_origin_city_id(Integer upload_item_origin_city_id) {
		this.upload_item_origin_city_id = upload_item_origin_city_id;
	}

	public String getUpload_item_origin_city_name() {
		return upload_item_origin_city_name;
	}

	public void setUpload_item_origin_city_name(String upload_item_origin_city_name) {
		this.upload_item_origin_city_name = upload_item_origin_city_name;
	}

	@Override
	public String toString() {
		return "UploadItemOriginCity [upload_item_origin_city_id=" + upload_item_origin_city_id
				+ ", upload_item_origin_city_name=" + upload_item_origin_city_name + "]";
	}
}
