/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

/**
 *
 * @author Mili
 */

/*
Com base na classe Questao3 codifique um novo método para classificar os
dados do vetor dados (atributo da instância). A classificação deverá ser
realizada de forma ascendente. Esse método deverá ser chamado no
construtor da classe. Após, imprima na saída padrão os dados classificados
*/
public class Questao3 {
 
    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};
    
    private void AscendenteImprime(){
        int cont1, cont2,aux;
        for(cont1 =1; cont1<dados.length; cont1++){
            for(cont2 =0; cont2 <dados.length; cont2++){
                if(dados[cont1] < dados[cont2]){
                    aux = dados[cont1];
                    dados[cont1] = dados[cont2];
                    dados[cont2] = aux;
                    }
                }
        }
        
        
        for (int i = 0; i < dados.length; i++) {
            System.out.print(dados[i] + ", "); 
        }
    
    }
 
    public Questao3(){
        AscendenteImprime();
    }
 
    public static void main(String args[]){
 
        new Questao3();
    }

    
}
