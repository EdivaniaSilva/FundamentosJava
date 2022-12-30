package fundamentos;

// Herança da classe medidas
public class Contadores extends Medidas {
    public void main (String[] args){
        System.out.println("Deseja realizar a contagem  regressiva? <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "S":
            case "s":
                contagemRegressiva();
                break;
            default:
                System.out.println("Digitou texto diferente de S");
        }
    }
}
