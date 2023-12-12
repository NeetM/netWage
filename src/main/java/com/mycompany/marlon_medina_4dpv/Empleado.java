package com.mycompany.marlon_medina_4dpv;

public class Empleado {
    
    String nom;
    String rut;
    double sueldoBruto;
    double sueldoLiquido;
   
    public void MostrarInformacion() {
        
        System.out.println("Nombre: " + nom);
        System.out.println("Rut: " + rut);
        System.out.println("SueldoBruto: " + sueldoBruto);

    }
    
    public void MostrarSueldoLiquido(){
    
        System.out.println("Sueldo Liquido: " + (sueldoBruto - (sueldoBruto * 0.115 + sueldoBruto * 00.7)));
        
    }
    
}

   
