import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //imprime a mensagem de erro caso acerte a excessao
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //valida a excessao e lanca
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }

        //logica para mostrar a contagem dos numeros
        int contagem = parametroDois - parametroUm;
        System.out.println("Havera " + contagem + " ocorrencias.");
        for (int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Imprimindo o numero: " + i);
        }
    }

    //classe da exception "ParametrosInvalidosException"
    private static class ParametrosInvalidosException extends Exception {
    }
}