package ParteIII.Aula08.funcional;
//outro exemplo de imutável
import java.util.Objects;

public class Ponto2D {

    private final double x;
    private final double y;

    //construtor privado para garantir imutabilidade
    private Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //método público para criar um novo ponto
    public static Ponto2D of(double x, double y) {
        return new Ponto2D(x, y);
    }

    //métodos getters imutáveis para x e y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //método para calcular a distância entre este ponto e outro
    public double distancia(Ponto2D outroPonto) {
        double dx = x - outroPonto.getX();
        double dy = y - outroPonto.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //método para calcular a soma de dois pontos
    public Ponto2D soma(Ponto2D outroPonto) {
        return new Ponto2D(x + outroPonto.getX(), y + outroPonto.getY());
    }

    //outros métodos (se necessário) ....

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto2D ponto2D = (Ponto2D) o;
        return Double.compare(x, ponto2D.x) == 0 &&
                Double.compare(y, ponto2D.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

