/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lanchonetedpatterns.pedido;

/**
 *
 * @author elois
 */
public interface EstadoPedido {
    void proximo(Pedido pedido);
    String getEstado();
}