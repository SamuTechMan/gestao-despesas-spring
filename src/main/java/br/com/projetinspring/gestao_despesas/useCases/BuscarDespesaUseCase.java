package br.com.projetinspring.gestao_despesas.useCases;

import br.com.projetinspring.gestao_despesas.entity.Despesa;
import br.com.projetinspring.gestao_despesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BuscarDespesaUseCase {

    @Autowired
    private DespesasRepository despesasRepository;

    public List<Despesa> execute(String email, LocalDate data) {

        List<Despesa> despesas;
        if (data != null) {
            despesas = despesasRepository.findByEmailAndData(email, data);
        } else {
            despesas = despesasRepository.findByEmail(email);
        }
        return despesas;
    }
}
