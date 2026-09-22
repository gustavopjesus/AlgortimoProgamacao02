package PilhaeFila;

public class Funcionariio extends Pessoa {
    private double Salario;
    private final double COMISSAO = 0.15;

    public Funcionariio(String nome, String cargo, SEMANA folga, double salario) {
        super(nome, cargo, folga);
    }




    @Override
    public double comissaoSalrio() {
        return (this.Salario * COMISSAO)+this.Salario;
    }

    @Override
    public String toString() {
        return "Funcionariio{" +
                "Salario=" + Salario +
                ", COMISSAO=" + COMISSAO +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", folga=" + folga +
                '}';
    }
}
