package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.request.team.TeamListDto;
import site.metacoding.red.web.dto.request.team.TeamSaveDto;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	@GetMapping("/teamList")
	public String TeamList(Model model) {
		List<TeamListDto> teamList = teamService.팀전체보기();
		model.addAttribute("teamlist", teamList);
		return "team/Teamlist";
	}
	
	
	
	@GetMapping("/teamSaveForm")
	public String teamSaveForm(Model model) {
		model.addAttribute("stadium",stadiumService.구장전체보기());
		return "team/teamSaveForm";
	}

	@DeleteMapping("/team/delete")
	public @ResponseBody CMRespDto<?> deleteTeam(Integer id){
		teamService.팀삭제하기(id);
		return new CMRespDto<>(1, "삭제성공", null);
	}
	
	@PostMapping("/team/insert")
	public @ResponseBody CMRespDto<?> insertTeam(@RequestBody TeamSaveDto teamSaveDto) {
		teamService.팀추가하기(teamSaveDto);
		return new CMRespDto<>(1, "추가성공", null);
	}
}	
