public class Electronic extends Product {
    private int warranty; // Garantia em meses
    private int quantity; // Quantidade do produto em estoque

    public Electronic(String code, String name, double price, int warranty, int quantity) {
        // Inicializa os atributos da classe base Product e os específicos de Electronic
        super(code, name, price);
        this.warranty = warranty;
        this.quantity = quantity;
    }

    public int getWarranty() {
        return warranty; // Retorna o período de garantia
    }

    public int getQuantity() {
        return quantity; // Retorna a quantidade disponível do produto
    }

    @Override
    public String toString() {
        // Retorna uma string representando o produto com suas informações adicionais
        return super.toString() + ", Warranty: " + warranty + " months, Quantity: " + quantity;
    }
}
