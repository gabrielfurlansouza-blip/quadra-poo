public class Horario {
    private int id;
    private String hora;
    private double valor;
    private boolean disponivel = true;

    public Horario(int id, String hora, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.id = id;
        this.hora = hora;
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public double getValor() {
        return valor;
    }

    public String getHora() {
        return hora;
    }
}
