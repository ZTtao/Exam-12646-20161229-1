package pers.zhentao.SpringAndMybatisConsole.handler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import pers.zhentao.SpringAndMybatisConsole.event.AfterInsertFilmEvent;
import pers.zhentao.SpringAndMybatisConsole.event.BeforeInsertFilmEvent;

@Aspect
public class MyHandler implements ApplicationContextAware{
	private ApplicationContext context;
	
	@Before("execution(* pers.zhentao.SpringAndMybatisConsole.service.IFilmService.addFilm(..))")
	public void beforePrint(JoinPoint point){
		context.publishEvent(new BeforeInsertFilmEvent(context));
	}
	@After("execution(* pers.zhentao.SpringAndMybatisConsole.service.IFilmService.addFilm(..))")
	public void afterPrint(JoinPoint point){
		context.publishEvent(new AfterInsertFilmEvent(context));
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}
