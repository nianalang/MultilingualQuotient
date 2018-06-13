package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.ThUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 泰语业务逻辑层
 * 
 * @author 念阿郎
 *
 */
@Service("thUploadItemService")
public class ThUploadItemServiceImpl implements ThUploadItemService {

	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;

	/**
	 * 将泰语转换为中文
	 * 
	 * @return
	 */
	public String thaiTransformChinese(String corpus_russian) {
		// 根据泰语查询汉语
		String name = corpusDao.thaiTransformChinese(corpus_russian);
		return name;
	}

	// 将中文的集合转换为泰语的集合
	public List<String> chineseTransformThai(List<String> chinese) {
		List<String> thaiDatas = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询泰语
			String name = corpusDao.chineseTransformThai(chinese.get(i));
			// 将查询到的数据存到集合中
			thaiDatas.add(name);
		}
		return thaiDatas;
	}

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	public List<String> quaryThItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	public List<String> quaryThItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(thaiTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryThItemOriginName() {
		return chineseTransformThai(uploadItemService.quaryItemOriginName());
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryThItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(thaiTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryThItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(thaiTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	public List<String> quaryThItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	public List<String> quaryThItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	public List<String> quaryThItemSaveMethod() {
		return chineseTransformThai(uploadItemService.quaryItemSaveMethod());
	}

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	public List<String> quaryThItemFactoryAddressName() {
		return chineseTransformThai(uploadItemService.quaryItemFactoryAddressName());
	}

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	public List<String> quaryThItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(thaiTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	public List<String> quaryThItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(thaiTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformThai(chineseData);
	}

}
