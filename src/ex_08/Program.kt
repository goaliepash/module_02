package ex_08

/*
    Задание 8: Проценты по вкладу

    Напишите программу для расчета дохода по вкладу.
    Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
    Программа выводит в консоль информацию по каждому месяцу отдельно. Информация отображает: на сколько будет
    увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.
 */

fun main() {
    print("Сумма вклада: ")
    var depositAmount: Double = readLine()!!.toDouble()

    print("Длительность вклада (количество месяцев): ")
    val duration: Int = readLine()!!.toInt()

    print("Ежемесячный процент: ")
    val monthlyPercent: Double = readLine()!!.toDouble()

    for (i in 1..duration) {
        val income: Double = (depositAmount * monthlyPercent) / 100
        depositAmount += income
        println("$i-й месяц:\nСумма вклада: $depositAmount\nПрибыль: $income\n")
    }
}