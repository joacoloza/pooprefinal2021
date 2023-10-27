import java.util.Set;

public abstract class Seguro {
    protected int dni;

    public Seguro (int dni){
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public abstract float getMonto();
    public abstract float calcularCostoPoliza ();
    public abstract Set<Seguro> listar (Filtro filtro);
}
