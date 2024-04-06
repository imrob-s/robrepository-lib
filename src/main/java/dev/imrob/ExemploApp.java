package dev.imrob;

import dev.imrob.entity.Pessoa;
import java.util.List;

public class ExemploApp {
    public static void main(String[] args) {
        // Cria uma conexão com o banco de dados
        ExemploRepository repository = new ExemploRepository();

        // Criando 3 objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa(null, "Joao", "12456321485", "joao@email.com");
        Pessoa pessoa2 = new Pessoa(2L, "Maria", "12456321485", "maria@email.com");
        Pessoa pessoa3 = new Pessoa(3L, "Pedro", "12456321485", "pedro@email.com");

        List<Pessoa> pessoas = repository.findAll(); // Retorna uma lista de objetos da classe Pessoa do banco de dados
        Pessoa pessoa = repository.findById(3L); // Retorna um objeto da classe Pessoa do banco de dados
        repository.save(pessoa1); // Salva um objeto da classe Pessoa no banco de dados
        repository.update(pessoa2); // Atualiza um objeto da classe Pessoa no banco de dados
        repository.delete(3L); // Deleta um objeto da classe Pessoa do banco de dados

    }
}
