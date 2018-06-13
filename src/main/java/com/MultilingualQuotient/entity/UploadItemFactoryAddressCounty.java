package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品厂家地址地区表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemFactoryAddressCounty implements Serializable {

	/*
	 * 商品厂家地址地区表id
	 */
	private Integer upload_item_factory_address_county_id;

	/*
	 * 商品厂家地址地区名称
	 */
	private String upload_item_factory_address_county_name;
	
	/*
	 * 商品厂家市级名称
	 * 
	 */
	private String upload_item_factory_address_city_name ;
	
	public String getUpload_item_factory_address_city_name() {
		return upload_item_factory_address_city_name;
	}

	public void setUpload_item_factory_address_city_name(String upload_item_factory_address_city_name) {
		this.upload_item_factory_address_city_name = upload_item_factory_address_city_name;
	}

	public Integer getUpload_item_factory_address_county_id() {
		return upload_item_factory_address_county_id;
	}

	public void setUpload_item_factory_address_county_id(Integer upload_item_factory_address_county_id) {
		this.upload_item_factory_address_county_id = upload_item_factory_address_county_id;
	}

	public String getUpload_item_factory_address_county_name() {
		return upload_item_factory_address_county_name;
	}

	public void setUpload_item_factory_address_county_name(String upload_item_factory_address_county_name) {
		this.upload_item_factory_address_county_name = upload_item_factory_address_county_name;
	}

	@Override
	public String toString() {
		return "UploadItemFactoryAddressCounty [upload_item_factory_address_county_id="
				+ upload_item_factory_address_county_id + ", upload_item_factory_address_county_name="
				+ upload_item_factory_address_county_name + "]";
	}

}
