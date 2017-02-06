package kr.co.tworld.freebill.domain.meta;


public interface ItemMetaRepository {
	public ItemMeta findByCode(String itemCode);
}
