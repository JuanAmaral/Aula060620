public class Zumbi implements Inimigo{
    int vida = 20;
    int xp = 10;
    
    @Override
    public void atacar(Personagem p) {
        p.vida -= 5;
    }

    @Override
    public void levarDano(int quantidade) {
        this.vida -= quantidade;
    }
    
    public String toString() {
        return "Zumbi >> Vida: " + this.vida;
    }
    
}
