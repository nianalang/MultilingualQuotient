package com.MultilingualQuotient.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MultilingualQuotient.dto.MultilingualQuotientResult;
import com.MultilingualQuotient.entity.UploadItem;
import com.MultilingualQuotient.service.CorpusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 按不同的需要翻译上传的商品
 * 
 * @author 念阿郎
 *
 */
@Controller
@RequestMapping("/translateUpload")
@Api(value = "提供各种语言的接口", tags = "获取各种语言的接口")
public class TranslateUploadController {

	@Resource
	private CorpusService corpusService;

	/**
	 * 转换为英文对象
	 */
	@RequestMapping(value = "/translateEnglish/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询英文对象", httpMethod = "GET", notes = "转换为英文对象")
	public MultilingualQuotientResult<UploadItem> translateEnglish(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformEnglish(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}

	/**
	 * 转换为中文对象
	 */
	@RequestMapping(value = "/translateChinese/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询中文对象", httpMethod = "GET", notes = "查询中文对象")
	public MultilingualQuotientResult<UploadItem> translateChinese(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformChinese(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}

	/**
	 * 转换为俄文对象
	 */
	@RequestMapping(value = "/translateRussian/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询俄文对象", httpMethod = "GET", notes = "查询俄文对象")
	public MultilingualQuotientResult<UploadItem> transformRussian(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformRussian(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}

	/**
	 * 转换为藏语对象
	 */
	@RequestMapping(value = "/translateTibetab/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询藏语对象", httpMethod = "GET", notes = "查询藏语对象")
	public MultilingualQuotientResult<UploadItem> transformTibetab(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformTibetab(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}

	/**
	 * 转换为蒙古语对象
	 */
	@RequestMapping(value = "/translateMongolian/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询蒙古语对象", httpMethod = "GET", notes = "查询蒙古语对象")
	public MultilingualQuotientResult<UploadItem> transformMongolian(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformMongolian(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}

	/**
	 * 转换为泰语对象
	 */
	@RequestMapping(value = "/translateThai/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询泰语对象", httpMethod = "GET", notes = "查询泰语对象")
	public MultilingualQuotientResult<UploadItem> transformThai(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformThai(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}
	/**
	 * 转换为希腊语对象
	 */
	@RequestMapping(value = "/translateGreek/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询希腊语对象", httpMethod = "GET", notes = "查询希腊语对象")
	public MultilingualQuotientResult<UploadItem> transformGreek(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformGreek(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}
	
	/**
	 * 转换为土耳其语对象
	 */
	@RequestMapping(value = "/translateTurkish/{upload_item_id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询土耳其语对象", httpMethod = "GET", notes = "查询土耳其语对象")
	public MultilingualQuotientResult<UploadItem> transformTurkish(
			@PathVariable(value = "upload_item_id") String upload_item_id) {
		UploadItem uploadItem = corpusService.transformTurkish(upload_item_id);
		return new MultilingualQuotientResult<UploadItem>(true, uploadItem);
	}
}
