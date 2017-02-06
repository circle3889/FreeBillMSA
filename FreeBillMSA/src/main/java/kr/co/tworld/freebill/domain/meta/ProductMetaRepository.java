package kr.co.tworld.freebill.domain.meta;


public interface ProductMetaRepository {
	public ProductMeta findByProductId(String productId); 
}
