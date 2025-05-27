/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.sistema;

/**
 *
 * @author elois
 */
public class SistemaPedidos {
    private static SistemaPedidos instancia;

    private SistemaPedidos() {
       
    }

    public static SistemaPedidos getInstancia() {
        if (instancia == null) {
            instancia = new SistemaPedidos();
        }
        return instancia;
    }

    public void finalizarPedido() {
        System.out.println("Pedido finalizado no sistema.");
    }
}