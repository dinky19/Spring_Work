package com.example.springAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class EmployeeConfig {
	@Before("execution(public void show())")
public void logs()
{
	System.out.println("configurations");
}
}
