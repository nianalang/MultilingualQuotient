package test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.MultilingualQuotient.dao.UploadItemDao;
import com.MultilingualQuotient.entity.UploadItem;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"}) 
public class UploadItemDaoTest {
	@Resource
	UploadItemDao uploadItemDao;

	@Test
	public void test() {
		UploadItem uploadItem=new UploadItem();
		uploadItem.setUpload_item_kind_name("苹果");
		uploadItem.setUpload_item_kind_detail_name("红富士");
		uploadItem.setUpload_item_origin_name("辽宁省");
		uploadItem.setUpload_item_origin_city_name("大连市");
		uploadItem.setUpload_item_origin_county_name("开发区");
		uploadItem.setUpload_item_TTM(new Date());
		uploadItem.setUpload_item_price("11");
		uploadItem.setUpload_item_price_unit("元");
		uploadItem.setUpload_item_supply("1");
		uploadItem.setUpload_item_supply_unit("吨");
		uploadItem.setUpload_item_character_shape("圆形");
		uploadItem.setUpload_item_character_color("红色");
		uploadItem.setUpload_item_save_method("常温");
		
		uploadItem.setUpload_item_factory_address_name("辽宁省");
		uploadItem.setUpload_item_factory_address_city_name("大连市");
		uploadItem.setUpload_item_factory_address_county_name("开发区");
		uploadItem.setUpload_item_phone("15140594871");
		uploadItem.setUpload_item_QQ("1255279286@qq.com");
		
		int a=uploadItemDao.insertUploadItem(uploadItem);
		if(a>0) {
			System.out.println("插入成功");
		}
	}
	
	@Test
	public void queryUploadItemById() {
		UploadItem uploadItem=uploadItemDao.queryUploadItemById(1);
		System.out.println(uploadItem.getUpload_item_TTM());
		//String ss=TimeProcessUtil.dateToString(uploadItem.getUpload_item_TTM());
		//System.out.println(ss+"llll");
		
		//Date ddd=TimeProcessUtil.stringToDate(ss);
	
		//System.out.println(ddd.toString());
	}

}
