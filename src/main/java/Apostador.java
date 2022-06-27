import java.util.Observable;
import java.util.Observer;

public class Apostador implements Observer {

    private String nome;
    private String resultadoAposta;

    public Apostador(String nome) {
        this.nome = nome;
    }

    public String getResultadoAposta() {
        return this.resultadoAposta;
    }

    public void apostar(Corrida corrida) {
        corrida.addObserver(this);
    }

    public void update(Observable corrida, Object arg1) {
        this.resultadoAposta = this.nome + ", resultado da corrida  " + corrida.toString() + " lancada";
    }
}