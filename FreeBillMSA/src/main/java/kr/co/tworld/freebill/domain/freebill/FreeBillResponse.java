package kr.co.tworld.freebill.domain.freebill;

import java.util.List;

public class FreeBillResponse {
	private String productName;
	private List<Item> voiceItems;
	private List<Item> dataItems;
	private List<Item> smsItems;
	private List<Item> etcItems;
	
	public FreeBillResponse(String productName, List voiceItems, List dataItems, List smsItems, List etcItems){
		this.productName = productName;
		this.voiceItems = voiceItems;
		this.dataItems  = dataItems;
		this.smsItems   = smsItems;
		this.etcItems   = etcItems;
	}

	public String getProductName() {
		return productName;
	}

	public List<Item> getVoiceItems() {
		return voiceItems;
	}

	public List<Item> getDataItems() {
		return dataItems;
	}

	public List<Item> getSmsItems() {
		return smsItems;
	}

	public List<Item> getEtcItems() {
		return etcItems;
	}
}
