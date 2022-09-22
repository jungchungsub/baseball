package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamdao;
	
	
	public List<Team> 팀전체보기(){
		List<Team> team = teamdao.findAll();
		return team;
	};
	
	//public void insert(Team team);
	
	
	public Team 팀하나찾기(Integer id) {
		return teamdao.findById(id);
	};
	
	public void 팀삭제하기(Integer id) {
		teamdao.deleteById(id);
	};
}
