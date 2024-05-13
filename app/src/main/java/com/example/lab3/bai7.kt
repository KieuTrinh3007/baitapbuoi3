package com.example.lab3

import com.example.lab3.model_bai7.CBGV

fun main() {

    var listCBGV = mutableListOf<CBGV>()

    val cbgv = CBGV("GV01", "Bui Thanh Nguyen", 30, "Nam Dinh", 15000.0, 10200.0, 200.0)
    val cbgv1 = CBGV("GV02", "Trinh Xuan Mai", 25, "Nam Dinn", 20000.0, 10200.0, 200.0)

    listCBGV.add(cbgv)
    listCBGV.add(cbgv1)

    do {
        println("------Chuc nang-------")
        println("1. Xem danh sach giao vien")
        println("2. Them giao vien")
        println("3. Xoa giao vien")
        println("4. Tinh luong thuc linh giao vien")

        print("Moi chon chuc nang: ")
        var s = readLine()!!.toInt()

        when (s) {
            1 -> {
                getThongTin(listCBGV)
            }

            2 -> {
                addGV(listCBGV)
                getThongTin(listCBGV)
            }

            3 -> {
                deleteGV(listCBGV)
                getThongTin(listCBGV)
            }

            4 -> {
                luonglinhthuc(listCBGV)
            }

            else -> println("Chuc nang khong ton tai")
        }

        print("Ban co muon tiep tuc khong? (y/n): ")
        if (readLine().equals("n"))
            break
    } while (true)
}

fun getThongTin(listCBGV: MutableList<CBGV>) {
    println("Danh sach giao vien")
    for (gv in listCBGV) {
        println(
            "Ma giao vien: ${gv.maGV}, Ho ten: ${gv.hoTen}, Tuoi: ${gv.tuoi}, Dia chi: ${gv.queQuan}, " +
                    "Lương cứng: ${gv.luongCung}, Tiền thưởng: ${gv.luongThuong}, Tiền phạt:  ${gv.tienPhat} "
        )
    }
}

fun addGV(listCBGV: MutableList<CBGV>) {
    print("Nhap ma giao vien: ")
    var magv = readLine()
    print("Nhap ho ten giao vien: ")
    var hoten = readLine()
    print("Nhap tuoi giao vien: ")
    var tuoi = readLine()!!.toInt()
    print("Nhap que quan: ")
    var quequan = readLine()
    print("Nhap luong giao vien: ")
    var luongcung = readLine()!!.toDouble()
    print("Nhap tien thuong: ")
    var tienthuong = readLine()!!.toDouble()
    print("Nhap tien phat: ")
    var tienphat = readLine()!!.toDouble()

    val cbgv = CBGV(magv!!, hoten!!, tuoi, quequan!!, luongcung, tienthuong, tienphat)

    listCBGV.add(cbgv)
}

fun deleteGV(listCBGV: MutableList<CBGV>) {
    print("Nhap ma giao vien can xoa: ")
    var magv = readLine()

    var check = false

    for (gv in listCBGV) {
        if (gv.maGV.equals(magv)) {
            listCBGV.remove(gv)
            check = true
            break
        }
    }

    if (check == false)
        println("Giao vien khong ton tai")
}

fun luonglinhthuc(listCBGV: MutableList<CBGV>) {
    for (gv in listCBGV) {
        println("Luong cua giao vien ${gv.hoTen} la: ${gv.luongThucLinh()}")
    }
}