import java.util.Scanner;

public class Nilaiakhir {
    public static void main(String[] args) {

        Scanner scanner - new Scanner(System.int);

        // Konstanta bobot penilaian
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

        // Input nilai dari pengguna
        System.out.print("Nilai praktikum : ");
        double p = scanner.nextDouble();

        System.out.print("Nilai tugas     : ");
        double t = scanner.nextDouble();

        System.out.print("Nilai MID       : ");
        double m = scanner.nextDouble();

        System.out.print("Nilai final     : ");
        double f = scanner.nextDouble();

        double akhir = p * BOBOT_PRAKTIKUM
                + t * BOBOT_TUGAS
                + m * BOBOT_MID;

        akhir += f * BOBOT_FINAL;

        int dibulatkan = (int) akhir;

        double selisih = akhir - dibulatkan;

        boolean lulus = akhir >= 60;
    }
}