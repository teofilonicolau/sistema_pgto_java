# Sistema de Pagamento em Java

Este projeto implementa um Sistema de Pagamento usando conceitos fundamentais de Programação Orientada a Objetos (POO), como herança, polimorfismo e sobrecarga de métodos, desenvolvido em Java no IntelliJ IDEA.

## 📋 Descrição do Projeto
O sistema simula o processamento de pagamentos através de diferentes métodos, aplicando taxas específicas conforme o tipo de pagamento:

### Classe Base: Pagamento
- Define o valor do pagamento e um método `realizarPagamento()` genérico.

### Subclasses:
- **PagamentoCredito**: Aplica uma taxa de 2%.
- **PagamentoDebito**: Aplica uma taxa de 1%.
- **PagamentoPix**: Não aplica taxa e permite uma descrição opcional da transação por meio de sobrecarga do método `realizarPagamento()`.

## 🚀 Funcionalidades Implementadas
### Processamento de Pagamentos:
- Simula pagamentos usando diferentes formas: crédito, débito e PIX.

### Polimorfismo:
- As subclasses sobrescrevem o método `realizarPagamento()`.

### Sobrecarga de Método:
- **PagamentoPix** possui duas versões de `realizarPagamento()`, uma com e outra sem descrição da transação.

## 📦 Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/teofilonicolau/sistema_pgto_java.git

   ```
2.Abra o projeto no IntelliJ IDEA.

3. Execute a classe Main para visualizar a saída no console.
   
   
## Conceitos Utilizados
- Programação Orientada a Objetos (POO):

- Herança

- Polimorfismo

- Sobrecarga de Métodos 
   ![image](https://github.com/user-attachments/assets/28fa954f-78f6-4c66-aa76-fb96cd31488d)

