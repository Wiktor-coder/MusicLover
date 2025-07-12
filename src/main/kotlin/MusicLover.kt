fun main() {

    val constant: Boolean = true
    val discount = 100
    val purchaseAmount = 10_001

//    Сначала применяем стандартную скидку
    val standardDiscount = if (purchaseAmount <= 1_000) {
        purchaseAmount
    } else if (purchaseAmount <= 10_000) {
        purchaseAmount - discount
    } else {
        purchaseAmount - (purchaseAmount * 0.05).toInt()
    }

//    Затем применяем скидку постоянного покупателя
    val finalAmount = if (constant) {
        standardDiscount - (standardDiscount * 0.01).toInt()
    } else {
        standardDiscount
    }

    println("Сумма оплаты со скидкой: $finalAmount рублей")
}