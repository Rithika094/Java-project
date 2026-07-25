import java.util.*;

public class Cycle {
    public static void main(String[] args) {
        int numCourse=4;
        int[][] prerequisites={
            {1,0},
            {2,1},
            {0,2},  
        };
        System.out.println(canFinish(numCourse,prerequisites));
    }
    static boolean canFinish(int numCourse,int[][] prerequisites){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); 
	        for (int i = 0; i < numCourse; i++) { 
	            graph.add(new ArrayList<>()); 
	        } 
	        int[] indegree = new int[numCourse]; 
	        for (int[] prerequisite : prerequisites) { 
	            int course = prerequisite[0]; 
	            int prerequisiteCourse = prerequisite[1]; 
	            graph.get(prerequisiteCourse).add(course); 
	            indegree[course]++; 
	        } 
	        Queue<Integer>queue=new LinkedList<>(); 
	        for (int i=0; i<numCourse; i++) { 
	            if (indegree[i]==0) { 
	                queue.add(i); 
	            } 
	        } 
	        int count=0; 
	        while(!queue.isEmpty()) { 
	            int current=queue.poll(); 
	            count++; 
	       for(int neighbour : graph.get(current)){ 
	                indegree[neighbour]--; 
	                if (indegree[neighbour]== 0){ 
	                    queue.add(neighbour); 
	                } 
	            } 
	        } 
	        return count == numCourse; 
}
}
