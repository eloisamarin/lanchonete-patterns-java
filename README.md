Sistema de Lanches com Padrões de Projeto (Java)


📌 SOBRE O PROJETO
===========================================================
Este projeto é uma aplicação em Java de terminal que simula um sistema de pedidos de lanches com entrada interativa. 
Foi desenvolvido como atividade avaliativa para praticar os principais padrões de projeto (Design Patterns).

O usuário pode:
- Escolher entre dois tipos de lanche (Hambúrguer ou Lanche Antigo com Batata Grátis)
- Aplicar desconto no pedido
- Acompanhar os estados do pedido (Novo > Preparando > Pronto)
- Ver mensagens informativas e interativas no console

💡 Este projeto foi desenvolvido como atividade da minha aula de Padrões de Projeto, com o objetivo de aprender mais sobre esses conceitos e colocá-los em prática de forma aplicada.


📚 PADRÕES DE PROJETO UTILIZADOS
===========================================================
✔ Factory Method – Criação de diferentes tipos de lanches  
✔ Strategy – Aplicação de diferentes tipos de desconto  
✔ State – Controle do estado do pedido  
✔ Adapter – Adaptação de um lanche legado (Lanche Antigo)  
✔ Singleton – Gerenciamento centralizado do sistema de pedidos  


🛠 COMO EXECUTAR O PROJETO
===========================================================
1. Certifique-se de ter o Java JDK instalado (Java 8 ou superior)
2. Compile todos os arquivos .java no terminal:
   javac LanchoneteDPatterns.java

3. Execute o sistema:
   java LanchoneteDPatterns

4. Siga as instruções exibidas no console para interagir com o sistema.


📁 ORGANIZAÇÃO DO CÓDIGO
===========================================================
- LanchoneteDPatterns.java → Arquivo principal com a execução da aplicação
- Interfaces e classes para cada padrão de projeto estão no mesmo arquivo, mas podem ser organizadas separadamente.


✍️ AUTORIA
===========================================================
Projeto criado por Eloisa Marin da Silva Pessoa  
Atividade avaliativa de Design Patterns – Maio/2025
