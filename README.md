# Exercício 1
- O objetivo desse exercício é treinar o uso de herança e polimorfismo
- Ao executar o código, o usuário deve inserir seu primeiro nome e, em seguida, seu último nome

<div style = "display: inline_block">
  <img align = "center" alt = "PrimeiroNome" src = "https://user-images.githubusercontent.com/114308727/203125713-2096020c-b09d-49e3-9abe-ce0d7f57fa4f.png">
  <img align = "center" alt = "UltimoNome" src = "https://user-images.githubusercontent.com/114308727/203125928-cc9fcc97-ebbf-4267-a216-6450e2e745fe.png">
</div>
<br>

- Depois, o usuário deve selecionar um tipo de funcionário, para que o código possa realizar o cálculo de seu salário
<img src = "https://user-images.githubusercontent.com/114308727/203126265-2d41cf88-18e8-41c7-9c97-68b0c3355727.png">

- Se o usuário escolher "Chefe", o programa pede o salário semanal do empregado e calcula seu salário mensal, admitindo que um mês possui 4 semanas

<div style = "display: inline_block">
  <img align = "center" alt = "SalarioSemanal" src = "https://user-images.githubusercontent.com/114308727/203126915-316b4ead-82aa-471a-8431-ab53de7a3902.png">
  <img align = "center" alt = "SalarioMensal" src = "https://user-images.githubusercontent.com/114308727/203127618-de259721-de00-4aa8-a97d-f609b1fb26c4.png">
</div>                                                                                                                  
<br>

- Caso escolha "Comissionado", o programa irá pedir que o usuário informe o salário do empregado, o valor da comissão sobre as vendas, a quantidade de vendas e irá calcular seu salário final da seguinte forma: salario + (comissao * quantidade)

- Se escolher "Hora", o usuário deve informar o salário do empregado por hora e a quantidade de horas trabalhadas, assim, o ganho do empregado será calculado por salarioHora * horas

- Por fim, caso o usuário escolha "Peça Produzida", ele deve informar a remuneração do empregado por peça produzida e a quantidade de peças produzidas, dessa forma, o programa retornará o salário final do empregado por meio do seguinte cálculo remuneracao * quantidade

# Exercício 3
- Nesse exercício, o objetivo é treinar a manipulação de arquivos em java
- Primeiramente, ao executar o código, será criado um arquivo chamado "loja.txt", por meio da função abaixo, que recebe como parâmetro o nome do arquivo e retorna esse arquivo depois de criado

<img width = 550 src = "https://user-images.githubusercontent.com/114308727/203576512-ab12aa0b-652f-4e70-a957-bf6fe9e87304.png">

- O arquivo "loja.txt" será preenchido com informações que constam no ArrayList<Loja> cadastro, que por sua vez foi preenchido na seguinte função

<img width = 420 src = "https://user-images.githubusercontent.com/114308727/203577826-64333831-38bb-4768-ad9c-b5529cd41d5a.png">

- Depois, o arquivo "loja.txt" será lido e as informações contidas nele serão separadas pelo código da filial e guardadas no ArrayList de cada filial

- Serão criados 4 arquivos - um para cada filial - com as informações das respectivas filiais

- Por fim, os quatro arquivos serão lidos e o valor total de vendas de cada filial será calculado e escrito no próprio arquivo, assim como o valor médio de vendas de cada filial
