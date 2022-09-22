package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public List<Team> findAll();
	public void insert(Team team);
	public Team findById(Integer id);
	public void update(Team team);
	public void deleteById(Integer id);
	
	
}
