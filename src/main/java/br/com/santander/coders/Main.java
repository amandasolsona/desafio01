package br.com.santander.coders;

import br.com.santander.coders.enums.TipoAlimentacao;
import br.com.santander.coders.enums.TipoLocomocao;
import br.com.santander.coders.model.Animal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {

        criarAnimais();

        System.out.println("Animais Herbivoros Com Locomocao Terrestre: ");
        System.out.println(animaisHerbivorosComLocomocaoTerrestre());

        System.out.println("Animais Onivoros Com Tamanho Maior Que 30:");
        System.out.println(animaisOnivorosComTamanhoMaiorQue30());

        System.out.println("Animais Terrestres Com Peso Menor Que 20");
        System.out.println(animaisTerrestresComPesoMenorQue20());
    }

    private static void criarAnimais() {

        animais.add(new Animal("Cachorro", TipoAlimentacao.ONIVORO, TipoLocomocao.TERRESTRE, 40, new BigDecimal(15.0)));
        animais.add(new Animal("Jacaré", TipoAlimentacao.CARNIVORO, TipoLocomocao.AQUATICO, 80, new BigDecimal(220.0)));
        animais.add(new Animal("Girafa", TipoAlimentacao.HERBIVORO, TipoLocomocao.TERRESTRE, 300, new BigDecimal(150.0)));
        animais.add(new Animal("Gato", TipoAlimentacao.ONIVORO, TipoLocomocao.TERRESTRE, 10, new BigDecimal(2.0)));
        animais.add(new Animal("Passaro", TipoAlimentacao.HERBIVORO, TipoLocomocao.AEREO, 8, new BigDecimal(0.8)));
    }

    private static List<Animal> animaisHerbivorosComLocomocaoTerrestre() {
        return animais.stream()
                .filter(animal -> TipoAlimentacao.HERBIVORO.equals(animal.getTipoAlimentacao()))
                .filter(animal -> TipoLocomocao.TERRESTRE.equals(animal.getTipoLocomocao()))
                .collect(Collectors.toList());
    }

    private static List<Animal> animaisOnivorosComTamanhoMaiorQue30() {
        return animais.stream()
                .filter(animal -> TipoAlimentacao.ONIVORO.equals(animal.getTipoAlimentacao()))
                .filter(animal -> animal.getTamanho().compareTo(30) > 0)
                .collect(Collectors.toList());
    }

    private static List<Animal> animaisTerrestresComPesoMenorQue20() {
        return animais.stream()
                .filter(animal -> TipoLocomocao.TERRESTRE.equals(animal.getTipoLocomocao()))
                .filter(animal -> animal.getPeso().compareTo(new BigDecimal(20.0)) < 0)
                .collect(Collectors.toList());
    }

}