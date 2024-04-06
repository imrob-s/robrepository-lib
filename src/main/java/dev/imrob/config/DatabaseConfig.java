package dev.imrob.config;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 *
 * @author Rob
 */
public class DatabaseConfig {

 public static DataSource dataSource() {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "postgres";

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    public static JdbcClient jdbcClient() {
        return JdbcClient.create(dataSource());
    }
    
}
