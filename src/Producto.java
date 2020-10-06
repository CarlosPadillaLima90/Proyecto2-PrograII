public class Producto {

    private int id;
    private String nombre;
    private String tipoDeProducto;
    private String fechaDeVencimiento;
    private String precioUnidad;

    public Producto() {
    }

    public Producto(int id, String nombre, String tipoDeProducto, String fechaDeVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.tipoDeProducto = tipoDeProducto;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.precioUnidad = precioUnidad;

    }

    public String getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(String precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}

