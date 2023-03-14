public class Methods {

    public static void sum() {
        System.out.println("Nu ați furnizat niciun număr pentru a calcula suma.");
    }

    public static int sum(int n1, int n2) {
        if (n2 < n1) {
            System.out.println("Numerele sunt introduse în ordinea greșită.");
            return 0;
        } else if (n1 == n2) {
            System.out.println("Numerele introduse sunt egale! ");
            return n1;
        } else {
            int sum = 0;
            for (int i = n1; i <= n2; i++) {
                sum += i;
            }
            System.out.println("Suma numerelor de la " + n1 + " pina la " + n2 + " este: ");
            return sum;
        }
    }

    public static int sum(int n) {
        if (n < 0) {
            System.out.println("Introduceți un număr pozitiv.");
        } else {
            int sum = 0;
            int i = 0;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Suma numerelor de la 0 la " + n + " este: " + sum);
        }

        System.out.println("Numărul care a fost selectat este: ");
        return n;
    }

}
