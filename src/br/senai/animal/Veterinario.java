package br.senai.animal;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando...");
        animal.emitirSom();
    }

}
