package org.example;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Fizzbuzz {
    public List<Usuario> filtrarMayoresEdad(List<Usuario> usuarios) {
        return usuarios.stream()
                .filter(usuario -> usuario.getEdad() >= 18)
                .collect(Collectors.toList());

    }
    public List<Integer> getDivisibles(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(num -> num % divisor == 0)
                .collect(Collectors.toList());

    }

    private void collect(Collector<Object,?, List<Object>> list) {
    }

    public String checkNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return null;
    }


}
