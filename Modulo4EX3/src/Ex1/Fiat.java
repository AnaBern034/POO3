package Ex1;

public class Fiat extends ICarros {

    public Fiat(String marca, String cor, double valor, double velocidade, int portas) {
        super(marca, cor, valor, velocidade, portas);
    }

    @Override
    public void exibição() {
        super.exibição();
    }

    public void motor(){
        System.out.println("Iniciando motor");

        System.out.println("Minha velocidade está em: "+getVelocidade());
        System.out.println("Acelerando...minha velocidade está em: "+ acelerar());
        System.out.println("Freiando...minha velocidade está em: "+freiar()+"km/h");

    }
    public double freiar(){
        double  calculoFreiar =getVelocidade()-6;
        return calculoFreiar;

    }

    public double acelerar(){
        double acelerar = getVelocidade() + 12;
        return  acelerar;
    }
}


