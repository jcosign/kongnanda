package ac.kr.kongdesert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.kr.kongdesert.dao.GoodsDao;
import ac.kr.kongdesert.model.Goods;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsDao dao;
	
	@Override
	public List<Goods> list() {
		return dao.list();
	}

	@Override
	public void add(Goods item) {
		dao.add(item);
	}

	@Override
	public Goods item(int goodsid) {
		return dao.item(goodsid);
	}

	@Override
	public void update(Goods item) {
		dao.update(item);
	}

	@Override
	public void delete(int goodsid) {
		dao.delete(goodsid);
	}


}
