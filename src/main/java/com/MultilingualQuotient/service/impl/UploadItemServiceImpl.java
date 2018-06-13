package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.UploadItemDao;
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
import com.MultilingualQuotient.service.UploadItemService;

@Service("uploadItemService")
public class UploadItemServiceImpl implements UploadItemService {

	@Autowired
	private UploadItemDao uploadItemDao;

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	public List<String> quaryItemKindName() {
		// 查询数据
		List<UploadItemKind> uploadItemKinds = uploadItemDao.quaryItemKind();
		// 新建一个存String的集合
		List<String> kindNames = new ArrayList<String>();
		// 取出name，并存入kindNames集合中
		for (UploadItemKind uploadItemKind : uploadItemKinds) {
			kindNames.add(uploadItemKind.getUpload_item_kind_name());
		}
		return kindNames;
	}

	/**
	 * 根据名字查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	public List<String> quaryItemKindDetailName(String upload_item_kind_name) {
		// 新建一个存String的集合
		List<String> detailNames = new ArrayList<String>();
		// 查询到该商品对应的id
		List<UploadItemKindDetail> uploadItemKinds = uploadItemDao.quaryItemKindDetail(upload_item_kind_name);

		for (int i = 0; i < uploadItemKinds.size(); i++) {
			UploadItemKindDetail uploadItemKindDetail = uploadItemKinds.get(i);
			// 查询名字
			String detailName = uploadItemKindDetail.getUpload_item_kind_detail_name();
			// 加入集合
			detailNames.add(detailName);
		}
		return detailNames;
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryItemOriginName() {
		// 查询数据
		List<UploadItemOrigin> uploadItemOrigins = uploadItemDao.quaryItemOrigin();
		// 新建一个存String的集合
		List<String> originNames = new ArrayList<String>();
		for (UploadItemOrigin uploadItemOrigin : uploadItemOrigins) {
			originNames.add(uploadItemOrigin.getUpload_item_origin_name());
		}
		return originNames;
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryItemOriginCityName(String upload_item_origin_name) {
		// 新建一个存String的集合
		List<String> originCityNames = new ArrayList<String>();
		List<UploadItemOriginCity> uploadItemOrigins = uploadItemDao.quaryItemOriginCity(upload_item_origin_name);
		for (int i = 0; i < uploadItemOrigins.size(); i++) {
			UploadItemOriginCity uploadItemOrigin = uploadItemOrigins.get(i);
			String originCityName = uploadItemOrigin.getUpload_item_origin_city_name();
			originCityNames.add(originCityName);
		}
		return originCityNames;
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryItemOriginCountyName(String upload_item_origin_county_name) {
		// 新建一个存String的集合
		List<String> originCountyNames = new ArrayList<String>();
		List<UploadItemOriginCounty> uploadItemOriginCities = uploadItemDao
				.quaryItemOriginCounty(upload_item_origin_county_name);
		for (int i = 0; i < uploadItemOriginCities.size(); i++) {
			UploadItemOriginCounty uploadItemOriginCity = uploadItemOriginCities.get(i);
			String originCountyName = uploadItemOriginCity.getUpload_item_origin_county_name();
			originCountyNames.add(originCountyName);
		}
		return originCountyNames;
	}

	/**
	 * 商品单位表
	 */
	public List<String> quaryItemTTMUnit(String upload_item_TTM_unit_status) {
		List<UploadItemTTMUnit> uploadItemTTMUnits = uploadItemDao.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 新建一个存String的集合
		List<String> itemTTMUnitNames = new ArrayList<String>();
		for (int i = 0; i < uploadItemTTMUnits.size(); i++) {
			itemTTMUnitNames.add(uploadItemTTMUnits.get(i).getUpload_item_TTM_unit_rate());
		}
		return itemTTMUnitNames;
	}

