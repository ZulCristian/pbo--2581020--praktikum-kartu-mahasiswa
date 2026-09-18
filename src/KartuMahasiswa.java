import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("NIK (16 digit) : ");
        Long NIK = input.nextLong();

        System.out.printf("Umur : ");
        Integer Umur = input.nextInt();

        System.out.printf("Tinggi badan cm : ");
        Double Tinggi = input.nextDouble();

        System.out.print("Golongan darah  : ");
        char golongandarah = input.next().charAt(0);

        System.out.print("Sudah Menikah  : ");
        boolean sudahMenikah = input.nextBoolean();

        input.nextLine();

        System.out.print("Nama lengkap    : ");
        String namaLengkap = input.nextLine();

        System.out.println();
        System.out.println("===== KARTU MAHASISWA =====");
        System.out.println("Nama      : " + namaLengkap);
        System.out.println("NIK       : " + NIK);
        System.out.println("Umur      : " + Umur + " tahun");
        System.out.println("Tinggi    : " + Tinggi + " cm");
        System.out.println("Gol darah : " + golongandarah);
        System.out.println("Menikah   : " + sudahMenikah);

        input.close();









        }
    }
