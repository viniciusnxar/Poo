public class Administrativo extends Assistente{
    private String turno;
    private double bonusTurno;
        public Administrativo(String nome, double salario, int matricula, String turno,double bonusTurno){
        super(nome, salario, matricula);
        this.turno = turno;
        this.bonusTurno = bonusTurno;
    }

    @Override
    public double ganhoAnual() {
        double salarioAnual = getSalario() * 12;
        if (turno.equalsIgnoreCase("noite")) {
            salarioAnual += bonusTurno * 12;
        }
        return salarioAnual;
    }
    
}
