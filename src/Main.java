import sistemaBancario.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Cliente c1 = new Cliente("Paulo","123");
        Cliente c2 = new Cliente("Algusto", "123");
        Cliente c3 = new Cliente("Beatriz", "123");
        Cliente c4 = new Cliente("Carlos", "123");
        Cliente c5 = new Cliente("Zed", "123");
        Cliente c6 = new Cliente("Alberto", "123");


        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPolpanca(c2);
        Conta cc2 = new ContaPolpanca(c3);
        Conta cc3 = new ContaPolpanca(c4);
        Conta cc4 = new ContaPolpanca(c6);
        Conta cc5 = new ContaPolpanca(c3);
        Conta cp2 = new ContaPolpanca(c5);

        Banco b1 = new Banco("nome", new ArrayList<Conta>(List.of(cc, cp, cc2, cc3, cc4, cc5)));

        //System.out.println(b1.getContas());

        System.out.println(b1.listarClientes());
        b1.adicionarConta(cp2);
        System.out.println(b1.listarClientes());

        c1.autentica("123");
        cc.depositar(100);
        //cc.imprimirExtrato();
        cc.transferir(100, cp);


        //cp.getCliente().autentica("123");
        //cp.imprimirExtrato();
        //cp.sacar(100);
    }
}