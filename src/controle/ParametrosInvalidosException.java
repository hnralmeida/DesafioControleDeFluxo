package controle;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException (String message) {
        super(message);
        System.out.println("O primeiro numero deve ser menor que o segundo");
    }
}
