package br.senai;

import br.senai.animal.*;
import br.senai.pessoa.*;

public class Main {
    public static void main(String[] args) {

//        pessoas();
//        animais();
        zoologico();

    }

    public static void pessoas() {

        //Teste exercício 2
        Fornecedor f = new Fornecedor("Fornecedor 1", "Rua 1", "9999-9999", 1000D, 100D);

        System.out.println(f.obterSaldo());

        //Teste exercício 3
        Empregado e = new Empregado("Empregado 1", "Rua 1", "9999-9999", 1, 1000, 10);

        System.out.println(e.calcularSalario());

        //Teste exercício 4
        Administrador a = new Administrador("Administrador 1", "Rua 1", "9999-9999", 1, 1000, 10, 100);

        System.out.println(a.calcularSalario());

        //Teste exercício 5
        Operario o = new Operario("Operario 1", "Rua 1", "9999-9999", 1, 1000, 10, 1000, 10);

        System.out.println(o.calcularSalario());

        //Teste exercício 6
        Vendedor v = new Vendedor("Operario 1", "Rua 1", "9999-9999", 1, 1000, 10, 1000, 10);

        System.out.println(v.calcularSalario());

    }

    public static void animais() {
        //Teste exercício 8
        Cachorro cachorro = new Cachorro("Cachorro", 5);
        Cavalo cavalo = new Cavalo("Cavalo", 5);
        Preguica preguica = new Preguica("Preguiça", 5);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        //Teste exercicio 9
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }

    public static void zoologico() {
        //Teste exercício 10
        Animal[] jaulas = {
                new Cachorro("Cachorro 1", 5),
                new Cavalo("Cavalo 1", 7),
                new Cachorro("Cachorro 2", 5),
                new Preguica("Preguica 1", 10),
                new Preguica("Preguica 2", 10),
                new Cachorro("Cachorro 3", 5),
                new Cavalo("Cavalo 2", 7),
                new Cachorro("Cachorro 4", 5),
                new Cavalo("Cavalo 3", 7),
                new Preguica("Preguica 3", 10)
        };

        Zoologico zoologico = new Zoologico(jaulas);

        zoologico.examinarJaulas();
    }
}
