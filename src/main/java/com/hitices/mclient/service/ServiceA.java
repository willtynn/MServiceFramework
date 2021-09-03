package com.hitices.mclient.service;


import com.hitices.mclient.annotation.MNextService;
import com.hitices.mclient.annotation.MSvcFunc;
import com.hitices.mclient.base.MSvcObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceA extends MSvcObject {

    @MSvcFunc
    @MNextService(value = {"aTestB","aTestC"})
    public void aTestA(){
        log.info("this is ServiceA-testA");
    }

    @MSvcFunc
    @MNextService(value = {"aTestC"})
    public void aTestB(){
        log.info("this is ServiceA-testB");
    }

    @MSvcFunc
    public void aTestC(){
        log.info("this is ServiceA-testC");
    }


}