package ac.kr.kongdesert.service;

import java.util.List;

import ac.kr.kongdesert.model.Point;

public interface PointService {

	List<Point> list();

	void add(Point item);

	Point item(int pointnum);

	void update(Point item);

	void delete(int pointnum);

}
