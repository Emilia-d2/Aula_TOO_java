/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

/**
 *
 * @author Mili
 */

public class Exercicio4 {

    /*
      4) Teste e recupere duas informações recebidas por parâmetro no método main. Para isso execute 
          a main informando dois valores. 
         Caso os valores sejam inteiros positivos. Calcule a média e imprima na tela o resultado. 
         Caso contrário, informe e finalize o programa.
             
        Comando para compilação (a partir do diretorio java): javac br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4.java
    
        Comando para execução (a partir do diretorio java): java br/edu/ifsul/bcc/too/base/topico3/exercicios/Exercicio4
     */

    public static void main(String[] args) {


        if (args.length == 2) {
            
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float media = (a + b) / 2;
            System.out.println("Parametro/argumento recebido pela funcao main: " + media);
        } else {
            System.out.println("Não recebeu Parametro/argumento recebido pela funcao main.");
        }

    }

}

