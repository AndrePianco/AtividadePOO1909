package Q4;
/*Crie uma classe Carro.java adicionando atributos, como marca, modelo, ano de fabricação, tipo de
        combustível (álcool, gasolina ou flex), e também alguns métodos (Ligar, desligar, frear, etc) além de
        ao menos um método construtor e os métodos get e set. Crie arquivo Main.java para definir e exibir
        os novos atributos. Crie também uma classe Pessoa.java com métodos e atributos além de ao menos
        um método construtor e os métodos get e set para se relacionar com a classe carro.*/

public class Carro {
    String marca;
    String modelo;
    int ano;
    String gas;
    boolean ligado;
    Pessoa dono;

    Carro(){
        //Construtor para instanciar um objeto sem passar parametro
    }
    Carro(String marca, String modelo, int ano, String gas, Pessoa dono){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.gas = gas;
        this.ligado = false;
        this.dono = dono;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public void setGas(String gas){
        this.gas = gas;
    }
    public String getGas(){
        return gas;
    }

    public void Ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("Carro ligando...");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }
    public void Desligar(){
        if(ligado == true){
            ligado = false;
            System.out.println("Carro desligando...");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }
    public void Frear() {
        if (ligado == true) {
            System.out.println("Carro freando...");
        } else {
            System.out.println("Ligue o carro primeiro para poder frear!");
        }
    }

    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono){
        this.dono = dono;
    }
}
