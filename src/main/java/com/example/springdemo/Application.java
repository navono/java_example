package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication 注解标注启动类，被标注的类为一个配置类，会触发自动配置和
// Starter 组件扫描。其有以下职责：
// - 在被该注解修饰的类中，可以用 @Bean 注解来配置多个 Bean 。应用启动时，Spring 容器会加载 Bean 并注入到 Spring 容器
// - 启动 Spring 上下文的自动配置。基于依赖和定义的 Bean 会自动配置需要的 Bean 和类
// - 扫描被 @Configuration 修饰的配置类。也会扫描 Starter 组件的配置类，并启动加载其默认配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // SpringApplication 职责：
        // - 创建应用上下文 ApplicationContext 实例
        // - 注册 CommandLinePropertySource，将命令行参数赋值到 Spring 属性
        // - 刷新应用上下文，加载所有单例
        // - 触发所有 CommandLineRunner Bean
    }
}
