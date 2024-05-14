package com.example.lab3

import com.example.lab3.model_bai7.CBGV

fun main() {

    var listCBGV = mutableListOf<CBGV>()

    val cbgv = CBGV("GV01", "Bui Thanh Nguyen", 30, "Ha Noi", 15000f, 10200f, 200f)
    val cbgv1 = CBGV("GV02", "Trinh Xuan Mai", 25, "Nam Dinh", 20000f, 10200f, 200f)

    listCBGV.add(cbgv)
    listCBGV.add(cbgv1)

    do {
        println("------Quản lý giáo viên-------")
        println("1. Xem danh sach giao vien")
        println("2. Them giao vien")
        println("3. Xoa giao vien")
        println("4. Tinh luong thuc linh giao vien")

        print("Moi chon chuc nang: ")
        var s = readLine()!!.toInt()

        when (s) {
            1 -> {
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            2 -> {
                addGV(listCBGV)
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            3 -> {
                deleteGV(listCBGV)
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            4 -> {
                luonglinhthuc(listCBGV)
            }

            else -> println("Chuc nang khong ton tai")
        }

        print("Bạn có muốn tiếp tục không ? (y/n): ")
        if (readLine().equals("n"))
            break
    } while (true)
}

fun addGV(listCBGV: MutableList<CBGV>) {
    print("Nhập mã giáo viên: ")
    var magv = readLine()
    print("Nhập họ tên: ")
    var hoten = readLine()
    print("Nhập tuoi: ")
    var tuoi = readLine()!!.toInt()
    print("Nhập quê quán: ")
    var quequan = readLine()
    print("Nhập lương: ")
    var luongcung = readLine()!!.toFloat()
    print("Nhập tien thưởng: ")
    var tienthuong = readLine()!!.toFloat()
    print("Nhập tiền phat: ")
    var tienphat = readLine()!!.toFloat()

    val cbgv = CBGV(magv!!, hoten!!, tuoi, quequan!!, luongcung, tienthuong, tienphat)

    listCBGV.add(cbgv)
}

fun deleteGV(listCBGV: MutableList<CBGV>) {
    print("Nhập mã giáo viên cần xóa: ")
    var magv = readLine()

    var check = false

    for (gv in listCBGV) {
        if (gv.magv.equals(magv)) {
            listCBGV.remove(gv)
            check = true
            break
        }
    }

    if (check == false)
        println("Giáo viên không tồn tại")
}

fun luonglinhthuc(listCBGV: MutableList<CBGV>) {
    for (gv in listCBGV) {
        println("Lương của giáo viên ${gv.hoten} là: ${gv.luongthuclinh}")
    }
}