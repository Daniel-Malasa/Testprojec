package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int num_ver = 0;
        int source;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        //scanner.nextInt();
        num_ver = 5;

        int A[][] = new int[num_ver + 1][num_ver + 1];
        System.out.println("Enter the adjacency matrix");
        for (int sn = 1; sn <= num_ver; sn++) {
            for (int dn = 1; dn <= num_ver; dn++) {
                A[sn][dn] = scanner.nextInt();
                if (sn == dn) {
                    A[sn][dn] = 0;
                    continue;
                }
                if (A[sn][dn] == 0) {
                    A[sn][dn] = 5;
                }
            }
        }


        System.out.println("Enter the source vertex");
        source = 1;
        //b.BellmanFordEvaluation(source, A);
    }
}

