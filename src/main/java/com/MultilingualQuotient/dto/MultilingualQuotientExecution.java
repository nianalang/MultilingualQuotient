package com.MultilingualQuotient.dto;

import java.io.Serializable;


/**
 * 封装执行结果
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class MultilingualQuotientExecution implements Serializable{

	/**
     * 执行结果状态
     */
    private int state;

    /**
     * 状态表示
     */
    private String stateInfo;

	public MultilingualQuotientExecution(int state, String stateInfo) {
		super();
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
