import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(1, "João", "99999");

        Horario h1 = new Horario(1, "10:00", 50);
        Horario h2 = new Horario(2, "11:00", 50);

        Aluguel aluguel = new Aluguel(1, c1, Arrays.asList(h1, h2), "2026-04-17");

        System.out.println("Cliente: " + c1.getNome());
        System.out.println("Total: " + aluguel.getValorTotal());
    }
}
