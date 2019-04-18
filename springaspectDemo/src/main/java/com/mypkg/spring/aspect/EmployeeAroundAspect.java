package com.mypkg.spring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class EmployeeAroundAspect {
	@Around("execution(* com.mypkg.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before invoking getName() method");
		Object value=null;
		try{
			value=proceedingJoinPoint.proceed();
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("After invoking getName(); method the return value is "+value);
		return value;
	}
}
