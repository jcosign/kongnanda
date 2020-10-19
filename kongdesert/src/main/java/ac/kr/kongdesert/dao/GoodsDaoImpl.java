package ac.kr.kongdesert.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ac.kr.kongdesert.model.Goods;

@Repository
public class GoodsDaoImpl implements GoodsDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Goods> list() {
		return sql.selectList("Goods.list");
	}

	@Override
	public void add(Goods item) {
		sql.insert("Goods.add", item);
	}

	@Override
	public Goods item(int goodsid) {
		return sql.selectOne("Goods.item", goodsid);
	}

	@Override
	public void update(Goods item) {
		sql.update("Goods.update", item);
	}

	@Override
	public void delete(int goodsid) {
		sql.delete("Goods.delete",goodsid);
	}

}
