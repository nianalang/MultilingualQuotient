package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 商品单位表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class UploadItemTTMUnit implements Serializable {

	/*
	 * 商品单位表id
	 */
	private Integer upload_item_TTM_unit_id;
	/*
	 * 标志位 0表示 价格的单位 1表示重量的单位
	 */
	private String upload_item_TTM_unit_status;
	/*
	 * 单位名称
	 */
	private String upload_item_TTM_unit_rate;

	public Integer getUpload_item_TTM_unit_id() {
		return upload_item_TTM_unit_id;
	}

	public void setUpload_item_TTM_unit_id(Integer upload_item_TTM_unit_id) {
		this.upload_item_TTM_unit_id = upload_item_TTM_unit_id;
	}

	public String getUpload_item_TTM_unit_status() {
		return upload_item_TTM_unit_status;
	}

	@Override
	public String toString() {
		return "UploadItemTTMUnit [upload_item_TTM_unit_id=" + upload_item_TTM_unit_id
				+ ", upload_item_TTM_unit_status=" + upload_item_TTM_unit_status + ", upload_item_TTM_unit_rate="
				+ upload_item_TTM_unit_rate + "]";
	}

	public void setUpload_item_TTM_unit_status(String upload_item_TTM_unit_status) {
		this.upload_item_TTM_unit_status = upload_item_TTM_unit_status;
	}

	public String getUpload_item_TTM_unit_rate() {
		return upload_item_TTM_unit_rate;
	}

	public void setUpload_item_TTM_unit_rate(String upload_item_TTM_unit_rate) {
		this.upload_item_TTM_unit_rate = upload_item_TTM_unit_rate;
	}
}
