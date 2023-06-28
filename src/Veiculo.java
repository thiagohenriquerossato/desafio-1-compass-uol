import java.lang.reflect.Field;

public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int qtdPassageiros;
    private int qtdPortas;
    private int qtdRodas;
    private boolean isCarga;
    private int capacidadeDeCarga;

    private Combustivel combustivel;

    public Veiculo(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean isCarga, int capacidadeDeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.qtdPassageiros = qtdPassageiros;
        this.qtdPortas = qtdPortas;
        this.qtdRodas = qtdRodas;
        this.isCarga = isCarga;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.combustivel = combustivel;
    }
    
    public Veiculo (){}

    public boolean isMotor() {
        return motor;
    }
    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    public boolean isVolante() {
        return volante;
    }
    public void setVolante(boolean volante) {
        this.volante = volante;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    public int getQtdRodas() {
        return qtdRodas;
    }
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public boolean isCarga() {
        return isCarga;
    }
    public void setCarga(boolean carga) {
        isCarga = carga;
    }
    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    public Combustivel getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    public void imprimirVariaveis() {
        imprimirVariaveis(this.getClass());
    }
    private void imprimirVariaveis(Class<?> classe) {
        Class<?> atualClasse = classe;

        while (atualClasse != null && atualClasse != Object.class) {
            Field[] campos = atualClasse.getDeclaredFields();

            for (Field campo : campos) {
                campo.setAccessible(true);
                Class<?> tipoDoCampo = campo.getType();

                try {
                    if (tipoDoCampo.isPrimitive() || tipoDoCampo.equals(String.class)) {
                        System.out.println(campo.getName() + ": " + campo.get(this));
                    } else if(campo.get(this)!=null) {
                        System.out.println("valorDoCampo");

                        Object valorDoCampo = campo.get(this);
                        System.out.println(valorDoCampo);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            atualClasse = atualClasse.getSuperclass();
        }
    }
}
