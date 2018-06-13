package com.MultilingualQuotient.enmus;


/**
 * 状态设置
 * @author depc
 *
 */
public enum MultilingualQuotientEnum {

	INNER_ERROR(-2, "系统异常"),
	INSERTSUCCESS (4,"添加成功"),
	INSERTFAIL(-4,"添加失败"),
	NULLDATA(-5,"数据为空");
	
	private int state;//状态

    private String stateInfo;//信息

	private MultilingualQuotientEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
    
}
