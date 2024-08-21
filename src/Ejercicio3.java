public class Ejercicio3 {

    public static void main(String[] args) {

        int num = 6;
        int res = 0;

        // Solo necesitamos iterar hasta num / 2
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                res += i;
            }
        }

        if (res == num) {
            System.out.println(num + " es un número perfecto");
        } else {
            System.out.println(num + " no es un número perfecto");
        }
    }
}
