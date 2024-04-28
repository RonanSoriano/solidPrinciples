package solidPrinciples;

public class OrderTest {
    public static void main(String[] args) {

        TotalCalculator totalCalculator = new OrderAction();
        totalCalculator.calculateTotal(10.0, 2);

        OrderPlacer order = new OrderAction();
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoice = new OrderAction();
        invoice.generateInvoice("order_123.pdf");

        EmailNotifier notifier = new OrderAction();
        notifier.sendEmailNotification("johndoe@example.com");
    }
}