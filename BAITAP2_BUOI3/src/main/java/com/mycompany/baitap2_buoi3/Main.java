/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitap2_buoi3;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Nga
 */
public class Main {

    public static void main(String[] args) {
        // Tao danh sach diem 2D va 3D
        ArrayList<Diem2D> danhSach = new ArrayList<>();
        ArrayList<Diem2D> ds2D = new ArrayList<>();
        ArrayList<Diem3D> ds3D = new ArrayList<>();

        // Tao cac diem 2D
        Diem2D a = new Diem2D(1, 2);
        Diem2D b = new Diem2D(4, 6);

        ds2D.add(a);
        ds2D.add(b);

        // Tao cac diem 3D
        Diem3D c = new Diem3D(1, 2, 3);
        Diem3D d = new Diem3D(4, 6, 3);

        ds3D.add(c);
        ds3D.add(d);

        // Dua cac diem vao danh sach chung
        danhSach.addAll(ds2D);
        danhSach.addAll(ds3D);

        // Tinh tong khoang cach cac diem 2D
        double tong2D = 0;

        for (int i = 0; i < ds2D.size() - 1; i++) {
            tong2D += ds2D.get(i).khoangCach(
                    ds2D.get(i + 1)
            );
        }

        // Tinh tong khoang cach cac diem 3D
        double tong3D = 0;

        for (int i = 0; i < ds3D.size() - 1; i++) {
            tong3D += ds3D.get(i).khoangCach3D(
                    ds3D.get(i + 1)
            );
        }

        System.out.println(
                "Tong khoang cach cac diem 2D: " + tong2D
        );

        System.out.println(
                "Tong khoang cach cac diem 3D: " + tong3D
        );

        // Them cac diem doi xung vao danh sach chung
        for (Diem2D p : ds2D) {
            danhSach.add(p.doiXung());
        }

        for (Diem3D p : ds3D) {
            danhSach.add(p.doiXung());
        }

        // Hien thi danh sach diem
        System.out.println("\nDanh sach diem:");

        for (Diem2D p : danhSach) {
            System.out.println(p);
        }
    }
}
