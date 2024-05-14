package com.example.lab3.model_bai7

public class CBGV : Nguoi  {

    var luongcung: Float
    var luongthuong: Float?
    var tienphat: Float?
    var luongthuclinh: Float = 0f
        get() = luongcung + (luongthuong?:0f) - (tienphat?:0f)

    constructor(
        magv: String,
        hoten: String,
        tuoi: Int?,
        quequan: String,
        luongcung: Float,
        luongthuong: Float?,
        tienphat: Float?
    ) : super(magv, hoten, tuoi, quequan) {
        this.luongcung = luongcung
        this.luongthuong = luongthuong
        this.tienphat = tienphat
    }

    override fun getThongTin(): String {
        return "CBGV:" + super.getThongTin() + ", luong cung: $luongcung, luong thuong: $luongthuong, tien phat: $tienphat"
    }
}