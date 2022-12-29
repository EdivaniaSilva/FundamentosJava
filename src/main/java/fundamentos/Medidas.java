// Pacote
package fundamentos;

// Bibliotecas

import java.util.Scanner;

// Classe
public class Medidas {
    // Atributos
    static Scanner entrada;

    // Métodos e Funções

    public static void main (String[] args) {
        String opcao;
        int area = 0;

        entrada = new Scanner(System.in); // instanciar o objeto para ler entrada do console

        System.out.println("Escolha o cálculo desejado:");
        System.out.println("(1) - Área do Quadrado");
        System.out.println("(2) - Área do Retângulo");
        System.out.println("(3) - Área do Triângulo");
        System.out.println("(4) - Área do Círculo");

        opcao = entrada.nextLine(); //Leitura da opção

        switch (opcao) {
            case "1":
                area = calculaAreaDoQuadrado();
                break;
            case "2":
                area = calculaAreaDoRetangulo();
                break;
            case "3":
                area = calculaAreaDoTriangulo();
                break;
            case "4":
                area = calculaAreaDoCirculo();
                break;
            default:
                System.out.println("Entrada inválida. Informe uma das opções abaixo");
        }
        if (area > 0) {
            System.out.println("A área é de " + area + "m²");
        }

    }

    public static int calculaAreaDoQuadrado(){

        int lado;

        System.out.println("Digite o lado do Quadrado: ");
        lado = entrada.nextInt(); // leitura do lado do quadrado
        return lado * lado; // Retorna a área do quadrado

    }

    public static int calculaAreaDoRetangulo(){

        int base;
        int altura;

        System.out.println("Digite o base do Retângulo: ");
        base = entrada.nextInt(); // Leitura do lado do retângulo
        System.out.println("Digite o altura do Retângulo: ");
        altura = entrada.nextInt(); // Leitura do lado do retângulo
        return base * altura; // Retorna a área do quadrado

    }

    public static int calculaAreaDoTriangulo(){

        int base;
        int altura;

        System.out.println("Digite o base do Triângulo: ");
        base = entrada.nextInt(); // Leitura do lado do triângulo
        System.out.println("Digite o altura do Triângulo: ");
        altura = entrada.nextInt(); // Leitura do lado do triângulo
        return (base * altura) / 2; // Retorna a área do triângulo

    }

    public static int calculaAreaDoCirculo(){

        int raio;

        System.out.println("Digite o raio do Círculo: ");
        raio = entrada.nextInt(); // Leitura do raio do circulo
        return (int) (Math.PI * raio);
    }
}
