package com.devsenior;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        

        List<Producto> productos  = List.of(
            new Producto("Laptop", "Macbook Pro", 2000),
            new Producto("Laptop", "Dell XPS", 1500),
            new Producto("Smartphone", "iPhone 12", 1000),
            new Producto("Smartphone", "Samsung Galaxy S21", 900),
            new Producto("Tablet", "iPad Pro", 1200)
        );


        var resultado = productos.stream() //Los pipelines son métodos sucesivos quue se pasan valores unos a otros
        .collect(Collectors.groupingBy(Producto :: getCategoria)); // (key) ---> map(key, list<T>) 

        resultado.forEach((categoria, lista)->
            System.out.println("Categoria " + categoria ));
            productos.forEach(p -> System.out.println("Producto: " + p.getNombre() + " Precio: " + p.getPrecio()));
 
    }
}