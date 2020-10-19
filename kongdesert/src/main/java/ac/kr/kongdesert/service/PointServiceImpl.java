package ac.kr.kongdesert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.kr.kongdesert.dao.PointDao;
import ac.kr.kongdesert.model.Point;

@Service
public class PointServiceImpl implements PointService {

	@Autowired
	PointDao dao;
	
	@Override
	public List<Point> list() {
		return dao.list();
	}

	@Override
	public void add(Point item) {
		dao.add(item);
	}

	@Override
	public Point item(int pointnum) {
		return dao.item(pointnum);
	}

	@Override
	public void update(Point item) {
		dao.update(item);
	}

	@Override
	public void delete(int pointnum) {
		dao.delete(pointnum);
	}

}
