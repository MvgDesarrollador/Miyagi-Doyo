package milibreria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema.");
        System.out.println("Por favor Resgistrate.");
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Apellido: ");
        String apellido = sc.next();
        System.out.println("Documento: ");
        int documento = sc.nextInt();
        System.out.println("Edad: ");
        int edadUsuario = sc.nextInt();
        System.out.println("Telefono: ");
        int telefono = sc.nextInt();
        System.out.println("Direccion: ");
        String direccion = sc.next();


        System.out.println("¿Tiene algun grado o cinturon? 1.Si / 2.No");
        int gradoYCinturon = sc.nextInt();


        if (gradoYCinturon == 1 && edadUsuario < 18) {
            System.out.println("Nombre Completo de Acudiente: ");
            String nombreAcudiente = sc.next();
            System.out.println("Cedula: ");
        }

        System.out.println("Elige tu plan 1.Mensual / 2.Anual");
        int tipoPlan = sc.nextInt();


        float totalDescuentoGradoYCinturon = 0;
        float valorParcial = 0;

        //Validacion Grado y cinturon (CALCULO)
        if (gradoYCinturon == 1 && tipoPlan == 2) {
            System.out.println("Cuantos Kyu haz logrado?");
            int kyu = sc.nextInt();
            float descuento = (kyu * 5);
            totalDescuentoGradoYCinturon = (descuento * 250) / 100;
            valorParcial = 250 - totalDescuentoGradoYCinturon;


        }

        System.out.println("Haz sido alumno anteriormente? 1.Si / 2.No");
        int alumnoAnterior = sc.nextInt();
        int descuentoMensualAlumnoAnterior = 0;
        int descuentoAnualAlumnoAnterior = 0;
        int valorParcialAnual = 0;

        if (alumnoAnterior == 1 && tipoPlan == 1) {
            descuentoMensualAlumnoAnterior = (25 * 7) / 100;
            int valorParcialMensual = 25 - descuentoMensualAlumnoAnterior;
        } else if (tipoPlan == 2) {
            descuentoAnualAlumnoAnterior = (250 * 12) / 100;
            valorParcialAnual = 250 - descuentoAnualAlumnoAnterior;
        }

        System.out.println("Deseas comprar Indumentaria? 1.Si / 2.No");
        int comprarIndumentaria = sc.nextInt();
        int descuentoIndumentaria = 0;
        int valorParcialIndumentaria = 0;
        if (comprarIndumentaria == 1 && tipoPlan == 2) {
            descuentoIndumentaria = (250 * 5) / 100;
            valorParcialIndumentaria = 250 - descuentoIndumentaria;
        }


        System.out.println("Elige medio de pago: 1.Efectivo / 2.Otro medio.");
        int medioPago = sc.nextInt();

        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Edad: " + edadUsuario);
        System.out.println("Telefono: " + telefono);
        System.out.println("Dirrecion: " + direccion);

        float valorTotal = 0;
        //---- Plan Anual
        if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 1
                && alumnoAnterior == 1 && comprarIndumentaria == 1) {
            System.out.println("descuentos aplicados : 5% por rango o cinturon, 12% por ser alumo antiguo y 5% por comprar indumentaria");
            valorTotal =  250 - (totalDescuentoGradoYCinturon + descuentoAnualAlumnoAnterior + descuentoIndumentaria);
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 1
                && alumnoAnterior == 1 && comprarIndumentaria == 2) {
            System.out.println("descuentos aplicados : 5% por rango o cinturon y 12% por ser alumo antiguo ");
            valorTotal = 250 - (totalDescuentoGradoYCinturon + descuentoAnualAlumnoAnterior);
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 2
                && alumnoAnterior == 1 && comprarIndumentaria == 1) {
            System.out.println("descuentos aplicados : 12% por ser alumo antiguo y 5% por comprar indumentaria");
            valorTotal = 250 - (descuentoAnualAlumnoAnterior + descuentoIndumentaria);
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 1
                && alumnoAnterior == 2 && comprarIndumentaria == 1) {
            System.out.println("descuentos aplicados : 5% por rango o cinturon y 5% por comprar indumentaria");
            valorTotal = 250 - (totalDescuentoGradoYCinturon + descuentoIndumentaria);
        }
        //Plan mensual
        else if (medioPago == 1 && tipoPlan == 1 && alumnoAnterior == 1) {
            System.out.println("descuentos aplicados : 7% por ser alumno antiguo");
            valorTotal = 25 - (descuentoMensualAlumnoAnterior);
        }

        //No cumple ninguna
        else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 2
                && alumnoAnterior == 2 && comprarIndumentaria == 2) {
            valorTotal = 250;
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 1
                && alumnoAnterior == 2 && comprarIndumentaria == 2) {
            System.out.println("descuentos aplicados : 5% por rango o cinturon");
            valorTotal = valorParcial;
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 2
                && alumnoAnterior == 1 && comprarIndumentaria == 2) {
            System.out.println("descuentos aplicados : 12% por ser alumo antiguo ");
            valorTotal = valorParcialAnual;
        } else if (medioPago == 1 && tipoPlan == 2 && gradoYCinturon == 2
                && alumnoAnterior == 2 && comprarIndumentaria == 1) {
            System.out.println("descuentos aplicados : 5% por comprar indumentaria");
            valorTotal = valorParcialIndumentaria;
        }


        System.out.println("valor total suscripcion: " + valorTotal);
    }
}



