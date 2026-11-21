package algo3.contaminacion;

import java.util.List;

import algo3.contaminacion.excepciones.CombustibleInvalidoExcepction;

public class Combustion {
    private List<Combustible> combustibles;

    public Combustion(List<Combustible> combustibles) {
        if (combustibles == null) {
            throw new CombustibleInvalidoExcepction("El combustible no puede ser nulo");
        }
        this.combustibles = combustibles;
    }

    public double calcularCosto() {
        return this.combustibles.stream().mapToDouble(Combustible::calcularCostoCombustion).sum();
    }

    public double calcularContaminacion() {
        return this.combustibles.stream().mapToDouble(Combustible::calcularGradoContaminacion).sum();
    }
}
