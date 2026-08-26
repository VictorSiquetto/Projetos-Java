package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Video 1");
        v[1] = new Video("Video 2");
        v[2] = new Video("Video 3");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Joao", 19, "M", "jonny");
        g[1] = new Gafanhoto("Ana", 21, "F", "aninha");
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        System.out.println("");
        
        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(87.5f);
        System.out.println(vis[1].toString());
        
    }
    
}
