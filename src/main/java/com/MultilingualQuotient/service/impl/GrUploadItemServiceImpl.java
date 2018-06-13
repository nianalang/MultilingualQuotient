package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.GrUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 希腊语业务逻辑层
 * 
 * @author 念阿郎
 *
 */
@Service("grUploadItemService")
public class GrUploadItemServiceImpl implements GrUploadItemService {
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
	public String greekTransformChinese(String corpus_russian) {
		// 根据蒙古语查询汉语
		String name = corpusDao.greekTransformChinese(corpus_russian);
		return name;
	}

	// 将中文的集合转换为蒙古语的集合
	public List<String> chineseTransformGreek(List<String> chinese) {
		List<String> greeklianDatas  = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询蒙古语
			String name = corpusDao.chineseTransformGreek(chinese.get(i));
			// 将查询到的数据存到集合中
			greeklianDatas.add(name);
		}
		return greeklianDatas;
	}

	public List<String> quaryGrItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(greekTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemOriginName() {
		return chineseTransformGreek(uploadItemService.quaryItemOriginName());
	}

	public List<String> quaryGrItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(greekTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(greekTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemSaveMethod() {
		return chineseTransformGreek(uploadItemService.quaryItemSaveMethod());
	}

	public List<String> quaryGrItemFactoryAddressName() {
		return chineseTransformGreek(uploadItemService.quaryItemFactoryAddressName());
	}

	public List<String> quaryGrItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(greekTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

	public List<String> quaryGrItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(greekTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformGreek(chineseData);
	}

}
