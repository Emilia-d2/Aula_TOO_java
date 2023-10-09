/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3.outras_classes;

/**
 *
 * @author Mili
 */

/*        
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela os Pneus.
    */
public class Pneu implements Comparable<Pneu>{
    
    private Integer code;
    private String modelo;
    private Integer posicao;
    private String fabricante;
    private double valorPneu;

    public Pneu(Integer code, String modelo, Integer posicao, String fabricante, double valorPneu) {
        this.code = code;
        this.modelo = modelo;
        this.posicao = posicao;
        this.fabricante = fabricante;
        this.valorPneu = valorPneu;
    }

    public Integer getCode() {
        return code;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public double getValorPneu() {
        return valorPneu;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public void setValorPneu(double valorPneu) {
        this.valorPneu = valorPneu;
    }

    @Override
    public String toString() {
        return "código: " + code.toString() + " modelo: " +  modelo;
    }
    
    public int compareTo(Pneu o) {
        Pneu p = (Pneu)o;
        return  p.code - this.code;//É só inverter pra ser crescente
       // return o.codigo.compareTo(this.codigo);//não funcionou dessa maneira
    }
    
}
