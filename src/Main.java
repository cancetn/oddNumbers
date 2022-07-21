import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift
         ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        int sayi, toplam=0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Sayi giriniz = ");

            sayi = inp.nextInt();

            if(sayi % 2 == 0 && sayi % 4 == 0){
                toplam = toplam + sayi;

            }

        }while(sayi % 2 == 0);

        System.out.println("Toplam = "+ toplam);

    }
}
