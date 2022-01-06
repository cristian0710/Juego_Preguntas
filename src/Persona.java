import java.util.Scanner;

public class Persona {
    private String nombre;
    private double premio=0;
    private boolean rendirse;
    Scanner sc = new Scanner(System.in);

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        String nom;
        System.out.println("Digite nombre: ");
        nom = sc.nextLine();
        //nom = sc.toString();
        this.nombre = nom;
    }

    public double getPremio() {
        return premio;
    }

    public void aumentarPremio(double premio){
        this.premio += premio;
    }

    public void quitarPremio(){
        this.premio = 0;
    }

    public void setRendirse(boolean rendirse) {
        this.rendirse = rendirse;
    }

}
