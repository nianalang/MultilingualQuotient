package com.MultilingualQuotient.service;

import java.util.List;

/**
 * 土耳其语业务逻辑层
 * 
 * @author 念阿郎
 *
 */
public interface TuUploadItemService {
	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	List<String> quaryTuItemKindName() throws Exception;

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	List<String> quaryTuItemKindDetailName(String upload_item_kind_name) throws Exception;

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	List<String> quaryTuItemOriginName();

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	List<String> quaryTuItemOriginCityName(String upload_item_origin_name);

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	List<String> quaryTuItemOriginCountyName(String upload_item_origin_county_name);

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	List<String> quaryTuItemTTMUnit(String upload_item_TTM_unit_status);

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	List<String> quaryTuItemCharacterParameter(String status);

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	List<String> quaryTuItemSaveMethod();

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	List<String> quaryTuItemFactoryAddressName();

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	List<String> quaryTuItemFactoryAddressCityName(String upload_item_factory_address_name);

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	List<String> quaryTuItemFactoryAddressCountyName(String upload_item_factory_address_city_name);
}
