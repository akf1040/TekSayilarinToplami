import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        sayi=scanner.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i%2==1){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
}