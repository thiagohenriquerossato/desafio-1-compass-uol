public class Carro extends Veiculo{
    private boolean hasArCondicionado;
    private boolean hasRadio;

    public Carro(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean isCarga, int capacidadeDeCarga, Combustivel combustivel, boolean hasArCondicionado, boolean hasRadio) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, isCarga, capacidadeDeCarga, combustivel);
        this.hasArCondicionado = hasArCondicionado;
        this.hasRadio = hasRadio;
    }
    
    public Carro(){
    }
    public boolean isHasArCondicionado() {
        return hasArCondicionado;
    }

    public void setHasArCondicionado(boolean hasArCondicionado) {
        this.hasArCondicionado = hasArCondicionado;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }
    

}
