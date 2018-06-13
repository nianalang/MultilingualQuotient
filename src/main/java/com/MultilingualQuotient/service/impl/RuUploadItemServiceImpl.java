package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.RuUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 俄语的业务逻辑层实现层
 * 
 * @author 念阿郎
 *
 */
@Service("ruUploadItemService")
public class RuUploadItemServiceImpl implements RuUploadItemService {

	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;

	/**
	 * 将俄文转换为中文
	 * 
	 * @return
	 */
	public String russianTransformChinese(String corpus_russian) {
		// 根据俄语查询汉语
		String name = corpusDao.russianTransformChinese(corpus_russian);
		return name;
	}

	// 将中文的集合转换为俄文的集合
	public List<String> chineseTransformRussian(List<String> chinese) {
		List<String> russianDatas = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询俄语
			String name = corpusDao.chineseTransformRussian(chinese.get(i));
			// 将查询到的数据存到集合中
			russianDatas.add(name);
		}
		return russianDatas;
	}

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	public List<String> quaryRuItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	public List<String> quaryRuItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(russianTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryRuItemOriginName() {
		return chineseTransformRussian(uploadItemService.quaryItemOriginName());
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryRuItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(russianTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryRuItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(russianTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	public List<String> quaryRuItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	public List<String> quaryRuItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	public List<String> quaryRuItemSaveMethod() {
		return chineseTransformRussian(uploadItemService.quaryItemSaveMethod());
	}

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	public List<String> quaryRuItemFactoryAddressName() {
		return chineseTransformRussian(uploadItemService.quaryItemFactoryAddressName());
	}

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	public List<String> quaryRuItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(russianTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	public List<String> quaryRuItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(russianTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformRussian(chineseData);
	}

}
