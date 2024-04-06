package dev.imrob;

import dev.imrob.config.DatabaseConfig;
import dev.imrob.entity.Pessoa;
import dev.imrob.impl.RobRepository;
import org.springframework.jdbc.core.simple.JdbcClient;

public class ExemploRepository implements RobRepository<Pessoa, Long> {
    /**
     * Obtém o cliente JDBC usado para executar operações no banco de dados.
     *
     * @return A conexão com o banco de dados usada pelo jdbcClient.
     */
    @Override
    public JdbcClient getConnection() {
        return DatabaseConfig.jdbcClient();
    }
}
