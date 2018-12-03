package buoi7;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class java {
    static Random rnd = new Random();
    public static void main(String[] args) {
        int a[][] = new int[3][3];

        nhap(a);
        xuat(a);
        sumMang(a);
        sumCot(a);
        System.out.println("Dong co tong lon nhat "+sumhang(a));
        //random(a);
        daoNguoc(a);
    }

    public static void nhap(int a[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap hang" + i);
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("nhap phan tu" + j);
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void random(int a[][]){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]= rnd.nextInt(10);
            }
        }
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                System.out.print(+a[i][j]);
            }
            System.out.println();
        }
    }
    public static void xuat(int a[][]) {
        System.out.println("Mang vua nhap la");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void sumMang (int a[][]) {
        int tong =0;
        System.out.println("Tong la cua mang la");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                    tong = tong + a[i][j];
            }
        }
        System.out.println(tong);
    }
    public static void sumCot (int a[][]){
        for (int i=0;i<a.length;i++){
            int cot1=0;
            for(int j=0;j<a[0].length;j++){
                cot1= cot1+a[j][i];
            }
            System.out.println("tong cua cot " +i+ "la:" +cot1);

        }
    }
    public static int sumhang (int a[][]){
        int lon =0;
        int t=0;
        for(int i=0;i<a.length;i++) {
            int hang = 0;
            for (int j = 0; j < a[0].length; j++) {
                hang = hang + a[i][j];
            }
            System.out.println("tong cua hang" + i + "la:" + hang);
            if (hang > lon) {
                lon = hang;
                t=i;
            }
        }
        return t;
    }
    public static void daoNguoc(int a[][]) {
        System.out.println("Mang dao nguoc la");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
}
