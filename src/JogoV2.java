import java.util.Scanner;
public class JogoV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Criando um personagem:
        Personagem jogador = new Personagem();
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = teclado.next();
        jogador.nome = nome;
        
        System.out.println("Bem-vindo(a): " + jogador.nome + "!");
        /*
        System.out.println("STATUS: ");
        System.out.println("Nível: " + jogador.nivel);
        System.out.println("XP: " + jogador.xp);
        System.out.println("Vida: " + jogador.vida);
        */
        System.out.println(jogador.status());
    }
}
