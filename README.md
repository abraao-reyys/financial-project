# Gerenciador de Metas Financeiras

Projeto avaliativo da disciplina de Projeto de Programção, I Unidade. Trata-se de uma aplicação de console em Java que ajuda o usuário a cadastrar uma meta financeira e acompanhar seus investimentos (Renda Fixa e Variável) até atingir o objetivo. Os resultados mostrados na sua carteira já são a projeção com base na taxa de juros informada e no valor informado das cotas.

## | Como Executar

1. Certifique-se de ter o **Java JDK 15 ou superior** instalado, visto que é utilizado recursos recentes como o Text Blocks.
2. Clone ou extraia este projeto.
3. Navegue até o package `src`, localizado no diretório raiz, via terminal.
4. Compile os arquivos: `javac Main.java model/*.java service/*.java`
5. Execute o programa: `java Main`

## | Principais Funcionalidades

- Definição de uma Meta Financeira (descrição, valor alvo e prazo).
- Cadastro de ativos de **Renda Fixa**, calculando saldo via juros compostos simples; ou seja, é uma projeção.
- Cadastro de ativos de **Renda Variável**, calculando saldo pela marcação a mercado (cotas x preço).
- Busca de ativos por nome.
- Geração de extrato formatado no terminal, exibindo o percentual de progresso em relação à meta.

## | Conceitos da Disciplina Aplicados

* **Sintaxe e Controle de Fluxo:** Uso de `while`, `switch/case` e tratamento de exceções com `try-catch`, capturando a `NumberFormatException`.
* **Strings:** Formatação com **Text Blocks** (`"""`), `String.formatted()` e métodos de busca.
* **Coleções:** Uso de `ArrayList` para armazenar dinamicamente a carteira de ativos e laços `for-each` para iteração.
* **Orientação a Objetos (POO):**
    * **Abstração & Herança:** Classe abstrata `Investment` base para `FixedIncome` e `VariableIncome`.
    * **Polimorfismo:** Método `calculateCurrentBalance()` sobrescrito (`@Override`) e chamado dinamicamente.
    * **Encapsulamento:** Atributos `private` acessados via *getters*.
* **SOLID:** Separação de responsabilidades (SRP) com a classe `StatementService`, que tira a responsabilidade de impressão da tela da classe de negócios, a `Wallet`.

## | Observações

* **Idioma Inglês Americano** no código do projeto, exceto nos textos de interação, por preferências pessoais.
* O sistema gera apenas uma **projeção**. É válido ressaltar que **taxas de juros pós-fixadas mudam**, além da **renda variável**, que está vinculada a **índices extremamente voláteis**.
* O sistema não utiliza banco de dados ou arquivos externos. Os dados são mantidos em memória durante a execução via ArrayList.
* Para manter a simplicidade do MVP, os cálculos de rendimento não descontam inflação, IR ou taxas de custódia da bolsa ou corretoras.
* O sistema utiliza o padrão americano para casas decimais no terminal. Portanto, os valores fracionados devem ser inseridos utilizado ponto em vez de vírgula.
