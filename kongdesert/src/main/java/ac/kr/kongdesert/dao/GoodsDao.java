package ac.kr.kongdesert.dao;

import java.util.List;

import ac.kr.kongdesert.model.Goods;

public interface GoodsDao {

	List<Goods> list();

	void add(Goods item);

	Goods item(int goodsid);

	void update(Goods item);

	void delete(int goodsid);

}
