import java.util.Scanner;

public class programKonverensiSuhu {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan suhu Celcius!:");
        double C = input.nextDouble();

        System.out.println("Masukkan suhu hasil konvert!:");
        System.out.println("1 (farenheit)");
        System.out.println("2 (reamur)");
        System.out.println("3 (kelvin)");
        int konvert = input.nextInt();

        if (konvert == 1){
            double F = (C * 9/5)+32;
            System.out.println("----------");
            System.out.println("C = "+C);
            System.out.println("F = "+F);
            System.out.println("---KONVERT BERHASIL---");
        }
        else if (konvert == 2){
            double R = (C * 4/5);
            System.out.println("----------");
            System.out.println("C = "+C);
            System.out.println("R = "+R);
            System.out.println("---KONVERT BERHASIL---");
        } 
        else if (konvert == 3){
            double K = (273 + C);
            System.out.println("----------");
            System.out.println("C = "+C);
            System.out.println("K = "+K);
            System.out.println("---KONVERT BERHASIL---");
        } 
        else{
            System.out.println("Input tidak valid");
        }

        System.out.println("Konvert selesai");
        
    }
}
