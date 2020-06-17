import java.util.Scanner;
public class JogoV5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = teclado.next();
        //Criando um personagem guerreiro:
        Guerreiro jogador = new Guerreiro(nome);
        
        Zumbi z1 = new Zumbi();
        
        System.out.println(jogador.status());
        System.out.println(z1);
        
        System.out.println("---------------------------------------------");
        jogador.bater(z1);
        System.out.println(z1);
        System.out.println("---------------------------------------------");
        jogador.bater(z1);
        System.out.println(z1);
        
    }
}
