package Exercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio02 {

    static void main() {

        List<Empregado> empregados = new ArrayList<>();

        empregados.add(new Empregado("Carlinhos", 4000, 20));
        empregados.add(new Empregado("Abe", 7000, 40));
        empregados.add(new Empregado("Moomin", 2000, 10));
        empregados.add(new Empregado("Dro", 1000, 3));


        List<Empregado> reajustados = empregados.stream()
                .map(emp-> {

                    double valor;

                    if (emp.anosExp() >= 5){

                        valor = emp.salario() * 1.20;
                    }
                    else{
                        valor = emp.salario() * 1.10;
                    }

                    return new Empregado(emp.nome(), valor, emp.anosExp());
                })
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();


        System.out.println(reajustados);
    }

}
