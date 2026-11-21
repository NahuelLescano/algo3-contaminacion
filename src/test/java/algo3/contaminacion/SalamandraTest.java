package algo3.contaminacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import algo3.contaminacion.excepciones.CapacidadMaximaSuperadaExcepction;
import algo3.contaminacion.excepciones.ContaminacionMaximaSuperadaExcepction;

public class SalamandraTest {
    private static final double DELTA = 1e-3;

    @Test
    public void test01CostoContaminacionSalamandraRellenadaCon5KilosDeQuebracho1KiloDePinoY1KiloDeResina() {
        Salamandra salamandra = new Salamandra();
        salamandra.rellenarCon(new Quebracho(5));
        salamandra.rellenarCon(new Pino(1));
        salamandra.rellenarCon(new Resina(1));

        Combustion combustion = salamandra.quemar();
        double costoCombustion = combustion.calcularCosto();

        assertEquals(5750, costoCombustion, DELTA);
    }

    @Test
    public void test02GradoContaminacionSalamandraRellenadaCon6KilosDeQuebrachoY5KilosDePino() {
        Salamandra salamandra = new Salamandra();
        salamandra.rellenarCon(new Quebracho(6));

        assertThrows(CapacidadMaximaSuperadaExcepction.class, () -> {
            salamandra.rellenarCon(new Pino(5));
        });
    }

    @Test
    public void test03GradoContaminacionSalamandraRellenadaCon2KilosDeQuebracho1KiloDePinoY5KilosDeResina() {
        Salamandra salamandra = new Salamandra();
        salamandra.rellenarCon(new Quebracho(2));
        salamandra.rellenarCon(new Pino(1));
        salamandra.rellenarCon(new Resina(5));

        assertThrows(ContaminacionMaximaSuperadaExcepction.class, () -> {
            salamandra.quemar();
        });
    }

    @Test
    public void test04GradoContaminacionSalamandraRellenadaCon5KilosDeQuebracho1KiloDePinoY1KiloDeResina() {
        Salamandra salamandra = new Salamandra();
        salamandra.rellenarCon(new Quebracho(5));
        salamandra.rellenarCon(new Pino(1));
        salamandra.rellenarCon(new Resina(1));

        Combustion combustion = salamandra.quemar();
        double costoCombustion = combustion.calcularContaminacion();

        assertEquals(180, costoCombustion, DELTA);
    }
}
