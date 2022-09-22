package site.metacoding.red.domain.stadium;

import java.util.List;


public interface StadiumDao {
	public List<Stadium> findAll();
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
