public class EstrategiaDistribucionCiclista implements EstrategiaDistribucion {

    @Override
    public void distribuir(Producto producto) {
        System.out.println("El producto " + producto.getNombre() + " se distribuirá por vía ciclista.");
    }
}
