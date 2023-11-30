package com.bokezg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: TODO
 * @Author: zguo
 * @CreateTime: 2023-11-30  10:52
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.bokezg.mapper")
public class BoKeZGApplication {
    public static void main(String[] args){
        SpringApplication.run(BoKeZGApplication.class);
    }
}
