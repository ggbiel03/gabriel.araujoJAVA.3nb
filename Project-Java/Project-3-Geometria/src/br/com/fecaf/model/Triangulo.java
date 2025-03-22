package br.com.fecaf.model;

import java.util.Arrays; // importo a biblioteca de array para ordenar a verificação do 3 4 5
import java.util.Scanner;

import static java.lang.reflect.Array.*;

public class Triangulo {
    // Atributos para calcular o Triângulo
    public double base, altura, lado2, lado3, area, perimetro;

    /* Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/**********************************************/");
        System.out.println("/*             Cadastro Triângulo             */");
        System.out.println("/**********************************************/");
        System.out.println(" Informe a base");
        base = scanner.nextDouble();
        System.out.println(" Informe o lado2: ");
        lado2 = scanner.nextDouble();
        System.out.println(" Informe o lado3: ");
        lado3 = scanner.nextDouble();
        System.out.println(" Informe a altura: ");
        altura = scanner.nextDouble();

        return true;
    }
// /      public void exibirTriangulo() {
//        System.out.println("/******************************/");
//        System.out.println("/*    Resultado do Triângulo  */");
//        System.out.println("/******************************/");
//        System.out.println("A Área do triângulo é igual a: " + area);
//        System.out.println("O Perímetro do triângulo é igual a: " + perimetro);
//        System.out.println("/******************************/");
//    }


    public void calcularArea() {
        System.out.println("/**********************************************/");
        System.out.println("/*                Calculando Área             */");
        System.out.println("/**********************************************/");

        area = (base * altura) / 2;
        System.out.println("/* A Área do triângulo é igual a: " + area);
    }

    public void calcularPerimetro() {
        System.out.println("/**********************************************/");
        System.out.println("/*             Calculando Perimetro           */");
        System.out.println("/**********************************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("/* O Perímetro do triângulo é igual a: " + perimetro);
    }

    /*como um triangulo retangulo também pode ser isosceles ou escaleno,
    precisa ser definido antes de verificarmos o tipo pelos lados   */

    //A fórmula do teorema de Pitágoras é c2=a2+b2,
    //onde c é a medida da hipotenusa e a e b são as medidas dos catetos.


    public void classificando345 () {
        System.out.println("/**********************************************/");
        System.out.println("/*         Classificando Tipo - Ângulo        */");
        System.out.println("/**********************************************/");

        /*pelo triangulo 3, 4, 5 ser também calculado com o teorema de pitagoras, farei dentro
        dessa public void a verificação dele*/

        double[] lados = {base, lado2, lado3}; // defino a ordem dos lados
        Arrays.sort(lados); // defino que seja de forma crescente

        /*a condição abaixo é usada para definir que todos os lados vão ser multiplos de 3 4 5*/
        if (lados[0] % 3 == 0 && lados[1] % 4 == 0 && lados[2] % 5 == 0) {
            System.out.println("É um triângulo 3 4 5!!!");
        } else {
            // são três tipos de possibilidade para concluir se é ou não um triângulo retangulo
            // aqui, uso || no lugar de && pois estou comparando os dados informados pelo usuário
            if (Math.pow(base, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                    Math.pow(base, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) ||
                    Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(base, 2)) {
            /* verifico com a mesma biblioteca usada no circulo para numero elevado
            se os lados formam um triângulo retângulo*/
                System.out.println("Esse triângulo é um retângulo!!!");
            } else {
                System.out.println("NÃO é um triângulo retângulo...");
            }

        }

    }

    /* Definir tipos de triângulo */
    /* Equilatero - Escaleno - Isosceles */

    public void classificandoTipo () {
        System.out.println("/*****************************************/");
        System.out.println("/*         Definindo Tipo - Lado         */");
        System.out.println("/*****************************************/");

        /*triângulos podem ser classificados pelos seus lados e definidos entre:
         Equilatero, Isosceles e Escaleno*/

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é um Isosceles...");
        }

    }

    //DESAFIO
    /*No triângulo retângulo, o lado oposto ao ângulo reto é chamado de hipotenusa
    os demais lados são chamados de catetos. */


}
