package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    // Definimos objetos de tipo empleado para usarlos en todos los tests
    static Empleado empleado1;
    static Empleado empleado2;
    static Empleado empleado3;
    static Empleado empleado4;

    // Este método se invoca el primero antes de nada
    @BeforeAll
    public static void inicio() {
        // Creamos los objetos
        empleado1 = new Empleado("Fernando", "Ureña", 23, 1000);
        empleado2 = new Empleado("Antonio", "Lopez", 23, 800);
        empleado3 = new Empleado();
        empleado4 = new Empleado("Fernando", "Ureña", 43, 1200);
    }

    @Test
    public void plusTest() {
        double plus = 50;

        // Devolverá falso ya que tiene menos de 40 años
        assertEquals(false, empleado1.plus(plus));

        // Devolverá falso ya que tiene menos de 40 años
        assertEquals(false, empleado2.plus(plus));

        // Devolverá falso ya que tiene menos de 40 años
        assertEquals(false, empleado3.plus(plus));

        // Devolverá verdadero ya que tiene más de 40 años
        assertEquals(true, empleado4.plus(plus));
    }

    @Test
    public void equalsTest() {
        // Comprobamos si son iguales unos empleados de otro

        // Devolverá false ya que su nombre y apellido son distintos
        assertEquals(false, empleado1.equals(empleado2));

        // Devolverá false ya que su nombre y apellido son distintos
        assertEquals(false, empleado2.equals(empleado3));

        // Devolverá true ya que su nombre y apellido son iguales
        assertEquals(true, empleado1.equals(empleado4));
    }

    @Test
    public void compareTo() {
        // Comparamos entre distintos empleados, usamos constantes

        // Los dos empleados tienen la misma edad
        assertEquals(Empleado.IGUAL, empleado1.compareTo(empleado2));

        // El empleado 4 es mayor que el empleado 1
        assertEquals(Empleado.MAYOR, empleado4.compareTo(empleado1));

        // El empleado 3 es menor que el empleado 2
        assertEquals(Empleado.MENOR, empleado3.compareTo(empleado2));
    }
}