package projeto09;

public class Projeto09 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        
        v1.setNome("Joao");
        v1.setIdade(23);
        v1.setSexo("M");
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Carlos");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Ana");
        b1.setIdade(17);
        b1.setSexo("F");
        b1.setMatricula(1112);
        b1.setBolsa(15.5f);
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        
        t1.setNome("Kleber");
        t1.setIdade(18);
        t1.setSexo("M");
        t1.setRegistroProfissional(1113);
        t1.praticar();
        t1.pagarMensalidade();
    }
    
}
