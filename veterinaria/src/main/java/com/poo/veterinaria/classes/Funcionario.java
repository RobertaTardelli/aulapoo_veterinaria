package com.poo.veterinaria.classes;

<<<<<<< HEAD
import com.poo.veterinaria.enums.UnidadeFederal;

public class Funcionario extends Pessoa {

    private String funcao;
    private int matricula;

    // puxa UnidadeFederal de Pessoa - lança no construtor e no super
    public Funcionario(int id, String nome, String endereco, UnidadeFederal uf, String cpf, int telefoneFixo,
            int telefoneCel,
            String email, String funcao, int matricula) {
        super(id, nome, endereco, uf, cpf, telefoneFixo, telefoneCel, email);
        this.funcao = funcao;
        this.matricula = matricula;
    }

    public String getFuncao() {
=======
import com.poo.veterinaria.enums.Funcao;

public class Funcionario {
    private String nome;
    private int cpf;
    private Funcao funcao;
    private String endereco;
    private int telefone;
    private int matricula;

    // contrutor do funcionario
    // atributos serao preenchidos ao criar o funcionario no application

    public Funcionario(String nome, int cpf, Funcao funcao, String endereco, int telefone, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public Funcionario (){
        //Construtor vazio para testar diferentes formas de criar funcionário
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Funcao getFuncao() {
>>>>>>> 27e36cba270c584e3126b0f03eab4d1ff85b8a1d
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }

<<<<<<< HEAD
    public void setMatricula(int matricula) {
        this.matricula = matricula;
=======
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
>>>>>>> 27e36cba270c584e3126b0f03eab4d1ff85b8a1d
    }

}
