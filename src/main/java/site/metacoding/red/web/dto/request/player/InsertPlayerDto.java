package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Getter
@Setter
public class InsertPlayerDto {
	private String name;
	private Integer teamId;
	private String position;
	
}
