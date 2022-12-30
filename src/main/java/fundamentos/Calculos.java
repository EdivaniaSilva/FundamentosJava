package fundamentos;

import static fundamentos.Medidas.calcularTabuada;
import static fundamentos.Medidas.entrada;

// Chamada de método da classe Medidas
public class Calculos {

    public static void main(String[] args){
        System.out.println("Deseja calcular a tabuada? <S/N>");
        String resposta = entrada.nextLine();

        if (resposta.toUpperCase().equals("S")) {
            calcularTabuada();
        } else {
                System.out.println("Digitou texto diferente de S");

        }
    }
}
