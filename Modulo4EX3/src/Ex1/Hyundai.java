package Ex1;

public class Hyundai extends ICarros {
    public Hyundai(String marca, String cor, double valor, double velocidade, int portas) {
        super(marca, cor, valor, velocidade, portas);
    }

    @Override
    public void exibição() {
        super.exibição();
    }

    public void motor(){
        System.out.println("Iniciando motor");

        System.out.println("Minha velocidade está em: "+getVelocidade());
        System.out.println("Acelerando...minha velocidade está em: "+ acelerar()+"km/h");
        System.out.println("Freiando...minha velocidade está em: "+freiar()+"km/h");

    }
    public double freiar(){
        double  calculoFreiar =getVelocidade()-2;
        return calculoFreiar;

    }

    public double acelerar(){
        double calculoAcelerar = getVelocidade() + 15;
        return  calculoAcelerar;

    }
}
