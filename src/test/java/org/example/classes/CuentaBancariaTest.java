package org.example.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuentaBancariaTest {

    private CuentaBancaria cuenta;
    private Usuario titular;

    @Before
    public void setUp(){
        titular = new Usuario();
        titular.setNombre("Carlos");
        titular.setApellido("Paez");
        cuenta = new CuentaBancaria(titular);

    }

    @Test
    public void testGetUsuario(){
        assertEquals(titular, cuenta.getUsuario());
    }

    @Test
    public void testDepositar(){
        cuenta.depositar(500.0);
        assertEquals(500.0, cuenta.getSaldo(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositarCantidadNegativa(){
        cuenta.depositar(-500.0);

    }

}
