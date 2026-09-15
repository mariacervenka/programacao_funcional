package Exercicio01;

import java.util.Arrays;
import java.util.List;

public class Exercicio01 {

    static void main() {

        List<String> lista = Arrays.asList("Carlinhos", "Abe", "Moomin");

        List<String> nomes = lista.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .sorted()
                .toList();


        nomes.forEach(System.out::println);

    }

}
