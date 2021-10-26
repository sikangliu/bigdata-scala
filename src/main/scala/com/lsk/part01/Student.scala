package com.lsk.part01

class Student(name: String, var age: Int) {
    def printInfo(): Unit = {
        println(name + " " + age + " " + Student.school)
    }
}

// 引入伴生对象
object Student {
    val school: String = "qinghua"

    def main(args: Array[String]): Unit = {
        val alice = new Student("zhangsan", 20)
        val bob = new Student("lisi", 23)

        alice.printInfo()
        bob.printInfo()
    }
}
