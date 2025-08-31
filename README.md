# Producto TDA - Sistema de Gestión de Productos

## Introducción

Solución a la actividad 1 de la clase estructura de datos.

Este proyecto implementa un sistema de gestión de productos utilizando Java y Maven. El programa permite crear, almacenar y visualizar productos con diferentes métodos de construcción, demostrando el uso de constructores, getters, setters y estructuras de datos.

## Características

- **Gestión de Productos**: Crear y almacenar productos con diferentes atributos
- **Múltiples Constructores**: Diferentes formas de crear productos (completo, en blanco, con setters, etc.)
- **Interfaz de Usuario**: Menú interactivo por consola
- **Almacenamiento**: Lista dinámica de productos en memoria

## Requisitos Previos

- **Java JDK**: Versión 8 o superior
- **Maven**: Versión 3.6 o superior

### Verificar instalaciones

```bash
java -version
mvn -version
```

## Instrucciones de Ejecución

### 1. Clonar o descargar el proyecto

```bash
git clone <url-del-repositorio>
cd producto-tda
```

### 2. Compilar el proyecto

```bash
mvn clean compile
```

### 3. Ejecutar el programa

```bash
mvn exec:java -Dexec.mainClass="com.learning.App"
```

### 4. Crear un JAR ejecutable

```bash
mvn clean package
```

Para ejecutar el JAR generado:

```bash
java -jar target/producto-tda-1.0-SNAPSHOT.jar
```

## Estructura del Proyecto

```
producto-tda/
├── src/
│   ├── main/java/com/learning/
│   │   ├── App.java          # Clase principal con el menú
│   │   └── Producto.java     # Clase Producto con constructores y métodos
│   └── test/java/com/learning/
│       └── AppTest.java      # Pruebas unitarias
├── pom.xml                   # Configuración de Maven
└── README.md                 # Este archivo
```

## Uso del Programa

Al ejecutar el programa, se mostrará un menú principal con las siguientes opciones:

1. **Crear producto**: Permite crear productos de diferentes maneras
2. **Ver lista de productos**: Muestra todos los productos creados
3. **Salir**: Termina el programa

### Opciones para crear productos:

1. **Producto completo**: Ingresa todos los datos del producto
2. **Producto en blanco**: Crea un producto con valores por defecto
3. **Producto con setters**: Usa métodos setter para configurar el producto
4. **Producto con nombre y precio**: Constructor con solo nombre y precio

## Atributos del Producto

- **Nombre**: Nombre del producto
- **Descripción**: Descripción detallada
- **Código**: Código único del producto
- **Precio**: Precio en formato decimal
- **Cantidad en inventario**: Número de unidades disponibles

## Comandos Maven Útiles

```bash
# Limpiar y compilar
mvn clean compile

# Ejecutar pruebas
mvn test

# Crear JAR
mvn package

# Instalar en repositorio local
mvn install

# Ejecutar con plugin exec
mvn exec:java -Dexec.mainClass="com.learning.App"
```