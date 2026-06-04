// NAME: Sai Pradeep Thiagarajan IIT_STUDENT: 20241324 U0W_NUMBER: w21213513
import java.util.List;
public class Main {
    public static void main(String[] args) throws Exception{

       // Test 1 - Acyclic graph

       System.out.println("=== Test 1: Acyclic Graph ===");

       Graphs g1 = new Graphs();

       g1.parseFile("Sai.txt");

       g1.PrintMatrix();

       List<Integer> cycle1 = g1.findCycle();
       if(cycle1 != null){
           System.out.println("Cycle found: "+ cycle1);
       }else{
           System.out.println("No cycle found!");
       }
       g1.isAcyclic();

       // Test 2 - Cyclic graph

       System.out.println("\n=== Test 2 : Cyclic Garph ===");
       Graphs g2 = new Graphs();
       g2.parseFile("Cycle.txt");
       g2.PrintMatrix();
       List<Integer> cycle2 = g2.findCycle();
       if(cycle2 != null){
           System.out.println("Cycle found: "+ cycle2);

       }else{
           System.out.println("No cycle found!");
       }
       g2.isAcyclic();









    }
}
