// making a Graph class to look at how the test is performed over this data structure
import java.util.*;

public class Graph {
     protected int vertices;
     protected LinkedList<Integer> list[];

     public Graph(int vertices){
         this.vertices = vertices;
         list = new LinkedList[vertices];
         for (int i=0;i<vertices;i++){
             list[i] = new LinkedList<>();
         }
    }

    public void addEdge(int source, int destination){
         // use linkedlist built in methods to add edges and back edges.
         list[source].addFirst(destination);
         // this is a way to make it "doubly" linked
         list[destination].addFirst(source);
    }

    public void print(){
         for (int i=0;i<vertices;i++){
             if (list[i].size()>0) {
                 System.out.print("Vertex "+i+" is connected to: ");
                 for (int j=0;j<list[i].size();j++){
                     System.out.print(list[i].get(j)+" ");
                 }
                 System.out.println(" ");
             }
         }
    }

}
