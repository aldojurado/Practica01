# Tarea 01: Problemas de Optimización

## Integrantes del equipo:

- **Ángeles Sánchez Aldo Javier 320286144**
- **Jurado Guadalupe Aldo Emilio 320025255**

## Requisitos

Este proyecto usa maven. <br>
**Instalación desde terminal:**

### En fedora:

```bash
sudo dnf install maven
```

### En ubuntu:

```bash
sudo apt install maven
```

Adicionalmente ya se debe tener java con su **jdk**.
De no tenerlo, en fedora se instala de la siguiente forma:

```bash
sudo dnf install java-devel

```

## Compilar y Ejecutar

Para compilar de forma limpia:

```bash
mvn clean install
```

Para ejecutar el programa compilado, se puede hacer de la siguiente forma:

```bash
java -jar target/practica1.jar
```

## Limpieza

Adicionalmente para limpiar los archivos generados por la compilación:

```bash
mvn clean
```

# Preguntas

### 1. ¿Cuál es la representación en binario del número decimal 172_10?
<<<<<<< HEAD

Respuesta

### 2. ¿Cuál es la representación en hexadecimal del número octal 74_8?

Respuesta

=======
Para convertir el número 172 en decimal a binario, debes seguir los siguientes pasos:\\
1. Dividimos 172 entre 2, resultado 86, residuo 0
2. Dividimos 86 entre 2, resultado 43, residuo 0
3. Dividimos 43 entre 2, el resultado 21, residuo 1
4. Dividimos 21 entre 2, el resultado 10, residuo 1
5. Dividimos 10 entre 2, el resultado 5, residuo 0
6. Dividimos 5 entre 2, el resultado 2, residuo 1
7. Dividimos 2 entre 2, el resultado 1, residuo 0 
8. Ahora, juntamos en orden inverso el resultado final y los residuos anteriores. 
9. Por lo tanto, el número es el siguiente: 10101100
### 2. ¿Cuál es la representación en hexadecimal del número octal 74_8?
Para convertir el número 74 en octal a hexadecimal, debes seguir los siguientes pasos:\\
1. Comenzaremos pasando el número a binario utilizando los valores conocidos, es decir, 7 = 111 y 4 = 100, entonces 74 = 111100
2. Ahora, dividimos el número en binario en bloques de 4 bits de derecha a izquierda 11_1100 y rellenamos con 0, entonces 0011_1100
3. Sabemos que 0011 en hexadecimal representa el 3 y el 1100 representa C
4. Por lo tanto, nuestro número en hexadecimal es 3C


### 3. Desarrolla cuál es el número mínimo de bits requeridos para representar todos los caracteres en un teclado que tiene 9 letras, 16 letras y 17 letras.
Si deseamos representar 9 caracteres, lo podemos hacer asignando cada caracter a un número binario, de modo que podamos representar al menos 9 números distintos.
El número 9 en binario es:
1. Dividimos 9 entre 2, resultado 4, residuo 1
2. Dividimos 4 entre 2, resultado 2, residuo 0
3. Dividimos 2 entre 2, el resultado 1, residuo 0
4. 3. Dividimos 1 entre 2, el resultado 0, residuo 1
Entonces, el 9 en binario es 1001.
Notando que 1001 tiene 4 bits, entonces necesitamos al menos 4 bits para representar 9 letras.
Como dato extra, el número más grande que podríamos representar con estos 4 bits sería 1111.
Convirtiendo de binario a decimal:
\[2^3+2^2+2^1+2^0 = 8+4+2+1 = 15.\]
Por lo tanto, con estos 4 bits podríamos representar hasta 15 letras distintas.

Para 16 letras esos 4 bits ya no son suficientes ya que vimos que con 4 bits se pueden representar hasta 15 letras.
Entonces, agreguemos un bit extra y veamos cuál será el número máximo de letras distintas que podremos representar.
Con 5 bits, el número más grande representable es 11111 y convirtiendo a decimal:
\[2^4+2^3+2^2+2^1+2^0=16+8+4+2+1 = 31.\]
Entonces, con 5 bits podremos representar hasta 31 letras y como para este caso queremos representar 16 letras, entonces 5 bits será el número requerido.

Para 17 letras, los mismos 5 bits serán suficientes, ya que en el caso anterior vimos que con 5 bits se pueden asignar 31 valores distintos a 31 letras distintas, entonces 17 letras aún son representables con 5 bits.

### 4. En general, ¿es posible hacer la conversión entre una base n y una base m, para cualquier n, m > 1 y n ̸= m? Desarrolla.
Sí es posible, ya que en las bases cada número se puede representar de forma única y por la forma en que las construimos tienen cierta estructura.
Como vimos con el ayudante en base 2, base 8 y base 16; pasar de una base n a decimal es separar los números para hacer una suma de productos donde cada producto es el valor del dígito por la base a la potencia i, donde i sería el número que ocupa dicho dígito en el número base n (De derecha a izquierda empezando por cero).
Por otro lado, para pasar de base 10 a una base m, usamos otro método que sería ir dividiendo el número entre la base, luego ir dividiendo entre los resultados hasta que el resultado sea cero, y al final los residuos van a ser la representación de esa base.
Podemos ver que usando estos dos métodos, podemos ir desde una base n a una base m.
Por lo tanto, concluimos que sí es posible y ya dimos una forma en la que pueden hacerlo.
Claro que habrá formas más directas de ir entre bases que sean múltiplos de otras, pero de este fue un método general que nos asegura el cambio de base para todo n, m > 1, donde n ̸= m.


