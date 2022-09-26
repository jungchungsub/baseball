package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private Timestamp createdAt;	
}
