package proyecto.utils;
import java.util.ArrayList;


public class ReportType {
    private static ArrayList<String> types = new ArrayList<String>();
    
    
    public ReportType() {
        types.add("");
        types.add("Pérdida de paquete");
        types.add("Entrega retrasada");
        types.add("Entrega incorrecta");
        types.add("Paquete dañado");
        types.add("Modificación de datos");
        types.add("Otros");
    }
    
    public static String getType(int id) {
        System.out.println(id);
        System.out.println("Vamoos");
        return types.get(id);
    }
}
