public class FoodUtensil extends Product {
    private int shelfLife; // Validade do item em dias
    private int quantity; // Quantidade do produto em estoque

    public FoodUtensil(String code, String name, double price, int shelfLife, int quantity) {
        // Inicializa os atributos da classe base Product e os específicos de
        // FoodUtensil
        super(code, name, price);
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public int getShelfLife() {
        return shelfLife; // Retorna o prazo de validade do produto
    }

    public int getQuantity() {
        return quantity; // Retorna a quantidade disponível do produto
    }

    @Override
    public String toString() {
        // Retorna uma string representando o produto com suas informações adicionais
        return super.toString() + ", Shelf Life: " + shelfLife + " days, Quantity: " + quantity;
    }
}
