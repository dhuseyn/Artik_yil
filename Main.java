import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        System.out.print("Yıl giriniz : ");
        Scanner inp = new Scanner(System.in);
        year = inp.nextInt();

        if (year%4==0) {
            if (year%400!=0 && year%100==0) {
                System.out.println("Artık yıl değil...");
            } else System.out.println("Artık yıl..:)");
        }else System.out.println("Artık yıl değil");
    }
}