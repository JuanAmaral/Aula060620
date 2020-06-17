import java.util.Scanner;
public class JogoV4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = teclado.next();
        //Criando um personagem guerreiro:
        Guerreiro jogador = new Guerreiro();
        jogador.nome = nome;
        System.out.println(jogador.status());

    }
}
