package dev.imrob;

import dev.imrob.config.DatabaseConfig;
import dev.imrob.entity.Pessoa;
import dev.imrob.impl.RobRepository;
import org.springframework.jdbc.core.simple.JdbcClient;

public class ExemploRepository implements RobRepository<Pessoa, Long> {
    /**
     * Obt�m o cliente JDBC usado para executar opera��es no banco de dados.
     *
     * @return A conex�o com o banco de dados usada pelo jdbcClient.
     */
    @Override
    public JdbcClient getConnection() {
        return DatabaseConfig.jdbcClient();
    }
}
