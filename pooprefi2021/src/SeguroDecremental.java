import java.time.LocalDate;

public class SeguroDecremental extends Seguro{
    private int poliza;
    private String descripcion;
    private LocalDate anio;
    private int monto;
    private CalculadorPoliza calculador;
    public SeguroDecremental (int dni, int poliza, String descripcion, LocalDate anio, int monto,CalculadorPoliza calculador){
        super(dni);
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.anio = anio;
    }
    public float getMonto () {
        int diferenciaAnios = LocalDate.now().getYear() - anio.getYear();
        return monto / diferenciaAnios;
    }
    public void  setCalculador (CalculadorPoliza calculador){this.calculador = calculador;}
    public float calcularCostoPoliza (){
        return calculador.calcular(this);
    }
}
