package site.metacoding.red.web.dto.request;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Getter
@Setter
public class InsertStadiumDto {
	private String name;
	private String area;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.name, this.area);
		return stadium;
	}
}
