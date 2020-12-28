package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {


	public static int[][] buildGraph(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Vertex");
		int v=sc.nextInt();
		System.out.println("Enter no of Edge");
		int e=sc.nextInt();
		int graphMat[][]=new int[v][v];
		for(int i=0;i<e;i++) {
			System.out.println((i+1)+" :Enter the edge pair");
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			graphMat[fv][sv]=1;
			graphMat[sv][fv]=1;
		}
		return graphMat;
	}
	
	public static void bfs(int edge[][]) {
		boolean flag[]=new boolean[edge.length];
		for(int i=0;i<edge.length;i++) {
			if(!flag[i]) {
				bfshelper(edge,i,flag);
			}
		}
	}

	public static void bfshelper(int[][] edge,int si,boolean flag[]) {
		//boolean flag[]=new boolean[edge.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(si);
		flag[si]=true;
		while(!q.isEmpty()) {
			int fv=q.poll();
			System.out.print(fv+" ");
			for(int i=0;i<edge.length;i++) {
				if(edge[fv][i]==1 && !flag[i]) {
					q.add(i);
					flag[i]=true;
				}
			}
		}
	}

<<<<<<< HEAD:Graph/BFS Traversal.txt



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edge[][]=buildGraph();
		bfs(edge);
	}



=======
>>>>>>> ddc791a6abb303813f9c5788821d69246c4f36e0:Graph/BFS Traversal.java
}
