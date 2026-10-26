/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Nga
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Tren lop");
        HinhTron ht1 = new HinhTron(1, 1, 3.5);
        HinhTron ht2 = new HinhTron(2, 2, 4.8);
        System.out.println(ht1);
        System.out.println(ht2);
        System.out.println("dien tich hinh tron 1 la: " + ht1.dienTich());
        System.out.println("dien tich hinh tron 2 la: " + ht2.dienTich());
        //cho biet hinh nao co dien tich lon hon
        if (ht1.dienTich() > ht2.dienTich()) {
            System.out.println("Hinh tron 1 co dien tich lon hon");
        }
        //nhap vao mot gia tri d, tinh tien hinh tron theo gia tri d
        ht1.tinhTien(0.8);
        System.out.println(ht1);

        System.out.println("Bai Tap 1");

        Scanner sc = new Scanner(System.in);
        ArrayList<BaiTap1> ds = new ArrayList<>();

        System.out.print("Nhap so luong phan so: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(
                    "So luong phan so phai lon hon 0!"
            );
            sc.close();
            return;
        }

        // Nhap danh sach phan so
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Nhap phan so thu " + (i + 1)
            );

            System.out.print("Tu so: ");
            int tu = sc.nextInt();

            int mau;
            do {
                System.out.print("Mau so: ");
                mau = sc.nextInt();

                if (mau == 0) {
                    System.out.println(
                            "Mau so phai khac 0!"
                    );
                }
            } while (mau == 0);

            ds.add(new BaiTap1(tu, mau));
        }

        // In danh sach
        System.out.println("\nDanh sach phan so:");
        for (BaiTap1 ps : ds) {
            System.out.print(ps + "  ");
        }

        // Tim phan so lon nhat
        BaiTap1 max = ds.get(0);

        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).soSanh(max) > 0) {
                max = ds.get(i);
            }
        }

        System.out.println(
                "\nPhan so lon nhat: " + max
        );

        // Tinh tong cac phan so
        BaiTap1 tong = new BaiTap1();

        for (BaiTap1 ps : ds) {
            tong = tong.cong(ps);
        }

        System.out.println(
                "Tong cac phan so: " + tong
        );

        // Dem phan so khong phai so nguyen
        int dem = 0;

        for (BaiTap1 ps : ds) {
            if (!ps.laSoNguyen()) {
                dem++;
            }
        }

        System.out.println(
                "So phan so khong phai so nguyen: " + dem
        );

        sc.close();
    }

}
