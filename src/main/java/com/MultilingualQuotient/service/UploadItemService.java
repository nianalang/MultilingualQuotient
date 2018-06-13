package com.MultilingualQuotient.service;

import java.util.List;

import com.MultilingualQuotient.entity.UploadItem;


/**
 * 上传商品业务逻辑层
 * 功能：从Dao层取出商品，并转换为对应的语言
 * @author runner
 *
 */
public interface UploadItemService {
	/**
	 * 查询商品的种类
	 * @return  商品种类的集合
	 */
	List<String> quaryItemKindName()  throws Exception;
	
	/**
	 * 查询商品种类的细节
	 * @param upload_item_kind_name
	 * @return
	 */
	List<String> quaryItemKindDetailName(String upload_item_kind_name)  throws Exception;
	
	
	/**
	 * 查询商品产地省级表
	 * @return  查询商品产地省级表的集合
	 */
	List<String> quaryItemOriginName() ;
	
	
	/**
	 * 查询商品产地市级表
	 * @return  查询商品产地市级表的集合
	 */
	List<String>  quaryItemOriginCityName(String upload_item_origin_name);
	
	/**
	 * 查询商品产地县级表
	 * @return  查询商品产地县级表的集合
	 */
	List<String> quaryItemOriginCountyName(String upload_item_origin_county_name);
	
	
	/**
	 * 商品单位表
	 * @param upload_item_TTM_unit_status 状态
	 * @return 商品单位表的集合
	 */
	List<String> quaryItemTTMUnit(String upload_item_TTM_unit_status);
	
	/**
	 * 商品特征参数表
	 * @return 商品特征参数表的集合
	 */
	 List<String> quaryItemCharacterParameter(String status);
	
	/**
	 * 商品保存方式表
	 * @return 商品保存方式表的集合
	 */
	List<String> quaryItemSaveMethod();
	
	
	/**
	 * 商品厂家地址表
	 * @return 商品厂家地址表的集合
	 */
	List<String> quaryItemFactoryAddressName();
	
	/**
	 * 商品厂家地址市级表
	 * @return 商品厂家市级表的集合
	 */
	List<String> quaryItemFactoryAddressCityName(String upload_item_factory_address_name);
	
	/**
	 * 商品厂家地址县级表
	 * @return 商品厂家县级表的集合
	 */
	List<String> quaryItemFactoryAddressCountyName(String upload_item_factory_address_city_name);

	
	/**
	 * 通过id查询数据
	 */
	UploadItem queryUploadItemById(int upload_item_id);
}
