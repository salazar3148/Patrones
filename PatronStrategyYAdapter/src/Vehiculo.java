public class Vehiculo {
    private AceleracionStrategy aceleracionStrategy;
    public void setAceleracionStrategy(AceleracionStrategy aceleracionStrategy) {
        this.aceleracionStrategy = aceleracionStrategy;
    }
    public void acelerar() {
        aceleracionStrategy.acelerar();
    }
}