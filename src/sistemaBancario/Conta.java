package sistemaBancario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    @Setter
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            if (cliente.isAutenticado()) {
                this.saldo -= valor;
            } else {
                throw new RuntimeException("Cliente não logado");
            }
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try{
        if (cliente.isAutenticado()) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            throw new RuntimeException("Cliente não logado");
        }}catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    protected void imprimirInfos() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero: " + this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

}