	/**
	 * 商品特征参数表
	 */
	public List<String> quaryItemCharacterParameter(String status) {
		List<UploadItemCharacterParameter> uploadItemCharacterParameters = uploadItemDao.quaryItemCharacterParameter();
		List<String> lists = new ArrayList<String>();
		for (int i = 0; i < uploadItemCharacterParameters.size(); i++) {
			UploadItemCharacterParameter uploadItemCharacterParameter = uploadItemCharacterParameters.get(i);
			if ("form".equals(status)) {// 查询形状
				String parameter_form = uploadItemCharacterParameter.getUpload_item_character_parameter_form();
				lists.add(parameter_form);
			} else if ("color".equals(status)) {// 查询颜色
				String parameter_color = uploadItemCharacterParameter.getUpload_item_character_parameter_color();
				lists.add(parameter_color);
			}
		}
		return lists;
	}

	/**
	 * 商品保存方式表
	 */
	public List<String> quaryItemSaveMethod() {
		// 新建一个存String的集合
		List<String> itemSaveMethodNames = new ArrayList<String>();
		List<UploadItemSaveMethod> uploadItemSaveMethods = uploadItemDao.quaryItemSaveMethod();
		for (int i = 0; i < uploadItemSaveMethods.size(); i++) {
			itemSaveMethodNames.add(uploadItemSaveMethods.get(i).getUpload_item_save_method());
		}
		return itemSaveMethodNames;
	}

	/**
	 * 商品厂家地址表
	 */
	// 商品厂家地址表
	public List<String> quaryItemFactoryAddressName() {
		// 新建一个存String的集合
		List<String> itemFactoryAddressNames = new ArrayList<String>();
		List<UploadItemFactoryAddress> uploadItemFactoryAddresses = uploadItemDao.quaryItemFactoryAddress();
		for (int i = 0; i < uploadItemFactoryAddresses.size(); i++) {
			UploadItemFactoryAddress uploadItemFactoryAddress = uploadItemFactoryAddresses.get(i);
			String itemFactoryAddressName = uploadItemFactoryAddress.getUpload_item_factory_address_name();
			itemFactoryAddressNames.add(itemFactoryAddressName);
		}

		return itemFactoryAddressNames;
	}

	/**
	 * 商品厂家地址市区表
	 */
	public List<String> quaryItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 新建一个存String的集合
		List<String> itemFactoryAddressCityNames = new ArrayList<String>();
		List<UploadItemFactoryAddressCity> uploadItemFactoryAddresses = uploadItemDao
				.quaryItemFactoryAddressCity(upload_item_factory_address_name);
		for (int i = 0; i < uploadItemFactoryAddresses.size(); i++) {
			UploadItemFactoryAddressCity uploadItemFactoryAddress = uploadItemFactoryAddresses.get(i);

			String itemFactoryAddressCityName = uploadItemFactoryAddress.getUpload_item_factory_address_city_name();

			itemFactoryAddressCityNames.add(itemFactoryAddressCityName);
		}
		return itemFactoryAddressCityNames;
	}

	/**
	 * 商品厂家地址地区表
	 */
	public List<String> quaryItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 新建一个存String的集合
		List<String> itemFactoryAddressCountyNames = new ArrayList<String>();
		List<UploadItemFactoryAddressCounty> uploadItemFactoryAddressCities = uploadItemDao
				.quaryItemFactoryAddressCounty(upload_item_factory_address_city_name);
		for (int i = 0; i < uploadItemFactoryAddressCities.size(); i++) {
			UploadItemFactoryAddressCounty uploadItemFactoryAddressCity = uploadItemFactoryAddressCities.get(i);

			String itemFactoryAddressCountyName = uploadItemFactoryAddressCity
					.getUpload_item_factory_address_county_name();
			itemFactoryAddressCountyNames.add(itemFactoryAddressCountyName);
		}
		return itemFactoryAddressCountyNames;
	}
	
	/**
	 * 通过id查询数据
	 */
	public UploadItem queryUploadItemById(int upload_item_id) {
		return uploadItemDao.queryUploadItemById(upload_item_id);
	}

}
