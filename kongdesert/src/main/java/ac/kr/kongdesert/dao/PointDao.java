package ac.kr.kongdesert.dao;

import java.util.List;

import ac.kr.kongdesert.model.Point;

public interface PointDao {

	List<Point> list();

	void add(Point item);

	Point item(int pointnum);

	void update(Point item);

	void delete(int pointnum);

}
