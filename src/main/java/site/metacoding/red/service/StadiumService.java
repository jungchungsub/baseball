package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.request.InsertStadiumDto;
import site.metacoding.red.web.dto.request.UpdateStadiumDto;

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
	
	public void 구장수정(Integer id, UpdateStadiumDto updateStadiumDto) {
		//영속화
		Stadium stadium = stadiumdao.findById(id);
		
		//필요한 부분 업데이트
		stadium.update(updateStadiumDto);
		
		//전체 업데이트
		stadiumdao.update(stadium);
	}
	

	
}
