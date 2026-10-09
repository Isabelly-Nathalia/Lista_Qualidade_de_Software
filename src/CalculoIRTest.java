import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoIRTest {
    CalculoIR calculo = new CalculoIR();

    @Test
    public void testeRendimentoNegativo() {
        assertEquals("Erro: valor inválido.",
                calculo.calcularIR(-50000));
    }

    @Test
    public void testeIsencaoTotal() {
        assertEquals("Isenção total",
                calculo.calcularIR(4999));
    }

    @Test
    public void testeDesconto75() {
        assertEquals("Desconto de 75%",
                calculo.calcularIR(5200));
    }

    @Test
    public void testeDesconto50() {
        assertEquals("Desconto de 50%",
                calculo.calcularIR(5750));
    }

    @Test
    public void testeDesconto25() {
        assertEquals("Desconto de 25%",
                calculo.calcularIR(6360));
    }

    @Test
    public void testeDesconto10() {
        assertEquals("Desconto de 10%",
                calculo.calcularIR(7270));
    }

    @Test
    public void testeAliquota275() {
        assertEquals("Alíquota de 27,5%",
                calculo.calcularIR(35220));
    }
}