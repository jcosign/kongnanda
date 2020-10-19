package ac.kr.kongdesert.service;

import java.util.List;

import ac.kr.kongdesert.model.Goods;

public interface GoodsService {

	List<Goods> list();

	void add(Goods item);

	Goods item(int goodsid);

	void update(Goods item);

	void delete(int goodsid);

}
