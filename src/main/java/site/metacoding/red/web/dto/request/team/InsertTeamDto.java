package site.metacoding.red.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.team.Team;

@Getter
@Setter
public class InsertTeamDto {
	private Integer stadiumId;
	private String name;

	public Team toEntity() {
		Team team = new Team(this.stadiumId, this.name);
		return team;
	}
}
