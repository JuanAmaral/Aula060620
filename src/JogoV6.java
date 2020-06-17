import java.util.Scanner;
public class JogoV6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = teclado.next();
        //Criando um personagem guerreiro:
        Guerreiro jogador = new Guerreiro(nome);
        
        
        
        Goblin g1 = new Goblin();
        
        System.out.println(jogador.status());
        System.out.println(g1);
        
        System.out.println("--------------------------------------");
        jogador.bater(g1);
        g1.atacar(jogador);
        
        System.out.println(jogador.status());
        System.out.println(g1);
        System.out.println("---------------------------------------------");
        jogador.bater(g1);
        g1.atacar(jogador);
        System.out.println(jogador.status());
        System.out.println(g1);
        
        
    }
}
