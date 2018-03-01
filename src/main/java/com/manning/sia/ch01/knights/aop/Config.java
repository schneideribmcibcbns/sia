package com.manning.sia.ch01.knights.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages={"com.manning.sia.ch01.knights.aop"})
@EnableAspectJAutoProxy
public class Config {
}
