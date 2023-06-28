public class Moto extends Veiculo{
    private boolean isPartidaEletrica;

    public Moto(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean isCarga, int capacidadeDeCarga, Combustivel combustivel, boolean isPartidaEletrica) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, isCarga, capacidadeDeCarga, combustivel);
        this.isPartidaEletrica = isPartidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return isPartidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        isPartidaEletrica = partidaEletrica;
    }
}
