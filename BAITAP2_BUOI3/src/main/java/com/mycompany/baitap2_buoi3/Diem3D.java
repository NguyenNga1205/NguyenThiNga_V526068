/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2_buoi3;

/**
 *
 * @author Nguyen Nga
 */
public class Diem3D extends Diem2D{

    private double z;

    public Diem3D() {
        super();
        z = 0;
    }

    public Diem3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //tinh khoang cach giua hai diem 3D
    public double khoangCach3D(Diem3D p) {
        double dx = x - p.x;
        double dy = y - p.y;
        double dz = z - p.z;

        return Math.sqrt(
                dx * dx + dy * dy + dz * dz
        );
    }

    //dinh nghia lai ham doi xung
    @Override
    public Diem3D doiXung() {
        return new Diem3D(-x, -y, -z);
    }

    //tinh tien diem trong khong gian 3D
    public Diem3D tinhTien(
            double dx, double dy, double dz) {
        return new Diem3D(
                x + dx, y + dy, z + dz
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
