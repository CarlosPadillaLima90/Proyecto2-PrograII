import java.util.Date;

public class Orden {

    int id;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    Date fechaOrden;
    double precioEnvio;
    double total;
    String tipoEnvio;
    String estado;

    public Orden() {
        id = id;
        fechaOrden = new Date();
        total = 0.0;
    }

    public Orden(Date pFecha){
        new Orden();

    }


}
