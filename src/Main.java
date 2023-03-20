import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Escreva a frase lógica:");
            String fraseLogica = sc.nextLine();
            Validacao validacao = new Validacao(fraseLogica);
            Calculadora calculadora = new Calculadora(validacao);
            if (validacao.verificaConectivos() && validacao.isFbf()) {
                calculadora.calcular();
                System.out.println("Resposta: " + calculadora.getResposta());
                System.out.println("Tabela Verdade:");
                System.out.println("É uma: " + calculadora.tabelaVerdade());
            } else {
                System.out.println("Não é um FBF!");
            }
    }
}