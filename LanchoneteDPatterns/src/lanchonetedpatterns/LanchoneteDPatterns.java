/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanchonetedpatterns;

import java.util.Scanner;
import lanchonetedpatterns.desconto.Desconto;
import lanchonetedpatterns.desconto.Desconto10;
import lanchonetedpatterns.desconto.SemDesconto;
import lanchonetedpatterns.lanche.Hamburguer;
import lanchonetedpatterns.lanche.HamburguerFactory;
import lanchonetedpatterns.lanche.Lanche;
import lanchonetedpatterns.lanche.LancheAntigoAdapter;
import lanchonetedpatterns.pedido.Pedido;
import lanchonetedpatterns.sistema.SistemaPedidos;

/**
 *
 * @author elois
 */
public class LanchoneteDPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Sistema de Lanches ===");
        System.out.println("Escolha um lanche:");
        System.out.println("1 - Hamburguer");
        System.out.println("2 - Lanche Antigo com Batata Gratis");
        System.out.print(">> ");
        int opcao = sc.nextInt();

        Lanche lanche;
        if (opcao == 1) {
            lanche = new Hamburguer();
        } else {
            lanche = new LancheAntigoAdapter();
        }

        lanche.preparar();

        System.out.println("\nAplicar desconto?");
        System.out.println("1 - 10% de desconto");
        System.out.println("2 - Sem desconto");
        System.out.print(">> ");
        int opcaoDesconto = sc.nextInt();

        Desconto desconto = (opcaoDesconto == 1) ? new Desconto10() : new SemDesconto();
        double precoFinal = desconto.aplicarDesconto(lanche.getPreco());
        System.out.printf("\nPreço final: R$%.2f\n", precoFinal);

        Pedido pedido = new Pedido();
        System.out.println("Estado do pedido: " + pedido.getEstado());
        pedido.proximoEstado();
        System.out.println("Estado do pedido: " + pedido.getEstado());
        pedido.proximoEstado();
        System.out.println("Estado do pedido: " + pedido.getEstado());

        SistemaPedidos.getInstancia().finalizarPedido();
        System.out.println("Obrigado pelo pedido!");

        sc.close();
    }
}
    

