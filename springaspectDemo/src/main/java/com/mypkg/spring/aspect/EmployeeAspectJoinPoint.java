package com.mypkg.spring.aspect;
import java.util.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {
	@Before("execution(public void com.mypkg.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before runing logging advice on method ="+joinPoint.toString());
		System.out.println("Arguments passed ="+Arrays.toString(joinPoint.getArgs()));
	}
	@Before("args(name)")
	public void logStringArguments(String name){
		System.out.println("Strign argument passed :"+name);
	}
}
