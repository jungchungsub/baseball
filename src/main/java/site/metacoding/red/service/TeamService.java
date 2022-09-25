package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.request.stadium.InsertStadiumDto;
import site.metacoding.red.web.dto.request.team.InsertTeamDto;
import site.metacoding.red.web.dto.request.team.TeamListDto;
import site.metacoding.red.web.dto.request.team.TeamSaveDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamdao;
	
	
	public List<TeamListDto> 팀전체보기(){
		List<TeamListDto> teamList = teamdao.findAll();
		return teamList;
	};
	

	public Team 팀하나찾기(Integer id) {
		return teamdao.findById(id);
	};
	
	public void 팀삭제하기(Integer id) {
		teamdao.deleteById(id);
	};
	
	public void 팀추가하기(TeamSaveDto teamSaveDto) {
		teamdao.insert(teamSaveDto);
	}
	
	
}
