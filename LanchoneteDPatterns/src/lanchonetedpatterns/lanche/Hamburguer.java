/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.lanche;

/**
 *
 * @author elois
 */
public class Hamburguer implements Lanche {

    @Override
    public void preparar() {
        System.out.println("\n--- Preparando Hamburguer ---");
        System.out.println("Ingredientes: Pao de brioche, carne 180g, queijo cheddar, alface, tomate e molho especial");
        System.out.println("Tempo de preparo: 5 minutos");
        System.out.println("Preço base: R$20.00");
    }

    @Override
    public double getPreco() {
        return 20.0;
    }
}
