public class Product {
    protected String code; // Código único do produto
    protected String name; // Nome do produto
    protected double pricePerUnit; // Preço por unidade do produto

    // Construtor para inicializar os atributos do produto
    public Product(String code, String name, double pricePerUnit) {
        this.code = code;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    // Retorna o código do produto
    public String getCode() {
        return code;
    }

    // Retorna o nome do produto
    public String getName() {
        return name;
    }

    // Retorna o preço por unidade do produto
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Retorna uma representação em string do produto
    @Override
    public String toString() {
        return String.format("Código: %s, Nome: %s, Preço: %.2f", code, name, pricePerUnit);
    }
}
