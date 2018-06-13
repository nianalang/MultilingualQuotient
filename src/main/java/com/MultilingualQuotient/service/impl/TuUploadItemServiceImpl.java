package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.TuUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 土耳其语业务逻辑层
 * 
 * @author 念阿郎
 *
 */
@Service("tuUploadItemService")
public class TuUploadItemServiceImpl implements TuUploadItemService {

	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;
	/**
	 * 将土耳其语转换为中文
	 * 
	 * @return
	 */
	public String turkishTransformChinese(String corpus_russian) {
		// 根据土耳其语查询汉语
		String name = corpusDao.turkishTransformChinese(corpus_russian);
		return name;
	}

	// 将中文的集合转换为泰语的集合
	public List<String> chineseTransformTurkish(List<String> chinese) {
		List<String> turkishDatas  = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询土耳其语
			String name = corpusDao.chineseTransformTurkish(chinese.get(i));
			// 将查询到的数据存到集合中
			turkishDatas.add(name);
		}
		return turkishDatas;
	}

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	public List<String> quaryTuItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	public List<String> quaryTuItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(turkishTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryTuItemOriginName() {
		return chineseTransformTurkish(uploadItemService.quaryItemOriginName());
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryTuItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(turkishTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryTuItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(turkishTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	public List<String> quaryTuItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	public List<String> quaryTuItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	public List<String> quaryTuItemSaveMethod() {
		return chineseTransformTurkish(uploadItemService.quaryItemSaveMethod());
	}

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	public List<String> quaryTuItemFactoryAddressName() {
		return chineseTransformTurkish(uploadItemService.quaryItemFactoryAddressName());
	}

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	public List<String> quaryTuItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(turkishTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	public List<String> quaryTuItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(turkishTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformTurkish(chineseData);
	}

}
