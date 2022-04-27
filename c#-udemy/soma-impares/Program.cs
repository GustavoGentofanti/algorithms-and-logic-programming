using System;

namespace Programa {

    class Program {

        static void Main(string[] args) {

            int x, y, troca, soma = 0;

            System.Console.WriteLine("Digite dois numeros:");
            x = int.Parse(Console.ReadLine());
            y = int.Parse(Console.ReadLine());

            if (x > y) {
                troca = x;
                x = y;
                y = troca;
            }

            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }

            System.Console.WriteLine("Soma dos impares = " + soma);
        }
    }
}