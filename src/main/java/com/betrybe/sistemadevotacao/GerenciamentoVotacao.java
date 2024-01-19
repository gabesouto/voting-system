package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

/**
 * GerenciamentoVotacao class.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<String> cpfsComputados = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();


  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.numero == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }

    }

    PessoaCandidata pc = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pc);

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoasEleitora : pessoasEleitoras) {
      if (Objects.equals(pessoasEleitora.cpf, cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }

    }
    PessoaEleitora pe = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pe);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (!cpfsComputados.contains(cpfPessoaEleitora)) {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        if (pessoaCandidata.numero == numeroPessoaCandidata) {
          pessoaCandidata.receberVoto();
          cpfsComputados.add(cpfPessoaEleitora);
          System.out.println(cpfsComputados);
          return;
        }
      }
    }

    System.out.println("Pessoa eleitora já votou!");
  }

  @Override
  public void mostrarResultado() {

    System.out.println(cpfsComputados.size());
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata pc : pessoasCandidatas) {
      float percent = (float) pc.votos / cpfsComputados.size() * 100;

      System.out.println(
          "Nome: " + pc.getNome() + " - " + pc.getVotos() + " votos" + " ( " + Math.round(percent)
              + " ) ");
    }
    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
