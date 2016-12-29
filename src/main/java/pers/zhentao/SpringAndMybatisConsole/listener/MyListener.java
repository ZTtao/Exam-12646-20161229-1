package pers.zhentao.SpringAndMybatisConsole.listener;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

import pers.zhentao.SpringAndMybatisConsole.event.AfterInsertFilmEvent;
import pers.zhentao.SpringAndMybatisConsole.event.BeforeInsertFilmEvent;

public class MyListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if(event instanceof BeforeInsertFilmEvent){
			System.out.println("Before Insert Film Data");
		}else if(event instanceof AfterInsertFilmEvent){
			System.out.println("After Insert Film Data");
		}else if(event instanceof ContextStartedEvent){
			System.out.println("Context Start");
		}else if(event instanceof ContextStoppedEvent){
			System.out.println("Context Stop");
		}
	}

}
