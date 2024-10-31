
import org.example.Fizzbuzz;
import org.example.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    @DisplayName("test si el numero es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_TheReturnFizz() {
        //Give "data"
        Fizzbuzz Objectfizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = Objectfizzbuzz.checkNumber(9);
        //Then "pues"
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("test si el numrero es divisible por 5")
    void test_whenTheNumberIsDivisibleByfive_TheReturnFizz() {
        //Give "data"
        Fizzbuzz ObjectfizzBuzz = new Fizzbuzz();
        //when
        String result = ObjectfizzBuzz.checkNumber(10);
        //them
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("test reciba una lista de números y un número")
    void test_whenTheListaNumber_TheReturnListaNumber() {
        //Give
        Fizzbuzz ArrayList = new Fizzbuzz();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 15, 20);
        int divisor = 5;

        //when
        List<Integer> result = ArrayList.getDivisibles(numbers, divisor);
        //them
        List<Integer> expected = Arrays.asList(5, 10, 15, 20);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test reciba de objetos ‘usuario’ que tenga el nombre y la edad")
    void test_whenTheObjectUsuarioAgeName() {
        //Give
        Fizzbuzz ArrayList = new Fizzbuzz();

        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Juan", 17),
                new Usuario("María", 19),
                new Usuario("Pedro", 20),
                new Usuario("Ana", 16));


        //when
        List<Usuario> result = ArrayList.filtrarMayoresEdad(usuarios);
        //them
        List<Usuario> expected = Arrays.asList(new Usuario("María", 19),
                new Usuario("Pedro", 20));
        assertEquals(expected.size(),result.size());

    }

    ;


}



