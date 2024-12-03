public class CashRegister {
    private double currentCash; // Armazena o valor atual em caixa

    public CashRegister(double initialCash) {
        this.currentCash = initialCash; // Inicializa o caixa com um valor inicial
    }

    public void addToCash(double amount) {
        currentCash += amount; // Adiciona um valor ao caixa
    }

    public double getCurrentCash() {
        return currentCash; // Retorna o valor atual do caixa
    }

    public void closeRegister() {
        // Exibe o total no caixa e reseta para 0 para o próximo dia
        System.out.printf("Caixa fechado com total: %.2f\n", currentCash);
        currentCash = 0.0;
    }
}
