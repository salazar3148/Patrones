public class ProveedorVelocidadExterno implements ProveedorVelocidad {
    private double velocidadMph;
    public ProveedorVelocidadExterno(double velocidadMph) {
        this.velocidadMph = velocidadMph;
    }
    public double obtenerVelocidadMph() {
        return this.velocidadMph;
    }
}