/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import topico3.outras_classes.Pneu;

/**
 *
 * @author Mili
 */

/*
Com base na classe Questao1, finalize a implementação do método
converteDados. Esse método deverá converte para Integer cada um dos
elementos do vetor d (variável local). O resultado da conversão deverá ser
armazenado na lista dados (atributo da instância). Caso não seja possível
converter para inteiro, adicionar a informação 0 (zero) na lista da instância.

*/
public class Questao1 {

    private String raw_data = "123,b,22,f,e,7,1,2,3";

    private java.util.List<Integer> dados = new java.util.ArrayList();
    private Set<Integer> st;

    public void converteDados(){

        int i=0;
        String d[] = raw_data.split(",");

        while(i < d.length){
            
            try {
                int valor = Integer.parseInt(d[i]);
                dados.add(valor);
                
            } catch (NumberFormatException e) {
                
                dados.add(0);
            }
            i++;
        }
    
       
    }
    
    public void imprimeEmOrdem(List<Integer> vet){
       /*int cont1, cont2,aux;
       java.util.List<Integer> aha = new java.util.ArrayList();
        for(cont1 =1; cont1<vet.size(); cont1++){
            for(cont2 =0; cont2 <vet.size(); cont2++){
                if(vet.get(cont1) < vet.get(cont2)){
                    aux = vet.get(cont1);
                    vet.set(cont1, vet.get(cont2));
                    vet.set(cont2, aux);
                    }
                }
        }
        
        
        for (int i = 0; i < vet.size(); i++) {
            for (int j = i + 1; j < vet.size(); j++) {
                if(!vet.get(i).equals(vet.get(j))){
                    aha.add(vet.get(i));
                }
            }
        }
        
        for (int i = 0; i < aha.size(); i++) {
            System.out.print(aha.get(i) + ", "); 
        }*/
       
        st = new TreeSet<>();
         for(int j=0; j < vet.size(); j++){
                Collections.sort(vet);
                st.add(vet.get(j));
        }
          System.out.println("Elemento da lista em ordem crescente: " + st);
    
    }

    public Questao1(){
        converteDados();
        imprimeEmOrdem(dados);
    }

    public static void main(String args[]){
        new Questao1();
    }
}
