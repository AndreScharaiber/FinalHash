# FinalHash
André Luís Scharaiber Alves  

Neste projeto em java eu implementei 3 funções Hashes onde realizei teste e as comparei entre si. Desta forma, meu projeto visa ser uma versão minimalista de um sistema real em hash, utilizando apenas as funções liberadas pelo professor.  
Esse código possui 6 arquivos .java diferentes, sendo 3 para definir cada uma das funções hash, uma main para testar e comparar os resultados, uma função nodo, que foi solicidada utilizada para a manupulação do Array utilizado no Hash, e por fim, a class Hash, onde foram definidas as operações de adição e busca, além de permitir o teste das 3 funções por meio do uso de uma verificação: Indice.     
Nesta mesma classe, também são definidas as comparações, como as de Hits e Misses, além das colisões.   
  
Na classe de HashDivisão, eu utilizo a divisão da Chave pelo Tamanho (K % M).  
Na classe de HashMultiplicação, eu utilizo a multiplicação de (A * K), retornando o valor inteiro e utilizando para multiplicar novamente por M.  
Na classe de HashDobramento, a chave é particionada em blocos de 3 digitos, após isso, são somados e aplicados a h(k) = soma mod M.  

CSV: https://docs.google.com/spreadsheets/d/1CPBwcch2bPraJh8Vg1aF3BjBi8vCP6KumtBWEkV8eTg/edit?usp=sharing
YOUTUBE: 
