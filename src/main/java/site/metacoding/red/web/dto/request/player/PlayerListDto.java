package site.metacoding.red.web.dto.request.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerListDto {
	private Integer id;
	private Integer teamId;
	private String teamName;
	private String position;
	private String name;
	private Timestamp createdAt;
}
