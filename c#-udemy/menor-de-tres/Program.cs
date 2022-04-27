using System;

namespace Programa {

    class Program {

        static void Main(string[] args) {

            int a, b, c, menor = 0;

            System.Console.Write("Pirmeiro valor: ");
            a = int.Parse(Console.ReadLine());
            System.Console.Write("Segundo valor: ");
            b = int.Parse(Console.ReadLine());
            System.Console.Write("Terceiro valor: ");
            c = int.Parse(Console.ReadLine());

            if (a < b && a < c) {
                menor = a;
            } else if (b < c) {
                menor = b;
            } else {
                menor = c;
            }

            System.Console.WriteLine("Menor = " + menor);
        }
    }
}