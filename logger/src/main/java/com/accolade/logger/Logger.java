package com.accolade.logger;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by elliott.jacobsen on 11/9/16.
 */

@Aspect
public class Logger {

    public static final String LOG_TAG = Logger.class.getSimpleName();

    //Defines a pointcut that we can use in the @Before,@After, @AfterThrowing, @AfterReturning,@Around specifications
    //The pointcut will look for the @YourAnnotation
    @Pointcut("@annotation(methodName)")
    public void annotationPointCutDefinition(String methodName){
    }

    //Defines a pointcut that we can use in the @Before,@After, @AfterThrowing, @AfterReturning,@Around specifications
    //The pointcut is a catch-all pointcut with the scope of execution
    @Pointcut("execution(* *(..))")
    public void atExecution(){}

    // Uses the above-defined pointcuts to only run this advice when the annotation is specified AND
    // that it's during execution.
    @Before("annotationPointCutDefinition(methodName) && atExecution()")
    public void printMethodName(JoinPoint joinPoint, MyAnnotation methodName) {
        Log.d(LOG_TAG, methodName.toString());
    }
}
