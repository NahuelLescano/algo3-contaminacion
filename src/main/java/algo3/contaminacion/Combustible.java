package algo3.contaminacion;

public interface Combustible {
    double calcularCostoCombustion();
    double calcularGradoContaminacion();
    // TODO: refactorizar el codigo para no violar `Tell dont ask`
    double obtenerKilos();
}
