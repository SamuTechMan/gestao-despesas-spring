package br.com.projetinspring.gestao_despesas.performance;

import br.com.projetinspring.gestao_despesas.entity.Despesa;
import br.com.projetinspring.gestao_despesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {

    @Autowired
    DespesasRepository despesasRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Rodando seeder de desempenho...");
        List<Despesa> despesas = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            Despesa despesa = new Despesa();
            despesa.setCategoria("Categoria " + i + (i+1));
            despesa.setData(LocalDate.now().minusDays(i % 30));
            despesa.setDescricao("Gasto n: " + i);
            despesa.setEmail("usuario" + i + "@performance.com");
            despesa.setValor(BigDecimal.valueOf(10 + (i % 50)));

            despesas.add(despesa);
        }

        despesasRepository.saveAll(despesas);
        System.out.println("Seeder de desempenho finalizado.");
    }
}
