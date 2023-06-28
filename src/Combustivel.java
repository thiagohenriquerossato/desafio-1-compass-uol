public class Combustivel {
    private boolean isGasolina;
    private boolean isAlcool;
    private boolean isDiesel;
    private boolean isEletricidade;
    private boolean isHumano;
    private boolean isAnimal;

    public Combustivel(boolean isGasolina, boolean isAlcool, boolean isDiesel, boolean isEletricidade, boolean isHumano, boolean isAnimal) {
        this.isGasolina = isGasolina;
        this.isAlcool = isAlcool;
        this.isDiesel = isDiesel;
        this.isEletricidade = isEletricidade;
        this.isHumano = isHumano;
        this.isAnimal = isAnimal;
    }
    
    public Combustivel(){}

    public boolean isGasolina() {
        return isGasolina;
    }

    public void setGasolina(boolean gasolina) {
        isGasolina = gasolina;
    }

    public boolean isAlcool() {
        return isAlcool;
    }

    public void setAlcool(boolean alcool) {
        isAlcool = alcool;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public boolean isEletricidade() {
        return isEletricidade;
    }

    public void setEletricidade(boolean eletricidade) {
        isEletricidade = eletricidade;
    }

    public boolean isHumano() {
        return isHumano;
    }

    public void setHumano(boolean humano) {isHumano = humano;}

    public boolean isAnimal() {
        return isAnimal;
    }

    public void setAnimal(boolean animal) {
        isAnimal = animal;
    }
    
    
    // ------
    
    public Combustivel setGasolina( ) {
        isGasolina =true;
        return this;
    }
    public Combustivel setAlcool( ) {
        isAlcool =true;
        return this;
    }
    public Combustivel setDiesel( ) {
        isDiesel =true;
        return this;
    }
    public Combustivel setEletricidade( ) {
        isEletricidade =true;
        return this;
    }
    public Combustivel setHumano( ) {
        isHumano =true;
    return this;}
    public Combustivel setAnimal( ) {
        isAnimal =true;
        return this;
    }

    @Override
    public String toString() {
        return "Combustivel: {" +
          (isGasolina ? "\n     isGasolina: " + isGasolina : "") +
                (isAlcool ? "\n     isAlcool: " + isAlcool : "") +
                (isDiesel ? "\n     isDiesel: " + isDiesel : "") +
                (isEletricidade ? "\n     isEletricidade: " + isEletricidade : "") +
                (isHumano ? "\n     isHumano: " + isHumano : "") +
                (isAnimal ? "\n     isAnimal: " + isAnimal : "") +
                "\n }";
    }
}
