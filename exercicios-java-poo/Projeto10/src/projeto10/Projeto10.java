package projeto10;

public class Projeto10 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();        
        Arara ar = new Arara();        
        
        c.locomover();
        ca.locomover();
        c.emitirSom();
        ca.emitirSom();
        t.locomover();
    }
}
