public class SerieTipoDos extends Prototipo<Integer>{
    private Integer valorInicial;
    private Integer paso;

    @Override
    public void establecerValorInicial(Integer number) {
        this.valorInicial=number;
        this.paso=number+2;
    }

    @Override
    public Integer siguienteNumero() {
        int temp=paso;
        paso+=2;
        return temp;
    }

    @Override
    public void reiniciarSerie() {
        this.establecerValorInicial(valorInicial);
    }
}
