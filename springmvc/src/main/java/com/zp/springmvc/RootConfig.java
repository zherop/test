package com.zp.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月29日
 */
@Configuration
@ComponentScan(basePackages = "com.zp.springmvc", excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class RootConfig {

}
