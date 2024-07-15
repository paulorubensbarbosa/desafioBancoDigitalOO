package sistemaBancario;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    //METODO PARA ADICIONAR CONTA
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    //METODO PARA RETORNAR UMA LISTA COM O NOME DOS CLIENTES EM ORDEM ALFABÉTICA
    public List<String> listarClientes(){
        List<String> clientes = contas.stream()
                .map(n-> n.getCliente().getNome())
                .sorted()
                .distinct()
                .toList();
        return clientes;
    }
}
