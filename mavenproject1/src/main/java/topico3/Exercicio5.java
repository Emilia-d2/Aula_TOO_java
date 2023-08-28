/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;
import java.lang.String;

/**
 *
 * @author Mili
 */

//uma classe
public class Exercicio5 {
    //um atributo
    static String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */
    
    //constutor da classe.(metodo - sem retorno) se tem retorno é tipo, se não não tem tipo é void
    //Quando uma coisa é estática, ela consome muita memória 
    //Um construtor, ele é quando parte do mesmo nome da classe, SÓ PODE SER CONSTRUTOR SE TEM O MESMO NOME DA CLASSE.
    public Exercicio5(){
        String ala = "Emilia";
        System.out.println("executou o construtor da classe");
        System.out.println("Aqui faz a concatenação");
        System.out.println(ala.concat(strDados));
        //System.out.println(strDados.va);
        System.out.println("Verifica se o inicio(prefix) existe numa string e retorna true ou false");
        System.out.println(strDados.startsWith("A"));
        // posso chamar os metodos no meu construtor
        System.out.println("Chama o metodo");
        manipulaString();
    }
    
    //OBS: posso ter um metodo ou construtor com o mesmo nome, mas preciso mudar a assinatura
    
    private void manipulaString(){//metodo da classe
        System.out.println("pega uma parte que vc submete de uma string, por exemlo do primeiro caractere até o decimo caracter");
         System.out.println(strDados.substring(0, 10));
         System.out.println("substitui um trecho de uma string por outro e retorna a operação em uma nova string");
         System.out.println(strDados.replace("A classe", "seila"));
         System.out.println("O trim remove os espaços no inicio e no fim");
         System.out.println(strDados.trim());
         System.out.println("Faz a comparacao de duas strings e retorna se é maior ou menor a string comparada");
         System.out.println(strDados.compareTo("sim"));
         
    }
    
    public static void main(String args[]){//metodo main
        
        
        Exercicio5 e5 = new Exercicio5();//objeto da classe
        e5.manipulaString();//chamada do metodo a partir do objeto.
        
    }

   
}
