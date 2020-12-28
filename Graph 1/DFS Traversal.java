package graph;

import java.util.Scanner;

public class DFS_implementation {

	public static void dfshelper(int edge[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		int n=edge.length;
		for(int i=0;i<n;i++) {
			if(!visited[i] && edge[sv][i]==1) {
				dfshelper(edge,i,visited);
			}
		}
	}

	public static void dfs(int edge[][]) {
		boolean visited[]= new boolean[edge.length];
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				dfshelper(edge,i,visited);
			}
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertex");
		int n=sc.nextInt();
		System.out.println("Enter number of edge");
		int e=sc.nextInt();
		//int graph[][]=new int[n][n];

		//this one is moving on ever cell

		//		for(int i=0;i<n;i++){
		//			for(int j=0;j<n;j++) {
		//				System.out.println("edge between "+(i+1) +" and "+(j+1)+ " ?");
		//				int response=sc.nextInt();
		//				
		//				if(response==1) {
		//					graph[i][j]=response;
		//				}else {
		//					graph[i][j]=0;
		//				}
		//			}
		//		}




		//Better approach
		int graph[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			System.out.println("Enter first vertex");
			int fv=sc.nextInt();
			System.out.println("Enter second vertex");
			int sv=sc.nextInt();
			graph[fv][sv]=1;
			graph[sv][fv]=1;
		}





		//printing matrix graph

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}



		//Fuction calling
		System.out.println("The visited nodes in DFS are");
		dfs(graph);



	}

}
