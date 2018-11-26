import java.util.Arrays;
import java.util.Scanner;
public class baitapmang {
    public static void main(String[] args) {
        int arr[] = new int[5];
        nhapMang(arr);
        inMang(arr);
        //sapSep(arr);
        lonNho(arr);
        daoNguoc(arr);
        chenXoaDauPT(arr);
        chenXoaCuoiPT(arr);
        demMang(arr);
    }

    public static void nhapMang(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu" + i);
            int k = sc.nextInt();
            arr[i] = k;
        }
    }

    public static void inMang(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in cac phan tu");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(+arr[i]);
        }
    }

    public static void sapSep(int arr[]) {
        int tam;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tam = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tam;
                }
            }
        }
    }

    public static void lonNho(int arr[]) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                max = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat la :" + max);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat trong mang la :" + min);
    }

    public static void daoNguoc(int arr[]) {
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
    }
    public static void chenXoaDauPT(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chen phan tu k vao mang");
        int k = sc.nextInt();
        int b[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            b[i + 1] = arr[i];
        }
        b[0] = k;
        System.out.println("phan tu chen vao mang la"+Arrays.toString(b));
        int c[]= new int[arr.length];
        for(int j =0; j<arr.length;j++){
            c[j]=arr[j];
        }
        System.out.println("Xoa phan tu da chen la: "+Arrays.toString(c));
    }
    public static void chenXoaCuoiPT(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chen phan tu k vao mang");
        int k = sc.nextInt();
        int b[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        b[arr.length] = k;
        System.out.println("phan tu da chen cuoi la: "+Arrays.toString(b));
        int c[]=new int [arr.length];
        for(int j=0;j<arr.length;j++){
            c[j]=b[j];
        }
        System.out.println("Xoa phan tu da chen cuoi la: "+Arrays.toString(c));
    }
    public static void demMang(int arr[]){
        int dem =0;
        int phanTu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can dem");
        phanTu= sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==phanTu)
                dem++;
        }
        System.out.println("So lan xuat hien trong mang la : "+dem);
    }

}


