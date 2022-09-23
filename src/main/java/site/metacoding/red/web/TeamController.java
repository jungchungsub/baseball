package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.request.team.InsertTeamDto;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	
	@GetMapping({"/teamList"})
	public String TeamList(Model model) {
		List<Team> Teamlist = teamService.팀전체보기();
		model.addAttribute("Teamlist", Teamlist);
		return "team/Teamlist";
	}
	
	@PostMapping("/team")
	public CMRespDto<?> insertTeam(@RequestBody InsertTeamDto insertTeamDto){
		teamService.팀추가하기(insertTeamDto);
		return new CMRespDto<>(1, "팀등록성공", null);
	}

	
}	
