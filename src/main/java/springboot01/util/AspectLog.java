package springboot01.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Slf4j
@Aspect
@Component
public class AspectLog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//@Pointcut("execution(public * com.rlgk.driving.controller.*.*(..))")
	@Pointcut("execution(public * springboot01.controller.*.*(..))")
	public static void allMethod(){
		
	}
	
	/**
	 * 环绕通记录方法执行耗时
	 * @param p
	 * @return
	 * @throws Throwable
	 */
	@Around("allMethod()")
	public Object doAround(ProceedingJoinPoint p) throws Throwable{
		long startTime = System.currentTimeMillis();  
		Object obj = p.proceed();
		long endTime = System.currentTimeMillis();  
		MethodSignature signature = (MethodSignature) p.getSignature();  
	    String methodName = signature.getDeclaringTypeName() + "." + signature.getName(); 
	    log.info(methodName+" 运行耗时："+(endTime-startTime)+"ms");
		return obj;
	}
	
}
