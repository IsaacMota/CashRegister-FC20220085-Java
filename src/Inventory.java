import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap<>(); // Armazena produtos com código como chave

    // Adiciona um produto ao inventário
    public void addProduct(Product product) {
        products.put(product.getCode(), product);
    }

    // Pesquisa um produto pelo nome
    public Product searchProductByName(String name) {
        // Itera pelos produtos para encontrar pelo nome (ignora maiúsculas/minúsculas)
        for (Product p : products.values()) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null; // Retorna null se não encontrado
    }

    // Remove um produto do inventário
    public void removeProduct(String code) {
        products.remove(code);
    }

    // Lista todos os produtos no inventário
    public Collection<Product> listProducts() {
        return products.values();
    }

    // Verifica se um produto existe no inventário
    public boolean productExists(String code) {
        return products.containsKey(code);
    }

    // Obtém um produto pelo código
    public Product getProductByCode(String code) {
        return products.get(code);
    }
}
