package Ex1;

public class Renault extends ICarros {
    public Renault(String marca, String cor, double valor, double velocidade, int portas) {
        super(marca, cor, valor, velocidade, portas);
    }
    @Override
    public void exibição() {
        super.exibição();
    }
    public void motor(){
        System.out.println("Iniciando motor");

        System.out.println("Minha velocidade está em: "+getVelocidade());
        System.out.println("Acelerando...minha velocidade está em: "+ acelerar()+"hm/h");
        System.out.println("Freiando...minha velocidade está em: "+freiar()+"hm/h");
    }
    public double freiar(){
       double  calculoFreiar = acelerar() - 5;
       return calculoFreiar;
    }
    public double acelerar(){
        double acelerar= getVelocidade() + 10;
        return  acelerar;
    }
}
