import  java.util.ArrayList;
import java.util.List;
public class testPessoa {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();


          number.add(12);
          number.add(14);
          number.add(15);

          for (Integer list : number) {
                System.out.println("Numero: "+list);
          }
        
    }
}