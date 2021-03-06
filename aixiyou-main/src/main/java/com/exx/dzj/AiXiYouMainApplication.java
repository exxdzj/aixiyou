package com.exx.dzj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName AiXiYouMainApplication
 * @Description:
 * @Author yangyun
 * @Date 2019/11/20 0020 18:34
 * @Version 1.0
 **/
@SpringBootApplication
@EnableTransactionManagement // 开启事务
@ComponentScan("com.exx.dzj")
@MapperScan("com.exx.dzj.mapper") // mapper 包扫描
@EnableCaching //开启基于注解的缓存
@EnableScheduling   //开启任务调度
public class AiXiYouMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiXiYouMainApplication.class, args);
    }
}
