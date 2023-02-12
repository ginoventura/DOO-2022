package edu.ubp.doo.modelo;

public abstract class Bd {
    
    protected String cadenaConexion;

    public Bd(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }
    
    /**
     * @return the cadenaConexion
     */
    public String getCadenaConexion() {
        return cadenaConexion;
    }

    /**
     * @param cadenaConexion the cadenaConexion to set
     */
    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }
    
    /**
     * La implementación solo debe imprimir por pantalla
     * que se esta haciendo un insert y nada más (para este ejemplo)
     * System.out.println("Se ejecuta insert en....");
     */
    public abstract void insert();
    
    /**
     * La implementación solo debe imprimir por pantalla
     * que se esta haciendo un update y nada más (para este ejemplo)
     * System.out.println("Se ejecuta update en....");
     */
    public abstract void update();
    
    /**
     * La implementación solo debe imprimir por pantalla
     * que se esta haciendo un delete y nada más (para este ejemplo)
     * System.out.println("Se ejecuta delete en....");
     */
    public abstract void delete();
    
}
