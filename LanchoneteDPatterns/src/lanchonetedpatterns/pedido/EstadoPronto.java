/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.pedido;

/**
 *
 * @author elois
 */
public class EstadoPronto implements EstadoPedido {
    public void proximo(Pedido pedido) {
        System.out.println("Pedido ja está pronto. Nao ha mais estados.");
    }

    public String getEstado() { return "Pronto!"; }
}
