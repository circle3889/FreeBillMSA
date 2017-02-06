package kr.co.tworld.freebill.domain.freebill;

public interface FreeBillRepository {
	
	public FreeBill findBySvcmgmtNum(String svcMgmtNum); 
}
