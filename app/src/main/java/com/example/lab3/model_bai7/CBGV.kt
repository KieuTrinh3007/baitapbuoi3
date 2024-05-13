package com.example.lab3.model_bai7

class CBGV (maGV: String, hoTen: String, tuoi: Int, queQuan: String, var luongCung: Double, var luongThuong: Double, var tienPhat: Double)
: Nguoi(maGV, hoTen, tuoi, queQuan) {

    fun luongThucLinh(): Double {
        return luongCung + luongThuong - tienPhat
    }
}