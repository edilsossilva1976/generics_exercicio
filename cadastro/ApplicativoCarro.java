/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alves.ferreira
 */
public class ApplicativoCarro {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        
        listaCarros.add(new Sedan("Toyota", "Corolla", 2020));
        listaCarros.add(new Sedan("Jeep", "Renegade", 2021));

        imprimir(listaCarros);
    }

    
    public static <T> void imprimir(List<T> lista){
        for (T item : lista) {
            System.out.println(item.toString());
        }
    }
}
