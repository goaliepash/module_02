package ex_10

/*
    Задание 10: Города

    Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
    - Добавить название города в программу.
    - Посмотреть в консоли список всех добавленных городов.
    - Посмотреть список добавленных городов без повторений
    - Выход из программы
    Для хранения используйте коллекцию типа List.
 */

fun main() {
    val cities = arrayListOf<String>()
    while (true) {
        print("1 - добавить город; 2 - список всех городов; 3 - список городов без повторений; 4 - выйти из программы: ")
        when (readLine()!!.toInt()) {
            1 -> {
                print("Город: ")
                cities.add(readLine().toString())
            }
            2 -> {
                if (cities.isEmpty()) {
                    println("Список пуст.")
                    continue
                }
                println("Список всех городов: ")
                for (city in cities) {
                    println(city)
                }
            }
            3 -> {
                val setOfCities = linkedSetOf<String>()
                setOfCities.addAll(cities)
                if (setOfCities.isEmpty()) {
                    println("Список пуст.")
                    continue
                }
                println("Список всех городов без повторений: ")
                for (city in setOfCities) {
                    println(city)
                }
            }
            4 -> {
                println("До свидания!")
                break
            }
        }
    }
}