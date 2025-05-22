package com.my.sts.config;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.cj.jdbc.Driver;

//root-servlet.xml 역할
//db정보 세팅할거임
@Configuration //설정 파일 선언
@MapperScan("com.my.sts.model") //dao 인터페이스만을 사용한 db 조회 가능하도록 @Mapper 조회 위치 설정 어노테이션
public class RootConfig {
	
	@Bean //bean 으로 등록해줘야 작동함
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(Driver.class.getCanonicalName());
		dataSource.setUrl("jdbc:mysql://localhost:33306/xe");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		return dataSource;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());		
		return jdbcTemplate;
	}
	
	//마이바티스 어노테이션 구문 사용을 위한 설정 -> @Mapper 어노테이션 스캔은 클래스에서 선언한다
	@Bean
	public SqlSessionFactory getSessionFactory() throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(getDataSource());
		return factory.getObject();
	}
}
