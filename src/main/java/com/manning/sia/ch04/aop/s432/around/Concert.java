package com.manning.sia.ch04.aop.s432.around;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {

	@Override
	public void perform() {
		System.out.println("<<<<<< Nice symphony >>>>>>");

	}

}
