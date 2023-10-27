import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SeguroTransitorio extends  Seguro{
    private LocalDate fechaInic;
    private LocalDate fechacaduc;
    private Seguro elemento;

    public SeguroTransitorio (int dni,Seguro elemento,LocalDate fechaInic,LocalDate fechacaduc){
        super(dni);
        this.elemento = elemento;
        this.fechacaduc = fechacaduc;
        this.fechaInic = fechaInic;
    }
    @Override
    public float getMonto() {
        LocalDate fehcaAct = LocalDate.now();
        if ((fehcaAct.isAfter(fechaInic)) && (fehcaAct.isBefore(fechacaduc))){
            return elemento.getMonto();
        }
        return 0;
    }

    @Override
    public float calcularCostoPoliza() {
        LocalDate fehcaAct = LocalDate.now();
        if ((fehcaAct.isAfter(fechaInic)) && (fehcaAct.isBefore(fechacaduc))){
            return elemento.calcularCostoPoliza() ;
        }
        return 0;
    }

    @Override
    public Set<Seguro> listar(Filtro filtro) {
        LocalDate fehcaAct = LocalDate.now();
        if ((fehcaAct.isAfter(fechaInic)) && (fehcaAct.isBefore(fechacaduc))) {
            if (!elemento.listar(filtro).isEmpty()) {
                return elemento.listar(filtro);
            }
        }
        return  null;
    }
}
