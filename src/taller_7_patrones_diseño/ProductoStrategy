public class ProductoStrategy implements Producto {

    private String id;
    private String nombre;
    private String marca;
    private String modelo;
    private float peso;
    private float precio;
    private int resolucionPantalla;
    private int cantidadMemoriaInterna;

    public ProductoStrategy(String id, String nombre, String marca, String modelo, float peso, float precio, int resolucionPantalla, int cantidadMemoriaInterna) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.precio = precio;
        this.resolucionPantalla = resolucionPantalla;
        this.cantidadMemoriaInterna = cantidadMemoriaInterna;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    public int getResolucionPantalla() {
        return resolucionPantalla;
    }

    public int getCantidadMemoriaInterna() {
        return cantidadMemoriaInterna;
    }

    @Override
    public void distribuir(EstrategiaDistribucion estrategiaDistribucion) {
        estrategiaDistribucion.distribuir(this);
    }
}
