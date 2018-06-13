package com.MultilingualQuotient.dao;

import java.util.List;

import com.MultilingualQuotient.entity.UploadItem;
import com.MultilingualQuotient.entity.UploadItemCharacterParameter;
import com.MultilingualQuotient.entity.UploadItemFactoryAddress;
import com.MultilingualQuotient.entity.UploadItemFactoryAddressCity;
import com.MultilingualQuotient.entity.UploadItemFactoryAddressCounty;
import com.MultilingualQuotient.entity.UploadItemKind;
import com.MultilingualQuotient.entity.UploadItemKindDetail;
import com.MultilingualQuotient.entity.UploadItemOrigin;
import com.MultilingualQuotient.entity.UploadItemOriginCity;
import com.MultilingualQuotient.entity.UploadItemOriginCounty;
import com.MultilingualQuotient.entity.UploadItemSaveMethod;
import com.MultilingualQuotient.entity.UploadItemTTMUnit;

/**
 * 商品上传的Dao接口
 * 
 * @author runner
 *
 */
public interface UploadItemDao {

	/**
	 * 插入一条商品数据(中文)
	 * 
	 * @param uploadItem
	 *            商品的实例
	 * @return 数据库执行的结果
	 */
	int insertUploadItem(UploadItem uploadItem);

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	List<UploadItemKind> quaryItemKind();

	/**
	 * 查询商品的种类细节
	 * 
	 * @param upload_item_kind_name
	 *            商品的种类的名字
	 * 
	 * @return 商品的种类细节的集合
	 */
	List<UploadItemKindDetail> quaryItemKindDetail(String upload_item_kind_name);

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	List<UploadItemOrigin> quaryItemOrigin();

	/**
	 * 查询商品产地市级表
	 * 
	 * @param upload_item_origin_name
	 *            产地省级表名字
	 * @return 查询商品产地市级表的集合
	 */
	List<UploadItemOriginCity> quaryItemOriginCity(String upload_item_origin_name);


	/**
	 * 查询商品产地县级表
	 * 
	 * @param upload_item_origin_county_name
	 *            产地市级表名字
	 * @return 查询商品产地县级表的集合
	 */
	List<UploadItemOriginCounty> quaryItemOriginCounty(String upload_item_origin_city_name);

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	List<UploadItemTTMUnit> quaryItemTTMUnit(String upload_item_TTM_unit_status);

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	List<UploadItemCharacterParameter> quaryItemCharacterParameter();

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	List<UploadItemSaveMethod> quaryItemSaveMethod();

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	List<UploadItemFactoryAddress> quaryItemFactoryAddress();

	/**
	 * 商品厂家地址市区表
	 * 
	 * @param upload_item_factory_address_name
	 *            商品厂家名字
	 * @return 商品厂家地址市区表的集合
	 */
	List<UploadItemFactoryAddressCity> quaryItemFactoryAddressCity(String upload_item_factory_address_name);

	/**
	 * 商品厂家地址地区表
	 * 
	 * @param upload_item_factory_address_city_name 商品厂家地址市区表名字
	 * @return 商品厂家地址地区表的集合
	 */
	List<UploadItemFactoryAddressCounty> quaryItemFactoryAddressCounty(String upload_item_factory_address_city_name);

	/**
	 * 通过id查数据
	 * @param upload_item_id
	 * @return
	 */
	UploadItem queryUploadItemById(int upload_item_id);

}
