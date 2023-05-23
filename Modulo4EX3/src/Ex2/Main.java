package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Biblioteca sitema = new Biblioteca();
        System.out.println("digite o numero da opção que deseja resgistrar seu livro: ");

        System.out.println("---------------");
        System.out.println("OPÇÃO 1- registrar com ISBN");
        System.out.println("OPÇÃO 2- registrar com ISBN e o NOME DO LIVRO");
        System.out.println("OPÇÃO 3 - registrar com ISBN,NOME DO LIVRO E GÊNERO");
        System.out.println("OPÇÃO 2 - registrar com ISBN,NOME DO LIVRO,GÊNERO E AUTOR");
        System.out.println("---------------");
        int opção = ler.nextInt();

         if (opção == 1){
             sitema.resgistrarLivro(1);
         } else if (opção == 2) {
             sitema.registrarLivro(2);
         } else if (opção == 3) {
             sitema.registrarLivro(3);
         } else if (opção == 4) {
             sitema.registrarLivro(4);
         } else {
             System.out.println("VALOR INVALIDO");
             return;
         }


    }
}
