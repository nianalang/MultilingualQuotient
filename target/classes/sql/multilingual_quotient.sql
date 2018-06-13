--创建数据库
CREATE database multilingual_quotient;
--删除数据表
DROP database multilingual_quotient;
--使用数据表
use  multilingual_quotient;

drop table upload_item;
--创建上传商品表
CREATE table upload_item(

	upload_item_id bigint NOT NULL AUTO_INCREMENT COMMENT '上传商品id',
	
	upload_item_kind_name varchar(100) NOT NULL COMMENT '商品种类名称',
	upload_item_kind_detail_name varchar(100) NOT NULL COMMENT '商品种类细节名称',
	
	upload_item_origin_name varchar(50) NOT NULL COMMENT '产地名称',
	upload_item_origin_city_name varchar(50) NOT NULL COMMENT '产地市级名称',	
	upload_item_origin_county_name varchar(50) NOT NULL COMMENT '产地县级名称',
	
	
	upload_item_TTM varchar(50) NOT NULL COMMENT '上市时间',
	
	upload_item_price  varchar(50) NOT NULL COMMENT '商品价格',
	upload_item_price_unit varchar(10) NOT NULL COMMENT '商品价格的单位',
	
	upload_item_supply varchar(50) NOT NULL COMMENT '商品供货量',
	upload_item_supply_unit varchar(50) NOT NULL COMMENT '商品供货量的单位',
	
	upload_item_character_shape  varchar(50) NOT NULL COMMENT '商品形状',
	
	upload_item_character_color  varchar(50) NOT NULL COMMENT '商品颜色',
	
	upload_item_save_method  varchar(50) NOT NULL COMMENT '商品保存方式',
	
	upload_item_factory_address_name varchar(50) NOT NULL COMMENT '商品厂家地址名称',
	upload_item_factory_address_city_name varchar(50) NOT NULL COMMENT '商品厂家地址市区名称',
	upload_item_factory_address_county_name varchar(50) NOT NULL COMMENT '商品厂家地址地区名称',
	
	upload_item_phone varchar(20) NOT NULL COMMENT '商家联系电话',
	upload_item_QQ varchar(20) NOT NULL COMMENT '商家QQ',
	PRIMARY KEY(upload_item_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;




--创建上传商品种类表 
CREATE table upload_item_kind(
	upload_item_kind_id bigint NOT NULL AUTO_INCREMENT COMMENT '种类表id',
	upload_item_kind_name varchar(100) NOT NULL COMMENT '商品种类名称',
	PRIMARY KEY(upload_item_kind_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_kind(upload_item_kind_id,upload_item_kind_name)
values
	('1','苹果'),
	('2','梨子');
	
	
--创建上传商品种类细节表
CREATE table upload_item_kind_detail(
	upload_item_kind_detail_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品种类细节表id',
	upload_item_kind_name varchar(100) NOT NULL COMMENT '商品种类名称',
	upload_item_kind_detail_name varchar(100) NOT NULL COMMENT '商品种类细节名称',
	
	PRIMARY KEY(upload_item_kind_detail_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_kind_detail(upload_item_kind_name,upload_item_kind_detail_name)
values
	('苹果','红富士'),
	('苹果','阿克苏'),
	('苹果','黄元帅'),
	('梨子','皇冠梨'),
	('梨子','鸭梨'),
	('梨子','秋月梨');

-----------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------	

	
--创建上传商品产地省级表
CREATE table 	upload_item_origin(
	upload_item_origin_id  bigint NOT NULL AUTO_INCREMENT COMMENT '产地表id',
	upload_item_origin_name varchar(50) NOT NULL COMMENT '产地名称',
	PRIMARY KEY(upload_item_origin_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_origin(upload_item_origin_id,upload_item_origin_name)
values
	('1','辽宁省'),
	('2','云南省');

--创建上传商品产地市级表
CREATE table 	upload_item_origin_city(
	upload_item_origin_city_id bigint NOT NULL AUTO_INCREMENT COMMENT '产地市级表id',
	upload_item_origin_name varchar(50) NOT NULL COMMENT '产地名称',
	upload_item_origin_city_name varchar(50) NOT NULL COMMENT '产地市级名称',
	PRIMARY KEY(upload_item_origin_city_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_origin_city(upload_item_origin_name,upload_item_origin_city_name)
values
	('辽宁省','大连市'),
	('云南省','曲靖市');
	

drop table upload_item_origin_county;

--创建上传商品产地县级表	
CREATE table 	upload_item_origin_county(
	upload_item_origin_county_id bigint NOT NULL AUTO_INCREMENT COMMENT '产地县级表id',
	upload_item_origin_city_name varchar(50) NOT NULL COMMENT '产地市级名称',
	upload_item_origin_county_name varchar(50) NOT NULL COMMENT '产地县级名称',
	PRIMARY KEY(upload_item_origin_county_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;	

--插入数据
insert into
	upload_item_origin_county(upload_item_origin_city_name,upload_item_origin_county_name)
values
	('大连市','西岗区'),
	('大连市','中山区'),
	('曲靖市','富源县'),
	('曲靖市','罗平县');

------------添加-----	
insert into
	upload_item_origin_county(upload_item_origin_city_name,upload_item_origin_county_name)
values
	('大连市','沙河口区'),
	('大连市','甘井子区'),	
	('大连市','旅顺口区');
	
		
--------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------
--创建商品单位表
--0表示 价格的单位
--1表示重量的单位
drop table upload_item_TTM_unit;
CREATE table upload_item_TTM_unit(
	upload_item_TTM_unit_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品单位表id',
	upload_item_TTM_unit_status varchar(10) NOT NULL COMMENT '标志位',
	upload_item_TTM_unit_rate varchar(50) NOT NULL COMMENT '单位名称',
	PRIMARY KEY(upload_item_TTM_unit_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_TTM_unit(upload_item_TTM_unit_status,upload_item_TTM_unit_rate)
values
	('0','￥'),
	('0','$'),
	('1','kg'),
	('1','t');

--商品特征参数表
CREATE table  upload_item_character_parameter(
	upload_item_character_parameter_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品特征参数表id',
	upload_item_character_parameter_form varchar(50) NOT NULL COMMENT '商品形状', 
	upload_item_character_parameter_color varchar(50) NOT NULL COMMENT '商品颜色', 
	PRIMARY KEY(upload_item_character_parameter_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据	
insert into
	upload_item_character_parameter(upload_item_character_parameter_id,upload_item_character_parameter_form,upload_item_character_parameter_color)
values
	('1','圆形','红色'),
	('2','椭圆形','黄色'),
	('3','扁形','白色');
	
--商品保存方式表
CREATE table upload_item_save_method(
	upload_item_save_method_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品保存方式表id',
	upload_item_save_method varchar(50) NOT NULL COMMENT '保存方式',
	PRIMARY KEY(upload_item_save_method_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_save_method(upload_item_save_method)
values
	('常温'),
	('冷藏');

	
	
------------------------------------------------------------------------
------------------------------------------------------------------------	
	
--商品厂家地址表
CREATE table upload_item_factory_address(
	upload_item_factory_address_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品厂家地址表id',
	upload_item_factory_address_name varchar(50) NOT NULL COMMENT '商品厂家地址名称',
	PRIMARY KEY(upload_item_factory_address_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据	
insert into 
	upload_item_factory_address(upload_item_factory_address_id,upload_item_factory_address_name)
values
	('1','辽宁省');

--商品厂家地址市区表	
CREATE table upload_item_factory_address_city(
	upload_item_factory_address_city_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品厂家地址市区表id',
	upload_item_factory_address_name varchar(50) NOT NULL COMMENT '商品厂家地址名称',
	upload_item_factory_address_city_name varchar(50) NOT NULL COMMENT '商品厂家地址市区名称',
	PRIMARY KEY(upload_item_factory_address_city_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据
insert into 
	upload_item_factory_address_city(upload_item_factory_address_name,upload_item_factory_address_city_name)
values
	('辽宁省','大连市');

--商品厂家地址地区表	
CREATE table upload_item_factory_address_county(
	upload_item_factory_address_county_id bigint NOT NULL AUTO_INCREMENT COMMENT '商品厂家地址地区表id',
	upload_item_factory_address_city_name varchar(50) NOT NULL COMMENT '商品厂家地址市区名称',
	upload_item_factory_address_county_name varchar(50) NOT NULL COMMENT '商品厂家地址地区名称',
	PRIMARY KEY(upload_item_factory_address_county_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

--插入数据	
insert into
	upload_item_factory_address_county(upload_item_factory_address_city_name,upload_item_factory_address_county_name)
values
	('大连市','开发区');

	
-------------新加---------------	
insert into
	upload_item_factory_address_county(upload_item_factory_address_city_name,upload_item_factory_address_county_name)
values
	('大连市','高新园区'),
	('大连市','金州区');
	
--创建语料库信息表	
drop table corpus;	


CREATE table corpus(
	corpus_id bigint NOT NULL AUTO_INCREMENT COMMENT '语料库id',
	corpus_english varchar(120) NOT NULL COMMENT '英语语料库', 
	corpus_chinese varchar(120) NOT NULL COMMENT '汉语语料库', 
	corpus_russian varchar(120) NOT NULL COMMENT '俄语语料库',
	corpus_tibetab varchar(120)  COMMENT '藏语语料库',
	corpus_mongolian varchar(120)  COMMENT '蒙古语语料库',
	corpus_thai  varchar(120)  COMMENT '泰语语料库',
	corpus_greek varchar(120)  COMMENT '希腊语语料库',
	corpus_turkish varchar(120)  COMMENT '土耳其语语料库',
	
	PRIMARY KEY(corpus_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into
	 corpus(corpus_english,corpus_chinese,corpus_russian,corpus_tibetab,corpus_mongolian,corpus_thai,corpus_greek,corpus_turkish)
values
	('apple','苹果','яблоко','ཀུ་ཤུ་','ᠠᠯᠮᠤᠷᠠᠳ','แอปเปิล','elma','Μήλα'),
	('Red Fuji','红富士','Fuji','ཧོང་ཧྥུ་ཧྲི་','fuji','ฟูจิสีแดง','Kırmızı Fuji','Κόκκινο Fuji'),
	('aikesu','阿克苏','Aksu','ཨ་ཁེ་སུའུ་','akesu','Aksu','Aksu','Aksu'),
	('Golden Delicious','黄元帅','Хуан Сяошуай','དམག་སྤྱི་ཧོང་གིས་','ᠰᠢᠷ᠎ᠠ ᠮᠠᠷᠱᠠᠯ','Huang Yuanshuai','Huang Yuanshuai','Στρατηγός'),
	
	('pear','梨子','груши','ལི་·','ᠬᠦᠱᠦ','ลูกแพร์','armut','Αχλάδι'),
	('Crown pear','皇冠梨','Корона груша','ལི་གོང་མའི་ཅོད་པན་','ᠬᠠᠭᠠᠨ ᠤ ᠲᠢᠲᠢᠮ ᠠᠯᠢᠮ᠎ᠠ','Crown pear','Taç armut','αχλάδια Crown'),
	('yali','鸭梨','груша','སིལ་སྐྱ་འཇོང་མ་','ᠠᠯᠢᠮᠠᠨ','เป็ด ลูกแพร์','ördek armut','Πάπια Αχλάδι'),
	('Autumn pear','秋月梨','Осенняя лунная груша','སྟོན་ཟླ་ཆང་བ་ལི་','ᠨᠠᠮᠤᠷ ᠤᠨ ᠰᠡᠷᠡᠠ ᠠᠯᠢᠮ᠎ᠠ','ลูกแพร์ดวงจันทร์','Sonbahar ay armut','αχλάδια Σελήνη'),
	
	('Liaoning Province','辽宁省','Провинция Ляонин','ལེའོ་ཉིང་ཞིང་ཆེན་','ᠯᠢᠶᠣᠤᠨᠢᠩ ᠮᠤᠵᠢ','จังหวัดเหลียวหนิง','Liaoning Eyaleti','Επαρχία Liaoning'),
	('Dalian city','大连市','Город Далянь','ཏ་ལན་གྲོང་ཁྱེར་གྱིས་','ᠳ᠋ᠠᠯᠢᠶᠠᠨ ᠬᠣᠲᠠ','ต้าเหลียนซิตี้','Dalian Şehri','Dalian Πόλη'),
	('xigang district','西岗区','Xigang','གཞིས་སྒང་','ᠪᠠᠷᠠᠭᠤᠨ ᠬᠠᠷᠠᠭᠤᠯ','เขต Xigang','Xigang Bölgesi','Xigang'),
	('Zhongshan District','中山区','Район Чжуншань','རི་ཁུལ་ནང་','ᠳᠤᠮᠳᠠ ᠠᠭᠤᠯᠠᠷᠬᠠᠭ ᠣᠷᠣᠨ','เขต Zhongshan','Zhongshan Bölgesi','Zhongshan'),
	('shahekou district','沙河口区','Район Шахекоу','ཧྲ་ཧོའུ་ཁུལ་','ᠱᠠ ᠾᠧ','เขต Shahekou','Shahekou Bölgesi','Περιοχή Shahekou'),
	('ganjingzi district','甘井子区','Ганьцзинский район','ཁྲོན་','ᠤᠰᠤ ᠨᠢ ᠠᠮᠲᠠᠲᠠᠶ ᠬᠤᠳᠳᠤᠭ ᠤᠨ','เขต Ganjingzi','Ganjingzi','Ganjingzi'),
	('lushunkou district','旅顺口区','Район Лушункоу','ལུའི་ཧྲུན་རྒྱ་མཚོའི་གྲུ་ཁ་','ᠯᠢᠦᠶᠢᠱᠦ᠋ᠨ ᠭᠠᠷᠠᠮ ᠤᠨ ᠣᠷᠣᠨ','port Arthur','port Arthur','Lushunkou'),
	
	('Yunnan Province','云南省','Провинция Юньнань','ཡུན་ནན་ཞིང་ཆེན་','ᠶᠦᠨᠨᠠᠨ ᠮᠤᠵᠢ','จังหวัดยูนนาน','Yunnan Eyaleti','Επαρχία Yunnan'),
	('Qujing','曲靖市','Qujing Город','ཆུས་ཅིང་གྲོང་ཁྱེར་','ᠴᠢᠦᠶ ᠵᠢᠩ','Qujing City','Qujing Şehri','Qujing Πόλη'),
	('Fuyuan County','富源县','Округ Фуюань','རྒྱུ་ནོར་འབྱུང་ཁུངས་','ᠡᠬᠢ ᠪᠠᠶᠠᠯᠢᠭ','Fuyuan เคาน์ตี้','Fuyuan County','Fuyuan County'),
	('Luoping County','罗平县','Luoping County','ལུའོ་ཕིང་རྫོང་','ᠯᠦᠸᠧ ᠫᠢᠩ ᠰᠢᠶᠠᠨ ᠤ','Luoping เคาน์ตี้','Luoping İlçe','Luoping County'),
	
	('￥','￥','￥','￥','￥ ','￥','￥','￥'),
	('$','$','$','$','$','$','$','$'),
	
	('Kg','Kg','Kg','Kg་','Kg','Kg','kg','Kg'),
	('T','T','T','T','T','T','T','Τ'),
	
	('round','圆形','круглый','ཟླ་གམ་','ᠲᠣᠭᠣᠷᠢᠭ','รอบ','yuvarlak','γύρος'),
	('oval','椭圆形','овальный','འཇོང་དབྱིབས་','ᠵᠤᠤᠪᠠᠩ','รูปไข่','oval','Οβάλ'),
	('flat','扁形','плоско','ལེབ་དབྱིབས་','ᠬᠠᠪᠲᠠᠭᠠᠶ','แบน','düz','Flat'),
	('red','红色','Красном','དམར་པོ་','ᠤᠯᠠᠭᠠᠨ ᠤᠢᠡᠭᠭᠡ','สีแดง','kırmızı','Κόκκινο'),
	('yellow','黄色','желтый','སེར་པོ་','ᠱᠠᠯᠢᠭ','สีเหลือง','sarı','Κίτρινο'),
	('white','白色','белый','དཀར་པོ་','ᠴᠠᠭᠠᠨ','ขาว','beyaz','Λευκό'),
	
	('ordinary temperature','常温','Нормальная температура','རྒྱུན་དྲོད་','ᠡᠩ ᠦᠨ ᠬᠠᠯᠠᠭᠤᠨ','อุณหภูมิปกติ','Oda sıcaklığı','Κανονική θερμοκρασία'),
	('cold storage','冷藏','Холодильная','འཁྱག་ཉར་','ᠬᠦᠢᠳᠡᠠ ᠬᠠᠳᠠᠭᠠᠯᠠᠯᠲᠠ','การแช่เย็น','soğutma','Ψύξη'),
	
	
	('area for development','开发区','Область разработки','གསར་སྤེལ་ཁུལ་དུ་གྱུར་ཡོད་','ᠨᠡᠭᠡᠭᠡᠯᠲᠡ ᠶᠢᠨ ᠣᠷᠣᠨ','พื้นที่พัฒนา','Geliştirme alanı','Περιοχή ανάπτυξης'),
	('high-tech zone','高新园区','Парк высоких технологий','མཐོ་གསར་གྱི་ཐོན་ལས་གླིང་','ᠳᠡᠭᠡᠳᠦ ᠰᠢᠨ᠎ᠡ ᠬᠦᠷᠢᠶᠡᠯᠡᠩ ᠲᠣᠭᠣᠷᠢᠭ','ไฮเทคพาร์ค','Yüksek teknoloji parkı','Πάρκο υψηλής τεχνολογίας'),
	('Jinzhou District','金州区','Голден Стэйт','ཅིན་ཀྲོའུ་','ᠵᠢᠨ ᠵᠧᠸ','รัฐโกลเด้น','golden State','Χρυσή Πολιτεία'),
	
	('System exception','系统异常','системы аномалия','མ་ལག་རྒྱུན་ལྡན་མིན་པ་།','ᠢᠰᠲ᠋ᠧᠮ ᠦᠨ ᠬᠡᠪ ᠦᠨ ᠪᠤᠰᠤ','ยกเว้นระบบ','Ανωμαλία συστήματος','Sistem anormalliği'),
	('Add Success','添加成功','Добавить успеха','སྦྱོར་རྟ་བྱེད་པ་ལེགས་འགྲུབ་བྱུང་','ᠨᠡᠮᠡᠭᠰᠡᠨ','เพิ่มเรียบร้อยแล้ว','Προστέθηκε με επιτυχία','Başarıyla eklendi'),
	('Add Failed','添加失败','не добавлять','ཕམ་ཁ་སྦྱོར་རྟ་','ᠨᠡᠮᠡᠵᠦ ᠳᠡᠶᠢᠯᠦᠭᠰᠡᠨ ᠦᠬᠡᠢ','เพิ่มล้มเหลว','Η προσθήκη απέτυχε','Ekleme başarısız oldu'),
	('Data is empty','数据为空','Нет данных','གཞི་གྲངས་སྟོང་།','ᠳ᠋ᠠᠶᠢᠲ᠋ᠠ ᠶᠢᠨ ᠬᠣᠭᠣᠰᠣᠨ','ข้อมูลว่างเปล่า','Τα δεδομένα είναι κενά','Veri boş');

	
	