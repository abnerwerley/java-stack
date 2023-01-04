
public class FluxoStackOverFlowError {

	public static void main(String[] args) throws MinhaException {
		try {
			System.out.println("Início do main");
			metodo1();
			System.out.println("Fim do main");
		} catch (Exception e) {
			throw new MinhaException("Exception: " + e.getMessage());
		}
	}

	private static void metodo1() throws MinhaException {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException {
		try {
			metodo2();
		} catch (StackOverflowError e) {
			throw new MinhaException(e.getMessage());
		}

	}
}