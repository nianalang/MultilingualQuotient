package com.MultilingualQuotient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MultilingualQuotient.dto.MultilingualQuotientExecution;
import com.MultilingualQuotient.dto.MultilingualQuotientResult;
import com.MultilingualQuotient.enmus.MultilingualQuotientEnum;
import com.MultilingualQuotient.entity.UploadItem;
import com.MultilingualQuotient.service.CorpusService;
import com.MultilingualQuotient.service.impl.CorpusServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 多语言语料库控制层
 * 
 * @author runner
 *
 */
@Controller
@RequestMapping("/corpus")
@Api(value = "多语言语料库控制层", tags = "接收各种语言的接口")
public class CorpusController {

	@Autowired
	private CorpusService corpusService;

	// 前台上传中文商品对象
	@RequestMapping(value = "/uploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传中文商品", httpMethod = "POST", value = "上传中文商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> uploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertUploadItem(uploadItem,2);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传英文商品对象
	@RequestMapping(value = "/enUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传英文商品", httpMethod = "POST", value = "上传英文商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> enUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertEnUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传俄语商品对象
	@RequestMapping(value = "/ruUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传俄语商品", httpMethod = "POST", value = "上传俄语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> ruUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertRuUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传藏语商品对象
	@RequestMapping(value = "/tiUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传藏语商品", httpMethod = "POST", value = "上传藏语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> tiUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertTiUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传蒙古语商品对象
	@RequestMapping(value = "/moUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传蒙古语商品", httpMethod = "POST", value = "上传蒙古语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> moUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertMoUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传泰语商品对象
	@RequestMapping(value = "/thUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传泰语商品", httpMethod = "POST", value = "上传泰语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> thUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertThUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传希腊语商品对象
	@RequestMapping(value = "/grUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传希腊语商品", httpMethod = "POST", value = "上传希腊语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> grUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertGrUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}

	// 前台上传土耳其语商品对象
	@RequestMapping(value = "/tuUploadItems", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "前台上传土耳其语商品", httpMethod = "POST", value = "上传土耳其语商品")
	public MultilingualQuotientResult<MultilingualQuotientExecution> tuUploadItems(@RequestBody UploadItem uploadItem) {
		try {
			// 得到数据
			MultilingualQuotientExecution mExecution = corpusService.insertTuUploadItem(uploadItem);
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(true, mExecution,
					CorpusServiceImpl.upload_item_id);
		} catch (Exception e) {
			e.printStackTrace();
			// 系统错误
			return new MultilingualQuotientResult<MultilingualQuotientExecution>(false,
					MultilingualQuotientEnum.INNER_ERROR.getStateInfo());
		}
	}
}