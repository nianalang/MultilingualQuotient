package com.MultilingualQuotient.service;

import java.util.List;

/**
 * English
 * 英文上传商品业务逻辑层
 * @author 念阿郎
 * 原理：将从Dao层取出来的英文转换为中文
 */
public interface EnUploadItemService {
	
	/**
	 * 查询商品的种类
	 * @return  商品种类的集合
	 */
	List<String> quaryEnItemKindName()  throws Exception;
	
	/**
	 * 查询商品种类的细节
	 * @param upload_item_kind_name
	 * @return
	 */
	List<String> quaryEnItemKindDetailName(String upload_item_kind_name)  throws Exception;
	
	
	/**
	 * 查询商品产地省级表
	 * @return  查询商品产地省级表的集合
	 */
	List<String> quaryEnItemOriginName() ;
	
	
	/**
	 * 查询商品产地市级表
	 * @return  查询商品产地市级表的集合
	 */
	List<String>  quaryEnItemOriginCityName(String upload_item_origin_name);
	
	/**
	 * 查询商品产地县级表
	 * @return  查询商品产地县级表的集合
	 */
	List<String> quaryEnItemOriginCountyName(String upload_item_origin_county_name);
	
	
	/**
	 * 商品单位表
	 * @param upload_item_TTM_unit_status 状态
	 * @return 商品单位表的集合
	 */
	List<String> quaryEnItemTTMUnit(String upload_item_TTM_unit_status);
	
	/**
	 * 商品特征参数表
	 * @return 商品特征参数表的集合
	 */
	 List<String> quaryEnItemCharacterParameter(String status);
	
	/**
	 * 商品保存方式表
	 * @return 商品保存方式表的集合
	 */
	List<String> quaryEnItemSaveMethod();
	
	
	/**
	 * 商品厂家地址表
	 * @return 商品厂家地址表的集合
	 */
	List<String> quaryEnItemFactoryAddressName();
	
	/**
	 * 商品厂家地址市级表
	 * @return 商品厂家市级表的集合
	 */
	List<String> quaryEnItemFactoryAddressCityName(String upload_item_factory_address_name);
	
	/**
	 * 商品厂家地址县级表
	 * @return 商品厂家县级表的集合
	 */
	List<String> quaryEnItemFactoryAddressCountyName(String upload_item_factory_address_city_name);
}
