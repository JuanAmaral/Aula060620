
import java.util.ArrayList;
import java.util.Scanner;

public class Personagem  {
    //Atributos
    String nome;
    int vida;
    int nivel;
    int xp;
    
    
    private void pri(){
        System.out.println("privado?");
    }
    
    
    
    private ArrayList<Personagem> listaItens = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    
    //Métodos
    //Construtor - invocado quando um objeto da classe é criado
    public Personagem() {
        nome = "SemNome";
        vida = 100;
        nivel = 1;
        xp = 0;
    }
    
    public Personagem(String nome) {
        this.nome = nome; //ATRIBUTO nome (this) recebe o valor do ARGUMENTO nome
        vida = 100;
        nivel = 1;
        xp = 0;
    }
    
    public String status() {
        String status = "";
        
        status += "Nome: " + this.nome + "\n";
        status += "Nível: " + this.nivel + "\n";
        status += "XP: " + this.xp + "\n";
        status += "Vida: " + this.vida;
        
        return status;
    }
    public String itens()
    {
        String itens = "";
        System.out.println("Você não tem nenhum item");
        return itens;
    }
   

   
    
    

    
}
