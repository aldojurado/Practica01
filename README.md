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

Para ejecutar el programa (después de compilar) hay dos formas:


## Limpieza

Adicionalmente para limpiar los archivos generados por la compilación:

```bash
mvn clean
```


# Preguntas 
### 1. ¿Cuál es la representación en binario del número decimal 172_10?
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
Respuesta

### 4. En general, ¿es posible hacer la conversión entre una base n y una base m, para cualquier n, m > 1 y n ̸= m? Desarrolla.
Respuesta
