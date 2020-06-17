public class Goblin implements Inimigo{
    int vida = 15;
    int xp = 5;
    
    @Override
    public void atacar(Personagem p) {
        p.vida -= 2;
    }

    @Override
    public void levarDano(int quantidade) {
        this.vida -= quantidade;
    }
    
    public String toString() {
        return "Goblin >> Vida: " + this.vida;
    }
    
}
