/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi3;

/**
 *
 * @author Nguyen Nga
 */
public class BaiTap1 {

    private int tuSo;
    private int mauSo;

    //ham tao
    public BaiTap1() {
        tuSo = 0;
        mauSo = 1;
    }

    //ham tao co doi
    public BaiTap1(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    @Override
    public String toString() {
        return "BaiTap1{" + "tuSo=" + tuSo + ", mauSo=" + mauSo + '}';
    }

    //tim uoc chung lon nhat
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //rut gon phan so
    public void rutGon() {
        int ucln = UCLN(tuSo, mauSo);

        if (ucln != 0) {
            tuSo = tuSo / ucln;
            mauSo = mauSo / ucln;
        }

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    //cong hai phan so
    public BaiTap1 cong(BaiTap1 ps) {
        BaiTap1 kq = new BaiTap1(tuSo * ps.mauSo + ps.tuSo * mauSo, mauSo * ps.mauSo);
        kq.rutGon();
        return kq;
    }

    //tru hai phan so
    public BaiTap1 tru(BaiTap1 ps) {
        BaiTap1 kq = new BaiTap1(tuSo * ps.mauSo - ps.tuSo * mauSo, mauSo * ps.mauSo);
        kq.rutGon();
        return kq;
    }

    //nhan hai phan so
    public BaiTap1 nhan(BaiTap1 ps) {
        BaiTap1 kq = new BaiTap1(tuSo * ps.tuSo, mauSo * ps.mauSo
        );
        kq.rutGon();
        return kq;
    }

    //chia hai phan so
    public BaiTap1 chia(BaiTap1 ps) {
        if (ps.tuSo == 0) {
            System.out.println("Khong the chia cho 0!");
            return new BaiTap1();
        }

        BaiTap1 kq = new BaiTap1(tuSo * ps.mauSo, mauSo * ps.tuSo);
        kq.rutGon();
        return kq;
    }

    // So sanh hai phan so
    public int soSanh(BaiTap1 ps) {
        long a = (long) tuSo * ps.mauSo;
        long b = (long) ps.tuSo * mauSo;

        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
    
    //kiem tra phan so co phai so nguyen
    public boolean laSoNguyen() {
        return tuSo % mauSo == 0;
    }
    
    
    
}
