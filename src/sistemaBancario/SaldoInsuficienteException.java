package sistemaBancario;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException() {
        super ("Saldo Insuficiente para completar a transação");
    }
}
