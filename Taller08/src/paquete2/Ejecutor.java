/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DocenteNombramiento dn1 = new DocenteNombramiento();
        DocenteFactura df1 = new DocenteFactura();
        System.out.println("----Docuente Nombramiento---");
        System.out.println("Ingrese el nombre del docente");
        dn1.establecerNombres(entrada.nextLine());
        System.out.println("Ingrese el apellido del docente");
        dn1.establecerApellidos(entrada.nextLine());
        System.out.println("Ingrese la identificacion del docente");
        dn1.establecerIdentificacion(entrada.nextLine());
        System.out.println("Ingrese la edad del docente");
        dn1.establecerEdad(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese el sueldo del docente");
        dn1.establecerValorSueldo(Double.parseDouble(entrada.nextLine()));
        System.out.println("Ingrese el valor de hora extra");
        dn1.establecerValorHoraExtra(Double.parseDouble(entrada.nextLine()));
        System.out.println("Ingrese el numero de horas extras");
        dn1.establecerNumeroHorasExtras(Double.parseDouble(entrada.nextLine()));
        dn1.calcularSueldoFinal();

        System.out.printf("%s", dn1);
        System.out.println("---Docente Factura---");
        System.out.println("Ingrese el nombre");
        df1.establecerNombres(entrada.nextLine());
        System.out.println("Ingrese el apellido");
        df1.establecerApellidos(entrada.nextLine());
        System.out.println("Ingrese identificacion");
        df1.establecerIdentificacion(entrada.nextLine());
        System.out.println("Ingrese la edad");
        df1.establecerEdad(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese el valor de la factura");
        df1.establecerValorFactura(Double.parseDouble(entrada.nextLine()));
        System.out.println("Ingrese valor iva descuento");
        df1.establecerValorIvaDescuento(Double.parseDouble(entrada.nextLine()));
        df1.calcularValorCancelar();
        System.out.println("-----------------");
        System.out.printf("%s", df1);

    }
}
