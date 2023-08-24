package com.poo.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.veterinaria.classes.Funcionario;

@SpringBootApplication
public class VeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaApplication.class, args);

		Funcionario func1 = new Funcionario(); // criacao do primeiro funcionario (func1) onde sao inseridos os dados em
												// cada set.
		func1.setNome("Carlos Antonio da Silva");
		func1.setCpf(1234567800);
		func1.setFuncao("Atendente");
		func1.setEndereco("Rua dos bobos,00");
		func1.setTelefone(988241234);
		func1.setMatricula(1001);

		Funcionario func2 = new Funcionario(); // criacao do segundo funcionario (func2) onde sao inseridos os dados em
		// cada set.
		func2.setNome("Ana Paula Dias");
		func2.setCpf(1234512345);
		func2.setFuncao("Gerente");
		func2.setEndereco("Rua dos espertos,00");
		func2.setTelefone(998245555);
		func2.setMatricula(1002);

		// Print func1
		System.out.println("                                 ");
		System.out.println("_________________________________");
		System.out.println("Funcionário:" + func1.getNome());
		System.out.println("Matrícula:" + func1.getMatricula());
		System.out.println("Função:" + func1.getFuncao());
		System.out.println("                                 ");
		System.out.println("CPF:" + func1.getCpf());
		System.out.println("Endereço:" + func1.getEndereco());
		System.out.println("Telefone:" + func1.getTelefone());
		System.out.println("_________________________________");

		// Print func2
		System.out.println("                                 ");
		System.out.println("_________________________________");
		System.out.println("Funcionário:" + func2.getNome());
		System.out.println("Matrícula:" + func2.getMatricula());
		System.out.println("Função:" + func2.getFuncao());
		System.out.println("                                 ");
		System.out.println("CPF:" + func2.getCpf());
		System.out.println("Endereço:" + func2.getEndereco());
		System.out.println("Telefone:" + func2.getTelefone());
		System.out.println("_________________________________");


/************************************************************************* */

// Dados Pet





	}

}
