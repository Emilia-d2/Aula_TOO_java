package topico3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;//aceita elemento duplicado
import java.util.Map;
import topico3.outras_classes.Carro;
import topico3.outras_classes.Pneu;

public class Exercicio7 {
    
    private Map<Integer, Carro> mapDados = new HashMap<>();
    
    Exercicio7(){
        
        exer71();// chama o método exer71.
       
        exer72();//chama o método exer72.
        
       exer73(); 
    }
    
    private void exer71(){ 
    /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
    
        Carro carro1 = new Carro("Uno", "Fiat Uno", "Fiat", 12, 30.000);
        mapDados.put(1, carro1);
        Carro carro2 = new Carro( "Onix", "Turbo", "Chevrolet", 13, 70.000);
        mapDados.put(2, carro2);
        Carro carro3 = new Carro( "Range over", "Range", "Kia", 14, 150.000);
        mapDados.put(5, carro3);
        Carro carro4 = new Carro( "Tucson", "tucson", "Hinday", 15, 70.000);
        mapDados.put(4, carro4);
        Carro carro5 = new Carro( "Ka", "gera3", "Ford", 16, 65.000);
        mapDados.put(3, carro5);
        
        for (Map.Entry<Integer, Carro> m : mapDados.entrySet()) {//ver se da pra organizar a ordem
             System.out.println("Código: " + m.getKey() + " Carros: " + m.getValue());
        }
        
    }    
    
    /*        
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela os Pneus.
    */
    
    private void exer72(){
        
        java.util.List<Pneu> aham = new ArrayList();
        
        Pneu pneu1 = new Pneu(1, "Michel", 2, "alter", 400.00);
        aham.add(pneu1);
        Pneu pneu2 = new Pneu(3, "aha", 1, "alter", 600.00);
        aham.add(pneu2);
        Pneu pneu3 = new Pneu(6, "seila", 4, "alter", 200.00);
        aham.add(pneu3);
        Pneu pneu4 = new Pneu(2, "paolo", 9, "alter", 150.00);
        aham.add(pneu4);
        
        Collections.sort(aham);
        for (Pneu i : aham) {
            System.out.println(i);
        }
        
       // [21:31, 08/10/2023] Luana Facul: Collections.sort(list, Collections.reverseOrder());
       //[21:31, 08/10/2023] Luana Facul: assim ele ordena decrescente
       //[21:32, 08/10/2023] Luana Facul: serve pra string tb
        
        
        //https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
        
    }
  
        
    /*        
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
    */
    
      private void exer73(){
        Carro car1 = new Carro("Carro 1", "Honda", "Fiat", 12, 230.000f);
        Carro car2 = new Carro("Carro 2", "Ab", "aaa", 14, 430.000f);
        Carro car3 = new Carro("Carro 3", "cd", "bbb", 16, 30.000f);

        Pneu p1 = new Pneu(8, "AAA", 23, "sfd", 500f);
        Pneu p2 = new Pneu(5, "BBB", 27, "dffds", 700f);
        Pneu p3 = new Pneu(6, "CCC", 13, "lalal", 504f);
        Pneu p4 = new Pneu(7, "DDD", 19, "pao", 540f);

        List<Pneu> list_pneus = new ArrayList<Pneu>();
        list_pneus.add(p1);
        list_pneus.add(p2);
        list_pneus.add(p3);
        list_pneus.add(p4);

        car1.setPneus((List<Pneu>) list_pneus);
        System.out.println("Carro 1: " + car1+" Lista Pneus:"+ list_pneus);
    }
    

    public static void main(String[] args) {
        
         new Exercicio7();
    }
    
}
