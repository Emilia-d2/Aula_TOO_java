/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

/**
 *
 * @author Mili
 */
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import topico3.outras_classes.Compra;

public class Exercicio8 {
    
    Exercicio8(){
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS"); //SSS - Millisecond 
        Calendar dateCalendar = Calendar.getInstance();
        Calendar dateCalendar1 = Calendar.getInstance();
        Calendar dateCalendar2 = Calendar.getInstance();
        Calendar dateCalendar3 = Calendar.getInstance();
        Calendar dateCalendar4 = Calendar.getInstance();

        try{
            dateCalendar.setTime(formatador.parse("15/10/2020 15:39:00 100"));

            Compra c1 = new Compra(1, dateCalendar, formatador.parse("15/10/2020 17:20:00 300") );

            dateCalendar1.setTime(formatador.parse("16/10/2019 10:39:00 150"));

            Compra c2  = new Compra(2, dateCalendar1, formatador.parse("16/10/2020 10:59:00 160") );

            dateCalendar2.setTime(formatador.parse("17/10/2020 23:00:00 090"));

            Compra c3  = new Compra(3, dateCalendar2, formatador.parse("18/10/2020 00:25:00 100") );

            dateCalendar3.setTime(formatador.parse("17/10/2020 23:00:00 090"));

            Compra c4  = new Compra(4, dateCalendar3, formatador.parse("18/10/2020 01:25:00 100") );

            dateCalendar4.setTime(formatador.parse("31/12/2020 23:55:00 050"));

            Compra c5  = new Compra(5, dateCalendar4, formatador.parse("01/01/2021 00:33:00 100") );

            List <Compra> lista = new ArrayList();

            lista.add(c1);
            lista.add(c2);
            lista.add(c3);
            lista.add(c4);
            lista.add(c5); 

            Compra emissaoRecente = new Compra();//recebe o contrutor
            Compra saidaAntiga = new Compra();
            long maiorDiferenca = 0;
            int loop = 0;


        //long miliCalendar = dataCalendar.getTimeInMillis();
        //long miliDate = dataDate.getTime();

            for(int i=0; i < lista.size(); i++){

                System.out.println("Elemento da List: " + lista.get(i));//List possibilita a recuperacao pelo indice.

                if(i==0){
                    emissaoRecente = lista.get(i);
                    saidaAntiga = lista.get(i);
                    long aux = lista.get(i).getData_saida().getTime() - lista.get(i).getData_emissao().getTimeInMillis();
                    //getTimeInMillis() retorna o tipo calendar em milisegundos 
                    //getTime() retorna o tipo datas em mile segundos
                    maiorDiferenca = aux;
                    loop = i;
                }else{
                    //CompareTo: -1 se for menor, 0 se for igual e 1 se for maior (mais recente).
                    if(lista.get(i).getData_emissao().compareTo(emissaoRecente.getData_emissao()) == 1){
                        emissaoRecente = lista.get(i);
                    }
                    if(lista.get(i).getData_saida().compareTo(saidaAntiga.getData_saida()) == -1){
                        saidaAntiga = lista.get(i);
                    }
                    long x = lista.get(i).getData_saida().getTime() - lista.get(i).getData_emissao().getTimeInMillis();
                    if(x > maiorDiferenca){
                        maiorDiferenca = x;
                        loop = i;
                    }
                }
            }   

            System.out.println("\nEmissão mais recente: " + emissaoRecente);
            System.out.println("Saída mais antiga: " + saidaAntiga);
            System.out.println("Maior diferença entre entrada e saída: " + maiorDiferenca + "ms na compra " + (loop+1) + "\n");



        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    /*
     8. Codifique um método na classe Exercicio8 para criar e inicializar cinco 
        objetos do tipo Compra com as seguintes informações.
    
        Código 1, emissão:  15/10/2020 15:39:00 100, saída 15/10/2020 17:20 300
    
        Código 2, emissão:  16/10/2019 10:39:00 150, saída 16/10/2020 10:59 160
 
        Código 3, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 00:25 100
 
        Código 4, emissão:  17/10/2020 23:00:00 090, saída 18/10/2020 01:25 100
 
        Código 5, emissão:  31/12/2020 23:55:00 050, saída 01/01/2021 00:33 100
 
    
        Adicionar os objetos em uma coleção. Após, percorrer e analisar a lista
        para localizar os seguintes objetos/informações:
        
            1) Data de emissão de compra mais recente.
            2) Data de saída mais antiga.
            3) Compra com maior tempo em relação a emissão e a saída.
    */
    
    public static void main(String[] args) {
        new Exercicio8();
    }
    
}
