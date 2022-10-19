import java.util.Scanner;
public class sesi3PBO {
    public static void main (String [] args){

        String nama , nim ;

        int nilai;
        
        char grade;
        Scanner input = new Scanner (System.in);

  System.out.println("===== Menghitung Nilai Mahasiswa=====\n");

        System.out.print("Masukan nama : ");

        nama = input.nextLine();

        System.out.print("Masukan NIM : ");

        nim = input.nextLine();

        System.out.print("Nilai tugas : ");

        nilai = input.nextInt();
        if (nilai >= 90 && nilai <=100){
            grade = 'A';
        }
        else if (nilai > 80 && nilai < 90){
            grade = 'B';
        }
        else if (nilai > 70 && nilai < 80){
            grade = 'C';
        }
        else if (nilai > 60 && nilai < 70){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+nilai+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+nilai+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }

}
