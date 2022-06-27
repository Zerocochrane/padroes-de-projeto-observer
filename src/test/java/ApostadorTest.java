import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApostadorTest {

    @Test
    void deveNotificarUmAluno() {
        Corrida corrida = new Corrida("Cavalo", "1/3");
        Apostador apostador = new Apostador("Marco");
        apostador.apostar(corrida);
        corrida.lancarResultados();
        assertEquals("Marco, resultado da corrida  Corrida{tipo='Cavalo', pagamento='1/3'} lancada", apostador.getResultadoAposta());
    }

    @Test
    void deveNotificarAlunos() {
        Corrida corrida = new Corrida("Cavalo", "1/3");
        Apostador apostador = new Apostador("Marco");
        Apostador apostador2 = new Apostador("Paulo");
        apostador.apostar(corrida);
        apostador2.apostar(corrida);
        corrida.lancarResultados();
        assertEquals("Marco, resultado da corrida  Corrida{tipo='Cavalo', pagamento='1/3'} lancada", apostador.getResultadoAposta());
        assertEquals("Paulo, resultado da corrida  Corrida{tipo='Cavalo', pagamento='1/3'} lancada", apostador2.getResultadoAposta());
    }

    @Test
    void naoDeveNotificarAluno() {
        Corrida corrida = new Corrida("Cavalo", "1/3");
        Apostador apostador = new Apostador("Marco");
        corrida.lancarResultados();
        assertEquals(null, apostador.getResultadoAposta());
    }

    @Test
    void deveNotificarAlunoTurmaA() {
        Corrida corrida1 = new Corrida("Cavalo", "1/3");
        Corrida corrida2 = new Corrida("Cachorro", "1/2");
        Apostador apostador1 = new Apostador("Marco");
        Apostador apostador2 = new Apostador("Paulo");
        apostador1.apostar(corrida1);
        apostador2.apostar(corrida2);
        corrida1.lancarResultados();
        assertEquals("Marco, resultado da corrida  Corrida{tipo='Cavalo', pagamento='1/3'} lancada", apostador1.getResultadoAposta());
        assertEquals(null, apostador2.getResultadoAposta());
    }

}