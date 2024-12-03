# Proyecto Spring Boot - Consumo de API Externa

Este es un proyecto de Spring Boot que consume la API externa de **JSONPlaceholder** para obtener una lista de usuarios y exponerla mediante un endpoint en la aplicación Spring. Además, se implementan conceptos como manejo de errores, pruebas unitarias y caché.

## Tecnologías Usadas

- **Spring Boot** (v3.4.0)
- **Java 17**
- **Maven** para gestión de dependencias
- **JUnit 5** para pruebas unitarias
- **Lombok**
- **RestTemplate** para consumo de API externa
- **Spring Cache** para manejo de caché

## Requisitos

- Java 17 o superior
- Maven
- Un entorno de desarrollo como IntelliJ IDEA o Eclipse

## Descripción del Proyecto

Este proyecto consta de una aplicación **Spring Boot** que hace uso de **RestTemplate** para consumir la API externa de **JSONPlaceholder** (https://jsonplaceholder.typicode.com/users). El objetivo principal es:

- 1. Consumir la lista de usuarios desde la API externa.
- 2. Exponer un endpoint REST para devolver la lista de usuarios en formato JSON.
- 3. Implementar manejo de errores para el consumo de la API.
- 4. Incluir pruebas unitarias para asegurar que el servicio funciona correctamente.
- 5. Implementar caché para almacenar la respuesta de la API durante 5 minutos.

## Endpoints Expuestos

### `GET /api/users`

Este endpoint devuelve la lista de usuarios obtenida de la API externa **JSONPlaceholder**.

**Respuesta Exitosa**:

```json
[
    {
        "id": 1,
        "name": "Leanne Graham",
        "username": "Bret",
        "email": "Sincere@april.biz"
    },
    {
        "id": 2,
        "name": "Ervin Howell",
        "username": "Antonette",
        "email": "Shanna@melissa.tv"
    }
    
]
```

Respuesta de Error:
{
    "error": "Failed to fetch data from external API",
    "details": "Connection refused"
}

## Instrucciones de Instalación
## 1. Clonar el Repositorio
- Clona este repositorio en tu máquina local: git clone https://github.com/Maickol96/UserService

## 2. Compilar y Ejecutar el Proyecto
- mvn spring-boot:run

- Esto iniciará el servidor en http://localhost:8080 por defecto.

## Puedes probar el endpoint de la API usando herramientas como Postman o curl:

## Postman:
- Método: GET
- URL: http://localhost:8080/api/users
