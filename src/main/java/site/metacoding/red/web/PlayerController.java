package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamService;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final StadiumService stadiumService;
	private final TeamService teamService;
	
	@GetMapping("/player")
	public String playerList(Model model) {
		List<Player> List = playerService.선수전체보기();
		model.addAttribute("playerlist", List);
		return "player/playerList";
	}
	
	@GetMapping("/playerSaveForm")
	public String playerSaveForm(Model model) {
		model.addAttribute("stadium", stadiumService.구장전체보기());
		model.addAttribute("team", teamService.팀전체보기());
		return "player/playerSaveForm";
	}
	
}
