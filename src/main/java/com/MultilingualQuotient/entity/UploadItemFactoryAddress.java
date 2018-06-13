package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品厂家地址表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemFactoryAddress implements Serializable {

	/*
	 * 商品厂家地址表id
	 */
	private Integer upload_item_factory_address_id;
	/*
	 * 商品厂家地址名称
	 */
	private String upload_item_factory_address_name;
	

	public Integer getUpload_item_factory_address_id() {
		return upload_item_factory_address_id;
	}

	public void setUpload_item_factory_address_id(Integer upload_item_factory_address_id) {
		this.upload_item_factory_address_id = upload_item_factory_address_id;
	}

	public String getUpload_item_factory_address_name() {
		return upload_item_factory_address_name;
	}

	public void setUpload_item_factory_address_name(String upload_item_factory_address_name) {
		this.upload_item_factory_address_name = upload_item_factory_address_name;
	}

	@Override
	public String toString() {
		return "UploadItemFactoryAddress [upload_item_factory_address_id=" + upload_item_factory_address_id
				+ ", upload_item_factory_address_name=" + upload_item_factory_address_name + "]";
	}
}
