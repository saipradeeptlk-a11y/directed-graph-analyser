// NAME: Sai Pradeep Thiagarajan IIT_STUDENT: 20241324 U0W_NUMBER: w21213513
import java.io.File;
import java.util.*;
public class Graphs {


    // Adjacency list to represent the directed graph
    // Each key is a vertex, value is a Arraylist of its neighbours
    HashMap<Integer,ArrayList<Integer>>adjList;

    Scanner Sai=new Scanner(System.in);
    public Graphs(){
       adjList=new HashMap<>();
    }

    // Adds a directed edge from key to value
    // Also ensures the destination vertex exists in the map
    public void addEdgetoMartrix(int key,int value){
        if (!adjList.containsKey(value)) {
            adjList.put(value, new ArrayList<>());
        }
        if(!(adjList.containsKey(key))){
            adjList.put(key,new ArrayList<>());
            adjList.get(key).add(value);
            

            System.out.println("Sucessfully added !");

        }else{
            adjList.get(key).add(value);
            System.out.println("Sucessfully added !");//constant = 1

        }

    }

    // Prints the adjacency list representation of the graph
    public void PrintMatrix(){
        for (int vertex : adjList.keySet()) {
            System.out.println(vertex + " → " + adjList.get(vertex));//n
        }
    }

    // Finds and returns a sink vertex (no neighbours)
    // Returns -1 if no sink is found
    public int findSink() {
        for (int vertex : adjList.keySet()) {
            if (adjList.get(vertex).size() == 0) {
                return vertex;
            }
        }
        return -1;//n
    }

    // Removes a vertex and all edges pointing to it
    public void RemoveVertex(int Sink){

        if(adjList.containsKey(Sink)){
            adjList.remove(Sink);
        }
        // Remove all references to the deleted vertex from neighbours
        for (int vertex : adjList.keySet()) {
            adjList.get(vertex).remove(Integer.valueOf(Sink));
        }//n

    }

    // Sink elimination algorithm to check if graph is acyclic
    // Repeatedly removes sinks until graph is empty or no sink found
    public boolean isAcyclic() {

        while (true) {
            if (adjList.isEmpty()) {
                System.out.println("The Graph is empty");
                return true;
            } else {
                int Sink = this.findSink();
                if (Sink == -1) {
                    System.out.println("No sink!");
                    return false;

                } else {
                    System.out.println("Removing the Sink :" + Sink);
                    RemoveVertex(Sink);


                }
            }
        }


    }
    // Reads graph edges from a file
    // Each line contains two integers representing a directed edge
    public void parseFile(String filename) throws Exception {
        File file = new File(filename);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt()){
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            addEdgetoMartrix(from ,to);


        }
        scanner.close();



    }

    // Entry point for cycle detection using DFS
    public List<Integer> findCycle(){
        Set<Integer> visited = new HashSet<>();
        List<Integer> path = new ArrayList<>();

        for(int vertex : adjList.keySet()){
            if(!visited.contains(vertex)){
                List<Integer> result = dfs(vertex,visited,path);
                if(result != null) return result;

            }
        }
        return null;
    }
    
    // Recursive DFS to detect cycles
    // path tracks current traversal, visited tracks all seen vertices
    private List<Integer> dfs(int vertex, Set<Integer> visited, List<Integer> path){
        visited.add(vertex);01
        path.add(vertex);01

        for(int neighbour : adjList.get(vertex)){E

            if(path.contains(neighbour)){v

                int start = path.indexOf(neighbour);v
                List<Integer> cycle = new ArrayList<>(path.subList(start, path.size()));
                cycle.add(neighbour);
                return cycle;
            }

            if(!visited.contains(neighbour)){
                List<Integer> result = dfs(neighbour, visited, path);
                if(result != null) return result;
            }
        }
        path.remove(path.size()-1);
        return null;


    }





}
