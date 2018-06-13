package com.MultilingualQuotient.service;

import java.util.List;

/**
 * 希腊语业务逻辑层
 * 
 * @author 念阿郎
 *
 */
public interface GrUploadItemService {
	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	List<String> quaryGrItemKindName() throws Exception;

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	List<String> quaryGrItemKindDetailName(String upload_item_kind_name) throws Exception;

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	List<String> quaryGrItemOriginName();

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	List<String> quaryGrItemOriginCityName(String upload_item_origin_name);

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	List<String> quaryGrItemOriginCountyName(String upload_item_origin_county_name);

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	List<String> quaryGrItemTTMUnit(String upload_item_TTM_unit_status);

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	List<String> quaryGrItemCharacterParameter(String status);

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	List<String> quaryGrItemSaveMethod();

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	List<String> quaryGrItemFactoryAddressName();

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	List<String> quaryGrItemFactoryAddressCityName(String upload_item_factory_address_name);

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	List<String> quaryGrItemFactoryAddressCountyName(String upload_item_factory_address_city_name);
}
