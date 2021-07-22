package com.company;



public class Bellmanford {

    private int distance[];

    private int numb_vert;

    public static final int MAX_VALUE=999;

    public Bellmanford(int numb_vert)
    {

        this.numb_vert=numb_vert;

        distance=new int[numb_vert+1];

    }

    public void BellmanfordpEvaluation(int source,int adj_matrix[][])
    {
        for(int node=1;node<=numb_vert;node++)
        {

            distance[node]=MAX_VALUE;

        }

        distance[source]=0;

        for(int node=1;node<=numb_vert;node++)
        {
            for(int src_node=1;src_node<=numb_vert;src_node++)
            {
                for(int dest_node=1;dest_node<=numb_vert;dest_node++)
                {
                    if(adj_matrix[src_node][dest_node]!=MAX_VALUE)
                    {

                        if(distance[dest_node]>distance[src_node]+adj_matrix[src_node][dest_node])

                            distance[dest_node]=distance[src_node]+adj_matrix[src_node][dest_node];

                    }

                }

            }

        }

        for(int src_node=1;src_node<=numb_vert;src_node++)
        {

            for(int dest_node=1;dest_node<=numb_vert;dest_node++)
            {
                if(adj_matrix[src_node][dest_node]!=MAX_VALUE)
                {
                    if(distance[dest_node]>distance[src_node]+adj_matrix[src_node][dest_node])

                        System.out.println("the graph contains negative edge cycle");

                }

            }

        }

        System.out.println("Routing table for Router"+source+"i");

        System.out.println("destination distance/cost\t");

        for(int vertex=1;vertex<=numb_vert;vertex++)
        {

            System.out.println(+vertex+"\t\t\t"+distance[vertex]);

        }

    }
}


