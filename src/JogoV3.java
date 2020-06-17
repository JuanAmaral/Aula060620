import java.util.Scanner;
public class JogoV3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = teclado.next();
        //Criando um personagem:
        Personagem jogador1 = new Personagem(nome);
        Personagem jogador2 = new Personagem();
        
        System.out.println(jogador1.status());
        System.out.println(jogador2.status());
    }
}
