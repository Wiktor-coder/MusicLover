fun main() {

    var ordinary: Boolean = true
    val constant: Boolean = false
    val discount = 100
    val purchaseAmount = 10_001

    if (constant) {
        if (purchaseAmount <= 1_000) {
            println("Сумма оплаты со скидкой: ${purchaseAmount - (purchaseAmount * 0.01).toInt()}")
        } else if (purchaseAmount >= 1_001 && purchaseAmount <= 10_000) {
            println("Сумма оплаты со скидкой: ${purchaseAmount - (purchaseAmount * 0.01).toInt() - discount}")
        } else if (purchaseAmount >= 10_001) {
            println("Сумма оплаты со скидкой: ${purchaseAmount - (purchaseAmount * 0.06).toInt()}")
        }
        ordinary = false
    }
    if (ordinary) {
        if (purchaseAmount <= 1_000) {
            println("Сумма оплаты со скидкой: $purchaseAmount")
        } else if (purchaseAmount >= 1_001 && purchaseAmount <= 10_000) {
            println("Сумма оплаты со скидкой: ${purchaseAmount - discount}")
        } else if (purchaseAmount >= 10_001) {
            println("Сумма оплаты со скидкой: ${purchaseAmount - (purchaseAmount * 0.05).toInt()}")
        }
    }
}

/***
 * от 0 до 1 000 рублей — скидка не предоставляется
 * от 1 001 до 10 000 рублей — скидка составит 100 рублей (как в лекции)
 * от 10 001 рубля и выше — скидка составит 5% от суммы.
 */