package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String Bsm(){
        return "Persistência \nOrientação ao Detalhe \nOrientação ao Futuro \nReponsabilidade Pessoal" +
                "\nTrabalho em Equipe \nProatividade \nGestão do Tempo \nComunicação \nMentalidade de Crescimento" +
                "\n";
    }

    @GetMapping("/objetivos")
    public String Objetivos() {
        return "Aprender mais sobre Spring e entender mais sobre frameworks e bibliotecas.";
    }
}
