import java.time.LocalDate;

public class Reserva {
    private LocalDate data;
    private String nome;
    private int quarto;

    public Reserva(LocalDate data, String nome, int quarto) {
        this.data = data;
        this.nome = nome;
        this.quarto = quarto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
        return "Reserva{" +
                "data=" + data +
                ", nome='" + nome + '\'' +
                ", quarto=" + quarto +
                '}';
    }
}
