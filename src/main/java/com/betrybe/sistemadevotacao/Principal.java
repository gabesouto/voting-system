package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * principal class.
 */
public class Principal {

  /**
   * principal class.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    GerenciamentoVotacao gv = new GerenciamentoVotacao();

    do {

      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int estaCadastrando = Integer.parseInt(sc.nextLine());

      if (estaCadastrando != 1) {
        break;
      }

      System.out.println("Entre com o nome da pessoa candidata:");
      String nomeCandidato = sc.nextLine();
      System.out.println("Entre com o número da pessoa candidata:");
      int numero = Integer.parseInt(sc.nextLine());
      gv.cadastrarPessoaCandidata(nomeCandidato, numero);

    } while (true);

    do {

      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int estaCadastrando = Integer.parseInt(sc.nextLine());

      if (estaCadastrando != 1) {
        break;
      }

      System.out.println("Entre com o nome da pessoa eleitora:");
      String nomeEleitora = sc.nextLine();
      System.out.println("Entre com o cpf da pessoa eleitora:");
      String cpf = sc.nextLine();
      gv.cadastrarPessoaEleitora(nomeEleitora, cpf);
    } while (true);

    while (true) {
      System.out.println("Entre com o número correspondete à opção desejada");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      int input = Integer.parseInt(sc.nextLine());

      if (input == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = sc.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(sc.nextLine());
        gv.votar(cpf, numero);
        continue;
      }

      if (input == 2) {
        gv.mostrarResultado();
        continue;
      }

      gv.mostrarResultado();
      break;
    }
  }
}




