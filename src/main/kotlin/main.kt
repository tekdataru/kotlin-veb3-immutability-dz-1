

fun main() {
    val amount = 10000 //в копейках, 10000 копеек = 100 рублей
    val feeProcent = 75//0.75% от суммы

    var feeSum = amount / 10000 * feeProcent

    if (feeSum < 3500) {
        feeSum = 3500
    }

    println("Коммиссия за перевод ${amount / 100} рублей, составила ${feeSum / 100} рублей")
}

