package projeto09;

public class Professor extends Pessoa{
    private String espec;
    private float salario;

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void recerberAum(float v){
        this.salario += v;
    }
    
}
