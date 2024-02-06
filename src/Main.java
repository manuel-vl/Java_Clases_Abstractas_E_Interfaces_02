public class Main {
    public static void main(String[] args) {
        SerieTipoUno serieTipoUno = new SerieTipoUno();
        SerieTipoDos serieTipoDos = new SerieTipoDos();
        SerieTipoUno serieTipoUno2=new SerieTipoUno();

        serieTipoUno.establecerValorInicial(2);
        serieTipoDos.establecerValorInicial(1);
        serieTipoUno2.establecerValorInicial(3);

        System.out.println("Primera serie");
        imprimirSerie1(serieTipoUno);

        System.out.println("Segunda serie");
        imprimirSerie2(serieTipoDos);

        System.out.println("Tercera serie");
        imprimirSerie1(serieTipoUno2);
    }

    public static void imprimirSerie1(SerieTipoUno serieTipoUno) {
        for (int i = 0; i < 4; i++) {
            System.out.println(serieTipoUno.siguienteNumero());
        }
    }

    public static void imprimirSerie2(SerieTipoDos serieTipoDos){
        for (int i = 0; i < 4; i++) {
            System.out.println(serieTipoDos.siguienteNumero());
        }
    }
}
