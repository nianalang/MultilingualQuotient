package com.MultilingualQuotient.dao;

/**
 * 语料库信息表Dao层
 * 
 * @author depc
 *
 */
public interface CorpusDao {

	/**
	 * 根据汉语查询英语
	 * 
	 * @param uploadItem
	 *            汉语
	 * @return 英语
	 */
	String chineseTransformEnglish(String corpus_chinese);

	/**
	 * 根据英语查询为汉语
	 * 
	 * @param uploadItem
	 *            英语
	 * @return 汉语
	 */
	String englishTransformChinese(String corpus_english);

	/**
	 * 根据汉语查询俄语
	 */
	String chineseTransformRussian(String corpus_chinese);

	/**
	 * 根据俄语查询汉语
	 */
	String russianTransformChinese(String corpus_russian);
	
	

	/**
	 * 将汉语转换为藏语
	 */
	String chineseTransformTibetab(String corpus_chinese);

	/**
	 * 将藏语转换为汉语
	 */
	String tibetabTransformChinese(String corpus_tibetab);

	/**
	 * 将汉语转换为蒙古语
	 */
	String chineseTransformMongolian(String corpus_chinese);

	/**
	 * 将蒙古语转换为汉语
	 */
	String mongolianTransformChinese(String corpus_mongolian);

	/**
	 * 将汉语转换为泰语
	 */
	String chineseTransformThai(String corpus_chinese);

	/**
	 * 将泰语转换为汉语
	 */
	String thaiTransformChinese(String corpus_thai);

	/**
	 * 将汉语转换为希腊语
	 */
	String chineseTransformGreek(String corpus_chinese);

	/**
	 * 将希腊语转换为汉语
	 */
	String greekTransformChinese(String corpus_greek);

	/**
	 * 将汉语转换为土耳其语
	 */
	String chineseTransformTurkish(String corpus_chinese);

	/**
	 * 将土耳其语转换为汉语
	 */
	String turkishTransformChinese(String corpus_turkish);
}
