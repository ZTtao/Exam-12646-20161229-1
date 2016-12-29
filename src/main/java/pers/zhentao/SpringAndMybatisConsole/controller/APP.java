package pers.zhentao.SpringAndMybatisConsole.controller;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.zhentao.SpringAndMybatisConsole.option.Option;
import pers.zhentao.SpringAndMybatisConsole.pojo.GetOptions;

public class APP{
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		context.start();
		GetOptions gos = (GetOptions)context.getBean("getOptions");
		List<Option> list = gos.getList();
		list.get(0).execute();
		context.stop();
		context.close();
		System.exit(0);
	}
}
