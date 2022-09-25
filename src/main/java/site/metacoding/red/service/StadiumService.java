package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.request.stadium.InsertStadiumDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	private final StadiumDao stadiumdao;
	
	
	
	public List<Stadium> 구장전체보기(){
		List<Stadium> stadium = stadiumdao.findAll();
		return stadium;
	}
	
	
	public void 구장추가하기(InsertStadiumDto insertStadiumDto) {
		stadiumdao.insert(insertStadiumDto.toEntity());
	}
	
	public void 구장삭제하기(Integer id) {
		stadiumdao.deleteById(id);
	}
	
	public Stadium 구장하나만보기(Integer id) {
		return stadiumdao.findById(id);
	}	
	
	
}
