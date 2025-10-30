public class Audifonod extends Dispositivo implements color{
    private String audio;
    private String inalambricos;
    public Audifonod(String audio, String inalambricos) {
        this.audio = audio;
        this.inalambricos = inalambricos;
    }
    public Audifonod(String marca, String modelo, int precio, String audio, String inalambricos) {
        super(marca, modelo, precio);
        this.audio = audio;
        this.inalambricos = inalambricos;
    }
    public String getAudio() {
        return audio;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }
    public String getInalambricos() {
        return inalambricos;
    }
    public void setInalambricos(String inalambricos) {
        this.inalambricos = inalambricos;
    }
    public void antiruido(){
        System.out.println("SOMOS ANTIRUIDO");
    }
    @Override
    public int calcularprecio() {
        double iva = 0.19;
        double precioTotal = getPrecio() + (getPrecio() * iva);
        return  (int) precioTotal;
    }
    @Override
    public String tipodecolor() {
        return "blanco";
    }
    @Override
    public int tono() {
        return 2;
    }
}
