public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private byte genero;
    private String cpf;
    private String nomeDaMae;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, int idade, double altura, double peso, byte genero, String cpf, String nomeDaMae) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.cpf = cpf;
        this.nomeDaMae = nomeDaMae;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public byte getGenero() {
        return genero;
    }

    public void setGenero(byte genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
