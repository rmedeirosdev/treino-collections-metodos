import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List <Gato> gatos = new ArrayList<>();
        Gato gato1= new Gato("Roxin",12,"Laranja");
        Gato gato2= new Gato("Matador",9,"Cinza");
        Gato gato3= new Gato("Perigo",8,"Rajado");
        Gato gato4 = new Gato("Kadu",15,"Branco");

        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);
        gatos.add(gato4);

        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }


}
