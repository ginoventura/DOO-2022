package edu.ubp.doo.modelo;

public final class SistemaMultiusuario {
    
    int cantidadUsuariosConectados = 0;
    
    private static SistemaMultiusuario instancia = null;

    private SistemaMultiusuario() {
    }
    
    public static SistemaMultiusuario getInstancia() {
        if(instancia == null){
            instancia = new SistemaMultiusuario();
        }
        return instancia;
    }

    public void login(String nombreUsuario){
        this.cantidadUsuariosConectados++;
        System.out.println("Bienvenido " + nombreUsuario.toUpperCase());
        System.out.println("Hay " + this.cantidadUsuariosConectados + " logueado/s");
    }
    
    public void logout(String nombreUsuario){
        this.cantidadUsuariosConectados--;
        System.out.println("Chau " + nombreUsuario.toUpperCase());
        System.out.println("Hay " + this.cantidadUsuariosConectados + " logueado/s");
    }
    
    public int getCantidadUsuariosConectados(){
        return cantidadUsuariosConectados;
    }

    /***
     * Para asegurar que se cumpla el requerimiento de "única instancia" 
     * del singleton la clase debería producir un objeto no clonable.
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
