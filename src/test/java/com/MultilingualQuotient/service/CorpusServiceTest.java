package com.MultilingualQuotient.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.MultilingualQuotient.entity.UploadItem;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml" })
public class CorpusServiceTest {

	@Resource
	private CorpusService corpusService;

	@Test
	public void testTransformChinese() {
		UploadItem uploadItem = corpusService.transformChinese("1");
		System.out.println(uploadItem.getUpload_item_character_color() + "chinese");
	}

	@Test
	public void testTransformEnglish() {
		UploadItem uploadItem = corpusService.transformEnglish("1");
		System.out.println(uploadItem.getUpload_item_character_color() + "english");
	}
	@Test
	public void testTransformTibetab() {
		UploadItem uploadItem = corpusService.transformTibetab("1");
		System.out.println(uploadItem.getUpload_item_character_color() + "english");
	}
}
