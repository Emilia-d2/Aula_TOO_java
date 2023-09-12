/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mili
 */
public class ExerciciosDate {
    private Calendar dataCalendar;
    private Date dateDate;
    private SimpleDateFormat formatador;
    
    public ExerciciosDate(){ //Construtor
        dataCalendar = Calendar.getInstance();
      
        formatador = new SimpleDateFormat("dd/MM/yyy");
        
        //Trabalhar com o Date
        dateDate = new Date();
        
        //formato a data que eu criei com o Claendar.get...
        // getTime pegou a data no data Calendar... porque o format aceita apenas Date e devolve STring 
        String data_formatada = formatador.format(dataCalendar.getTime());
     
        //Exercício 1 : imprimir a diferença em milis e em dias entre dataDate e dataCalendar.
        data_formatada = formatador.format(dateDate);
        System.out.println("Diferença de datas em miliseconds: ");
        //diferenca de milesegundos 
        long diferencaMili = dateDate.getTime() - dataCalendar.getTimeInMillis();
        System.out.println(diferencaMili);
        
        
        //Exercício 2 : utilizar o método compareTo da classe Calendar para testar duas datas. Explicar os retornos.   
        System.out.println("Comparação de datas: " + dataCalendar.getTime().compareTo(dateDate));
        
        if(dataCalendar.getTime().compareTo(dateDate) == -1){
            System.out.println("A data comparada é menor");
        }
        
        if(dateDate.compareTo(dataCalendar.getTime()) == 1){
            System.out.println("A data comparada é maior");
        }
        
        if(dataCalendar.getTime().compareTo(dateDate) == 0){
            System.out.println("As datas comparadas são iguais");
        }
        
        //Exercício 3: converter a string  "25/09/1983" para java.util.Calendar
        String dataEmString = "25/09/1983";
        try {
            dataCalendar.setTime(formatador.parse(dataEmString));
        } catch (ParseException ex) {
            Logger.getLogger(TesteDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("String para dataCalendar " + new java.sql.Date(dataCalendar.getTimeInMillis()));
       
        
        //Exercício 4: converter a string "25/09/1983" para java.util.Date
        String dataEmStringDate = "25/09/1983";
        try {
            dateDate = formatador.parse(dataEmStringDate);
        } catch (ParseException ex) {
            Logger.getLogger(TesteDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("String para Date: " + dateDate);
    
    }
    
    public static void main(String[] args){
        new ExerciciosDate();
        
    }
    
}
