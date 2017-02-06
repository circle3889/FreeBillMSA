package kr.co.tworld.freebill.infra;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import kr.co.tworld.freebill.domain.meta.ItemMeta;
import kr.co.tworld.freebill.domain.meta.ItemMetaRepository;

@Repository
public class JPAItemMetaRepository implements ItemMetaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ItemMeta findByCode(String itemCode) {
		return entityManager.find(ItemMeta.class, itemCode);
	}
}
