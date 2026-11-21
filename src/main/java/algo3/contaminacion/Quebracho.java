package algo3.contaminacion;

public class Quebracho implements Combustible {
    private static final double PRECIO = 1000;
    private static final int FACTOR_CONTAMINACION = 5;

    private double kilos;

    public Quebracho(double kilos) {
        this.kilos = kilos;
    }

    @Override
    public double calcularCostoCombustion() {
        return PRECIO * this.kilos;
    }

    @Override
    public double calcularGradoContaminacion() {
        return FACTOR_CONTAMINACION * this.kilos;
    }

    @Override
    public double obtenerKilos() {
        return this.kilos;
    }

}
