package com.example.lab3

import com.example.lab3.model_bai8.TheMuon

fun main() {
    var listThe = mutableListOf<TheMuon>()

    val tm1 = TheMuon("Bui Thanh Nguyen", 20, "MD18309", "PM01", 10, 30, "Sach01")
    val tm2 = TheMuon("Trinh Xuan Mai", 22, "MD18309", "PM02", 5, 29, "Sach02")

    listThe.add(tm1)
    listThe.add(tm2)

    do {
        println("------Quản lý thẻ mượn-------")
        println("1. Xem danh sach the muon")
        println("2. Them the muon")
        println("3. Xoa the muon")

        print("Moi chon chuc nang: ")
        var s = readLine()!!.toInt()

        when (s) {
            1 -> {
                for ( i in listThe){
                    println(i.getThongTin())
                }
            }
            2 -> {
                addTheMuon(listThe)

            }
            3 -> {
                deleteTheMuon(listThe)

            }

            else -> println("Chuc nang khong ton tai")

        }

        print("Bạn có muốn tiếp tục không ? (y/n): ")
        var check = readLine()
        if (check.equals("n"))
            break
    } while (true)
}

fun addTheMuon(listThe: MutableList<TheMuon>) {
    print("Nhập mã thẻ mượn: ")
    var matm = readLine()
    print("Nhập họ tên sinh viên: ")
    var hoten = readLine()
    print("Nhập tuổi: ")
    var tuoi = readLine()!!.toInt()
    print("Nhập lớp: ")
    var lop = readLine()
    print("Ngày mượn: ")
    var ngaymuon = readLine()!!.toInt()
    print("Hạn trả: ")
    var hantra = readLine()!!.toInt()
    print("Số hiệu sách: ")
    var sohieusach = readLine()

    val tm = TheMuon(hoten!!, tuoi, lop!!, matm!!, ngaymuon, hantra, sohieusach!!)

    listThe.add(tm)

    for ( i in listThe){
        println(i.getThongTin())
    }
}

fun deleteTheMuon(listThe: MutableList<TheMuon>) {
    print("Nhập mã thẻ muượn cần xóa: ")
    var matm = readLine()
    var check = false
    for (tm in listThe) {
        if (tm.mapm.equals(matm)) {
            listThe.remove(tm)
            check = true
            break
        }
    }
    if (check == false)
        println("Thẻ mượn không tồn tại")
    for ( i in listThe){
        println(i.getThongTin())
    }
}