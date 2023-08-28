/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

import javax.swing.JOptionPane;

/**
 *
 * @author Mili
 */
public class Exercicio3 {
    
    public static void main(String[] args) {

        int[][] rgDados1 = new int[2][3];//linha e coluna - se a quantidade de coluna da primeira

        int[][] rgDados2 = new int[3][2];//for igual a quantida de linha da segunda.

        int[][] rgDados3 = new int[2][2];

        /*
            3) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
        */
        
        //IMPLEMENTAR A REGRA DA MULTIPLICAÇÃO!!!!!!!!!
        
        for (int linha=0; linha < rgDados1.length; linha++){           
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){  
                boolean erro = true;
                
                while(erro){
                try{
                    
                    String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro" + "[" + linha + "]" + "[" + coluna + "] ", "Informe", JOptionPane.PLAIN_MESSAGE);              
                    rgDados1[linha][coluna] = Integer.parseInt(d);
                    erro = false;
                
                }catch(Exception e){
                    System.out.println(e.toString());
                    erro = true;
                
                }
                }                   
            }                        
        } 
        
        for (int linha=0; linha < rgDados2.length; linha++){
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){ 
                boolean erro = true;
                
                while(erro){
                try{
                    
                    String d = JOptionPane.showInputDialog(null, "Informe um valor inteiro" + "[" + linha + "]" + "[" + coluna + "] ", "Informe", JOptionPane.PLAIN_MESSAGE);              
                    rgDados2[linha][coluna] = Integer.parseInt(d);
                    erro = false;
                
                }catch(Exception e){
                    System.out.println(e.toString());
                    erro = true;
                
                }
                }                             
            }                        
        } 
        
        System.out.println("Matriz rgDados3 com a multiplicação: ");
        //calculo da multiplicação das matrizes
        for(int i=0; i<rgDados3.length; i++){
            for(int j=0; j<rgDados3[i].length; j++){
                for(int k=0; k<rgDados1[i].length; k++){
                    rgDados3[i][j] += rgDados1[i][k] * rgDados2[k][j];
                    JOptionPane.showMessageDialog(null, rgDados3[i][j] + ", ");
                }
            }
        }
        /*for(int linha=0; linha < rgDados3.length; linha++){
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){ 
                rgDados3[linha][coluna] = rgDados1[linha][coluna] * rgDados2[linha][coluna];
                //para exibir a mensagem
                JOptionPane.showMessageDialog(null, rgDados3[linha][coluna] + ", ");
                 
            }   
            
        }*/
         

    }
    
}
