package kr.co.tworld.freebill.domain.meta;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ZP_FREE_PROD_MGMT")
public class ProductMeta {
	
	private String productId;
	private String productEnglishName;
	private boolean isView;
	
	public ProductMeta(String productId, String productEnglishName, String isView){
		this.productId = productId;
		this.productEnglishName = productEnglishName;
		
		this.isView = ("N".equals(isView)) ? false : true ;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductEnglishName() {
		return productEnglishName;
	}

	public boolean isView() {
		return isView;
	}
}
