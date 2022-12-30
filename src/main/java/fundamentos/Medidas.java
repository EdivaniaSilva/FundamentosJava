// Pacote
package fundamentos;

// Bibliotecas
import java.sql.SQLOutput;
import java.util.Scanner;

// Classe
public class Medidas {
    // Atributos
    static Scanner entrada;

    // Métodos e Funções

    public static void main(String[] args) {
        String opcao = "";
        int area = 0;

        entrada = new Scanner(System.in); // instanciar o objeto para ler entrada do console

      //  while (!opcao.toUpperCase().equals("S")){

            System.out.println("Escolha o cálculo desejado:");
            System.out.println("(1) - Área do Quadrado");
            System.out.println("(2) - Área do Retângulo");
            System.out.println("(3) - Área do Triângulo");
            System.out.println("(4) - Área do Círculo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisão");
            System.out.println("(S) - Sair");
    
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
                case "5":
                    calcularTabuada();
                    break;
                case "6":
                    calcularFibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "8":
                    divisao();
                    break;
                case "S":
                case "s":
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println(opcao + "Entrada inválida. Informe uma das opções abaixo");
                    break;
            }
            if (area > 0) {
                System.out.println("A área é de " + area + "m²");
            }
     //   }

    }

    public static int calculaAreaDoQuadrado(){

        int lado;

        System.out.print("Digite o lado do Quadrado: ");
        lado = entrada.nextInt(); // leitura do lado do quadrado

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha++) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("###");
            }
            System.out.println(""); //pular de linha
        }
        System.out.println(""); //pular de linha
        return lado * lado; // Retorna a área do quadrado

    }

    public static int calculaAreaDoRetangulo(){

        int base;
        int altura;

        System.out.print("Digite o base do Retângulo: ");
        base = entrada.nextInt(); // Leitura do lado do retângulo
        System.out.println("Digite o altura do Retângulo: ");
        altura = entrada.nextInt(); // Leitura do lado do retângulo
        return base * altura; // Retorna a área do quadrado

    }

    public static int calculaAreaDoTriangulo(){

        int base;
        int altura;

        System.out.print("Digite o base do Triângulo: ");
        base = entrada.nextInt(); // Leitura do lado do triângulo
        System.out.println("Digite o altura do Triângulo: ");
        altura = entrada.nextInt(); // Leitura do lado do triângulo
        return (base * altura) / 2; // Retorna a área do triângulo

    }

    public static int calculaAreaDoCirculo(){

        int raio;

        System.out.print("Digite o raio do Círculo: ");
        raio = entrada.nextInt(); // Leitura do raio do circulo
        return (int) (Math.PI * raio);

    }

    public static void calcularTabuada (){
        System.out.print("Você quer os resultados da tabuada de qual número? ");
        int numero = entrada.nextInt();

        for (int i = 1; i<11 ; i++){
            System.out.println(numero +  "x" +  i + " = " + numero*i);
        }

    }

    public static void calcularFibonacci (){
        System.out.print("Quantos números deseja calcular na sequencia? ");
        int numero = entrada.nextInt();

        switch (numero){
            case 0:
                System.out.println("A sequencia está vazia!");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for(int i = 2; i <= numero ; i++){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;

                }
        }
    }

    public static void contagemRegressiva(){

        System.out.print("Você quer fazer uma contagem regressiva a partir de qual número? ");
        int numeroInicial = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos números? ");
        int decrescimo = entrada.nextInt();

        if (decrescimo > 0){
            for(int count = numeroInicial; count >= 1 ; count-=decrescimo){
                System.out.println(count);
            }
        } else {
            System.out.println("Número inválido!");
        }
        System.out.println();
    }

    public static void divisao() {
        try {
            System.out.print("Qual é o dividendo (Número a ser dividido)? ");
            byte dividendo = entrada.nextByte();

            System.out.print("Qual é o divisor (Número que vai dividir o dividendo)? ");
            byte divisor = entrada.nextByte();

            System.out.println("O resultado é:  " + dividendo / divisor);
        } catch (Exception e) {

            System.out.println("Não é possível dividir por zero - Erro: + " + e.getMessage());
        }
        finally{
            System.out.println("Chega por hoje, partiu descansar!");
        }
    }

}


