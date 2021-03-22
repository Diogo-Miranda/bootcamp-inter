package enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculos = new TipoVeiculo();

        System.out.println(TipoVeiculo.TERRESTE);
        System.out.println(TipoVeiculo.AQUATICO);

        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: "+ tipo);
        }

        System.out.println("Code de status CLOSE: " + Status.CLOSE.getCod());
        System.out.println("Code de status CLOSE: " + Status.OPEN.getTexto());

    }
}
