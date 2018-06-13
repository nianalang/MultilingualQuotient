package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.EnUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * English上传商品逻辑层
 * 
 * @author 念阿郎
 *
 */
@Service("enUploadItemService")
public class EnUploadItemServiceIml implements EnUploadItemService {
	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;

	/**
	 * 将英文转换为中文
	 * 
	 * @return
	 */
	public String englishTransformChinese(String chinese) {
		// 根据英语查询汉语
		String name = corpusDao.englishTransformChinese(chinese);
		return name;
	}

	/**
	 * 将中文转换为英文集合
	 * 
	 * @param chinese
	 * @return
	 */
	public List<String> chineseTransformEnglish(List<String> chinese) {
		List<String> englishDatas  = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询英语
			String name = corpusDao.chineseTransformEnglish(chinese.get(i));
			// 将查询到的数据存到集合中
			englishDatas.add(name);
		}
		return englishDatas;
	}

	
	
	
	/**
	 * 获取英文上传商品细节
	 */
	public List<String> quaryEnItemKindName() throws Exception {
		// 获取中文的商品种类数据
		List<String> chineseKindNames = uploadItemService.quaryItemKindName();
		// 将中文转换为英文
		return chineseTransformEnglish(chineseKindNames);
	}

	/**
	 * 获取商品上传的细节
	 */
	public List<String> quaryEnItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 获取中文的商品种类数据细节
		List<String> chineseKindDetailNames = uploadItemService
				.quaryItemKindDetailName(englishTransformChinese(upload_item_kind_name));
		return chineseTransformEnglish(chineseKindDetailNames);
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryEnItemOriginName() {
		// 查询省级的名字
		List<String> chineseItemOriginName = uploadItemService.quaryItemOriginName();
		return chineseTransformEnglish(chineseItemOriginName);
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryEnItemOriginCityName(String upload_item_origin_name) {
		// 查询市级的名字
		List<String> chineseItemOriginCityName = uploadItemService
				.quaryItemOriginCityName(englishTransformChinese(upload_item_origin_name));
		return chineseTransformEnglish(chineseItemOriginCityName);
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryEnItemOriginCountyName(String upload_item_origin_county_name) {
		// 查询县级的名字
		List<String> chineseItemOriginCountyName = uploadItemService
				.quaryItemOriginCountyName(englishTransformChinese(upload_item_origin_county_name));
		return chineseTransformEnglish(chineseItemOriginCountyName);
	}

	/**
	 * 商品单位表
	 */
	public List<String> quaryEnItemTTMUnit(String upload_item_TTM_unit_status) {
		// 返回英文数据
		return chineseTransformEnglish(uploadItemService.quaryItemTTMUnit(upload_item_TTM_unit_status));
	}

	/**
	 * 商品特征参数表
	 */
	public List<String> quaryEnItemCharacterParameter(String status) {
		return chineseTransformEnglish(uploadItemService.quaryItemCharacterParameter(status));
	}

	/**
	 * 商品保存方式表
	 */
	public List<String> quaryEnItemSaveMethod() {
		return chineseTransformEnglish(uploadItemService.quaryItemSaveMethod());
	}

	/**
	 * 商品厂家地址表
	 */
	public List<String> quaryEnItemFactoryAddressName() {
		return chineseTransformEnglish(uploadItemService.quaryItemFactoryAddressName());
	}

	/**
	 * 商品厂家地址市区表
	 */
	public List<String> quaryEnItemFactoryAddressCityName(String upload_item_factory_address_name) {
		return chineseTransformEnglish(uploadItemService
				.quaryItemFactoryAddressCityName(englishTransformChinese(upload_item_factory_address_name)));
	}

	/**
	 * 商品厂家地址地区表
	 */
	public List<String> quaryEnItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		return chineseTransformEnglish(uploadItemService
				.quaryItemFactoryAddressCountyName(englishTransformChinese(upload_item_factory_address_city_name)));
	}
}
