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