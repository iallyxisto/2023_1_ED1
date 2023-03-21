# Revisão de POO

Serão listados abaixo alguns exemplos para a prática da linguagem e também revisão de POO. Os itens serão apresentados pensando na evolução do programa, inciando de maneira simples e adicionando pitadas de complexidade ao decorrer da atividade.

Sugerimos ainda que:

- a cada término você faça um `commit e push`, assim também estará colocando em prática o uso do git/github;
- faça uso de classes de teste, buscando otimizar seu tempo.

## 1. Calculadora Básica

Crie um programa que receba dois números do usuário e permita que ele selecione a operação matemática que deseja realizar (adição, subtração, multiplicação ou divisão). Em seguida, o programa deve exibir o resultado da operação escolhida.

## 2. Flexibilização de operações

Ajuste o programa para que você tenha controle (encapsulamento/interface) das operações. O controle também deverá favorecer a flexibilidade e expansão da calcudora permitindo incluir mais operações matemáticas.

## 3. Novas operações

Crie novas operações, pois atualmente o programa só suporta as quatro operações matemáticas básicas. Você pode adicionar outras operações mais complexas, como raiz quadrada, potenciação, logaritmos, entre outras.

## 4. Validação da entrada

Altere seu programa para que ele agora valide a entrada do usuário, visto que, atualmente, o programa não realiza nenhuma validação nos números de entrada. Adicionar validação espera-se aumentar a robustez do programa e evitar erros inesperados. Ah, lembre-se de POO, ou seja, é necessário ter uma classe de erro específica para essa funcionalidade? Poderíamos criar interfaces/classes abstratas para isso? É possível receber o parâmetro de validação? É possível ter mais de uma validação?

## 5. Execuação de um conjunto de operações básicas

Permita que o usuário informe uma lista de valores, sendo cada linha composta como `*a*;*operacao*;*b* (ex,: 2;1;3, sendo ...) e no final o programa exibe um relatório com a expressão solicitada e o resultado encontrado. 

Ex.:

operação:
-  1 = soma; 
-  2 = subtração;
-  3 = multiplicação
-  4 = divisão

lista de valores:

- 23;1;44
- 7;3;31
- 49;3;2
- 37;4;27
- 11;3;13
- 30;4;10
- 1;1;12
- 44;1;16
- 16;2;22
- 38;2;18

Resultado impresso pelo programa:

- 23;1;44 = 67
- 7;3;31 = 217
- 49;3;2 = 98
- 37;4;27 = 1
- 11;3;13 = -2
- 30;4;10 = 3
- 1;1;12 = 13
- 44;1;16 = 60
- 16;2;22 = -6
- 38;2;18 = 20
