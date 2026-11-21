package algo3.contaminacion;

import java.util.ArrayList;
import java.util.List;

import algo3.contaminacion.excepciones.CapacidadMaximaSuperadaExcepction;
import algo3.contaminacion.excepciones.CombustibleInvalidoExcepction;
import algo3.contaminacion.excepciones.ContaminacionMaximaSuperadaExcepction;

public class Salamandra {
    private static final int CAPACIDAD_MAX = 10; // kg
    private static final int CONTAMINACION_MAX = 500; // gCO2

    private List<Combustible> combustibles;

    public Salamandra() {
        this.combustibles = new ArrayList<>();
    }

    public boolean rellenarCon(Combustible nuevoCombustible) {
        if (nuevoCombustible == null) {
            throw new CombustibleInvalidoExcepction("El combustible no puede ser null");
        }

        double kilosActuales = this.combustibles.stream().mapToDouble(Combustible::obtenerKilos).sum();
        if (kilosActuales + nuevoCombustible.obtenerKilos() > CAPACIDAD_MAX) {
            throw new CapacidadMaximaSuperadaExcepction(
                    "Superaste la capacidad maxima de la salamandra de " + CAPACIDAD_MAX + "kg");
        }

        return this.combustibles.add(nuevoCombustible);
    }

    public Combustion quemar() {
        Combustion combustion = new Combustion(this.combustibles);
        if (combustion.calcularContaminacion() > CONTAMINACION_MAX) {
            throw new ContaminacionMaximaSuperadaExcepction(
                    "La combustion supera el limite de" + CONTAMINACION_MAX + "gCO2");
        }
        return combustion;
    }
}
