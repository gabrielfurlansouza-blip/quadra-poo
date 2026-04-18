public class Cliente {
    private int id;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
}
