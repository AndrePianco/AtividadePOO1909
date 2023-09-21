package Q4;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Andre", 19);
        Carro carro1 = new Carro("Chevrolet", "Astra", 2011, "Gasolina", pessoa1);
        pessoa1.setCarro(carro1);

        System.out.println("Dados do motorista:");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Idade: "+pessoa1.getIdade());
        System.out.println("Carro: "+pessoa1.getCarro().modelo);

        System.out.println("\nDados do carro:");
        System.out.println("Marca: "+carro1.getMarca());
        System.out.println("Modelo: "+carro1.getModelo());
        System.out.println("Ano: "+carro1.getAno());
        System.out.println("Combustível: "+carro1.getGas());
        System.out.println("Dono: "+carro1.getDono().nome);
        System.out.println();

        pessoa1.DesligarCarro();
        pessoa1.LigarCarro();
        pessoa1.DesligarCarro();
        pessoa1.FrearCarro();
    }
}
