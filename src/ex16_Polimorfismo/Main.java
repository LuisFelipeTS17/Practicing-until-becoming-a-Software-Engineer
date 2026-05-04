package ex16_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioCLT("Kaique", "001", 2500));
        funcionarios.add(new FuncionarioComecionado("Felipe", "001", 4500, 0.6));
        funcionarios.add(new FuncionarioPJ("Carlos", "001", 4000));

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirContracheque();
        }


    }
}
