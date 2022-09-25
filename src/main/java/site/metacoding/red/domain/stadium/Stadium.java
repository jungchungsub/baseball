package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
	

}
