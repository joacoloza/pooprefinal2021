public class FiltroDni implements Filtro{
    private int dni;
    public FiltroDni (int dni){this.dni = dni;}

    @Override
    public boolean cumple(SeguroSimple seguro) {
        return seguro.getDni() == dni;
    }
}
