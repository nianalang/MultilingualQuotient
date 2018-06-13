package com.MultilingualQuotient.service;

import java.util.List;

/**
 * 藏语业务逻辑层
 * @author 念阿郎
 *
 */
public interface TiUploadItemService {
	/**
	 * 查询商品的种类
	 * @return  商品种类的集合
	 */
	List<String> quaryTiItemKindName()  throws Exception;
	
	/**
	 * 查询商品种类的细节
	 * @param upload_item_kind_name
	 * @return
	 */
	List<String> quaryTiItemKindDetailName(String upload_item_kind_name)  throws Exception;
	
	
	/**
	 * 查询商品产地省级表
	 * @return  查询商品产地省级表的集合
	 */
	List<String> quaryTiItemOriginName() ;
	
	
	/**
	 * 查询商品产地市级表
	 * @return  查询商品产地市级表的集合
	 */
	List<String>  quaryTiItemOriginCityName(String upload_item_origin_name);
	
	/**
	 * 查询商品产地县级表
	 * @return  查询商品产地县级表的集合
	 */
	List<String> quaryTiItemOriginCountyName(String upload_item_origin_county_name);
	
	
	/**
	 * 商品单位表
	 * @param upload_item_TTM_unit_status 状态
	 * @return 商品单位表的集合
	 */
	List<String> quaryTiItemTTMUnit(String upload_item_TTM_unit_status);
	
	/**
	 * 商品特征参数表
	 * @return 商品特征参数表的集合
	 */
	 List<String> quaryTiItemCharacterParameter(String status);
	
	/**
	 * 商品保存方式表
	 * @return 商品保存方式表的集合
	 */
	List<String> quaryTiItemSaveMethod();
	
	
	/**
	 * 商品厂家地址表
	 * @return 商品厂家地址表的集合
	 */
	List<String> quaryTiItemFactoryAddressName();
	
	/**
	 * 商品厂家地址市级表
	 * @return 商品厂家市级表的集合
	 */
	List<String> quaryTiItemFactoryAddressCityName(String upload_item_factory_address_name);
	
	/**
	 * 商品厂家地址县级表
	 * @return 商品厂家县级表的集合
	 */
	List<String> quaryTiItemFactoryAddressCountyName(String upload_item_factory_address_city_name);
}
