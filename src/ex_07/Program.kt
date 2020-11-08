package ex_07

/*
    Задание 7: Тест

    Напишите тест на любую тему. Пользователь должен вводить номер варианта из предложенных ответов.
    Придумайте минимум 5 вопросов. Вывод результата тестирования должен происходить через оператор when, в виде
    текстового комментария (прим: «Ваши знания истории на крепкую четверку»).
 */

fun main() {
    val answer1 = "988"
    val answer2 = "1242"
    val answer3 = "1380"
    val answer4 = "1861"
    val answer5 = "1941"

    var count = 0

    print("В каком году произошло Крещение Руси: ")
    val userAnswer1: String? = readLine()
    if (userAnswer1.equals(answer1)) {
        count++
    }

    print("В каком году было 'Ледовое побоище': ")
    val userAnswer2: String? = readLine()
    if (userAnswer2.equals(answer2)) {
        count++
    }

    print("В каком году случилась Куликовская битва: ")
    val userAnswer3: String? = readLine()
    if (userAnswer3.equals(answer3)) {
        count++
    }

    print("В каком году отменили Крепостное право: ")
    val userAnswer4: String? = readLine()
    if (userAnswer4.equals(answer4)) {
        count++
    }

    print("В каком году началась Великая Отечественная война: ")
    val userAnswer5: String? = readLine()
    if (userAnswer5.equals(answer5)) {
        count++
    }

    when(count) {
        1 -> println("Вы совсем не знаете отечественную историю.")
        2 -> println("Двойка!")
        3 -> println("Ваши знания отечественной истории на удовлетворительном уровне.")
        4 -> println("Кое-что об истории России Вы знаете.")
        5 -> println("Отличный результат!")
        else -> print("Вы точно из России?")
    }
}