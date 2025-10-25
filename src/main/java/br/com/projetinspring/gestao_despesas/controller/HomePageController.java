package br.com.projetinspring.gestao_despesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public String HomePageController() {
        return "<!DOCTYPE html>"
                + "<html lang=\"pt-BR\">"
                + "<head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">"
                + "<title>Gestão de Despesas</title>"
                + "<style>"
                + "body{font-family:Arial,Helvetica,sans-serif;display:flex;align-items:center;justify-content:center;height:100vh;margin:0;background:#E0F0FF}"
                + ".card{background:#2E0000;padding:32px;border-radius:15px;box-shadow:0 4px 12px rgba(0,0,0,.08);text-align:center}"
                + "h1{margin:0 0 8px;color:#FFE1E0; text-shadow: 2.5px 2.5px blue;} p{margin:0;color:#F5F5F5; opacity:0.5; text-shadow: 0.8px 0.8px blue;}"
                + "a.btn{display:inline-block;margin-top:12px;padding:8px 16px;background:#2563eb;color:#fff;text-decoration:none;border-radius:6px}"
                + "</style></head><body>"
                + "<div class=\"card\"><h1>INTERFACE COMING SOON</h1><p>Projeto de Gestão de Despesas</p><a class=\"btn\" href=\"https://github.com/SamuTechMan/gestao-despesas-spring\" target=\"_blank\">GIT DO PROJETO</a></div>"
                + "</body></html>";
    }
}
