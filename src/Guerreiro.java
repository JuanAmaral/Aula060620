public class Guerreiro extends Personagem {
    int forca;
    
    public Guerreiro() {
        forca = 10;
    }
    
    public Guerreiro(String nome) {
        super(nome);
        forca = 10;
    }
    
    @Override
    public String status() {
        String status = super.status() + "\n"; //Pega o status do personagem (superclasse)
        status += "Força: " + this.forca; 
        return status;
    }
    
    public void bater(Inimigo inimigo) {
        inimigo.levarDano(forca);
        return; //Método declarado como void não retorna valor
    }

}
