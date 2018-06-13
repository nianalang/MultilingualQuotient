package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.service.TiUploadItemService;
import com.MultilingualQuotient.service.UploadItemService;

/**
 * 藏语的业务逻辑层实现层
 * 
 * @author 念阿郎
 *
 */
@Service("tiUploadItemService")
public class TiUploadItemServiceImpl implements TiUploadItemService {
	// 上传商品的逻辑层
	@Resource
	private UploadItemService uploadItemService;
	// 语言转换
	@Resource
	private CorpusDao corpusDao;
	
	/**
	 * 将藏语转换为中文
	 * 
	 * @return
	 */
	public String tibetabTransformChinese(String corpus_tibetab) {
		// 根据藏语查询汉语
		String name = corpusDao.tibetabTransformChinese(corpus_tibetab);
		return name;
	}

	// 将中文的集合转换为藏语的集合
	public List<String> chineseTransformTibetab(List<String> chinese) {
		List<String> tibetabDatas = new ArrayList<String>();
		// 遍历中文的集合
		for (int i = 0; i < chinese.size(); i++) {
			// 根据汉语查询俄语
			String name = corpusDao.chineseTransformTibetab(chinese.get(i));
			// 将查询到的数据存到集合中
			tibetabDatas.add(name);
		}
		return tibetabDatas;
	}
	

	/**
	 * 查询商品的种类
	 * 
	 * @return 商品种类的集合
	 */
	public List<String> quaryTiItemKindName() throws Exception {
		// 获取所有中文的集合
		List<String> chineseData = uploadItemService.quaryItemKindName();
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 查询商品种类的细节
	 * 
	 * @param upload_item_kind_name
	 * @return
	 */
	public List<String> quaryTiItemKindDetailName(String upload_item_kind_name) throws Exception {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemKindDetailName(tibetabTransformChinese(upload_item_kind_name));
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 查询商品产地省级表
	 * 
	 * @return 查询商品产地省级表的集合
	 */
	public List<String> quaryTiItemOriginName() {
		return chineseTransformTibetab(uploadItemService.quaryItemOriginName());
	}

	/**
	 * 查询商品产地市级表
	 * 
	 * @return 查询商品产地市级表的集合
	 */
	public List<String> quaryTiItemOriginCityName(String upload_item_origin_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCityName(tibetabTransformChinese(upload_item_origin_name));
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 查询商品产地县级表
	 * 
	 * @return 查询商品产地县级表的集合
	 */
	public List<String> quaryTiItemOriginCountyName(String upload_item_origin_county_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemOriginCountyName(tibetabTransformChinese(upload_item_origin_county_name));
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 商品单位表
	 * 
	 * @param upload_item_TTM_unit_status
	 *            状态
	 * @return 商品单位表的集合
	 */
	public List<String> quaryTiItemTTMUnit(String upload_item_TTM_unit_status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemTTMUnit(upload_item_TTM_unit_status);
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 商品特征参数表
	 * 
	 * @return 商品特征参数表的集合
	 */
	public List<String> quaryTiItemCharacterParameter(String status) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService.quaryItemCharacterParameter(status);
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 商品保存方式表
	 * 
	 * @return 商品保存方式表的集合
	 */
	public List<String> quaryTiItemSaveMethod() {
		return chineseTransformTibetab(uploadItemService.quaryItemSaveMethod());
	}

	/**
	 * 商品厂家地址表
	 * 
	 * @return 商品厂家地址表的集合
	 */
	public List<String> quaryTiItemFactoryAddressName() {
		return chineseTransformTibetab(uploadItemService.quaryItemFactoryAddressName());
	}

	/**
	 * 商品厂家地址市级表
	 * 
	 * @return 商品厂家市级表的集合
	 */
	public List<String> quaryTiItemFactoryAddressCityName(String upload_item_factory_address_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCityName(tibetabTransformChinese(upload_item_factory_address_name));
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}

	/**
	 * 商品厂家地址县级表
	 * 
	 * @return 商品厂家县级表的集合
	 */
	public List<String> quaryTiItemFactoryAddressCountyName(String upload_item_factory_address_city_name) {
		// 将俄语转换为汉语然后再查询数据
		List<String> chineseData = uploadItemService
				.quaryItemFactoryAddressCountyName(tibetabTransformChinese(upload_item_factory_address_city_name));
		// 将中文转换为俄文
		return chineseTransformTibetab(chineseData);
	}
}
