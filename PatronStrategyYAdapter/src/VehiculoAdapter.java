public class VehiculoAdapter extends Vehiculo{
    private ProveedorVelocidad proveedorVelocidad;
    public VehiculoAdapter(ProveedorVelocidad proveedorVelocidad) {
        this.proveedorVelocidad = proveedorVelocidad;
    }
    public double obtenerVelocidadKmh() {
        return proveedorVelocidad.obtenerVelocidadMph() * 1.60934;
    }
}

