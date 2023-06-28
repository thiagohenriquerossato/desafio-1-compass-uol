public class Caminhao extends Veiculo{
    public int qtdEixos;

    public Caminhao(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean isCarga, int capacidadeDeCarga, Combustivel combustivel, int qtdEixos) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, isCarga, capacidadeDeCarga, combustivel);
        this.qtdEixos = qtdEixos;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }
}
