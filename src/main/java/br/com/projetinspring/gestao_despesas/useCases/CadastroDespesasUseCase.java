package br.com.projetinspring.gestao_despesas.useCases;

import br.com.projetinspring.gestao_despesas.entity.Despesa;
import br.com.projetinspring.gestao_despesas.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesasUseCase {

    @Autowired
    private DespesasRepository despesasRepository;

    public Despesa executar(Despesa despesa) {

        if(despesa.getCategoria() == null || despesa.getData() == null || despesa.getDescricao() == null || despesa.getEmail() == null || despesa.getValor() == null) {
            throw new IllegalArgumentException("Todos os campos devem ser preenchidos ! ! !");
        }

        despesa = despesasRepository.save(despesa);
        return despesa;
    }
}
