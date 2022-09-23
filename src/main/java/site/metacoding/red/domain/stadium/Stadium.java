package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.request.stadium.UpdateStadiumDto;

@Getter
@Setter
@NoArgsConstructor
public class Stadium {
	private Integer id;
	private String name;
	private String area;
	private Timestamp createdAt;
	
	public Stadium(String name, String area) {
		this.name = name;
		this.area = area;
	}
	
	public void update(UpdateStadiumDto updateStadiumDto) {
		this.name = updateStadiumDto.getName();
	}
}
