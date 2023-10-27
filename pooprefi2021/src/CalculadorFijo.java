public class CalculadorFijo implements  CalculadorPoliza{
    private float costo;
    public CalculadorFijo (float costo) {this.costo = costo;}

    @Override
    public float calcular(Seguro seguro) {
        return costo;
    }
}
