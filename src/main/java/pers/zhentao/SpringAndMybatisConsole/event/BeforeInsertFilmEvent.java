package pers.zhentao.SpringAndMybatisConsole.event;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent{

	public BeforeInsertFilmEvent(Object source) {
		super(source);
	}
}
