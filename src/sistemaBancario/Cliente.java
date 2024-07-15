package sistemaBancario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Cliente {

    private String nome;
    private String senha;
    private boolean isAutenticado = false;

    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }


    public void autentica (String senha){
        if (this.senha.equals(senha)){
            this.isAutenticado = true;
            System.out.println("Cliente " + this.nome + " Logado");
        }else throw new RuntimeException("Senha incorreta");
    }

}
