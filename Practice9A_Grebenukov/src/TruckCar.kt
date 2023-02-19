import  Cars.*
class TruckCar(var load_capacity:Double, var manufacturer_country: String, brand: String,  power: Int): Car(brand , power)
{
    var cargo: Double = 0.0
    fun OccupancyPercentage()
    {
        while(true)
        {
            println("Введите сколько груза у вас загружено")
            try{
                cargo = readLine()!!.toDouble()
                if(cargo > 0 && cargo < load_capacity){
                    var result: Double = (cargo / load_capacity) * 100
                    println("Ваш прицеп загружен на ${String.format("%.2f", result)}%")
                    break
                }
                else
                    println("Введите груз в диапозоне от 0 до $load_capacity")
            }
            catch(e: Exception)
            {
                println("Введите число")
            }
        }
    }
    fun Capacity_Category()
    {
        when(load_capacity) {
            in 0.0..2000.0 -> println("Малая грузоподъемность")
            in 2000.0..5000.0 -> println("Средняя грузоподъемность")
            in 5000.0..16000.0 -> println("Большая грузоподъемность")
            else -> println("Особо большая грузоподъемность")
        }
    }
    fun WhereIsItMade()
    {
        println("Машина бренда $brand произведена в $manufacturer_country")
    }
}