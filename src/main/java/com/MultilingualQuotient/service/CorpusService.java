package com.MultilingualQuotient.service;

import com.MultilingualQuotient.dto.MultilingualQuotientExecution;
import com.MultilingualQuotient.entity.UploadItem;

/**
 * 多语言语料库的业务逻辑层
 * 
 * @author runner
 *
 */

public interface CorpusService {

	/**
	 * 存入中文的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertUploadItem(UploadItem uploadItem,int statue);

	/**
	 * 存入英文的数据
	 * 
	 * @param uploadItem
	 * @return
	 */
	MultilingualQuotientExecution insertEnUploadItem(UploadItem uploadItem);

	/**
	 * 存入俄语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertRuUploadItem(UploadItem uploadItem);

	/**
	 * 存入藏语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertTiUploadItem(UploadItem uploadItem);

	/**
	 * 存入蒙古语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertMoUploadItem(UploadItem uploadItem);

	/**
	 * 存入泰语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertThUploadItem(UploadItem uploadItem);

	/**
	 * 存入希腊语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertGrUploadItem(UploadItem uploadItem);

	/**
	 * 存入土耳其语的数据
	 * 
	 * @param uItemReceiver
	 * @return
	 */
	MultilingualQuotientExecution insertTuUploadItem(UploadItem uploadItem);

	/**
	 * 查询中文的对象
	 * 
	 * @param upload_item_id
	 * @return
	 */
	UploadItem transformChinese(String upload_item_id);

	/**
	 * 查询英文的对象
	 * 
	 * @param upload_item_id
	 * @return
	 */
	UploadItem transformEnglish(String upload_item_id);

	/**
	 * 查询俄文的对象
	 * 
	 * @param upload_item_id
	 * @return
	 */
	UploadItem transformRussian(String s_upload_item_id);

	/**
	 * 
	 * 根据id查询藏语的对象
	 */
	public UploadItem transformTibetab(String s_upload_item_id);

	/**
	 * 
	 * 根据id查询蒙古语的对象
	 */
	public UploadItem transformMongolian(String s_upload_item_id);

	/**
	 * 
	 * 根据id查询泰语的对象
	 */
	public UploadItem transformThai(String s_upload_item_id);

	/**
	 * 
	 * 根据id查询希腊语的对象
	 */
	public UploadItem transformGreek(String s_upload_item_id);

	/**
	 * 
	 * 根据id查询土耳其语的对象
	 */
	public UploadItem transformTurkish(String s_upload_item_id);
}
