package com.kodilla.collections.adv.immutable.Exercise.fromto;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    // No. of vertices in graph
    private int v;

    // adjacency list
    private ArrayList<Integer>[] adjList;

    // construktor
    public Graph(int variants) {
        this.v = variants;

        //initialise adjacency list
        initAdjList();

    }

    // utility method to initialise
    // adjacency list
    private void initAdjList() {
        adjList = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    // add edge from u to v

    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }
// Prints all paths from
    // 's' to 'd'

    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        // add source to path
        pathList.add(s);

        //Call recursive utility
        printAllPathsUtils(s, d, isVisited, pathList);
    }

    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path

    private void printAllPathsUtils(Integer u, Integer d, boolean[] isVisited, List<Integer> localPathList) {
        // Mark the current node
        isVisited[u] = true;

        if (u.equals(d)) {
            System.out.println(localPathList);

            isVisited[u] = false;
        return;
    }

    // Recur for all the vertices
    // adjacent to current vertex
    for(Integer i :adjList[u])

    {
        if (!isVisited[i]) {
            // store current node
            // in path[]
            localPathList.add(i);
            printAllPathsUtils(i, d, isVisited, localPathList);

            // remove current node
            // in path[]
            localPathList.remove(i);
        }
    }
    // Mark the current node
    isVisited[u]=false;
}
    // Driver program
    public static void main(String[] args)
    {
        // Create a sample graph
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(4,1);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(1,3);

        // arbitrary source
        int s = 2;

        // arbitrary destination
        int d = 3;

        System.out.println("Following are all different paths from "+s+" to "+d);
        g.printAllPaths(s, d);

    }
}




