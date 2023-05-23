package Ex1;

public class ICarros {
    public String marca,cor;
    public double valor,velocidade;
    public int portas;
    public ICarros(String marca,String cor, double valor,double velocidade,int portas){
        this.marca =marca;
        this.cor=cor;
        this.valor=valor;
        this.velocidade=velocidade;
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidade() {
        return velocidade;
    }
    public void exibição(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Cor: "+getCor());
        System.out.println("Valor: "+getValor());
        System.out.println("Velocidade: "+getVelocidade());
        System.out.println("Quantidade de portas: "+getPortas());
    }
}

