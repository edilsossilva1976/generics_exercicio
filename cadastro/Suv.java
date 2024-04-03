/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author alves.ferreira
 */
public class Suv extends Carro{

    public Suv(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    
    @Override
    public String getDescricao() {
        return "SUV: " + marca + " - " + ano;
    }
    
}
