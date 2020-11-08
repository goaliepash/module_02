package ex_09

/*
    Задание 9: Массив Стран

    Создайте многомерный массив, где в первом массиве хранится названия каких-либо стран, в следующем столицы данных
    стран и в последнем массиве используемая денежная единица. Сохраните информацию минимум по 3 странам и выведите в
    консоль в виде:
    Страна          Столица        Валюта
 */

fun main() {
    val countriesArray: Array<String> = arrayOf("Россия", "Белоруссия", "Узбекистан", "Китай")
    val capitalsArray: Array<String> = arrayOf("Москва", "Минск", "Ташкент", "Пекин")
    val currencyArray: Array<String> = arrayOf("Российский рубль", "Белорусский рубль", "Сом", "Китайский юань")

    val info = arrayOf(countriesArray, capitalsArray, currencyArray)

    println("Страна\tСтолица\tВалюта")
    for (i in info[0].indices) {
        for (j in info.indices) {
            print("${info[j][i]}\t")
        }
        println()
    }
}