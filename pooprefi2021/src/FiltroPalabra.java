public class FiltroPalabra implements Filtro{
    private String palabra;
    public FiltroPalabra (String palabra ){
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDescripcion() == palabra;
    }
}
