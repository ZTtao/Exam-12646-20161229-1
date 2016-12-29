package pers.zhentao.SpringAndMybatisConsole.dao;

import pers.zhentao.SpringAndMybatisConsole.pojo.Film;

public interface FilmMapper {
	int insertFilm(Film film);
	int countByLanguageId(int id);
}
