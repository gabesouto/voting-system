package com.betrybe.sistemadevotacao;

/**
 * Javadoc comment for the PessoaCandidata class.
 */
public class PessoaEleitora extends Pessoa {

  String cpf;

  public PessoaEleitora(String nome, String cpf) {
    this.cpf = cpf;
    this.setNome(nome);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
