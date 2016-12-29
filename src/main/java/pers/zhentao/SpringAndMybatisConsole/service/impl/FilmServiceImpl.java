package pers.zhentao.SpringAndMybatisConsole.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.zhentao.SpringAndMybatisConsole.dao.FilmMapper;
import pers.zhentao.SpringAndMybatisConsole.pojo.Film;
import pers.zhentao.SpringAndMybatisConsole.service.IFilmService;

@Service("FilmServiceImpl")
public class FilmServiceImpl implements IFilmService{

	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public boolean addFilm(Film film) throws Exception {
		try{
			int count = filmMapper.insertFilm(film);
			if(count > 0){
				return true;
			}else throw new Exception();
			
		}catch(Exception e){
			throw e;
		}
	}

	@Override
	public boolean checkLanguageId(int id) throws Exception {
		try{
			int count = filmMapper.countByLanguageId(id);
			if(count > 0)return true;
			else return false;
		}catch(Exception e){
			throw e;
		}
	}

}
