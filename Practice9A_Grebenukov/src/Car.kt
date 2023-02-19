package Cars
open class Car(_brand: String)
{
    var brand = _brand
    var power:Int = 400
    var price: Double = 256000.500
    constructor(_model: String, _power: Int): this(_model)
    {
        power = _power
    }
    constructor(_model: String, _power: Int, _price: Double): this(_model, _power)
    {
        price = _price
    }
    fun Input()
    {
        println("Введите марку машины")
        while (true)
        {
            try
            {
                brand = readLine()!!.toString()
                for (i in 0..brand.length - 1) {
                    if (brand[i].isDigit()) {
                        throw Exception("Нельзя писать цифры")
                    }
                }
                break
            }
            catch (e: Exception)
            {
                println(e.message)
            }

        }
        println("введите мощность")
        while (true) {
            try {
                power = readLine()!!.toInt()
                if (power <= 0)
                    println("Мощность не может быть меньше 0")
                else
                    break
            } catch (e: Exception) {
                println("В мощности могут быть только цифры")
            }
        }
        println("Введите стоимость в рублях")
        while(true){
            try {
                price = readLine()!!.toDouble()
                if (price<0)
                    println("стоимость не может быть отрицательной")
                else
                    break
            }
            catch(e:Exception){
                println("в цене могут быть только числа")
            }
        }
    }
    fun Output(){
        println("Название марки - "+ brand)
        println("Мошность = " +power+" л.с.")
        println("Цена = "+price+ " рублей")
    }
    fun Price_Category(){
        when(price){
            in 0.0..500000.0 -> println("Низкая ценовая категория")
            in 500000.0..3000000.0 -> println("Средняя ценовая категория")
            else -> println("Высокая ценовая категория")
        }
    }
}