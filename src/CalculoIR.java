public class CalculoIR {

    public String calcularIR(float rendimento) {
        String ir;

        if (rendimento < 0) {
            ir = "Erro: valor negativo inválido.";

        } else if (rendimento <= 5000) {
            ir = "Isenção total";

        } else if (rendimento <= 5500) {
            ir = "Desconto de 75%";

        } else if (rendimento <= 6000) {
            ir = "Desconto de 50%";

        } else if (rendimento <= 6500) {
            ir = "Desconto de 25%";

        } else if (rendimento <= 7350) {
            ir = "Desconto de 10%";

        } else {
            ir = "Alíquota de 27,5%";
        }
        return ir;
    }
}