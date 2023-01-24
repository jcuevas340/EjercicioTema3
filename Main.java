public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int c = 10;

        System.out.println("Resultado suma: " + suma(a, b, c));

        Coche miCoche = new Coche();
        System.out.println("Numero de puertas: " + miCoche.incrementoPuertas());
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    public static class Coche {
        public int numeroPuertas = 4;
        public int incrementoPuertas(){
            this.numeroPuertas++;
            return numeroPuertas;
        }
    }
}