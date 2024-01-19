# Sistema de Votação 
## Descrição

Bem-vindo ao repositório do projeto **Sistema de Votação**! Neste projeto,tive oportunidade de desenvolver um sistema de votação eletrônico utilizando a linguagem Java. O projeto consistiu em três etapas principais:

1. **Cadastrar Pessoas Candidatas:** Nesta etapa, você implementou a classe abstrata `Pessoa` com seus atributos, getters e setters.

2. **Cadastrar Pessoas Eleitoras:** Aqui, foi desenvolvida a classe `PessoaEleitora` para representar os eleitores no sistema.

3. **Iniciar Processo de Votação:** A classe `GerenciamentoVotacao` foi criada para gerenciar o processo de votação, incluindo cadastro de candidatos, eleitores e a implementação dos métodos de votação.

## Habilidades Desenvolvidas

Durante este projeto, você teve a oportunidade de desenvolver e aprimorar as seguintes habilidades:

- Compreensão dos conceitos fundamentais da Programação Orientada a Objetos (POO) em Java.
- Aplicação prática de conceitos como classes, objetos, métodos, encapsulamento, herança, polimorfismo, interfaces e classes abstratas.
- Análise de códigos Java escritos por outros, identificando o uso eficaz de conceitos de POO.
- Criação de programas Java utilizando os princípios da POO, garantindo organização lógica e eficiência no código.
- Avaliação da eficácia de diferentes abordagens de programação em Java, considerando legibilidade, eficiência e facilidade de manutenção.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `.github/workflows`: Arquivos relacionados aos workflows do GitHub.
- `.mvn/wrapper`: Configurações do Maven Wrapper.
- `.trybe`: Configurações específicas da Trybe.
- `images`: Imagens utilizadas no projeto.
- `src`: Código-fonte do projeto.
- `.gitignore`: Configurações para ignorar arquivos específicos no controle de versão.
- `FAQ.md`: Perguntas frequentes relacionadas ao projeto.
- `README.md`: Documentação principal do projeto.
- `mvnw`: Maven Wrapper - script para execução do Maven.
- `pom.xml`: Configurações do Maven para o projeto.
- `trybe-filter-repo.sh`: Script para filtrar o repositório da Trybe.
- `trybe.yml`: Configurações específicas da Trybe para o GitHub Actions.

  ## Rodando o sistema
  
  Clone the project

````bash
git clone git@github.com:gabesouto/voting-system.git

````
Entre no diretório do projeto

```bash
  cd voting-system
````
Instale as dependências
```bash
  mvn install
````

## Exemplo de uso:

 rode o arquivo Principal.java
```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
 1
 Entre com o cpf da pessoa eleitora:
123.456.789-00
 Entre com o número da pessoa candidata:
 1
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```


