
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		try {
			System.out.println("Início do metodo1");
		metodo2();
		Conta conta = null;
		conta.deposita();
		System.out.println("Fim do metodo1");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException " + e.getMessage());
		}
		
	}

	private static void metodo2() {
		try {
			System.out.println("Início do metodo2");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				int a = i / 0;
				System.out.println(a);
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException " + e.getMessage());
		}

	}
}