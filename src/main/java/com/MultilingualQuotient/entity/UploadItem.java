package com.MultilingualQuotient.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 上传商品表
 * 
 * @author runner
 *
 */
@SuppressWarnings("serial")
public class UploadItem implements Serializable {

	/*
	 * 上传商品id
	 */
	private Integer upload_item_id;
	/*
	 * 商品种类名字
	 */
	private String upload_item_kind_name;
	/*
	 * 商品细节名字
	 */
	private String upload_item_kind_detail_name;

	/*
	 * 商品产地省级名字
	 */
	private String upload_item_origin_name;
	/*
	 * 商品市级名字
	 */
	private String upload_item_origin_city_name;

	/*
	 * 商品县级名字
	 */
	private String upload_item_origin_county_name;
	/*
	 * 上市时间(不用翻译)
	 */
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	/*@JsonFormat(pattern="yyyy-MM-dd")*/
	/*@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")*/
	private Date upload_item_TTM;
	/*
	 * 商品价格(不用翻译)
	 */
	private String upload_item_price;

	/*
	 * 商品价格的单位
	 */
	private String upload_item_price_unit;

	/*
	 * 商品供货量(不用翻译)
	 */
	private String upload_item_supply;

	/*
	 * 商品供货量的单位
	 */
	private String upload_item_supply_unit;
	/*
	 * 商品形状
	 */
	private String upload_item_character_shape;

	/*
	 * 商品颜色
	 */
	private String upload_item_character_color;
	/*
	 * 商品保存方式
	 */
	private String upload_item_save_method;
	/*
	 * 厂家地址省级名字
	 */
	private String upload_item_factory_address_name;
	/*
	 * 厂家地址市级名字
	 */
	private String upload_item_factory_address_city_name;
	/*
	 * 厂家地址县级名字
	 */
	private String upload_item_factory_address_county_name;
	/*
	 * 商家联系电话(不用翻译)
	 */
	private String upload_item_phone;
	/*
	 * 商家QQ(不用翻译)
	 */
	private String upload_item_QQ;
	public Integer getUpload_item_id() {
		return upload_item_id;
	}
	public void setUpload_item_id(Integer upload_item_id) {
		this.upload_item_id = upload_item_id;
	}
	public String getUpload_item_kind_name() {
		return upload_item_kind_name;
	}
	public void setUpload_item_kind_name(String upload_item_kind_name) {
		this.upload_item_kind_name = upload_item_kind_name;
	}
	public String getUpload_item_kind_detail_name() {
		return upload_item_kind_detail_name;
	}
	public void setUpload_item_kind_detail_name(String upload_item_kind_detail_name) {
		this.upload_item_kind_detail_name = upload_item_kind_detail_name;
	}
	public String getUpload_item_origin_name() {
		return upload_item_origin_name;
	}
	public void setUpload_item_origin_name(String upload_item_origin_name) {
		this.upload_item_origin_name = upload_item_origin_name;
	}
	public String getUpload_item_origin_city_name() {
		return upload_item_origin_city_name;
	}
	public void setUpload_item_origin_city_name(String upload_item_origin_city_name) {
		this.upload_item_origin_city_name = upload_item_origin_city_name;
	}
	public String getUpload_item_origin_county_name() {
		return upload_item_origin_county_name;
	}
	public void setUpload_item_origin_county_name(String upload_item_origin_county_name) {
		this.upload_item_origin_county_name = upload_item_origin_county_name;
	}	
	public Date getUpload_item_TTM() {
		return upload_item_TTM;
	}
	public void setUpload_item_TTM(Date upload_item_TTM) {
		this.upload_item_TTM = upload_item_TTM;
	}
	public String getUpload_item_price_unit() {
		return upload_item_price_unit;
	}
	public void setUpload_item_price_unit(String upload_item_price_unit) {
		this.upload_item_price_unit = upload_item_price_unit;
	}
	
	public String getUpload_item_price() {
		return upload_item_price;
	}
	public void setUpload_item_price(String upload_item_price) {
		this.upload_item_price = upload_item_price;
	}
	public String getUpload_item_supply() {
		return upload_item_supply;
	}
	public void setUpload_item_supply(String upload_item_supply) {
		this.upload_item_supply = upload_item_supply;
	}
	public String getUpload_item_supply_unit() {
		return upload_item_supply_unit;
	}
	public void setUpload_item_supply_unit(String upload_item_supply_unit) {
		this.upload_item_supply_unit = upload_item_supply_unit;
	}
	public String getUpload_item_character_shape() {
		return upload_item_character_shape;
	}
	public void setUpload_item_character_shape(String upload_item_character_shape) {
		this.upload_item_character_shape = upload_item_character_shape;
	}
	public String getUpload_item_character_color() {
		return upload_item_character_color;
	}
	public void setUpload_item_character_color(String upload_item_character_color) {
		this.upload_item_character_color = upload_item_character_color;
	}
	public String getUpload_item_save_method() {
		return upload_item_save_method;
	}
	public void setUpload_item_save_method(String upload_item_save_method) {
		this.upload_item_save_method = upload_item_save_method;
	}
	public String getUpload_item_factory_address_name() {
		return upload_item_factory_address_name;
	}
	public void setUpload_item_factory_address_name(String upload_item_factory_address_name) {
		this.upload_item_factory_address_name = upload_item_factory_address_name;
	}
	public String getUpload_item_factory_address_city_name() {
		return upload_item_factory_address_city_name;
	}
	public void setUpload_item_factory_address_city_name(String upload_item_factory_address_city_name) {
		this.upload_item_factory_address_city_name = upload_item_factory_address_city_name;
	}
	public String getUpload_item_factory_address_county_name() {
		return upload_item_factory_address_county_name;
	}
	public void setUpload_item_factory_address_county_name(String upload_item_factory_address_county_name) {
		this.upload_item_factory_address_county_name = upload_item_factory_address_county_name;
	}
	public String getUpload_item_phone() {
		return upload_item_phone;
	}
	public void setUpload_item_phone(String upload_item_phone) {
		this.upload_item_phone = upload_item_phone;
	}
	public String getUpload_item_QQ() {
		return upload_item_QQ;
	}
	public void setUpload_item_QQ(String upload_item_QQ) {
		this.upload_item_QQ = upload_item_QQ;
	}
}
