using System;

namespace Programa {

    class Program {

        static void Main(string[] args){

            int ordemMatriz, count = 0;

            System.Console.Write("Qual a ordem da matriz? ");
            ordemMatriz = int.Parse(Console.ReadLine());

            int[,] matriz = new int [ordemMatriz, ordemMatriz];

            for (int i = 0; i < ordemMatriz; i++) {
                for (int j = 0; j < ordemMatriz; j++) {
                    System.Console.Write("Elemento [" + i + "," + j + "]: ");
                    matriz[i,j] = int.Parse(Console.ReadLine());
                }
            }

            System.Console.WriteLine("Diagonal principal:");
            for (int i = 0; i < ordemMatriz; i++) {
                for (int j = 0; j < ordemMatriz; j++) {
                    if (i == j) {
                        System.Console.Write(matriz[i,j] + " ");
                    }
                }
            }

            System.Console.WriteLine();

            for (int i = 0; i < ordemMatriz; i++) {
                for (int j = 0; j < ordemMatriz; j++) {
                    if (matriz[i,j] < 0) {
                        count += 1;
                    }
                }
            }

            System.Console.WriteLine("Quantidade de negativos = " + count);
        }
    }
}