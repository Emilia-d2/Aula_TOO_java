/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topico3.outras_classes;

import java.util.List;

/**
 *
 * @author Mili
 */

 /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
public class Carro {
    
    private Integer codigo;
    private String nome;
    private String modelo;
    private String fabricante;
    private Integer numeroChassi;
    private double valorMercado;
    private List<Pneu> pneus;


    public Carro(String nome, String modelo, String fabricante, Integer numeroChassi, double valorMercado) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numeroChassi = numeroChassi;
        this.valorMercado = valorMercado;
    }

   

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroChassi() {
        return numeroChassi;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroChassi(Integer numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    

    @Override
     public String toString() {

        return "Código "+this.numeroChassi + ", Modelo: " + this.modelo;
    }

     public List<Pneu> getPneus() {
        return pneus;
    }

    public void setPneus(List<Pneu> pneus) {
        this.pneus = pneus;
    }
    
    
    
    
    
    
    
}
