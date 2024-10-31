import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainProgFuncionalMap {
    private Map<Integer, String> map;
    private Map<Integer, String> mapaRecolectado;

    public void llenarlista(){
        map = new HashMap<>();
        map.put(1, "Jonhouseman");
        map.put(2, "Bill Joy");
        map.put(3, "Bill Gates");
        map.put(4, "Kloey");
    }
    public static void main(String[] args){
        MainProgFuncionalMap main = new MainProgFuncionalMap();
        main.llenarlista();
        main.insertarSiAusente();
        main.obternerOr();
        main.operarSiPresente();
        main.recolectar();

        main.mapaRecolectado.entrySet().stream().forEach(System.out::println);
        //main.map.forEach( ( k, v ) -> System.out.println("LLave: " +k+ " Valor: " +v));
    }

    public void insertarSiAusente(){
        map.putIfAbsent(6, "Jaime");//Agrega el elemento si este no existe en la lista
    }

    public void operarSiPresente(){
        map.computeIfPresent(5, ( k,v ) -> k + v );//Si encuentra la llave 3 ya a hacer unas determinadas operaciones que definas
        System.out.println(map.get(5));
    }

    public void obternerOr(){
        map.getOrDefault(5, "Valor predeterminado");//Si no hay ningun valor asociado a la llave 5 se le asignara el valor predeterminado que tu le asignes
    }

    public void recolectar(){//Arma una nueva lista en base al filtro que se le hizo al anterior hashmap
        mapaRecolectado = map.entrySet().stream()
                                                             .filter(e -> e.getValue().contains("a"))
                                                             .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
    }
}