package br.senai.animal;

public class Zoologico {
    Animal[] jaulas = new Animal[10];

    public Zoologico(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

    public void examinarJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            jaulas[i].emitirSom();
            if (jaulas[i] instanceof Cachorro) {
                ((Cachorro) jaulas[i]).correr();
            } else if (jaulas[i] instanceof Cavalo) {
                ((Cavalo) jaulas[i]).correr();
            }
        }
    }
}
