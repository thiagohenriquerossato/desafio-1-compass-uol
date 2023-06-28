public class Main {
  public static void main(String[] args) {
    
   
    
    Veiculo carro = new Carro(
      true,
      true,
      4,
      4,
      4,
      false,
      0,
      new Combustivel().setAlcool().setGasolina(),
      true,
      true
    );
    
    Veiculo bike = new Bicicleta(
      false,
      false,
      2,
      0,
      2,
      false,
      0,
      new Combustivel().setHumano(),
      false,
      false
    );
  
    Veiculo caminhao = new Caminhao(
      true,
      true,
      3,
      2,
      6,
      true,
      5000,
      new Combustivel().setDiesel(),
      3
    );
  
    Veiculo charrete = new Charrete(
      false,
      false,
      2,
      0,
      2,
      false,
      0,
      new Combustivel().setAnimal()
    );
  
    Veiculo moto = new Moto(
      true,
      false,
      2,
      0,
      2,
      false,
      0,
      new Combustivel().setEletricidade(),
      true
    );
    
  
    System.out.println("   Carro: ");
    carro.imprimirVariaveis();
  
    System.out.println("\n    Bicicleta: ");
    bike.imprimirVariaveis();
  
    System.out.println(" \n    Caminhão: ");
    caminhao.imprimirVariaveis();
  
    System.out.println(" \n    Charrete: ");
    charrete.imprimirVariaveis();
  
    System.out.println(" \n    Moto: ");
    moto.imprimirVariaveis();
  
  }
}