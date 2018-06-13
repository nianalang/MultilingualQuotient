package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品特征参数表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemCharacterParameter implements Serializable {

	/*
	 * 商品特征参数表id
	 */
	private Integer upload_item_character_parameter_id;
	/*
	 * 商品形状
	 */
	private String upload_item_character_parameter_form;

	/*
	 * 商品颜色
	 */
	private String upload_item_character_parameter_color;

	public Integer getUpload_item_character_parameter_id() {
		return upload_item_character_parameter_id;
	}

	public void setUpload_item_character_parameter_id(Integer upload_item_character_parameter_id) {
		this.upload_item_character_parameter_id = upload_item_character_parameter_id;
	}

	public String getUpload_item_character_parameter_form() {
		return upload_item_character_parameter_form;
	}

	public void setUpload_item_character_parameter_form(String upload_item_character_parameter_form) {
		this.upload_item_character_parameter_form = upload_item_character_parameter_form;
	}

	public String getUpload_item_character_parameter_color() {
		return upload_item_character_parameter_color;
	}

	public void setUpload_item_character_parameter_color(String upload_item_character_parameter_color) {
		this.upload_item_character_parameter_color = upload_item_character_parameter_color;
	}

	@Override
	public String toString() {
		return "UploadItemCharacterParameter [upload_item_character_parameter_id=" + upload_item_character_parameter_id
				+ ", upload_item_character_parameter_form=" + upload_item_character_parameter_form
				+ ", upload_item_character_parameter_color=" + upload_item_character_parameter_color + "]";
	}
}
