
public class Fluxo {

	public static void main(String[] args) {
		try {
			System.out.println("Início do main");
			metodo1();
			System.out.println("Fim do main");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	private static void metodo1() {
		System.out.println("Início do metodo1");
		Conta conta = null;
		conta.deposita();
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Início do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
	}
}