package site.metacoding.red.domain.team;

import java.util.List;

import site.metacoding.red.web.dto.request.team.TeamListDto;
import site.metacoding.red.web.dto.request.team.TeamSaveDto;

public interface TeamDao {
	public List<TeamListDto> findAll();
	public Team findById(Integer id);
	public void update(Team team);
	public void deleteById(Integer id);
	public void insert(TeamSaveDto teamSaveDto);
}
