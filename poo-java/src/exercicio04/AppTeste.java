package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class AppTeste {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNomeCompleto("Alessandro Dias");
        funcionario.setCpf("123.456.789-00");

        Dependente filha = new Dependente();

        filha.setNomeCompleto("Beatriz Dias");
        filha.setSequencial(123);
        filha.setParticipaPlano(false);
        filha.setFuncionario(funcionario);

        Dependente filho = new Dependente();

        filho.setNomeCompleto("Claudio Dias");
        filho.setSequencial(234);
        filho.setParticipaPlano(true);
        filho.setFuncionario(funcionario);

        List<Dependente> listaDependentes = new ArrayList<>();
        listaDependentes.add(filha);
        listaDependentes.add(filho);

        funcionario.setDependentes(listaDependentes);

        System.out.println("Funcionario: " + funcionario.getNomeCompleto());
        System.out.println("N. de dependentes: " + funcionario.getDependentes().size());
        
    }

}
