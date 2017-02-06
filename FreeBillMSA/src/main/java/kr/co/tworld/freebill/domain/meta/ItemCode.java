package kr.co.tworld.freebill.domain.meta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemCode implements Serializable {
	
	@Column(name="FREE_ITM_CD")
	private String code;
	
	ItemCode(){}
	
	public ItemCode(String code){
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
