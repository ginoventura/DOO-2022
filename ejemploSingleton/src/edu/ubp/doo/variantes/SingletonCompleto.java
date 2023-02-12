package edu.ubp.doo.variantes;

/**
 * Esta es la variante correcta para cuando se debe aplicar el patrón Singleton
 * en un programa multihilo. Además se declara a la clase como final para que no
 * pueda ser heredada y de esta forma romper el singleton.
 */
public final class SingletonCompleto {

    private static SingletonCompleto instancia = null;

    private SingletonCompleto() {
    }

    /**
     * Se ha sincronizado el apartado de creación de la instancia para evitar
     * posibles problemas multi-hilo que permitirian crear multiples instancias
     * del Singleton
     */
    public static synchronized SingletonCompleto getInstancia() {
        if (instancia == null) {
            
            instancia = new SingletonCompleto();
        }
        return instancia;
    }

    /**
     * *
     * Para asegurar que se cumpla el requerimiento de "única instancia" del
     * singleton la clase debería producir un objeto no clonable.
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }

}
