using System;

namespace Programa {
    class Program {
        static void Main(string[] args) {

            double largura, altura, area, perimetro, diagonal;

            System.Console.Write("Base do retangulo: ");
            largura = double.Parse(Console.ReadLine());
            System.Console.Write("Altura do retangulo: ");
            altura = double.Parse(Console.ReadLine());

            area = largura * altura;
            perimetro = (largura * 2) + (altura * 2);
            diagonal = Math.Sqrt(Math.Pow(largura, 2) + Math.Pow(altura, 2));

            System.Console.WriteLine("Area = " + area.ToString("F4"));
            System.Console.WriteLine("Perimetro = " + perimetro.ToString("F4"));
            System.Console.WriteLine("Diagonal = " + diagonal.ToString("F4"));
            
        }
    }
}
