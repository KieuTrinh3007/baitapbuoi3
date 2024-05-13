package com.example.lab3

fun main () {
    // khai bao va su dung lambda function

    val soA : Int? = 5
    val soB : Int? = 10

    val tong = tinhTong(soA!!, soB !!)
    val hieu = tinhHieu(soA!!, soB !!)

    println("Tong 2 so $soA và $soB = $tong")
    println("Hieu 2 so $soA và $soB = $hieu")
    println("Binh phuong $soA = ${binhPhuong(soA)}")
    println("Thuong 2 so $soA và $soB = ${tinhThuong(soA.toFloat(), soB.toFloat()) ()}")

    val tenSV = "Pham Kieu Trinh"
    println("In hoa chuoi $tenSV = ${inHoa(tenSV)}")

    val length = tenSV.let{
        val l = it.length
        l
    }

    val a2 = soA.run{
        val kq = this * 2
        kq

    }
    println("Binh phuong so $soA = $a2")

    println("Do dai chuoi $tenSV = $length")


}

val inHoa : (String) -> String = String::uppercase

val tinhTong : (Int, Int) -> Int
        = {soA: Int, soB: Int -> (soA + soB)}

val tinhHieu = {soA: Int, soB: Int -> (soA - soB)}

val binhPhuong : (Int) -> Int = {it * it}

val tinhThuong = {soA: Float, soB: Float -> {
    if(soB == 0f){
       "So bi chia phai khac 0!"
    }else {
        val c = soA / soB
        c
    }
}
}

