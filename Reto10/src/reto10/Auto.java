
package reto10;

public class Auto {
   //Atributos básicos.
    private String tipoVehiculo;
    private String modelo;
    private String tipoNeumatico;
    private String ventajas;
    private String desventajas;

    public Auto(String tipoVehiculo, String modelo, String tipoNeumatico, String ventajas, String desventajas) {
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
        this.tipoNeumatico = tipoNeumatico;
        this.ventajas = ventajas;
        this.desventajas = desventajas;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }

    public String getVentajas() {
        return ventajas;
    }

    public void setVentajas(String ventajas) {
        this.ventajas = ventajas;
    }

    public String getDesventajas() {
        return desventajas;
    }

    public void setDesventajas(String desventajas) {
        this.desventajas = desventajas;
    }
    
    
    
}
