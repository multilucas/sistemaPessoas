public class Main {
    public static void main(String[] args) {
        Pessoa meuFuncionario = new Pessoa("Lucas",25,1.79,89.6,(byte) 'M',"874.545.632-12","Josefina Maria das Graças");
        meuFuncionario.setIdade(25);
        meuFuncionario.setNome("Lucas");
        meuFuncionario.setAltura(1.8);
        meuFuncionario.setCpf("985.546.435-34");
        meuFuncionario.setPeso(79.7);
        meuFuncionario.setGenero((byte) 'M');
        meuFuncionario.setNomeDaMae("Josefina Maria das Graças");


        System.out.println(meuFuncionario.getNome());
        System.out.println(meuFuncionario.getIdade());

        meuFuncionario.setNome("Maria");
        meuFuncionario.setIdade(30);

        System.out.println(meuFuncionario.getNome());
        System.out.println(meuFuncionario.getIdade());
    }
}