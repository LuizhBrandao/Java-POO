# POO-Java
Programação Orientada a Objeto (POO) Java
🌟 **Programação Orientada a Objetos (POO) em Java** 🌟

A **Programação Orientada a Objetos (POO)** é um paradigma de programação baseado no conceito de **objetos** e **classes**. Em Java, tudo gira em torno de objetos, que são representações de entidades do mundo real com características (atributos) e comportamentos (métodos).

* * *

### 📌 **Princípios da POO**:

1. **Classe**:
  
  * Uma **classe** é o modelo ou a estrutura que define as características e comportamentos de um objeto. É como um "molde" para criar objetos.
    
    *    **Exemplo**: código
      
      public class Carro {
      
          // Atributos (variáveis de instância)
      
          String cor;
      
          int ano;
      
          // Método
      
          void acelerar() {
      
              System.out.println("O carro está acelerando!");
      
             }
      
      }
      
2. **Objeto**:
  
  * Um **objeto** é uma instância de uma classe. Cada objeto tem seu próprio estado (valores dos atributos) e pode executar comportamentos (métodos).
    
    * **Exemplo** : código
      
      public class TesteCarro {
      
          public static void main(String[] args) {
      
              Carro meuCarro = new Carro(); // Criação de um objeto
      
              meuCarro.cor = "Vermelho"; // Definindo atributos
      
              meuCarro.acelerar(); // Chamando o método    
      
          }
      
      }
      

* * *

### 🚀 **Pilares da POO**:

1. **Encapsulamento** 🛡️:
  
  * Esconde os detalhes internos de um objeto, protegendo os dados. É implementado usando **modificadores de acesso** (`private`, `public`, `protected`) e métodos `get` e `set`.
    
    * **Exemplo**: código
      
      public class Carro {
      
          private String cor; // Atributo encapsulado
      
          // Método público para acessar o atributo
      
          public String getCor() {
      
              return cor;
      
          }
      
          public void setCor(String novaCor) {
      
              cor = novaCor;
      
          }
      
      }
      
2. **Herança** 👪:
  
  * Permite que uma classe herde atributos e métodos de outra classe. Facilita a reutilização de código.
    
    * **Exemplo**:código
      
      public class Veiculo {
      
          void ligar() {
      
              System.out.println("Veículo ligado");
      
          }
      
      }
      
      public class Carro extends Veiculo {
      
          // Carro herda o método ligar()
      
      }
      
3. **Polimorfismo** 🎭:
  
  * Permite que um objeto de uma classe derivada (subclasse) seja tratado como um objeto da classe base (superclasse). Métodos podem ter comportamentos diferentes dependendo do objeto.
    
    * **Exemplo**: código
      
      class Animal {
      
          void fazerSom() {
      
              System.out.println("Som genérico");
      
          }
      
      }
      
      class Cachorro extends Animal {
      
          void fazerSom() {
      
              System.out.println("Au Au!");
      
          }
      
      }
      
      public class Teste {
      
          public static void main(String[] args) {
      
              Animal meuAnimal = new Cachorro(); // Polimorfismo
      
              meuAnimal.fazerSom(); // Chama o método da subclasse
      
          }
      
      }
      
4. **Abstração** 🎨:
  
  * Esconde detalhes complexos, mostrando apenas as funcionalidades essenciais. Em Java, isso pode ser feito com **classes abstratas** e **interfaces**.
    
    * **Exemplo**: código
      
      abstract class Forma {
      
          abstract void desenhar(); // Método abstrato
      
      }
      
      class Circulo extends Forma {
      
          void desenhar() {
      
              System.out.println("Desenhando um círculo");
      
          }
      
      }
      

* * *

### 🔑 **Benefícios da POO**:

* **Reutilização de código**: Com a herança, você pode reutilizar código existente.
* **Organização**: O código é mais estruturado e fácil de entender.
* **Manutenção facilitada**: Mudanças em uma classe não afetam outras partes do programa.
* **Modularidade**: Objetos e classes podem ser desenvolvidos e testados separadamente.

* * *

### 📝 **Resumo**:

* **Classe**: Define a estrutura dos objetos.
* **Objeto**: Instância de uma classe.
* **Encapsulamento**: Protege os dados.
* **Herança**: Permite reutilizar código.
* **Polimorfismo**: Permite que um objeto tenha comportamentos diferentes.
* **Abstração**: Simplifica a complexidade.

A POO em Java oferece uma maneira poderosa de organizar e estruturar o código, facilitando o desenvolvimento de sistemas complexos.
