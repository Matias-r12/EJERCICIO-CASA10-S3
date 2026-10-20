public class InterfazRed {
    private String nombre;
    private String direccionIP;
    private double velocidadMbps;
    private boolean activa;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccionIP(String direccionIP) {
        if (direccionIP != null && !direccionIP.isEmpty()) {
            this.direccionIP = direccionIP;
        }
    }

    public String getDireccionIP() {
        return this.direccionIP;
    }

    public void setVelocidadMbps(double velocidadMbps) {
        if (velocidadMbps > 0) {
            this.velocidadMbps = velocidadMbps;
        }
    }

    public double getVelocidadMbps() {
        return this.velocidadMbps;
    }

    public void activar() {
        this.activa = true;
    }

    public void desactivar() {
        this.activa = false;
    }

    public boolean isActiva() {
        return this.activa;
    }
}
