import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int aleatorio(int a, int b){
        int min_val = a;
        int max_val = b;
        Random ran = new Random();
        int x = ran.nextInt(max_val+1) + min_val;
        return x;
    }


    public static void main (String[] args){
        int ronda = 1;
        int x;
        char respuesta;
        char respuesta2;
        Scanner sc = new Scanner(System.in);
        String nombre;
        double premio;

        Persona jugador = new Persona();
        List<Preguntas> categoria1 = new ArrayList<Preguntas>();
        List<Respuestas> categoria1R = new ArrayList<Respuestas>();
        List<Preguntas> categoria2 = new ArrayList<Preguntas>();
        List<Respuestas> categoria2R = new ArrayList<Respuestas>();
        List<Preguntas> categoria3 = new ArrayList<Preguntas>();
        List<Respuestas> categoria3R = new ArrayList<Respuestas>();
        List<Preguntas> categoria4 = new ArrayList<Preguntas>();
        List<Respuestas> categoria4R = new ArrayList<Respuestas>();
        List<Preguntas> categoria5 = new ArrayList<Preguntas>();
        List<Respuestas> categoria5R = new ArrayList<Respuestas>();

        Preguntas pre1 = new Preguntas("1. Cuál de estos es un animal vertebrado?");
        Preguntas pre2 = new Preguntas("2. Cuál de estos es un animal invertebrado?");
        Preguntas pre3 = new Preguntas("3. Cual de estos animales es mamífero?");
        Preguntas pre4 = new Preguntas("4. Cual de estos animales es un reptil?");
        Preguntas pre5 = new Preguntas("5. Cual es un animal acuático?");
        Respuestas resPre1 = new Respuestas("mosca","lombriz","gato","abeja",'c');
        Respuestas resPre2 = new Respuestas("Mosca", "León", "Jirafa","Lagartija",'a');
        Respuestas resPre3 = new Respuestas("Perro", "Gusano", "Mariposa", "Trucha",'a');
        Respuestas resPre4 = new Respuestas("Gato", "Pantera","Cocodrilo", "Elefante",'c');
        Respuestas resPre5 = new Respuestas("Gavilán", "Liebre", "Zancudo","Tiburón",'d');

        categoria1.add(pre1);
        categoria1.add(pre2);
        categoria1.add(pre3);
        categoria1.add(pre4);
        categoria1.add(pre5);
        categoria1R.add(resPre1);
        categoria1R.add(resPre2);
        categoria1R.add(resPre3);
        categoria1R.add(resPre4);
        categoria1R.add(resPre5);

        Preguntas pre1C2 = new Preguntas("1.Cual de estos no es un dialecto colombiano?");
        Preguntas pre2C2 = new Preguntas("2.Cual no es una tribu indígena?");
        Preguntas pre3C2 = new Preguntas("3.Cual no pertenece a música colombiana?");
        Preguntas pre4C2 = new Preguntas("4.Cual es la bebida nacional?");
        Preguntas pre5C2 = new Preguntas("5.Cual de estas no pertenece a la gastronomía colombiana?");
        Respuestas resPre1C2 = new Respuestas("Español costeño", "Español paisa","Español cachaco","Español vallecaucano",'c');
        Respuestas resPre2C2 = new Respuestas("Wayuu", "Guámbianos","Ticuna","Mayas",'d');
        Respuestas resPre3C2 = new Respuestas("Rock", "Bambuco", "Porro", "Cumbia", 'a');
        Respuestas resPre4C2 = new Respuestas("Gaseosa", "Cerveza", "Ron", "Café", 'd');
        Respuestas resPre5C2 = new Respuestas("Sancocho de gallina","Arroz chino", "Arepas de maíz","Tamales",'b');

        categoria2.add(pre1C2);
        categoria2.add(pre2C2);
        categoria2.add(pre3C2);
        categoria2.add(pre4C2);
        categoria2.add(pre5C2);
        categoria2R.add(resPre1C2);
        categoria2R.add(resPre2C2);
        categoria2R.add(resPre3C2);
        categoria2R.add(resPre4C2);
        categoria2R.add(resPre5C2);

        Preguntas pre1C3 = new Preguntas("1.Cual es el viejo continente?");
        Preguntas pre2C3 = new Preguntas("2.En que continente se encuentra china?");
        Preguntas pre3C3 = new Preguntas("3.El principado de Mónaco se encuentra en?");
        Preguntas pre4C3 = new Preguntas("4.Capital de Egipto?");
        Preguntas pre5C3 = new Preguntas("5.En que continente esta Somalia?");
        Respuestas resPre1C3 = new Respuestas("Rusia","América", "Europa", "Antártida", 'c');
        Respuestas resPre2C3 = new Respuestas("Asia", "África", "Europa", "América", 'a');
        Respuestas resPre3C3 = new Respuestas("Alemania", "Francia", "Italia", "España", 'b');
        Respuestas resPre4C3 = new Respuestas("El cairo", "Cartago", "Madrid", "Quena",'a');
        Respuestas resPre5C3 = new Respuestas("América", "África", "Asia", "Europa", 'b');

        categoria3.add(pre1C3);
        categoria3.add(pre2C3);
        categoria3.add(pre3C3);
        categoria3.add(pre4C3);
        categoria3.add(pre5C3);
        categoria3R.add(resPre1C3);
        categoria3R.add(resPre2C3);
        categoria3R.add(resPre3C3);
        categoria3R.add(resPre4C3);
        categoria3R.add(resPre5C3);

        Preguntas pre1C4 = new Preguntas("1.Cual es el viejo continente?");
        Preguntas pre2C4 = new Preguntas("2.En que continente se encuentra china?");
        Preguntas pre3C4 = new Preguntas("3.El principado de Mónaco se encuentra en?");
        Preguntas pre4C4 = new Preguntas("4.Capital de Egipto?");
        Preguntas pre5C4 = new Preguntas("5.En que continente esta Somalia?");
        Respuestas resPre1C4 = new Respuestas("Rusia","América", "Europa", "Antártida", 'c');
        Respuestas resPre2C4 = new Respuestas("Asia", "África", "Europa", "América", 'a');
        Respuestas resPre3C4 = new Respuestas("Alemania", "Francia", "Italia", "España", 'b');
        Respuestas resPre4C4 = new Respuestas("El cairo", "Cartago", "Madrid", "Quena",'a');
        Respuestas resPre5C4 = new Respuestas("América", "África", "Asia", "Europa", 'b');

        categoria4.add(pre1C4);
        categoria4.add(pre2C4);
        categoria4.add(pre3C4);
        categoria4.add(pre4C4);
        categoria4.add(pre5C4);
        categoria4R.add(resPre1C4);
        categoria4R.add(resPre2C4);
        categoria4R.add(resPre3C4);
        categoria4R.add(resPre4C4);
        categoria4R.add(resPre5C4);

        Preguntas pre1C5 = new Preguntas("1.Cual es el viejo continente?");
        Preguntas pre2C5 = new Preguntas("2.En que continente se encuentra china?");
        Preguntas pre3C5 = new Preguntas("3.El principado de Mónaco se encuentra en?");
        Preguntas pre4C5 = new Preguntas("4.Capital de Egipto?");
        Preguntas pre5C5 = new Preguntas("5.En que continente esta Somalia?");
        Respuestas resPre1C5 = new Respuestas("Rusia","América", "Europa", "Antártida", 'c');
        Respuestas resPre2C5 = new Respuestas("Asia", "África", "Europa", "América", 'a');
        Respuestas resPre3C5 = new Respuestas("Alemania", "Francia", "Italia", "España", 'b');
        Respuestas resPre4C5 = new Respuestas("El cairo", "Cartago", "Madrid", "Quena",'a');
        Respuestas resPre5C5 = new Respuestas("América", "África", "Asia", "Europa", 'b');

        categoria5.add(pre1C5);
        categoria5.add(pre2C5);
        categoria5.add(pre3C5);
        categoria5.add(pre4C5);
        categoria5.add(pre5C5);
        categoria5R.add(resPre1C5);
        categoria5R.add(resPre2C5);
        categoria5R.add(resPre3C5);
        categoria5R.add(resPre4C5);
        categoria5R.add(resPre5C5);


        //preguntas.mostrarPreguntas(1);

        jugador.setNombre();

        while(ronda<=5){
            System.out.println("desea continuar: 1.Si 2.No");
            int continuar = sc.nextInt();
            if(continuar == 1){
                System.out.println("Pasaste a la ronda "+ronda);
            }else{
                ronda=6;
            }
            switch (ronda){
                case 1:
                    premio = 10000;
                    x = aleatorio(0,4);
                    System.out.println(categoria1.get(x).getPreguntas());
                    System.out.println(categoria1R.get(x).toString());
                    System.out.println("Digiete su respuesta: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextLine().charAt(0);
                    respuesta2 = categoria1R.get(x).getR();
                    if(Character.compare(respuesta,respuesta2)==0){
                        System.out.println("Es correcto acabas de ganar "+premio);
                        jugador.aumentarPremio(premio);
                        ronda=2;
                        break;
                    }else{
                        System.out.println("perdiste");
                        jugador.quitarPremio();
                        ronda=6;
                    }
                    break;
                case 2:
                    premio = 20000;
                    x = aleatorio(0,4);
                    System.out.println(categoria2.get(x).getPreguntas());
                    System.out.println(categoria2R.get(x).toString());
                    System.out.println("Digiete su respuesta: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextLine().charAt(0);
                    respuesta2 = categoria2R.get(x).getR();
                    if(Character.compare(respuesta,respuesta2)==0){
                        System.out.println("Es correcto acabas de ganar "+premio);
                        jugador.aumentarPremio(premio);
                        ronda=3;
                        break;
                    }else{
                        System.out.println("perdiste");
                        jugador.quitarPremio();
                        ronda=6;
                    }
                    break;
                case 3:
                    premio = 30000;
                    x = aleatorio(0,4);
                    System.out.println(categoria3.get(x).getPreguntas());
                    System.out.println(categoria3R.get(x).toString());
                    System.out.println("Digiete su respuesta: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextLine().charAt(0);
                    respuesta2 = categoria3R.get(x).getR();
                    if(Character.compare(respuesta,respuesta2)==0){
                        System.out.println("Es correcto acabas de ganar "+premio);
                        jugador.aumentarPremio(premio);
                        ronda=4;
                        break;
                    }else{
                        System.out.println("perdiste");
                        jugador.quitarPremio();
                        ronda=6;
                    }
                    break;
                case 4:
                    premio = 40000;
                    x = aleatorio(0,4);
                    System.out.println(categoria4.get(x).getPreguntas());
                    System.out.println(categoria4R.get(x).toString());
                    System.out.println("Digiete su respuesta: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextLine().charAt(0);
                    respuesta2 = categoria4R.get(x).getR();
                    if(Character.compare(respuesta,respuesta2)==0){
                        System.out.println("Es correcto acabas de ganar "+premio);
                        jugador.aumentarPremio(premio);
                        ronda=5;
                        break;
                    }else{
                        System.out.println("perdiste");
                        jugador.quitarPremio();
                        ronda=6;
                    }
                    break;
                case 5:
                    premio = 50000;
                    x = aleatorio(0,4);
                    System.out.println(categoria5.get(x).getPreguntas());
                    System.out.println(categoria5R.get(x).toString());
                    System.out.println("Digiete su respuesta: ");
                    sc = new Scanner(System.in);
                    respuesta = sc.nextLine().charAt(0);
                    respuesta2 = categoria5R.get(x).getR();
                    if(Character.compare(respuesta,respuesta2)==0){
                        System.out.println("Es correcto acabas de ganar "+premio);
                        jugador.aumentarPremio(premio);
                        ronda=6;
                        break;
                    }else{
                        System.out.println("perdiste");
                        jugador.quitarPremio();
                        ronda=6;
                    }
                    break;
                default:
            }
        }
        System.out.println("El jugador " + jugador.getNombre() + " Se lleva un total acumulado de: "+ jugador.getPremio());
    }
}
