# 📚 JavaSenior - Curso de Java

![GitHub repo size](https://img.shields.io/github/repo-size/SharifGiraldoo/JavaSenior?color=yellow&label=Tamaño%20del%20Repo)
![GitHub language count](https://img.shields.io/github/languages/count/SharifGiraldoo/JavaSenior?color=purple&label=Lenguajes)
![GitHub top language](https://img.shields.io/github/languages/top/SharifGiraldoo/JavaSenior?color=orange&label=Lenguaje%20Principal)
![GitHub license](https://img.shields.io/github/license/SharifGiraldoo/JavaSenior?color=green&label=Licencia)

---

Este repositorio contiene los **trabajos, actividades y desarrollos prácticos** realizados en el curso de **Java**, organizados de manera modular para facilitar el aprendizaje progresivo desde los fundamentos hasta conceptos avanzados de programación orientada a objetos y manejo de excepciones.

Su propósito es organizar y centralizar el material académico, facilitando el aprendizaje autónomo y el uso de buenas prácticas de programación y control de versiones.

---

## 📑 Tabla de Contenidos

1. [📝 Descripción General](#-descripción-general)  
2. [📂 Estructura del Repositorio](#-estructura-del-repositorio)  
3. [🛠️ Tecnologías Utilizadas](#️-tecnologías-utilizadas)  
4. [⚙️ Instalación y Ejecución](#️-instalación-y-ejecución)  
5. [📖 Contenido Académico por Módulo](#-contenido-académico-por-módulo)  
6. [📜 Licencia](#-licencia)  
7. [🤝 Contribuciones y Buenas Prácticas](#-contribuciones-y-buenas-prácticas)  
8. [📧 Contacto](#-contacto)

---

## 📝 Descripción General

El curso de **Java** está estructurado en módulos progresivos que abarcan desde la configuración del entorno de desarrollo hasta conceptos avanzados de programación orientada a objetos, manejo de excepciones y registro de eventos.

En este repositorio se recopilan los **ejercicios, prácticas y proyectos**, organizados por módulos, con el objetivo de:

- Desarrollar competencias en **programación con Java**.  
- Dominar los **fundamentos de la programación orientada a objetos**.  
- Aplicar principios de **herencia, polimorfismo e interfaces**.  
- Implementar **manejo robusto de excepciones**.  
- Utilizar sistemas de **logging** para el seguimiento de aplicaciones.  
- Promover el uso de **herramientas de control de versiones** como Git/GitHub.  

Este espacio está diseñado para ser un recurso de consulta, práctica y referencia para estudiantes.

---

## 📂 Estructura del Repositorio

La organización del proyecto sigue un esquema modular, donde cada carpeta representa una unidad temática:

```
JavaSenior/
│
├── .vscode/                        # Configuración de Visual Studio Code
│
├── 1-Modulo1/
│   ├── Clase-1/                    # Configuración del entorno y primer proyecto
│   ├── Clase-2/variablesJava/      # Variables, tipos de datos y operadores
│   ├── Clase-3/                    # Estructuras de control
│   ├── Clase-4/Funciones/          # Funciones y métodos
│   └── Proyecto Final/GestionProductos/  # Sistema de gestión de productos
│
├── 2-Modulo2/
│   ├── Clase-1/                    # Introducción a POO
│   ├── Clase-2/                    # Clases y objetos
│   ├── Clase-3/                    # Herencia
│   ├── Clase-4/                    # Polimorfismo e interfaces
│   └── ProyectoFinalModulo2/       # Proyecto Spotify
│
├── 3-Modulo3/
│   ├── Clase-1/                    # Manejo de excepciones
│   └── Clase-2/                    # Logging y registro de eventos
│
├── logs/                           # Archivos de registro generados
├── LICENSE
└── README.md
```

Cada carpeta de clase contiene:  
- Material teórico y **objetivos de aprendizaje**.  
- Ejercicios prácticos y adicionales.  
- Código fuente con ejemplos y soluciones.  

Esto facilita la navegación, el seguimiento progresivo del curso y el acceso a los contenidos.

---

## 🛠️ Tecnologías Utilizadas

El curso utiliza las siguientes tecnologías:

- **Lenguaje**:  
  - ☕ **Java** → enfocado en programación orientada a objetos.  

- **Entornos recomendados**:  
  - 💻 **Visual Studio Code** con extensiones de Java.  
  - ☕ **IntelliJ IDEA** o cualquier IDE compatible.  
  - 🔧 **JDK (Java Development Kit)** versión 11 o superior.  

- **Control de versiones**:  
  - 🌱 Git y GitHub como herramientas de colaboración y versionamiento.  

El uso de estas tecnologías fomenta el desarrollo de habilidades fundamentales en programación y fortalece las competencias del estudiante.

---

## ⚙️ Instalación y Ejecución

A continuación, se presentan los pasos para clonar y ejecutar los contenidos del repositorio en un entorno local:

### 1. Clonar el repositorio  
```bash
git clone https://github.com/SharifGiraldoo/JavaSenior.git
cd JavaSenior
```

### 2. Requisitos previos  
Asegúrate de tener instalado:  
- **JDK 11+** ([Descargar JDK](https://adoptium.net/))  
- **Visual Studio Code** o **IntelliJ IDEA**  
- **Git** para control de versiones  

### 3. Compilar y ejecutar  

#### Desde la terminal:
```bash
cd ruta/del/proyecto
javac NombreDelArchivo.java
java NombreDelArchivo
```

#### Desde Visual Studio Code:
1. Abre la carpeta del proyecto  
2. Ejecuta el archivo `.java` usando el botón "Run" o `F5`  

Consulta el README o material de cada clase para instrucciones específicas.

---

## 📖 Contenido Académico por Módulo

### 📘 Módulo 1 - Fundamentos de Java

#### Clase 1: Configuración del Entorno y Primer Proyecto
- Instalación del JDK, VSCode y Git  
- Estructura básica de un programa Java  
- Compilación y ejecución del programa "Hola Mundo"  
- Comandos básicos de Git  

#### Clase 2: Variables, Tipos de Datos y Operadores
- Tipos de datos primitivos (`int`, `double`, `boolean`, `char`)  
- Variables, constantes e inferencia con `var`  
- Operadores aritméticos y de asignación  
- Entrada y salida de datos con `Scanner`  

#### Clase 3: Estructuras de Control
- Condicionales (`if`, `else if`, `switch`)  
- Operador ternario  
- Bucles (`while`, `do-while`, `for`)  
- Control de flujo con `break` y `continue`  

#### Clase 4: Funciones
- Declaración y uso de métodos  
- Parámetros y valores de retorno  
- Buenas prácticas de modularización  

#### Proyecto Final Módulo 1: Sistema de Gestión de Productos
- Menú interactivo  
- Registro y manipulación de productos  
- Validaciones de entrada  
- Cálculo de valores totales  

---

### 📗 Módulo 2 - Programación Orientada a Objetos

#### Clase 1: Introducción a POO
- Conceptos fundamentales de la programación orientada a objetos  
- Diferencias entre programación estructurada y POO  

#### Clase 2: Clases y Objetos
- Definición de clases y creación de objetos  
- Atributos y métodos  
- Constructores y encapsulamiento  

#### Clase 3: Herencia
- Concepto de herencia y reutilización de código  
- Clases padre e hijas  
- Palabra clave `extends` y `super`  

#### Clase 4: Polimorfismo e Interfaces
- Polimorfismo y sobrescritura de métodos  
- Interfaces y clases abstractas  
- Implementación de contratos con `implements`  

#### Proyecto Final Módulo 2: Proyecto Spotify
- Modelado de clases (`Cancion`, `Playlist`, `BibliotecaMusical`, `CuentaSpotify`)  
- Herencia con clase abstracta `Multimedia`  
- Implementación de interfaz `Reproducible`  
- Gestión de listas de reproducción y biblioteca musical  

---

### 📙 Módulo 3 - Manejo de Excepciones y Logging

#### Clase 1: Excepciones
- Tipos de excepciones en Java (checked y unchecked)  
- Bloques `try-catch-finally`  
- Lanzamiento de excepciones con `throw` y `throws`  
- Creación de excepciones personalizadas  
- Mejores prácticas en el manejo de errores  

#### Clase 2: Logging
- Importancia del logging en aplicaciones  
- Uso de `java.util.logging`  
- Niveles de logging (SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST)  
- Configuración de handlers y formatters  
- Registro de eventos en archivos  
- Buenas prácticas para el seguimiento de aplicaciones  

---

## 📜 Licencia

Este proyecto se distribuye bajo la licencia **GNU General Public License v3.0**. Consulta el archivo [LICENSE](LICENSE) para más información.

---

## 🤝 Contribuciones y Buenas Prácticas

Se aceptan contribuciones que enriquezcan el contenido del repositorio. Si deseas colaborar:

1. **Fork** el repositorio.  
2. Crea una **rama** para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`).  
3. Realiza tus cambios y **commitea** con mensajes descriptivos.  
4. Envía un **Pull Request** detallando los cambios realizados.  

### Estándares de código:
- Seguir las convenciones de Java.  
- Comentar el código cuando sea necesario.  
- Mantener la estructura modular existente.  

---

## 📧 Contacto

Para consultas académicas, contribuciones o colaboraciones:

- 👨‍💻 **Autor**: Sharif Giraldo Obando   
- 🏫 **Ubicación**: Armenia, Quindío, Colombia  
- 📧 **Correo**: sharifgiraldo23@gmail.com 
- 🔗 **GitHub**: [SharifGiraldoo](https://github.com/SharifGiraldoo)  

---

✨ *Este repositorio tiene fines académicos y busca apoyar el proceso formativo en Java, fomentando la aplicación práctica de conceptos de programación.*