package Q4;

public class Pessoa {
    String nome;
    int idade;
    Carro carro;

    Pessoa(){
        //Construtor para instanciar um objeto sem passar parametro
    }

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setCarro(Carro carro){
        this.carro = carro;
    }
    public Carro getCarro(){
        return carro;
    }

    public void LigarCarro(){
        carro.Ligar();
    }
    public void DesligarCarro(){
        carro.Desligar();
    }

    public void FrearCarro(){
        carro.Frear();
    }
}
