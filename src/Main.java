public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Samsung", "Galaxy S25", 5000000, 2025, "256GB");
        celular1.sirve();
        celular1.camara();
        celular1.dañado();
        System.out.println("Marca: " + celular1.getMarca());
        System.out.println("Modelo: " + celular1.getModelo());
        System.out.println("Precio: $" + celular1.getPrecio());
        System.out.println("Tipo de color: " + celular1.tipodecolor());
        System.out.println("Tono: " + celular1.tono());
        System.out.println("Precio con IVA: $" + celular1.calcularprecio());
        System.out.println();
        Audifonod audifono1 = new Audifonod("Iphone", "JB-2277", 1200000, "Alto", "Sí");
        audifono1.sirve();
        audifono1.antiruido();
        System.out.println("Marca: " + audifono1.getMarca());
        System.out.println("Modelo: " + audifono1.getModelo());
        System.out.println("Precio: $" + audifono1.getPrecio());
        System.out.println("Tipo de color: " + audifono1.tipodecolor());
        System.out.println("Tono: " + audifono1.tono());
        System.out.println("Precio con IVA: $" + audifono1.calcularprecio());
    }
}