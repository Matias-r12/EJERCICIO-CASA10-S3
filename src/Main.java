public class Main{
    public static void main(String[] args) {
        InterfazRed eth = new InterfazRed();
        eth.setNombre("Eth0");
        eth.setDireccionIP("192.168.1.10");
        eth.setVelocidadMbps(1000.0);

        eth.activar();
        System.out.println("Interfaz activa: " + eth.isActiva());
    }
}