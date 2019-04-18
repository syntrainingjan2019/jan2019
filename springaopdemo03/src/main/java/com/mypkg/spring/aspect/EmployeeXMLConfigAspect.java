package com.mypkg.spring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
public class EmployeeXMLConfigAspect {
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Emplolyee xmlconfigaspwect :: before invoking getName() method");
		Object value=null;
		try{
			value=proceedingJoinPoint.proceed();
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect :: Afeter invoking getName() method retun value ="+value.toString());
		return value;
	}
}
