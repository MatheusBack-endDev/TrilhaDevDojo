package com.matheus.record.application;

import com.matheus.record.model.Funcionario;
import com.matheus.record.model.FuncionarioRecord;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("matheus", 12, "01/03/2000");

        // Mesma coisa que o Funcionario so que com menos codigo
        FuncionarioRecord funcionarioRecord = new FuncionarioRecord("matheus", "01/02/2000", 13);
    }
}
