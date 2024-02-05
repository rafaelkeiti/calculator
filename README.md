# Projeto de Aprendizado Spring Boot - Calculator

Este projeto tem como objetivo criar uma calculadora que realiza diferentes tipos de operações matemáticas, conversão de temperatura e cálculos de datas.

## Funcionalidades Principais
1. **Operações Matemáticas:**
   - Adição (+)
   - Subtração (-)
   - Divisão (/)
   - Multiplicação (*)

####

2. **Conversão de Temperatura:**
   - Suporta conversão entre Celsius e Fahrenheit.

####

3. **Cálculos de Datas:**
   - Adição de dias em uma data específica.
   - Diferença entre duas datas.

## Passos Iniciais

1. **CalculatorController:**
   - **Objetivo:** Criar um endpoint para realizar operações matemáticas.
   - **Implementação:**
      - O usuário deve passar 3 valores que serão recebidos pelo `RequestParam`. O primeiro e o segundo valor devem ser numéricos, e o terceiro é o parâmetro `signal` que indica a operação desejada: sum | subtraction | division | multiplication
   - **Endpoints:**
     - http://localhost:8080/calculator (Rota Inicial)
     - http://localhost:8080/calculator/calcular?value1=1&value2=1&signal=sum (Rota com parâmetros)
####

2. **TemperatureController:**
   - **Objetivo:** Criar um endpoint para realizar conversão de temperatura.
   - **Implementação:**
      - No TemperatureController, o usuário passa o valor da temperatura e o tipo dela. Caso seja `Celsius`, ela é convertida para `Fahrenheit` e vice-versa.
   - **Endpoints:**
      - http://localhost:8080/temperature (Rota Inicial)
      - http://localhost:8080/temperature/temperatureconversion?valuetemperature=30&typetemperature=fahrenheit (Rota com parâmetros)
     
####

3. **DateController:**
   - **Objetivo:** Criar endpoints para realizar cálculos com datas.
   - **Implementação:**
      - O DateController possui 2 endpoints: `/datesum`, que realiza a soma do valor passado à data atual, e `/datedifference`, que recebe duas datas e calcula suas diferenças em anos, meses e dias.
   - **Endpoints:**
     - http://localhost:8080/calendarydigital (Rota Inicial)
     - http://localhost:8080/calendarydigital/datedifference?start=05-02-2024&end=07-09-2024 (Rota com parâmetros)
      
####

- **Foi utilizado somente o método HTTP GET no desenvolvimento.**

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório:

   ```bash
   git clone https://github.com/rafaelkeiti/calculator.git
   ```

2. Navegue até o diretório do projeto pela sua IDE:

   ```bash
   cd pasta-do-projeto
   ```

3. Execute o projeto usando o Gradle Wrapper:

   ```bash
   ./gradlew clean build bootRun 
   ```

    - No Windows, use `gradlew.bat` em vez de `./gradlew`.

4. Agora basta acessar as rotas.