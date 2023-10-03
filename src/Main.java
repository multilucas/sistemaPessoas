public class Main {
    public static void main(String[] args) {
        Pessoa meuFuncionario = new Pessoa();
        meuFuncionario.setIdade(25);
        meuFuncionario.setNome("Lucas");

        System.out.println(meuFuncionario.getNome());
        System.out.println(meuFuncionario.getIdade());

        meuFuncionario.setNome("Maria");
        meuFuncionario.setIdade(30);

        System.out.println(meuFuncionario.getNome());
        System.out.println(meuFuncionario.getIdade());
    }
}