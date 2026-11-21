package algo3.contaminacion;

public class Pino implements Combustible {
    private static final double PRECIO = 500;
    private static final int FACTOR_CONTAMINACION = 150;

    private double kilos;

    public Pino(double kilos) {
        this.kilos = kilos;
    }

    @Override
    public double calcularCostoCombustion() {
        return PRECIO * this.kilos;
    }

    @Override
    public double calcularGradoContaminacion() {
        return FACTOR_CONTAMINACION;
    }

    @Override
    public double obtenerKilos() {
        return this.kilos;
    }

}
