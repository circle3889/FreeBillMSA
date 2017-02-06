package kr.co.tworld.freebill.domain.meta;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@Table(name = "ZP_FREE_ITM_MGMT")
public class ItemMeta {
	
	@EmbeddedId
	private ItemCode code;
	
	@Column(name="FREE_ITM_NM")
	private String englishName;
	
	@Column(name="FREE_ITM_APLY_YN")
	private String isView;
	
	public ItemMeta(String code, String englishName, String isView){
		this.code = new ItemCode(code);
		this.englishName = englishName;
		this.isView = isView;
	}

	public ItemCode getCode() {
		return code;
	}

	public String getEnglishName() {
		return englishName;
	}

	public String isView() {
		return isView;
	}
}
