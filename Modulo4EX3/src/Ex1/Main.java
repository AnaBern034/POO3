package Ex1;

public class Main {
    public static void main(String[] args) {
       Renault carros = new Renault("Renault","vermelho",13.000,0,4);
       carros.exibição();
        System.out.println("--------");
       carros.motor();
        System.out.println("====================================================");

        Fiat carros1 = new Fiat("Fiat","amarelo",13.000,3,4);
        carros1.exibição();
        System.out.println("--------");
        carros1.motor();
        System.out.println("====================================================");

        Hyundai carros2 = new Hyundai("Hyundai","azul",13.000,5,4);
        carros1.exibição();
        System.out.println("--------");
        carros2.motor();
        System.out.println("====================================================");





    }
}
