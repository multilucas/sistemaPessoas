public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        Pessoa meuFuncionario1 = new Pessoa("Lucas",25,"Programador",1.79,89.6,(byte) 'M',"874.545.632-12","Josefina Maria das Graças");
        Pessoa meuFuncionario2 = new Pessoa("Ana", 30, "Engenheira", 1.65, 60.2, (byte) 'F', "934.678.123-45", "Maria Silva");
        Pessoa meuFuncionario3 = new Pessoa("Pedro", 28, "Designer", 1.75, 70.3, (byte) 'M', "756.890.321-98", "Rosa Oliveira");
        Pessoa meuFuncionario4 = new Pessoa("Mariana", 35, "Médica", 1.68, 62.5, (byte) 'F', "645.234.987-61", "Lucia Pereira");
        Pessoa meuFuncionario5 = new Pessoa("Rafael", 29, "Professor", 1.82, 80.9, (byte) 'M', "821.456.789-32", "Camila Ferreira");
        Pessoa meuFuncionario6 = new Pessoa("Carla", 32, "Advogada", 1.67, 58.1, (byte) 'F', "912.345.678-90", "Luisa Santos");
        Pessoa meuFuncionario7 = new Pessoa("João", 27, "Engenheiro", 1.78, 77.0, (byte) 'M', "543.987.654-12", "Ana Rodrigues");
        Pessoa meuFuncionario8 = new Pessoa("Sara", 33, "Arquiteta", 1.70, 65.8, (byte) 'F', "678.234.567-89", "Isabela Gonçalves");
        Pessoa meuFuncionario9 = new Pessoa("Luis", 36, "Contador", 1.75, 72.6, (byte) 'M', "789.543.210-34", "Beatriz Martins");
        Pessoa meuFuncionario10 = new Pessoa("Marta", 31, "Farmacêutica", 1.63, 57.2, (byte) 'F', "875.678.987-23", "Laura Silva");
        minhaAgenda.addPessoa(meuFuncionario1);
        minhaAgenda.addPessoa(meuFuncionario2);
        minhaAgenda.addPessoa(meuFuncionario3);
        minhaAgenda.addPessoa(meuFuncionario4);
        minhaAgenda.addPessoa(meuFuncionario5);
        minhaAgenda.addPessoa(meuFuncionario6);
        minhaAgenda.addPessoa(meuFuncionario7);
        minhaAgenda.addPessoa(meuFuncionario8);
        minhaAgenda.addPessoa(meuFuncionario9);
        minhaAgenda.addPessoa(meuFuncionario10);
        System.out.println(minhaAgenda.buscaPessoaPorNome("Marta"));
        System.out.println(minhaAgenda.buscaPessoaPorProfissao("Professor"));
        System.out.println(minhaAgenda.todosContatos());

    }
}