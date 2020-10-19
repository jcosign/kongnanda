package ac.kr.kongdesert.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ac.kr.kongdesert.model.Point;

@Repository
public class PointDaoImpl implements PointDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Point> list() {
		return sql.selectList("Point.list");
	}

	@Override
	public void add(Point item) {
		sql.insert("Point.add", item);
	}

	@Override
	public Point item(int pointnum) {
		return sql.selectOne("Point.item", pointnum);
	}

	@Override
	public void update(Point item) {
		sql.update("Point.update", item);
	}

	@Override
	public void delete(int pointnum) {
		sql.delete("Point.delete", pointnum);
	}

}
