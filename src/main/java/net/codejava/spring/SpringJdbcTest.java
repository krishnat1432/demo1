package net.codejava.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringJdbcTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("ROOT");
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		String sql="INSERT INTO books(title,author,price) VALUES(?,?,?)";
		int result=jdbcTemplate.update(sql,"JAVA","philllips",45.23f);
		if(result>0)
		{
			System.out.println("record is saved");	
		}
		

	}

}
