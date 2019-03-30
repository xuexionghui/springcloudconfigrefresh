package com.junlaninfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  作者：xuexionghui
        邮箱：413669152@qq.com
        时间：2019年3月29日
        类作用：
 */
@SpringBootApplication
@EnableEurekaServer
public class aurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(aurekaApplication.class, args);

	}

}
