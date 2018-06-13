package com.MultilingualQuotient.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MultilingualQuotient.dao.CorpusDao;
import com.MultilingualQuotient.dao.UploadItemDao;
import com.MultilingualQuotient.dto.MultilingualQuotientExecution;
import com.MultilingualQuotient.enmus.MultilingualQuotientEnum;
import com.MultilingualQuotient.entity.UploadItem;
import com.MultilingualQuotient.service.CorpusService;

/**
 * 多语言语料库的业务逻辑层 主要负责语言的转换
 * 
 * @author runner
 *
 */
@Service("corpusService")
public class CorpusServiceImpl implements CorpusService {

	@Autowired
	private CorpusDao corpusDao;

	@Autowired
	private UploadItemDao uploadItemDao;

	// 存英文数据
	List<String> data = null;
	// 存中文数据

	/*
	 * 上传商品id
	 */
	static public Integer upload_item_id;

	/**
	 * 将英文转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem englishTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.englishTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将俄文转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem russianTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.russianTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将藏语转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem tibetabTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.tibetabTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将蒙古语转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem mongolianTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.mongolianTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将泰语转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem thaiTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.thaiTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将希腊语转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 * 
	 */

	private UploadItem greekTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.greekTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 将土耳其语转化为中文
	 * 
	 * @param uploadItem
	 *            上传商品的对象
	 * @return 中文的商品的对象
	 */
	private UploadItem turkishTransformChinese(UploadItem uploadItem) {
		// 实例化一个上传商品对象
		UploadItem uploadItemChinese = new UploadItem();

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.turkishTransformChinese(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemChinese, chineses, uploadItem);

		return uploadItemChinese;
	}

	/**
	 * 存入英文数据
	 */
	public MultilingualQuotientExecution insertEnUploadItem(UploadItem uploadItem) {
		return insertUploadItem(englishTransformChinese(uploadItem), 1);
	}

