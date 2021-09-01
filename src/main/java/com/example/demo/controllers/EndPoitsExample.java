package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EndPoitsExample {


    @GetMapping
    public String primeiroEnd(){
        return "Primeiro EndPoint Spring";
    }

    @GetMapping("/index")
    public String segundoEnd(){
        return "Segundo EndPoint Spring";
    }

    @GetMapping("/{nome}")
    public String terceiroEnd(@PathVariable String nome){
        return "Eu sou prof " + nome;
    }

    @GetMapping("/maioridade")
    public String quintoEndPoint(@RequestParam String nome, @RequestParam Integer idade) {
        if (idade >= 18) {
            return nome + " é maior de idade, sua idade é " + idade;
        } else {
            return nome + " é menor de idade, sua idade é " + idade;
        }
    }
}
