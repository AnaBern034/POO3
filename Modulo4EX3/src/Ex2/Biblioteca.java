package Ex2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Biblioteca {
    Scanner ler = new Scanner(System.in);

    public void resgistrarLivro(int nmIdentif1){
        System.out.println("Digite o ISBN do seu novo livro, contendo 13 numeros");
        double ISBN = ler.nextDouble();
        System.out.println("O livro foi registrado: "+ISBN);
    }

    public  void registrarLivro(int nmIdentif2){
        System.out.println("Digite o ISBN do seu novo livro, contendo 13 numeros");
        double ISBN = ler.nextDouble();

        System.out.println("Digite o nome do seu livro: ");
       String nomeLivro = ler.next();

        System.out.println("O livro foi regitrado com o ISBN: "+ISBN);

        System.out.println("E o nome: "+nomeLivro);
    }
      public void registrarLivro(double nm3){
        System.out.println("Digite o ISBN do seu novo livro, contendo 13 numeros");
        double ISBN = 13;
       if (ISBN == 13){
           ISBN = ler.nextDouble();
       } else {
           System.out.println("Você precisa atingir o valor até 13");
       }

        System.out.println("Digite o nome do seu livro: ");
        String nomeLivro = ler.next();

        System.out.println("Digite o gênero do seu lirvo: ");
        String genero = ler.next();

        System.out.println("O livro foi registrado: "+ISBN+"nome do livro: "+ nomeLivro+" genero livro: "+genero);
    } public void registrarLivro( float nm4){
        System.out.println("Digite o ISBN do seu novo livro, contendo 13 numeros");
        double ISBN = ler.nextDouble();

        System.out.println("Digite o nome do seu livro: ");
        String nomeLivro = ler.next();

        System.out.println("Digite o gênero do seu lirvo: ");
        String genero = ler.next();

        System.out.println("Digite o seu nome: ");
        String autoLivro = ler.next();

        System.out.println("O livro foi registrado: "+ISBN+"nome do livro: "+ nomeLivro+" genero livro: "+genero+"Nome do autor: "+autoLivro);
    }

}
