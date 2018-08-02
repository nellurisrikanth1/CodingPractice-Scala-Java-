package com.java.practice.implem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Killjee is very tired too write a story So , Here goes the problem You are given a graph having n nodes and m edges.
 *
 * You need to find an array of size  such that every adjacent elements of the array have a edge between them in the given graph.
 *
 * UPDATE
 *
 * If there are multiple solutions please output anyone of them.
 *
 * All vertices of the graph should be present in the array
 *
 * sorry for delay in announcment :(
 *
 * INPUT
 *
 * First line of Input contain 2 integers n and m as specified in the problem statement.
 *
 * OUTPUT
 *
 * Print size of the array in the first line of your output print the array in second line of the output.
 */
public class DFSExample {
    public static ArrayList<Integer> adjList[];
    public static ArrayList<Integer> res;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        adjList = new ArrayList[n + 1];//Intializing the list
        for (int i = 1; i <= n; i++)
            adjList[i] = new ArrayList<Integer>();//Intializing every element in the array list
        res = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);
        }
        dfs(1, new boolean[n + 1]);//Here first argument is the start vertex of DFS and second argument is vertices visited array
        System.out.println(res.size());
        for (int e : res)
            System.out.print(e + " ");
        s.close();
    }

    public static void dfs(int u, boolean isVisited[]) {
        isVisited[u] = true;
        res.add(u);
        for (int v : adjList[u]) {
            if (!isVisited[v]) {
                dfs(v, isVisited);
                res.add(u);
            }
        }
    }
}
