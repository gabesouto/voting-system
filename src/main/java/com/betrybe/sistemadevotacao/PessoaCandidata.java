package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {

  public int numero;
  public int votos;

  /**
   * Classe abstrata PessoaCandidata.
   */
  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    this.setNome(nome);
    this.votos = 0;
  }

  public int getVotos() {
    return votos;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
