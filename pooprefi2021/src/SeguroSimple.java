import java.util.HashSet;
import java.util.Set;

public class SeguroSimple extends Seguro {
    private int poliza;
    private String descripcion;
    private int monto;
    private CalculadorPoliza calculador;
    public SeguroSimple (int dni,int poliza,String descripcion,CalculadorPoliza calculador){
        super(dni);
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.calculador = calculador;
    }

    @Override
    public float getMonto() {return monto;}

    public void setCalculador (CalculadorPoliza calculador){this.calculador = calculador;}

    @Override
    public float calcularCostoPoliza (){
        return calculador.calcular(this);
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public Set<Seguro> listar(Filtro filtro) {
        Set<Seguro> listaCumple = new HashSet<>();
        if (filtro.cumple(this)){
            listaCumple.add(this);
        }
        return listaCumple;
    }
}
