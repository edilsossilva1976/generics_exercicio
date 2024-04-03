/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author alves.ferreira
 */
public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract String getDescricao();

    @Override
    public String toString() {
        return "Carro{" 
                + "marca=" + marca 
                + ", modelo=" + modelo 
                + ", ano=" + ano + '}';
    }
    
    
}
