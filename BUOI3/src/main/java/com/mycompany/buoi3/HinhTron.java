/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buoi3;



/**
 *
 * @author Nguyen Nga
 */
public class HinhTron {
    private double x;
    private double y;
    private double r;

    public HinhTron(double x, double y, double r) {
        this.x = 5;
        this.y = 5;
        this.r = 5;
    }

    HinhTron() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "x=" + x + ", y=" + y + ", r=" + r + '}';
    }
    
    public double dienTich(){
        return Math.PI*r*r;
    }
    
    public void tinhTien(double d){
        x+=d;
        y+=d;
    }
    

}
