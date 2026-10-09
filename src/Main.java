public class Main {
    public static void main(String[] args) {

        CalculoIR calculo = new CalculoIR();

        System.out.println(calculo.calcularIR(-50000));
        System.out.println(calculo.calcularIR(4999));
        System.out.println(calculo.calcularIR(5200));
        System.out.println(calculo.calcularIR(5750));
        System.out.println(calculo.calcularIR(6360));
        System.out.println(calculo.calcularIR(7270));
        System.out.println(calculo.calcularIR(35220));
    }
}