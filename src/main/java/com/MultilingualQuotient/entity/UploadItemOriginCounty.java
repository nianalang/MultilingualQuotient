package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品产地县级表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemOriginCounty implements Serializable {

	/*
	 * 产地县级表id
	 */
	private Integer upload_item_origin_county_id;

	/*
	 * 产地县级名称
	 */
	private String upload_item_origin_county_name;
	
	/*
	 * 产地市级名称
	 */
	private String upload_item_origin_city_name;
	
	public String getUpload_item_origin_city_name() {
		return upload_item_origin_city_name;
	}

	public void setUpload_item_origin_city_name(String upload_item_origin_city_name) {
		this.upload_item_origin_city_name = upload_item_origin_city_name;
	}

	public Integer getUpload_item_origin_county_id() {
		return upload_item_origin_county_id;
	}

	public void setUpload_item_origin_county_id(Integer upload_item_origin_county_id) {
		this.upload_item_origin_county_id = upload_item_origin_county_id;
	}

	public String getUpload_item_origin_county_name() {
		return upload_item_origin_county_name;
	}

	public void setUpload_item_origin_county_name(String upload_item_origin_county_name) {
		this.upload_item_origin_county_name = upload_item_origin_county_name;
	}

	@Override
	public String toString() {
		return "UploadItemOriginCounty [upload_item_origin_county_id=" + upload_item_origin_county_id
				+ ", upload_item_origin_county_name=" + upload_item_origin_county_name + "]";
	}

}
