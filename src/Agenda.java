import java.util.ArrayList;
public class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();

    void addPessoa(Pessoa pessoa) {
        contatos.add(pessoa);
    }

    public Pessoa buscaPessoaPorNome(String nome){
        for (Pessoa pessoa: contatos) {
            if(pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }
    public Pessoa buscaPessoaPorProfissao(String profissao){
        for (Pessoa pessoa: contatos) {
            if(pessoa.getProfissao().equals(profissao)) {
                return pessoa;
            }
        }
        return null;
    }

    public ArrayList<Pessoa> todosContatos(){
        ArrayList<Pessoa> todos = new ArrayList<Pessoa>();
        for(Pessoa pessoa: contatos) {
            todos.add(pessoa);
        }
        return todos;
    }
}
