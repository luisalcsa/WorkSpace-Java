package section13.application;

import section13.entities.Pedido;
import section13.enums.entities.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.Aguardando_Pagamento);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.Entregue;

        OrderStatus os2 = OrderStatus.valueOf("Entregue");

        System.out.println(os1);
        System.out.println(os2);
        
    }
}