	/**
	 * 存入中文数据到数据库
	 * 
	 * @param uploadItem
	 * @return
	 */
	public MultilingualQuotientExecution insertUploadItem(UploadItem uploadItem, int status) {
		// 判断上传的商品是否为空
		if (uploadItem != null) {
			// 直接将数据存入数据库
			int line;
			try {
				line = uploadItemDao.insertUploadItem(uploadItem);

				if (line > 0) {
					// 学习
					upload_item_id = uploadItem.getUpload_item_id();

					if (status == 1) {// 英文
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformEnglish(
										MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 2) {// 中文
						// 执行成功
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo());
					}
					if (status == 3) {// 俄文
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformRussian(
										MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 4) {// 藏语
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformTibetab(
										MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 5) {// 蒙古语
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformMongolian(
										MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 6) {// 泰语
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformThai(
										MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 7) {// 希腊语
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformGreek(MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}
					if (status == 8) {// 土耳其语
						return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTSUCCESS.getState(),
								corpusDao.chineseTransformTurkish(MultilingualQuotientEnum.INSERTSUCCESS.getStateInfo()));
					}

				} else {
					return new MultilingualQuotientExecution(MultilingualQuotientEnum.INSERTFAIL.getState(),
							MultilingualQuotientEnum.INSERTFAIL.getStateInfo());
				}
			} catch (Exception e) {
				e.printStackTrace();
				// 系统内部错误
				return new MultilingualQuotientExecution(MultilingualQuotientEnum.INNER_ERROR.getState(),
						MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
			}
		} else {
			// 数据为空
			return new MultilingualQuotientExecution(MultilingualQuotientEnum.NULLDATA.getState(),
					MultilingualQuotientEnum.NULLDATA.getStateInfo());
		}
		return null;
	}

	/**
	 * 存入俄语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	public MultilingualQuotientExecution insertRuUploadItem(UploadItem uploadItem) {
		return insertUploadItem(russianTransformChinese(uploadItem), 3);
	}

	/**
	 * 存入藏语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	public MultilingualQuotientExecution insertTiUploadItem(UploadItem uploadItem) {
		return insertUploadItem(tibetabTransformChinese(uploadItem), 4);
	}

	/**
	 * 存入蒙古语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	public MultilingualQuotientExecution insertMoUploadItem(UploadItem uploadItem) {
		return insertUploadItem(mongolianTransformChinese(uploadItem), 5);
	}

	/**
	 * 存入泰语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	public MultilingualQuotientExecution insertThUploadItem(UploadItem uploadItem) {
		return insertUploadItem(thaiTransformChinese(uploadItem), 6);
	}

	/**
	 * 存入希腊语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	public MultilingualQuotientExecution insertGrUploadItem(UploadItem uploadItem) {
		return insertUploadItem(greekTransformChinese(uploadItem), 7);
	}

	/**
	 * 存入土耳其语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */

	public MultilingualQuotientExecution insertTuUploadItem(UploadItem uploadItem) {
		return insertUploadItem(turkishTransformChinese(uploadItem), 8);
	}

	/**
	 * 根据id查询中文的对象
	 */
	public UploadItem transformChinese(String s_upload_item_id) {
		// 将string转换为Int
		int upload_item_id = Integer.parseInt(s_upload_item_id);
		// 所有的要翻译的数据
		UploadItem uploadItem = uploadItemDao.queryUploadItemById(upload_item_id);
		// uploadItem.setUpload_item_TTM(TimeProcessUtil.dateToString(uploadItem.getUpload_item_TTM()));
		return uploadItem;
	}

	/**
	 * 
	 * 根据id查询英文的对象
	 */
	public UploadItem transformEnglish(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformEnglish(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询俄语的对象
	 */
	public UploadItem transformRussian(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformRussian(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询藏语的对象
	 */
	public UploadItem transformTibetab(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformTibetab(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询蒙古语的对象
	 */
	public UploadItem transformMongolian(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformMongolian(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询泰语的对象
	 */
	public UploadItem transformThai(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformThai(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询希腊语的对象
	 */
	public UploadItem transformGreek(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformGreek(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	/**
	 * 
	 * 根据id查询土耳其语的对象
	 */
	public UploadItem transformTurkish(String s_upload_item_id) {
		// 实例化一个上传商品对象
		UploadItem uploadItemEnglish = new UploadItem();

		// 所有的要翻译的数据
		UploadItem uploadItem = transformChinese(s_upload_item_id);

		// 存数据
		List<String> data = getItem(uploadItem);

		List<String> chineses = new ArrayList<String>();
		// 2.翻译数据，并得到翻译结果
		for (int i = 0; i < data.size(); i++) {
			String chinese = corpusDao.chineseTransformTurkish(data.get(i));
			chineses.add(chinese);
		}
		// 放数据
		getCorpusItem(uploadItemEnglish, chineses, uploadItem);

		return uploadItemEnglish;
	}

	// 放数据
	private void getCorpusItem(UploadItem uploadItemChinese, List<String> chineses, UploadItem uploadItem) {
		// 3.将翻译结果集存入uploadItemChinese中
		uploadItemChinese.setUpload_item_kind_name(chineses.get(0));
		uploadItemChinese.setUpload_item_kind_detail_name(chineses.get(1));
		uploadItemChinese.setUpload_item_origin_name(chineses.get(2));
		uploadItemChinese.setUpload_item_origin_city_name(chineses.get(3));
		uploadItemChinese.setUpload_item_origin_county_name(chineses.get(4));
		/* uploadItemChinese.setUpload_item_price_unit(chineses.get(5)); */
		/* uploadItemChinese.setUpload_item_supply_unit(chineses.get(6)); */
		uploadItemChinese.setUpload_item_character_color(chineses.get(5));
		uploadItemChinese.setUpload_item_character_shape(chineses.get(6));
		uploadItemChinese.setUpload_item_save_method(chineses.get(7));
		uploadItemChinese.setUpload_item_factory_address_name(chineses.get(8));
		uploadItemChinese.setUpload_item_factory_address_city_name(chineses.get(9));
		uploadItemChinese.setUpload_item_factory_address_county_name(chineses.get(10));

		// 4.存入无需翻译的数据
		uploadItemChinese.setUpload_item_price(uploadItem.getUpload_item_price());
		uploadItemChinese.setUpload_item_supply(uploadItem.getUpload_item_supply());

		uploadItemChinese.setUpload_item_price_unit(uploadItem.getUpload_item_price_unit());
		uploadItemChinese.setUpload_item_supply_unit(uploadItem.getUpload_item_supply_unit());
		uploadItemChinese.setUpload_item_TTM(uploadItem.getUpload_item_TTM());
		uploadItemChinese.setUpload_item_phone(uploadItem.getUpload_item_phone());
		uploadItemChinese.setUpload_item_QQ(uploadItem.getUpload_item_QQ());
	}

	// 存数据
	private List<String> getItem(UploadItem uploadItem) {

		List<String> data = new ArrayList<String>();

		// 1.存入数据
		data.add(uploadItem.getUpload_item_kind_name());
		data.add(uploadItem.getUpload_item_kind_detail_name());
		data.add(uploadItem.getUpload_item_origin_name());
		data.add(uploadItem.getUpload_item_origin_city_name());
		data.add(uploadItem.getUpload_item_origin_county_name());
		/* data.add(uploadItem.getUpload_item_price_unit()); */
		/* data.add(uploadItem.getUpload_item_supply_unit()); */
		data.add(uploadItem.getUpload_item_character_color());
		data.add(uploadItem.getUpload_item_character_shape());
		data.add(uploadItem.getUpload_item_save_method());
		data.add(uploadItem.getUpload_item_factory_address_name());
		data.add(uploadItem.getUpload_item_factory_address_city_name());
		data.add(uploadItem.getUpload_item_factory_address_county_name());

		return data;
	}
}