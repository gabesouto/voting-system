package com.betrybe.sistemadevotacao;

/**
 * pessoa class.
 */
public abstract class Pessoa {

  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String name) {
    this.nome = name;
  }
}
