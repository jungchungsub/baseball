package site.metacoding.red.domain.player;

import java.util.List;


public interface PlayerDao {
	public List<Player> findAll();
	public void insert(Player player);
	public Player findById(Integer id);
	public void deleteById(Integer id);
}
