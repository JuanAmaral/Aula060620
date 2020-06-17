
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Terra4169 implements Terra{
    Personagem personagem;
    
    
    @Override
    public void  Historia1() {
        System.out.println("Entrando em Terra 4-169");
        System.out.println("------------------------------------");
        System.out.println("Carregamento concluido");
        System.out.println("------------------------------------");
        System.out.println("Devido a um erro operacional, este universo \n" + "esta passando por uma apocalipse Zumbi");
        System.out.println("------------------------------------");
        System.out.println("Você já esta presente no Terra 4-169");
        System.out.println("------------------------------------");
        System.out.println("Você está em uma floresta, é dia, o que deseja fazer?");
        System.out.println("1) explorar 2)revirar meus itens");
        System.out.print("Opção: ");
        Scanner scanner = new Scanner(System.in);

        
    }
    @Override
    public void Historia2() {
        System.out.println("Você encontrou Alguém sua frente");
        System.out.println("------------------------------------");
        System.out.println("Ele está combatendo os Zumbi,você gostaria de: 1)se juntar a ele 2) entrevistar");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 1){
            Historia3();
        }else if(num == 2)
        {
            Historia4();
        }
        
        
        
        
        
    }
    
    public void Historia3() {
        //combate a inimigos
        System.out.println("");
    }
    public void Historia4() {
        //entrevista
        System.out.println("O que você gostaria de perguntar primeiro? 1)Nome 2)O que ele faz aqui");
        //nome
        System.out.println("Glasses Man: Ola, eu me chamo Glasses Man");
        System.out.println(personagem.getNome()+ ": "+ " CAramba!! GLASSES MAN não");
        
        System.out.println(personagem.getNome()+ ": "+ " Sei que parace muito ocupado com esse apcalipse zumbi comendo solto, mas Você se importa se eu gravar essa conversa? ");
        System.out.println("Glasses Man: De forma alguma, diga meu jovem");
        System.out.println(personagem.getNome() + ": " + " ÓTIMO!\n" + "Acho que...Primeiro, quero te agradecer! E fale mais sobre sua visão sistêmica?");
        System.out.println("Glasses Man: Sou a favor da liberdade humana do sistema americano, de deixar o povo determinar as leis. Não acho que... Se eu tivesse que... Sabe, se alguém me pressionasse a dizer se vai ser bom ou ruim... Acho que pode acabar não sendo tão bom pras pessoas. ");
        
    }
 
 
    
   
   
   
    
    
    
}
