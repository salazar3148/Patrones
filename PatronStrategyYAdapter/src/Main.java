public class Main {
    public static void main(String[] args) {
        /*
        Hay una competencia de carreras en la ciudad, donde pueden participar distintos tipos de vehiculo
        como coches, motos y ciclas.
        Se sabe que cada tipo de vehículo acelera de una forma diferente,

        Además, se necesita capturar la velocidad final con el que el vehiculo llegó a la meta.
        La camara o proveedor externo te proporcionará los datos de velocidad en millas por hora (mph),
        pero requerimos que la aplicación trabaje en kilómetros por hora (kmh),

        Utilizar el Patron Strategy y el Patron Adapter
        Para solucionar este problema
        */

        ProveedorVelocidad proveedorVelocidadExternoCarro = new ProveedorVelocidadExterno(60);
        ProveedorVelocidad proveedorVelocidadExternoMoto = new ProveedorVelocidadExterno(55);
        ProveedorVelocidad proveedorVelocidadExternoBici = new ProveedorVelocidadExterno(15);

        VehiculoAdapter carro1 = new VehiculoAdapter(proveedorVelocidadExternoCarro);
        carro1.setAceleracionStrategy(new Carro());
        carro1.acelerar();

        VehiculoAdapter moto1 = new VehiculoAdapter(proveedorVelocidadExternoMoto);
        moto1.setAceleracionStrategy(new Moto());
        moto1.acelerar();

        VehiculoAdapter bicicleta = new VehiculoAdapter(proveedorVelocidadExternoBici);
        bicicleta.setAceleracionStrategy(new Bici());
        bicicleta.acelerar();

        System.out.println("Velocidad en Carro: " + carro1.obtenerVelocidadKmh() + " km/h");
        System.out.println("Velocidad en Moto: " + moto1.obtenerVelocidadKmh() + " km/h");
        System.out.println("Velocidad en Bicicleta: " + bicicleta.obtenerVelocidadKmh() + " km/h");

    }
}