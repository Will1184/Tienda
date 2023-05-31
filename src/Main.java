import impl.IProducto;
import model.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Creacion de Arrayllist para almacenar los objetos
        ArrayList<IProducto> productos= new ArrayList<>();
        //Creacion de objetos
        Date date = new Date(1945,4,13);

        Iphone iphone = new Iphone(1000,"Apple","Plus","Rojo");
        TvLcd tvLcd = new TvLcd(500,"Samsung",40);
        Comic comic = new Comic(24,date,"Orwell","1984",
                "Debolsillo","Winston, Smith");

        //Ingresar los objetos al arraylist
        productos.add(iphone);
        productos.add(tvLcd);
        productos.add(comic);


        System.out.println(">>>> Electronics and Beyond <<<<");
        for (IProducto producto:productos){
            int numIphone=0,numLibros=0,numTelevisores=0;
            if (producto instanceof Libro){
                numLibros++;
                System.out.println();
                System.out.println("Libros en existencia: "+ numLibros);
                System.out.println("Titulo: "+((Libro) producto).getTitulo()+"\nAutor: "
                        +((Libro) producto).getAutor()+"\nPrecio: "+ producto.getPrecioVenta());
            }
            if (producto instanceof Iphone){
                numIphone++;
                System.out.println("Iphone en existencia: "+numIphone);
                System.out.println("Modelo: "+((Iphone) producto).getModelo()+"\nColor: "+((Iphone) producto).getColor()+"\nPrecio: "+ producto.getPrecioVenta());
            }
            if (producto instanceof TvLcd){
                numTelevisores++;
                System.out.println();
                System.out.println("Televisores en existencia: "+numTelevisores);
                System.out.println("Fabricante: "+((TvLcd) producto).getFabricante()
                        +"\nPulgadas: "+((TvLcd) producto).getPulgada()+"\nPrecio: "+ producto.getPrecioVenta());
            }
        }

    }
}