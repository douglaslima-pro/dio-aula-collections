## **Antes de tudo…**

É importante notar a diferença entre os conceitos de **argumento** e **parâmetro**:

- Argumento é o valor que você passa na chamada de um método ou no construtor de uma classe
- Parâmetro é o tipo de argumento que se espera receber

## E o que de fato são generics?

Uma classe genérica é uma classe ou uma interface que podem ser parametrizados com um tipo específico.

**Observe** que parametrizar significa definir o tipo de argumento esperado na chamada de um método ou no construtor de uma classe.

Classes genéricas só aceitam um argumento de tipo pré-definido através do **operador diamante** <>.

Por exemplo, a classe *Departamento* pode ser definida como uma classe genérica que aceita como parâmetro apenas "tipos" que pode ser entendido como qualquer coisa que não seja um dado de tipo primitivo, podendo ser uma classe, uma interface, um array, etc.

```java
public class Departamento<T> {

	// T significa "tipo"
	private T t;

	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
	
}
```

## Convenção de nomenclatura para parâmetros de tipo

- **E:** elemento
- **K:** chave
- **N:** número
- **T:** tipo
- **V:** valor

## Instanciando uma classe genérica

A classe genérica Departamento pode ser instanciada usando a sintaxe de operador diamante e passando como argumento o tipo *Funcionario*.

```java
Departamento<Funcionario> funcionarios = new Departamento<Funcionario>();
```

A leitura deve ser feita como "Departamento de Funcionarios".

Portanto, a classe genérica Departamento foi instanciada passando como argumento o tipo Funcionario e, logo, infere-se que a variável funcionarios somente aceitará um objeto do tipo Funcionario em seus métodos get e set.