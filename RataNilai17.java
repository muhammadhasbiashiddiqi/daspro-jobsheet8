import java.util.Scanner;

/**
 * RataNilai17
 */
public class RataNilai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahNilai = 5;   
        int i = 1;

        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            double totalNilai = 0;
            int j = 1;

            while (j <= jumlahNilai) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
                j++;
            }

            double rataNilai = totalNilai / jumlahNilai;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }

    }
}