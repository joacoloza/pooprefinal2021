public class FiltroUnaPalbra implements Filtro{
    private String palabra;
    public FiltroUnaPalbra (String palabra) {this.palabra = palabra;}

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return ((seguro.getDescripcion().length() ==1) && (seguro.getDescripcion() == palabra));
    }
}
