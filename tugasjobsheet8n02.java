import java.util.Scanner;

/**
 * tugasjobsheet8n02
 */
public class tugasjobsheet8n02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtletPerCabor = 5;
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();
        String[][][] atlet = new String[jumlahPoliteknik][cabangOlahraga.length][jumlahAtletPerCabor];
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama Politeknik ke-" + (i + 1) + ": ");
            String namaPoliteknik = sc.nextLine();
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Masukkan nama 5 atlet untuk cabang olahraga " + cabangOlahraga[j] + " di " + namaPoliteknik + ":");
                for (int k = 0; k < jumlahAtletPerCabor; k++) {
                    System.out.print("Nama atlet ke-" + (k + 1) + ": ");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
            System.out.println();
        }
        System.out.println("Data Nama Atlet yang Mengikuti Porseni Polinema 2024:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik ke-" + (i + 1) + ":");
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Cabang Olahraga: " + cabangOlahraga[j]);
                for (int k = 0; k < jumlahAtletPerCabor; k++) {
                    System.out.println("Atlet ke-" + (k + 1) + ": " + atlet[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}