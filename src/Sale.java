import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sale {
    private List<Product> soldProducts = new ArrayList<>(); // Lista de produtos vendidos na venda atual
    private double totalAmount = 0.0; // Valor total da venda

    // Adiciona um produto à venda e atualiza o valor total
    public void addProduct(Product product) {
        soldProducts.add(product);
        totalAmount += product.getPricePerUnit();
    }

    // Remove um produto da venda usando o código do produto e atualiza o valor
    // total
    public void removeProduct(String code) {
        Iterator<Product> iterator = soldProducts.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getCode().equals(code)) {
                iterator.remove();
                totalAmount -= p.getPricePerUnit();
                break;
            }
        }
    }

    // Retorna o valor total da venda
    public double getTotalAmount() {
        return totalAmount;
    }

    // Finaliza a venda limpando a lista de produtos e resetando o valor total
    public void finalizeSale() {
        soldProducts.clear();
        totalAmount = 0.0;
    }
}
