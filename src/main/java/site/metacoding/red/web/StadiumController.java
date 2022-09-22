package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping({"/","/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> stadiumList = stadiumService.구장전체보기();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/List";
	}
	
}	
