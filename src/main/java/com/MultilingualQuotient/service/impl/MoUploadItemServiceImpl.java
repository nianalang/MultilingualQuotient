package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.MoUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 蒙古语的业务逻辑层实现层
 * 
 * @author 念阿郎
 *
 */
@Service("moUploadItemService")
public class MoUploadItemServiceImpl implements MoUploadItemService {
	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;
	

	/**
	 * 将蒙古语转换为中文
	 * 
	 * @return
	 */
	public String mongolianTransformChinese(String corpus_russian) {
		// 根据蒙古语查询汉语
		String name = corpusDao.mongolianTransformChinese(corpus_russian);
		return name;
	}

	// 将中文的集合转换为蒙古语的集合
	public List<String> chineseTransformMongolian(List<String> chinese) {
		List<String> mongolianDatas  = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询蒙古语
			String name = corpusDao.chineseTransformMongolian(chinese.get(i));
			// 将查询到的数据存到集合中
			mongolianDatas.add(name);
		}
		return mongolianDatas;
	}

	public List<String> quaryMoItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(mongolianTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemOriginName() {
		return chineseTransformMongolian(uploadItemService.quaryItemOriginName());
	}

	public List<String> quaryMoItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(mongolianTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(mongolianTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemSaveMethod() {
		return chineseTransformMongolian(uploadItemService.quaryItemSaveMethod());
	}

	public List<String> quaryMoItemFactoryAddressName() {
		return chineseTransformMongolian(uploadItemService.quaryItemFactoryAddressName());
	}

	public List<String> quaryMoItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(mongolianTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

	public List<String> quaryMoItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(mongolianTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformMongolian(chineseData);
	}

}
