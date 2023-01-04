
public class FluxoComTratamento {

    public static void main(String[] args) {
        try {
            System.out.println("Início do main");
            metodo1();
            System.out.println("Fim do main");
        } catch (NullPointerException | ArithmeticException | MinhaException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        metodo2();
    }
}
