package br.com.projetinspring.gestao_despesas.controller;


import br.com.projetinspring.gestao_despesas.custom_messages.ErrorMessage;
import br.com.projetinspring.gestao_despesas.entity.Despesa;
import br.com.projetinspring.gestao_despesas.useCases.BuscarDespesaUseCase;
import br.com.projetinspring.gestao_despesas.useCases.CadastroDespesasUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/gestao")
@RestController
public class GestaoDespesaController {

    @Autowired
    CadastroDespesasUseCase cadastroDespesasUseCase;

    @Autowired
    BuscarDespesaUseCase buscarDespesaUseCase;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Despesa despesa) {

        try {
            var result = cadastroDespesasUseCase.executar(despesa);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException ex) {
            var errorMessage = new ErrorMessage(ex.getMessage(), "INVALID_INPUT");
            return ResponseEntity.status(400).body(errorMessage);
        }
    }

    @GetMapping("/{email}")
    public List<Despesa> findByEmailAndDate(@PathVariable String email, @RequestParam(required = false) LocalDate data) {
        return buscarDespesaUseCase.execute(email, data);
    }
}
