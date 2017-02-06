package kr.co.tworld.freebill.domain.freebill;

import java.util.ArrayList;
import java.util.List;

public class FreeBill {
	
	public FreeBillResponse getRemainingCall(List items){
		
		List<Item> originItems = items;
		
		String productName = "";
		List<Item> voiceItems = new ArrayList();
		List<Item> dataItems = new ArrayList();
		List<Item> smsItems = new ArrayList();
		List<Item> etcItems = new ArrayList();
		
		FreeBillResponse response = new FreeBillResponse(productName, voiceItems, dataItems, smsItems, etcItems);
		
		return response;
	}
}
