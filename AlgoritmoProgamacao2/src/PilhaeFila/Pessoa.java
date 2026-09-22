package PilhaeFila;

public class Pessoa implements Comissao{
    protected String nome;
    protected String cargo;
    protected SEMANA folga;

    @Override
    public double comissaoSalrio() {
        return 0;
    }

    public Pessoa(String nome, String cargo, SEMANA folga) {
        this.nome = nome;
        this.cargo = cargo;
        this.folga = folga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
