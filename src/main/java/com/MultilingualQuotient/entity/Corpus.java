package com.MultilingualQuotient.entity;

import java.io.Serializable;

/**
 * 语料库信息表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class Corpus implements Serializable {

	/*
	 * 语料库id
	 */
	private Integer corpus_id;

	/*
	 * 英语语料库
	 */
	private String corpus_english;

	/*
	 * 汉语语料库
	 */
	private String corpus_chinese;

	/*
	 * 俄语语料库
	 */
	private String corpus_russian;

	/*
	 * 藏语语料库
	 */
	private String corpus_tibetab;

	/*
	 * 蒙古语语料库
	 */
	private String corpus_mongolian;

	/*
	 * 泰语语料库
	 */
	private String corpus_thai;

	/*
	 * 希腊语语料库
	 */
	private String corpus_greek;

	/*
	 * 土耳其语语料库
	 */
	private String corpus_turkish;

	public Integer getCorpus_id() {
		return corpus_id;
	}

	public void setCorpus_id(Integer corpus_id) {
		this.corpus_id = corpus_id;
	}

	public String getCorpus_english() {
		return corpus_english;
	}

	public void setCorpus_english(String corpus_english) {
		this.corpus_english = corpus_english;
	}

	public String getCorpus_chinese() {
		return corpus_chinese;
	}

	public void setCorpus_chinese(String corpus_chinese) {
		this.corpus_chinese = corpus_chinese;
	}

	public String getCorpus_tibetab() {
		return corpus_tibetab;
	}

	public void setCorpus_tibetab(String corpus_tibetab) {
		this.corpus_tibetab = corpus_tibetab;
	}

	public String getCorpus_mongolian() {
		return corpus_mongolian;
	}

	public void setCorpus_mongolian(String corpus_mongolian) {
		this.corpus_mongolian = corpus_mongolian;
	}

	public String getCorpus_russian() {
		return corpus_russian;
	}

	public void setCorpus_russian(String corpus_russian) {
		this.corpus_russian = corpus_russian;
	}

	public String getCorpus_thai() {
		return corpus_thai;
	}

	public void setCorpus_thai(String corpus_thai) {
		this.corpus_thai = corpus_thai;
	}

	public String getCorpus_greek() {
		return corpus_greek;
	}

	public void setCorpus_greek(String corpus_greek) {
		this.corpus_greek = corpus_greek;
	}

	public String getCorpus_turkish() {
		return corpus_turkish;
	}

	public void setCorpus_turkish(String corpus_turkish) {
		this.corpus_turkish = corpus_turkish;
	}

	@Override
	public String toString() {
		return "Corpus [corpus_id=" + corpus_id + ", corpus_english=" + corpus_english + ", corpus_chinese="
				+ corpus_chinese + ", corpus_russian=" + corpus_russian + ", corpus_tibetab=" + corpus_tibetab
				+ ", corpus_mongolian=" + corpus_mongolian + ", corpus_thai=" + corpus_thai + ", corpus_greek="
				+ corpus_greek + ", corpus_turkish=" + corpus_turkish + "]";
	}

}
