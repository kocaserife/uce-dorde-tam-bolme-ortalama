import  java.util.Scanner;
public class bolen {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.


        Scanner sc = new Scanner(System.in);
        int k;
        int sayac=0;
        int ortalama=0;
        double sum=0;

        k = sc.nextInt();
        for (int i = 0; i <= k; i++) {


            if(i %4 ==0  && i %3 ==0){
                sum = sum+i;
                System.out.println(i);
                sayac++;
                sum+=ortalama;

            }

        }

        ortalama= (int) (sum / sayac);

        System.out.println(ortalama);
        System.out.println(sum);




    }
    }

