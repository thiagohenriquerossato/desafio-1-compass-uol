public class Bicicleta extends Veiculo{
    private boolean isEletrica;
    private boolean hasCarga;

    public Bicicleta(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean isCarga, int capacidadeDeCarga, Combustivel combustivel, boolean isEletrica, boolean hasCarga) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, isCarga, capacidadeDeCarga, combustivel);
        this.isEletrica = isEletrica;
        this.hasCarga = hasCarga;
    }
    
    public boolean isEletrica() {
        return isEletrica;
    }

    public void setEletrica(boolean eletrica) {
        isEletrica = eletrica;
    }

    public boolean isHasCarga() {
        return hasCarga;
    }

    public void setHasCarga(boolean hasCarga) {
        this.hasCarga = hasCarga;
    }
}
