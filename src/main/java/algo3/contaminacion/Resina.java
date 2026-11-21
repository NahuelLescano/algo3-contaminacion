package algo3.contaminacion;

public class Resina implements Combustible {
    private static final double PRECIO = 250;
    private static final int FACTOR_CONTAMINACION = 5;

    private double kilos;

    public Resina(double kilos) {
        this.kilos = kilos;
    }

    @Override
    public double calcularCostoCombustion() {
        return PRECIO * this.kilos;
    }

    @Override
    public double calcularGradoContaminacion() {
        return Math.pow(FACTOR_CONTAMINACION, this.kilos);
    }

    @Override
    public double obtenerKilos() {
        return this.kilos;
    }

}
