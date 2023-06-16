public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Joao", 2000.0);
        func.exibeDados();
        System.out.println("Ganho Anual: " + func.ganhoAnual());

        Assistente assis = new Assistente("Maria", 2500.0, 12345);
        assis.exibeDados();
        System.out.println("Ganho Anual: " + assis.ganhoAnual());

        Tecnico tec = new Tecnico("Pedro", 3000.0, 54321, 500.0);
        tec.exibeDados();
        System.out.println("Ganho Anual: " + tec.ganhoAnual());

        Administrativo adm = new Administrativo("Ana", 3500.0, 98765, "noite", 200.0);
        adm.exibeDados();
        System.out.println("Ganho Anual: " + adm.ganhoAnual());
    }
}
