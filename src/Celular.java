public class Celular extends Dispositivo implements color{
    private String capacidad;
    private int añodelanzamiento;
    public Celular (){
    }
    public Celular(int añodelanzamiento, String capacidad) {
        this.añodelanzamiento = añodelanzamiento;
        this.capacidad = capacidad;
    }

    public Celular(String marca, String modelo, int precio, int añodelanzamiento, String capacidad) {
        super(marca, modelo, precio);
        this.añodelanzamiento = añodelanzamiento;
        this.capacidad = capacidad;
    }
    public void camara(){
        System.out.println("Tengo camara de excelente calidad");
    }
    @Override
    public int calcularprecio() {
        double iva = 0.19;
        double precioTotal = getPrecio() + (getPrecio() * iva);
        return  (int) precioTotal;
    }
    @Override
    public String tipodecolor() {
        return "azul";
    }
    @Override
    public int tono() {
        return 1;
    }
}
