# Tema **QLang**, grupo **qlang-q05**

---

## Constituição dos grupos e participação individual global

![cooltext459928447639171-removebg-preview](https://github.com/detiuaveiro/qlang-q05/assets/149102355/d46fc2f5-8b47-4a33-8b1b-4aa515cbcf2f)  
Nota final: 14.7

| NMec | Nome | Participação |
|:---:|:---|:---:|
| 113480 | AFONSO LUCAS DE OLIVEIRA FERREIRA | 27.5% |
| 108304 | MIGUEL SOARES FRANCISCO | 20.0% |
| 98059 | PEDRO MATOS PONTE | 23.75% |
| 112665 | TOMÁS RAFAEL MARQUES BRÁS | 23.75% |
| 109211 | VASCO MIGUEL OLIVEIRA RODRIGUES | 5.0% |

## Estrutura do repositório

- **src** -- deve conter todo o código fonte do projeto
- **examples** -- exemplos de código fonte que deve er aceite pela linguagem desenvolvida

## Relatório

### **Contextualização**

O principal objetivo deste trabalho foi o desenvolvimento de uma linguagem de programação compilada que permita a construção de questionários de avaliação ( especialmente dirigidos para o ensino de programação)

Neste trabalho tinhamos diferentes caracteristicas de avaliação:

- mínima -- caracteristica que a solução tem obrigatoriamente de implementar.
- desejável -- caracterı́stica não obrigatória, mas fortemente desejável que seja implementada pela solução (apenas considerada se as mı́nimas forem cumpridas).
- avançada -- caracterı́stica adicional apenas considerada para avaliação se as obrigatórias e as desejáveis tiverem sido contempladas na solução.

Em relação ás características mínimas, foram implmentados todos os objetivos solicitados, isto é:

- Instrução para definir perguntas dos tipos: hole, open, code−open, code−hole, do tipo question.
- Instrução para definir código (em linha ou importado de um ficheiro externo), do tipo code.
- Os tipo de de dados inteiro, texto, e fracção.
- Aceitar expressões aritméticas standard para os tipos de dados numéricos e aceitar a operação de concatenação de texto.
- Instrução de escrita no standard output.
- Instrução de leitura de texto a partir do standard input.
- Operadores de conversão entre tipos de dados.
- Instrução para executar código ou perguntas.
- Instrução para exportar resultados do questionário.
- Verificação semântica do sistema de tipos.

Para além da linguagem interpretada, conseguir aceitar programas que estejam de acordo com as características acima mencionadas deve ainda, aceitar programas pil e, para isso, necessita de:

- A definição de expressões booleanas (predicados) contendo, pelo menos relações de ordem e operadores booleanos (conjunção, disjunção, etc.).
- Instrução condicional.
- Instrução de iteração (loop).

Neste projeto foram ainda implementadas algumas desejáveis, como:

- Perguntas dos tipos: multi−choice e code−output.
- A definição de buracos em código definido em linha.

Para conseguirmos alcançar a linguagem o mais completa possível, desenvolvemos componentes que tratam de cada uma das fases de compilação

- Gramática principal da linguagem (compilador).
- Gramática auxiliar que permite a leitura de ficheiros .pil.
- Análise Semântica.
- Geração de código (escolha de liguagem destino e bibliotecas)
- Criação do compilador

### **Gramática principal**

A gramatica principal (Qlang) tem como objetivo facilitar a definição e manipulação de diferentes tipos de questões e declarações através de uma estrutura bem definida. A Qlang utiliza um compilador que faz a tradução para uma linguagem de mais baixo nível, garantindo assim flexibilidade e robustez na criação de questionários.

Na linguagem Qlang, existem vários tipos de declarações, incluindo declarações de questões, declarações de variáveis, atribuições, execuções de comandos, exportações, blocos de código e códigos simples. Estes elementos são definidos através de uma gramática específica que permite a criação de um conjunto diversificado de funcionalidades.

Tipos de Declarações e Comandos

    Declarações de Questões:
        hole: Define uma questão do tipo "hole question".
        open: Define uma questão do tipo "open question".
        codeHole: Define uma questão do tipo "code-hole question".
        codeOpen: Define uma questão do tipo "code-open question".
        coleOutput: Define uma questão do tipo "coleOutput question".
        multichoice: Define uma questão do tipo "multichoice question".
        Composed: Define uma questão do tipo "Composed question".

    Declarações de Variáveis:
        Permitem a criação e inicialização de variáveis que podem ser utilizadas posteriormente nas atribuições e execuções de comandos.

    Atribuições:
        Utilizadas para definir ou modificar o valor de variáveis previamente declaradas.

    Execuções de Comandos:
        Permitem a execução de instruções específicas no contexto da aplicação.

    Exportações:
        Facilitam a exportação de dados ou funções definidas dentro do sistema.

    Blocos de Código:
        Definidos pela palavra-chave code, permitem a criação de blocos de instruções que podem ser reutilizados em diferentes partes do programa.

    Códigos Simples:
        Comandos simples como println e print para saída de texto.

Principais Comandos:

Nota: Todos os comandos da linguagem terminam por "**;**".

    hole ID 'is' commandComposition ID '->' STRING* 'end'; --> Define uma questão do tipo "hole".
    open ID 'is' commandComposition 'end'; --> Define uma questão do tipo "open".
    println (STRING | ID | ('text(' ID ')'))*; --> Imprime texto no standard output.
    print (STRING | ID | ('text(' ID ')'))*; --> Imprime texto no standard output sem nova linha.

### **Gramática auxiliar**

A gramtica auxiliar (Pil) tem como objetivo auxiliar na execução de operações mais específicas, como atribuições, escrita, condições e ciclos. Esta linguagem utiliza uma gramática própria que define como estas operações podem ser estruturadas e executadas.

Estrutura da Gramática

        program: Define o programa que pode conter um compound e termina com EOF.

        compound: Define uma sequência de declarações que podem ou não ser seguidas de ponto e vírgula.

        statementWithBreak: Declarações seguidas por ponto e vírgula (;).
        statement: Pode ser uma atribuição, escrita (write), cláusula if (ifclause) ou cláusula de ciclo (loopclause).

        assignment: Atribuições utilizando o operador :=.
        write: Comandos write e writeln para saída de dados.
        ifclause: Cláusula if que pode ter uma parte else.
        loopclause: Cláusulas de ciclo com diferentes formas de iteração.

        As expressões (expr) podem incluir operações aritméticas, lógicas e parênteses para agrupamento.

Principais Comandos:

    idset := expr; --> Atribuição de uma expressão a uma variável.
    write expr (',' expr)*; --> Escreve uma expressão no output.
    writeln expr (',' expr)*; --> Escreve uma expressão no output com nova linha.
    if expr then compound ('else' elseStat=compound)? end; --> Cláusula if com opção else.
    loop statementWithBreak* Looper expr do compound end;

### **Análise Semântica**

A análise semântica no projeto é essencial para assegurar a correção e coerência dos programas escritos em Qlang e Pil, garantindo que os tipos de dados e operações são válidos e que não ocorrem redefinições de variáveis.

A análise semântica tem como objetivo verificar se as variáveis definidas são corretamente utilizadas, não permitindo por exemplo dar valores a uma variável ao qual esse valor não corresponda (por exemplo "integer a; a:= "String de texto").

Para além disso a análise semântica também tem um papel muito importante na verificação de operações entre dois tipos de variáveis, verificando os seus tipos e só executando quando for aceite. Por exemplo quando é comparado com sinais de comparação ("<",">", "=") só é aceite se ambas as varíaveis forem numéricas.

Para realizarmos estas verificações utilizámos um Hashmap <b>variables</b> para guardar as variáveis e os respetivos tipos, 1 array <b>questions</b> que irá armazenar as os nomes de questões feitas mas que ainda não estão instanciadas e 1 array <b>code</b> para os nomes de variáveis do tipo código que ainda não foi instanciado. O HashMap é do tipo <String, Type> sendo Type uma classe abstrata que os outros tipos implentam (FractionType, IntegerType etc..) isto permite-nos verificar o tipo das variáveis que foram defenidas sempre que preciso.

#### Qlang

Na linguagem Qlang, a análise semântica é realizada através da classe `SemanticAnalysis`, que utiliza várias estruturas de dados para manter o controle dos identificadores e tipos. As principais verificações incluem:

1. **Verificação de Identificadores**:

   - Assegura que os identificadores usados em declarações de variáveis e questões não foram previamente declarados, evitando redefinições. Utiliza-se um Hasmap (`variables`) para armazenar as variáveis e suas informações de tipo, além de listas (`questions` e `code`) para armazenar identificadores de questões e blocos de código.

2. **Tipos de Dados**:

   - Verifica-se a compatibilidade dos tipos de dados utilizados em declarações e atribuições. Por exemplo, uma variável declarada como `integer` não pode ser atribuída a um valor do tipo `string`. Isso é garantido através do método `getType` que mapeia strings de tipos para suas representações de tipo.

3. **Estrutura das Questões**:

   - Verifica-se que a estrutura das questões, como `hole`, `open`, `codeHole`, `codeOpen`, `coleOutput`, `multichoice` e `Composed`, segue as regras definidas na gramática. As questões são adicionadas à lista `questions` e verificadas para evitar duplicações.

4. **Execuções e Exportações**:

   - Valida-se que as execuções de comandos e exportações referem-se a entidades previamente declaradas e que os tipos envolvidos nas operações são válidos. Por exemplo, uma variável de tipo `question` só pode ser atribuída a outra de tipo `question`.

5. **Verificação de Atribuições e Operações**:
   - Assegura-se que as atribuições e operações aritméticas ou lógicas são realizadas entre operandos de tipos compatíveis. Operações entre tipos numéricos são verificadas para garantir que ambos os operandos são numéricos.

#### Pil

Na linguagem Pil, a análise semântica é conduzida pela classe `SemanticAnalyser`, que realiza verificações similares às de Qlang, mas focadas nas operações e estruturas específicas de Pil. As principais verificações incluem:

1. **Atribuições**:

   - Verifica-se se a variável à qual se está a atribuir um valor foi previamente declarada e se o tipo da expressão atribuída é compatível com o tipo da variável. Utiliza-se um Hasmap (`types`) para armazenar as variáveis e seus tipos.

2. **Operações de Escrita**:

   - Assegura-se que os dados passados para os comandos `write` e `writeln` são válidos e no formato correto.

3. **Cláusulas de Condição e Ciclo**:

   - Verifica-se se as expressões condicionais em `if` e `loop` são do tipo booleano. Assegura-se que os blocos de comandos dentro dessas cláusulas são bem formados e válidos, garantindo que as operações condicionais e iterativas funcionem conforme esperado.

4. **Expressões e Operações**:

   - Valida-se a consistência das expressões aritméticas, lógicas e de comparação, garantindo que os operadores são aplicados a operandos de tipos compatíveis. Por exemplo, as operações aritméticas são verificadas para garantir que ambos os operandos são numéricos.

5. **Verificação de Tipos**:
   - Através de métodos auxiliares, como `checkNumericType` e `fetchType`, a classe `SemanticAnalyser` verifica a compatibilidade dos tipos em operações aritméticas, lógicas e de comparação, assegurando que os tipos são apropriados para as operações realizadas.

A análise semântica desempenha um papel crucial na validação dos programas escritos em Qlang e Pil, assegurando que todas as declarações, atribuições e operações são coerentes e válidas antes da execução ou compilação final. Isso garante que os programas funcionem conforme esperado, sem erros de tipo ou operações inválidas.

### **Geração de código**

Linguagem Utilizada

      O projeto está desenvolvido em Java, uma linguagem amplamente reconhecida pela sua robustez e versatilidade.

Ferramenta StringTemplate4

      Utilizamos a ferramenta StringTemplate4 que nos permitiu gerar o codigo de forma simples e eficaz.

      Em relação ao ficheiro qlang.stg, que é o nosso template, temos:

            - O module define a estrutura do programa Java, incluindo importações e o método main, onde um questionário é inicializado e executado.
            - Templates que geram declarações e atribuições de variáveis.
            - Templates como createHoleQuestion,createCodeHoleQuestion, createCodeOpenQuestion e createOpenQuestion que geram código para diferentes tipos de perguntas.
            - Manipulação de Conteúdo: addQuestionText e addSolution adicionam em formato texto, questões e soluções.
            - Um executeQuestion executa perguntas, enquanto que o exportResults  exporta resultados para um arquivo.

Utilizámos o padrão visitor que vai percorrer a árvore sintática e assim gerar o código corresponde a essa instrução. Percorre todos os nós da árvore gerados pelo Parser e, para cada nó, é construido um cṕdigo, de acordo com o tipo de instrução.

Classes

      Criamos várias classes que consistem em um sistema de questionários que permite a criação, manipulação e avaliação de diferentes tipos de perguntas(hole, open, code−open, code−hole). O sistema é gerenciado por classes que definem o comportamento de cada tipo de pergunta e , para além disso, fornecem mecanismos para lidar com erros e registrar resultados.

      Temos ainda um ficheiro Execute.java que transforma uma árvore de sintaxe abstrata gerada pelo parser da linguagem Qlang em código-fonte na linguagem de destino (neste caso o Java). Utilizando o StringTemplate, a classe gera código de maneira estruturada e modular, permitindo a personalização e expansão fácil para outras linguagens ou novas construções de Qlang.

## Em relação aos requisitos:

No **Qlang** e no **PIL** tanto os requisitos minímos como os desejáveis foram aplicados tanto na análise semântica como na Gramática passando em todos os exemplos fornecidos. Na geração de código apenas os requisitos mínimos foram cumpridos passando no p1.q e no p2.q com algumas lacunas.

## Como executar o programa

**NÃO USAR ANTLR4-BUILD** - Quando se utiliza o **antlr4-build** são gerados ficheiros **.java** sobre os já existentes que não incluem as **packages** necessárias para a execução do programa.

No diretório **src**, os scripts:

- chmod +x script.sh - dá permissões de execução ao script
- build.sh - compila todo o código necessário para executar o compilador
- runExample.sh - o ficheiro runExample permite correr o compilador com um exemplo **pX.q** como argumento.
  - ex.: java QlangMain ../../examples/p1.q
- cleanClass.sh - apaga todos os ficheiros **.class** gerados pelo compilador do Java

## Contribuições

Nas contribuições, detalhamos os componentes que cada membro do grupo ajudou a desenvolver <br>

- #### **Afonso Ferreira**

  - Gramática Principal
  - Gr.Principal-Análise-Semântica
  - Geração de código
  - Compilador
  - Relatório
  - Java Examples
  - Script bash

- #### **Miguel Soares**

  - Geraçao de código
  - Java Examples
  - Relatorio

- #### **Pedro Ponte**

  - Gramática Secundária
  - Gramática Secundária-Análise Semântica
  - Java Examples
  - Relatório
  - Script bash
  - Compilador

- #### **Tomás Brás**

  - Gramática Principal
  - Gr.Principal-Análise-Semântica
  - Geração de código
  - Compilador
  - Java Examples
  - Relatório

- #### **Vasco Rodrigues**
  - Java Examples

<br>
Lista completa de tópicos: <br>

1. Gramática Principal <br>
2. Gr.Principal-Análise-Semântica <br>
3. Gramática Secundária <br>
4. Gr. Secundária-Análise Semântica <br>
5. Geração de código <br>
6. Compilador <br>
7. Scripts Bash <br>
8. Relatório <br>
9. Java Examples <br>
   <br>
