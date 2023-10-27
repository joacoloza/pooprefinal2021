public class FiltroMonto implements Filtro {
    private float monto;
    public FiltroMonto (float monto) {this.monto = monto;}

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getMonto() == monto ;
    }
}
