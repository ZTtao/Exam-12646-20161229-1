package pers.zhentao.SpringAndMybatisConsole.option.impl;

import java.util.Scanner;

import pers.zhentao.SpringAndMybatisConsole.option.Option;
import pers.zhentao.SpringAndMybatisConsole.pojo.Film;
import pers.zhentao.SpringAndMybatisConsole.service.IFilmService;

public class AddFilm implements Option{

	private String title;
	private IFilmService filmService;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入电影名称(title):");
		String title = scanner.nextLine();
		System.out.println("请输入电影描述(description):");
		String description = scanner.nextLine();
		System.out.println("请输入语言ID(language_id):");
		String languageId = scanner.nextLine();
		if(!checkTitle(title)){
			System.out.println("Error:Title为空");
		}
		if(!checkLanguageId(languageId)){
			System.out.println("Error:LanguageId错误");
		}else{
			try{
				Film film = new Film();
				film.setTitle(title.trim());
				film.setDescription(description.trim());
				film.setLanguageId(Integer.parseInt(languageId.trim()));
				filmService.addFilm(film);
			}catch(Exception e){
				System.out.println("Exception:出现异常");
			}
		}
		scanner.close();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	public void setFilmService(IFilmService filmService) {
		this.filmService = filmService;
	}
	private boolean checkTitle(String title){
		if(title.trim().equals(""))
			return false;
		if(title.trim().length()>255)
			return false;
		return true;
	}
	private boolean checkLanguageId(String languageId){
		try{
			int id = Integer.parseInt(languageId.trim());
			return filmService.checkLanguageId(id);
		}catch(Exception e){
			return false;
		}
	}
}
