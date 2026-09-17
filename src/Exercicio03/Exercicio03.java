package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

    static void main() {

        List<Produtos> produto = new ArrayList<>();

       produto.add(new Produtos("ipad", 5000, "eletronico"));
       produto.add(new Produtos("Computador Lenovo", 3000, "eletronico"));
       produto.add(new Produtos("A Historia Secreta", 50, "livro"));
       produto.add(new Produtos("Carlinhos", 40, "pelucia"));


       List<String> lista = produto.stream()
               .filter(produtos -> {

                   return produtos.categoria().equalsIgnoreCase("eletronico")
                           && produtos.preco() >= 1000;
               })
               .map(produtos -> {

                   //%s eh o simbolo para representar uma string
                    return String.format("%s - Preco com desconto: R$ %.2f",
                            produtos.nome(), produtos.preco() * 0.90);
               })
               .sorted()
               .toList();


       lista.forEach(System.out::println);

    }

}
