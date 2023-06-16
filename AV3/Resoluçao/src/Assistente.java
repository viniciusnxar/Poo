public class Assistente extends Funcionario {
    
    private int matricula;

    public Assistente(String nome, double salario, int matricula){
    super(nome, salario);
    this.matricula = matricula; 
    
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
  @Override
    public void exibeDados() {
        System.out.println("---------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Número de Matrícula: " + matricula);
        System.out.println("---------------");
    }

}
