public class SerieTipoUno extends Prototipo<Integer>{
    private int valorInicial;
    private int paso;

    @Override
    public void establecerValorInicial(Integer number) {
        this.valorInicial=number;
        this.paso=number;
    }

    @Override
    public Integer siguienteNumero() {
        int temp=paso;
        paso+=valorInicial;
        return temp;
    }

    @Override
    public void reiniciarSerie() {
        this.establecerValorInicial(valorInicial);
    }
}
