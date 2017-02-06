package kr.co.tworld.freebill.application;

import kr.co.tworld.freebill.domain.freebill.FreeBill;
import kr.co.tworld.freebill.domain.freebill.FreeBillRepository;

public class FreeBillService {
	private FreeBillRepository freeBillRepositoryRepository;
	private String svcMgmtNum;
	
	public FreeBillService(FreeBillRepository freeBillRepositoryRepository, String svcMgmtNum){
		this.freeBillRepositoryRepository = freeBillRepositoryRepository;
		this.svcMgmtNum = svcMgmtNum;
	}
	
	public FreeBill getRemainingCall(){
		return freeBillRepositoryRepository.findBySvcmgmtNum(svcMgmtNum);
	}
}
