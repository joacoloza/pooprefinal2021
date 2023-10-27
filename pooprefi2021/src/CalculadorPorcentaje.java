public class CalculadorPorcentaje implements  CalculadorPoliza{
    private float porcentaje;
    public CalculadorPorcentaje (int porcentaje) {this.porcentaje = porcentaje;}

    @Override
    public float calcular(Seguro seguro) {
        return seguro.getMonto() * porcentaje  ;
    }
}
