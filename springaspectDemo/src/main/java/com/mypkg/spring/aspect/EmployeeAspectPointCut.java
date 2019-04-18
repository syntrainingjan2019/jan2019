package com.mypkg.spring.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
public class EmployeeAspectPointCut {
	@Before("getNamePointCut()")
	public void loggingAdvice(){
		System.out.println("Executing loggingAdvice on getName()");
	}
	@Before("getNamePointCut()")
	public void secondAdvice(){
		System.out.println("Executing second Advice on getName()");
	}
	@Pointcut("execution(public String getName())")
	public void getnamePointCut(){
		System.out.println("Executing point cut for getName()");
	}
	@Before("allMethodsPointCut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Executing service methods ");
	}
	@Pointcut("within(com.mypkg.spring.service.*)")
	public void allMethodsPointCut(){
		System.out.println("Executing point cut for getName()");
	}
}
