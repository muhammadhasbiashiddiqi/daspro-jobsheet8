import java.util.Scanner;

/**
 * tugasjobsheet8no1
 */
public class tugasjobsheet8no1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print(N + " ");
            }
            System.out.println();
            for (int i = 0; i < N - 2; i++) {
                System.out.print(N + " ");
                for (int j = 0; j < N - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println(N);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(N + " ");
            }
            System.out.println();
        }

    }
}