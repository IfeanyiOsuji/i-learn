package com.ileiwe;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class IleWeApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
	}
	@Test
	public void connectionToDataBaseTest(){
		String url = "jdbc:mysql://localhost:3306/ile_iwedb";
		String username = "school_user";
		String password = "iwe123";
		assertThat(dataSource).isNotNull();
		log.info("Datasource properties -> {}", dataSource);
		try {
			Connection connection = dataSource.getConnection();
			assertThat(connection).isNotNull();
		}
		catch (SQLException exception){
			log.info("An exception occured -> {}", exception.getMessage());
		}
	}

}
