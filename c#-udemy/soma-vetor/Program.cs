using System;

namespace Programa {

    class Program {

        static void Main(string[] args) {

            int qntNumeros;
            double soma = 0, media;

            System.Console.Write("Quantos numeros voce vai digitar? ");
            qntNumeros = int.Parse(Console.ReadLine());

            double[] vetor= new double [qntNumeros];

            for (int i = 0; i < qntNumeros; i++) {
                System.Console.Write("Digite um numero: ");
                vetor[i] = double.Parse(Console.ReadLine());
            
            }

            System.Console.Write("Valores = ");
            for (int i = 0; i < qntNumeros; i++) {
                System.Console.Write(vetor[i].ToString("F1") + " ");
            }

            System.Console.WriteLine();

            for (int i = 0; i < qntNumeros; i++) {
                soma += vetor[i];   
            }

            media = soma / qntNumeros;

            System.Console.WriteLine("Soma = " + soma.ToString("F2"));
            System.Console.WriteLine("Media = " + media.ToString("F2"));
        }
    }
}