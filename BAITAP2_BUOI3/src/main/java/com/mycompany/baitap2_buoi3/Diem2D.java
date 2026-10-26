/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2_buoi3;

/**
 *
 * @author Nguyen Nga
 */
public class Diem2D {

    protected double x;
    protected double y;

    public Diem2D() {
        x = 0;
        y = 0;
    }

    public Diem2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //tinh khoang cach giua hai diem 2D
    public double khoangCach(Diem2D p) {
        double dx = x - p.x;
        double dy = y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    //tim diem doi xung qua goc toa do
    public Diem2D doiXung() {
        return new Diem2D(-x, -y);
    }

    //tinh tien diem
    public Diem2D tinhTien(double dx, double dy) {
        return new Diem2D(x + dx, y + dy);
    }

    @Override
    public String toString() {
        return "Diem2D{" + "x=" + x + ", y=" + y + '}';
    }

}
