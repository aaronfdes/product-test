package com.shopping.arch.logging;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Logging configuration aspect.<br/>
 * This class will intercept all com.shopping methods and log the method name,
 * before arguments, after arguments and return arguments.
 * 
 * @author aaron on 13-Mar-2016
 */
@Aspect
@Component
public class LoggingConfig {

	private static final Logger logger = LoggerFactory.getLogger(LoggingConfig.class);

	/**
	 * the pointcut to intercept
	 */
	@Pointcut("execution(* com.shopping..*.*(..))")
	private void pointcut() {
	}

	/**
	 * advice to execute around every method which matches the pointcut
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("pointcut()")
	public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {

		logger.debug("Started " + getMessage(joinPoint));
		Object returnVal = joinPoint.proceed();
		logger.debug("Finished " + getMessage(joinPoint) + " returning value : " + returnVal);
		return returnVal;
	}

	/**
	 * method to generate a generic message to log
	 * @param joinPoint 
	 * @return String in the format 'fully qualified method name' with args : 'args'
	 */
	private String getMessage(ProceedingJoinPoint joinPoint) {
		StringBuffer logMessage = new StringBuffer();
		logMessage.append(joinPoint.getSignature());
		logMessage.append(" with args : ");
		logMessage.append(Arrays.toString(joinPoint.getArgs()));
		return logMessage.toString();
	}
}
