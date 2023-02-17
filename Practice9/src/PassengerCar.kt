import Cars.*

class PassengerCar( var consumption_per_one_km: Double, var model: String, brand: String, power: Int): Car(brand, power)
{
    fun BrandAndModel()
    {
        println("Название вашего автомобиля: $brand $model ")
    }
    fun ConsumptionPerHundredKm()
    {
        var result: Double = consumption_per_one_km * 100
        println(result)
    }
    fun Power_Category()
    {
        when(power) {
            in 0..150 -> println("категория А")
            in 150..300 -> println("категория В")
            in 300..450 -> println("категория C")
            in 450..600 -> println("категория D")
            else -> println("категория F")
        }
    }
}