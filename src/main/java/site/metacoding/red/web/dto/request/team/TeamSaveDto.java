package site.metacoding.red.web.dto.request.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamSaveDto {
	private Integer id;
	private Integer stadiumId;
	private Integer name;
	private Timestamp createdAt;
}
