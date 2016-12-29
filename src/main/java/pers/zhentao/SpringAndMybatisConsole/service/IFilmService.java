package pers.zhentao.SpringAndMybatisConsole.service;

import pers.zhentao.SpringAndMybatisConsole.pojo.Film;

public interface IFilmService{
	boolean addFilm(Film film)throws Exception;
	boolean checkLanguageId(int id)throws Exception;
}
