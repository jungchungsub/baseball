package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.request.player.InsertPlayerDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerdao;
	
	public List<Player> 선수전체보기(){
		List<Player> player = playerdao.findAll();
		return player;
	}
	
	public void 선수삭제하기(Integer id) {
		playerdao.deleteById(id);
	}
	
	public Player 선수한명만보기(Integer id) {
		return playerdao.findById(id);
	}
	
	public void 선수추가하기(Player player) {
		
	}
}
