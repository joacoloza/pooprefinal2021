import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class SeguroIntegrador extends Seguro {
    private Vector<Seguro> segurosIntegrados;
    public  SeguroIntegrador (int dni){
        super(dni);
        segurosIntegrados = new Vector<>();
    }

    public  void agregar (Seguro seguro){ //esto es asi porque me tengo que asegurar que los seguros que pongo en cada "segurointegrador" pertenezcan al mismo cliente
        if (seguro.getDni() == this.getDni()) {
            segurosIntegrados.add(seguro);
        }
    }

    @Override
    public float getMonto() {
        float suma = 0;
        for (Seguro seguro : segurosIntegrados){
            suma = suma + seguro.getMonto();
        }
        return  suma ;
    }
    @Override
    public float calcularCostoPoliza (){
        float suma = 0;
        for (Seguro seguro : segurosIntegrados){
            suma = suma + seguro.calcularCostoPoliza();
        }
        return  suma ;
    }

    @Override
    public Set<Seguro> listar(Filtro filtro) {
        Set<Seguro> listaC = new HashSet<>();
        for (Seguro seguro : segurosIntegrados){
            listaC.addAll(seguro.listar(filtro));
        }
        return listaC;
    }
}
