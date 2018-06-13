package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品厂家地址市区表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemFactoryAddressCity implements Serializable {

	/*
	 * 商品厂家地址市区表id
	 */
	private Integer upload_item_factory_address_city_id;
	/*
	 * 商品厂家地址市区名称
	 */
	private String upload_item_factory_address_city_name;
	
	/*
	 * 商品厂家省级名称
	 */
	private String upload_item_factory_address_name;
	
	public String getUpload_item_factory_address_name() {
		return upload_item_factory_address_name;
	}

	public void setUpload_item_factory_address_name(String upload_item_factory_address_name) {
		this.upload_item_factory_address_name = upload_item_factory_address_name;
	}

	public Integer getUpload_item_factory_address_city_id() {
		return upload_item_factory_address_city_id;
	}

	public void setUpload_item_factory_address_city_id(Integer upload_item_factory_address_city_id) {
		this.upload_item_factory_address_city_id = upload_item_factory_address_city_id;
	}

	public String getUpload_item_factory_address_city_name() {
		return upload_item_factory_address_city_name;
	}

	public void setUpload_item_factory_address_city_name(String upload_item_factory_address_city_name) {
		this.upload_item_factory_address_city_name = upload_item_factory_address_city_name;
	}

	@Override
	public String toString() {
		return "UploadItemFactoryAddressCity [upload_item_factory_address_city_id="
				+ upload_item_factory_address_city_id + ", upload_item_factory_address_city_name="
				+ upload_item_factory_address_city_name + "]";
	}

}
