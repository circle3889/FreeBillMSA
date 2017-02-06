package kr.co.tworld.freebill.domain.freebill;

public class Item {
	private String productId;
	private String productName;
	private String itemCode;
	private String itemName;
	private String baseQuantity;
	private String useQuantity;
	private String remainingQuantity;
	private String unit;
	private String couponRegdate;
	private String unlimitedType;
	private String itemType;
	private int priority;
	private String percent;
	
	public Item(
			String productId,
			String productName,
			String itemCode,
			String itemName,
			String baseQuantity,
			String useQuantity,
			String remainingQuantity,
			String unit,
			String couponRegdate,
			String unlimitedType,
			String itemType,
			int priority
			){
		this.productId = productId;
		this.productName = productName;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.baseQuantity = baseQuantity;
		this.useQuantity = useQuantity;
		this.remainingQuantity = remainingQuantity;
		this.unit = unit;
		this.couponRegdate = couponRegdate;
		this.unlimitedType = unlimitedType;
		this.itemType = itemType;
		this.priority = priority;
	}
	
	public String getProductId(){
		return this.productId;
	}

	public String getProductName(){
		return this.productName;
	}
	
	public String getItemCode(){
		return this.itemCode;
	}
	
	public String getItemName(){
		return this.itemName;
	}
	
	public String getBaseQuantity(){
		return this.baseQuantity;
	}
	
	public String getUseQuantity(){
		return this.useQuantity;
	}
	
	public String getRemainingQuantity(){
		return this.remainingQuantity;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public String getCouponRegdate() {
		return couponRegdate;
	}
	
	public String getUnlimitedType() {
		return unlimitedType;
	}
	
	public String getItemType() {
		return itemType;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getPercent() {
		return percent;
	}	
}
