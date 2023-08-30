package com.poo.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.veterinaria.classes.ClinicaVeterinaria;

import com.poo.veterinaria.classes.Funcionario;
import com.poo.veterinaria.classes.Pet;
import com.poo.veterinaria.classes.Tutor;
import com.poo.veterinaria.enums.Especie;
import com.poo.veterinaria.enums.UnidadeFederal;
import com.poo.veterinaria.enums.Funcao;
@SpringBootApplication
public class VeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaApplication.class, args);

		System.out.println("");
		System.out.println(" *** DADOS DOS FUNCIONARIOS ***");

		Funcionario func1 = new Funcionario(10, "Carlos Antonio da Silva", "Rua dos bobos,00", UnidadeFederal.RJ,
				"1234567800", 22444123,
				99882255, "emailfunc@hotmail.com", "Atendente", 1001);

		Funcionario func2 = new Funcionario(11, "Ana Paula Dias", "Rua dos espertos,10", UnidadeFederal.MG,
				"1234512345", 22441010,
				99882233, "emailfunc2@hotmail.com", "Gerente", 1002); // insercao dados func2

		// Print func1

		System.out.println("_________________________________");
		System.out.println("Funcionário:" + func1.getNome());
		System.out.println("Matrícula:" + func1.getMatricula());
		System.out.println("Função:" + func1.getFuncao());
		System.out.println("                                 ");
		System.out.println("CPF:" + func1.getCpf());
		System.out.println("Endereço:" + func1.getEndereco());
		System.out.println("UF: " + func1.getUf());
		System.out.println("Telefone Fixo:" + func1.getTelefoneFixo());
		System.out.println("Telefone Cel:" + func1.getTelefoneCel());
		System.out.println("_________________________________");

		// Print func2

		System.out.println("_________________________________");
		System.out.println("Funcionário:" + func2.getNome());
		System.out.println("Matrícula:" + func2.getMatricula());
		System.out.println("Função:" + func2.getFuncao());
		System.out.println("                                 ");
		System.out.println("CPF:" + func2.getCpf());
		System.out.println("Endereço:" + func2.getEndereco());
		System.out.println("UF: " + func2.getUf());
		System.out.println("Telefone FIxo:" + func2.getTelefoneFixo());
		System.out.println("Telefone Cel:" + func2.getTelefoneCel());
		System.out.println("_________________________________");

		/************************************************************************* */

		// Dados Pet

		Pet pet1 = new Pet(); // criacao do primeiro pet (pet1) onde sao inseridos os dados em
		// cada set.
		pet1.setId(1000);
		pet1.setNome("Pretinha");
		pet1.setEspecie(Especie.CANINO);
		pet1.setIdade(10);
		pet1.setRaca("RND");

		System.out.println(" *** DADOS DOS PETS ***");

		// Print pet1
		System.out.println("_________________________________");
		System.out.println("Pet ID:" + pet1.getId());
		System.out.println("Nome Pet:" + pet1.getNome());
		System.out.println("Espécie:" + pet1.getEspecie());
		System.out.println("Idade:" + pet1.getIdade());
		System.out.println("Raça:" + pet1.getRaca());
		System.out.println("_________________________________");

		Pet pet2 = new Pet(); // criacao do pet2

		pet2.setId(1002);
		pet2.setNome("Bolinha");
		pet2.setEspecie(Especie.CANINO);
		pet2.setIdade(3);
		pet2.setRaca("Poodle");

		// Print pet2
		System.out.println("_________________________________");
		System.out.println("Pet ID:" + pet2.getId());
		System.out.println("Nome Pet:" + pet2.getNome());
		System.out.println("Espécie:" + pet2.getEspecie());
		System.out.println("Idade:" + pet2.getIdade());
		System.out.println("Raça:" + pet2.getRaca());
		System.out.println("_________________________________");

		Pet pet3 = new Pet(); // criacao do pet3
		pet3.setId(1003);
		pet3.setNome("Peluda");
		pet3.setEspecie(Especie.FELINO);
		pet3.setIdade(5);
		pet3.setRaca("Siamês");

		// teste

		// Print pet3
		System.out.println("_________________________________");
		System.out.println("Pet ID:" + pet3.getId());
		System.out.println("Nome Pet:" + pet3.getNome());
		System.out.println("Espécie:" + pet3.getEspecie());
		System.out.println("Idade:" + pet3.getIdade());
		System.out.println("Raça:" + pet3.getRaca());
		System.out.println("_________________________________");

		/********************************************************************************** */

		// Dados Clinica

		ClinicaVeterinaria clinica1 = new ClinicaVeterinaria(); // criacao de clinica
		clinica1.setCnpj("361526000166");
		clinica1.setRazaoSocial("PetHouse");
		clinica1.setEndereco("Rua dos Malandros,00");
		clinica1.setTefone("2499882255");

		// Print clinica
		System.out.println("_________________________________");
		System.out.println(" *** DADOS DA CLINICA ***");
		System.out.println("Razão Social:" + clinica1.getRazaoSocial());
		System.out.println("CNPJ:" + clinica1.getCnpj());
		System.out.println("Telefone:" + clinica1.getTefone());
		System.out.println("Endereço: " + clinica1.getEndereco());
		System.out.println("_________________________________");

		// Dados Tutor 1
		Tutor tutor1 = new Tutor(51, "Tutoro Uno", "Rua dos Tutores,00", UnidadeFederal.SP, "1234567800", 22444123,
				99882255,
				"emailtut@hotmail.com");

		System.out.println("_________________________________");
		System.out.println("Tutor:" + tutor1.getNome());
		System.out.println("CPF:" + tutor1.getCpf());
		System.out.println("Endereço:" + tutor1.getEndereco());
		System.out.println("Uf :" + tutor1.getUf());
		System.out.println("Telefone FIxo:" + tutor1.getTelefoneFixo());
		System.out.println("Telefone Cel:" + tutor1.getTelefoneCel());
		System.out.println("_________________________________");

	}

}
