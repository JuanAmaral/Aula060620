
import java.lang.reflect.Method;
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
public class TerraClownPlanet implements Terra{
    Personagem personagem;
    TerraClownPlanet terraClownPlanet;
    
    /*
     Quests quests = new Quests();
        System.out.println("Escolha entre 1)Terra 4-169 1   2)Universo 2  ou  3)Universo 3 ");
        System.out.print("Opção: ");
        String opcao = new java.util.Scanner(System.in).next();
        java.lang.reflect.Method method;       
        method = quests.getClass().getMethod("quest" + opcao);
        method.invoke(quests);
    */
    
    public int Escolhas(int opcao,String metodo,String metodo2) throws NoSuchMethodException{
        
        do{
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            java.lang.reflect.Method method;      
            
            switch(opcao){
                case 1:
                        method = terraClownPlanet.getClass().getMethod(metodo);
                    break;
                case 2:
                        method = terraClownPlanet.getClass().getMethod(metodo2);
                    
                    break;
                case 0:
                        break;
                default:
                    System.out.println("opção inválida");
                    
                    break;
            }
        }while (opcao != 0 || opcao != 1 || opcao != 2);
        return 0;
        
    }
    
    
    
    public void Historia1() {
        System.out.println("Entrando em ClownPlanet");
        System.out.println("------------------------------------");
        System.out.println("Iniciando simulação em 3,2,1... Carregamento concluido!");
        System.out.println("------------------------------------");
        System.out.println("Você já esta presente no ClownPlanet");
        System.out.println("------------------------------------");
        System.out.println("Você está em uma floresta povoada por palhacinhos, parece divertido, o que deseja fazer?");
        System.out.println("1) explorar 2)revirar meus itens");
         Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //Escolhas(num,"Historia1","Historia2");
        
        
        
        if(num == 1){
            Historia3();
        }else if(num == 2)
        {
            Historia3();
        }
        
        
    }

    @Override
    public void Historia2() {
        System.out.println("Você está percorrendo a floresta e escuta cascos na floresta, o que deseja fazer? 1)Explorar 2)Revirar Itens ");
        System.out.println("VocÊ se aproxima e vê...");
        System.out.println(personagem.getNome()+ ": "+ " CAramba!! Que diabos é isso?");
        System.out.println("Você vê diante de sua frente um hibrido cachorro com chifre de veado");
        System.out.println("1)atacar 2)Entrevistar");
        //se escolher entrevistar vai para História3();
    }
    public void Historia3() {
        System.out.println(personagem.getNome()+ ": "+ " Boa noite, Sr...? ");
        System.out.println("Annie: Pode me chamar de Annie, com 2 ''N''");
        System.out.println(personagem.getNome()+ ": "+"Se importa se eu entrevistar voce pra um video no meu espaçocast?");
         System.out.println("Annie: Pode ser, estou animada! Sempre quis fazer um espaçocast!");
        System.out.println(personagem.getNome()+ ": "+" Seja bem vinda, 1) O que faz nessa floresta tão densa e perigosa?  2) Que tipo de criatura você é?");
        // resposta 1
        System.out.println(personagem.getNome()+ ": "+ "Minha primeira pergunta é : Você esta preocupada? Porque parece que vamos morrer, o que você acha da morte?" );
        System.out.println("Annie: Parece que sim, mas já tive muitas mortes na vida ");
        //resposta 2
        System.out.println("Annie: Sou um híbrido cachorro nobre e pacífico!  ");
        
        //System.out.println(personagem.getNome()+ ": "+ );
    }
    
}
