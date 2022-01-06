public class Respuestas {
    private String a, b, c, d;
    private char r;

    public Respuestas(String a, String b, String c, String d, char r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.r = r;
    }

    public char getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Respuestas{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
