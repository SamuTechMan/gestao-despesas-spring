package br.com.projetinspring.gestao_despesas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class GestaoDeDespesasApplication {

	public static void main(String[] args) {
        SpringApplication.run(GestaoDeDespesasApplication.class, args);
	}

}
