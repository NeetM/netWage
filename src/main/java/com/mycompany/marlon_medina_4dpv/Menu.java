package com.mycompany.marlon_medina_4dpv;

import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       Empleado emp1 = new Empleado();
       
        System.out.println("Ingrese Nombre");
        emp1.nom = input.next();
        
        System.out.println("Ingrese rut");
        emp1.rut = input.next();
        
        System.out.println("Ingrese sueldoBruto");
        emp1.sueldoBruto = input.nextDouble();

    
        emp1.MostrarInformacion();
        emp1.MostrarSueldoLiquido();
        
    }
    
}
