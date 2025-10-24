package br.com.projetinspring.gestao_despesas.custom_messages;

import lombok.Data;

@Data
public class ErrorMessage {

    private String message;
    private String type;

    public ErrorMessage(String message, String type) {
        this.message = message;
        this.type = type;
    }

}
