import java.util.Observable;

public class Corrida extends Observable {

    private String tipo;
    private String pagamento;

    public Corrida(String tipo, String pagamento) {

        this.tipo = tipo;
        this.pagamento = pagamento;
    }

    public void lancarResultados() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "tipo='" + tipo + '\'' +
                ", pagamento='" + pagamento + '\'' +
                '}';
    }
}