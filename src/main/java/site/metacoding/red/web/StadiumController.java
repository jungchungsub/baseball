package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.request.stadium.InsertStadiumDto;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping({"/","/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> List = stadiumService.구장전체보기();
		model.addAttribute("List", List);
		return "stadium/List";
	}
	
	@PostMapping("/stadium")
	public CMRespDto<?> insertStadium(@RequestBody InsertStadiumDto insertStadiumDto){
		stadiumService.구장추가하기(insertStadiumDto);
		return new CMRespDto<>(1, "등록성공", null);	
	} 
	
	@GetMapping("/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "stadium/stadiumSaveForm";
	}
	
	
	
	
	
	
}	
