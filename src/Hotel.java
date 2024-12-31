public class Hotel {
    private String nome;
    private String endereco;
    private int quarto;

    public Hotel(String nome, String endereco, int quarto) {
        this.nome = nome;
        this.endereco = endereco;
        this.quarto = quarto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", quarto=" + quarto +
                '}';
    }
}
