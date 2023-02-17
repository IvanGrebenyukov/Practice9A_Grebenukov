import Phone.*
class IntercityCall(var region: String, phonenumber: String, duration_of_call: Int, dateoftalk: String, citycode: Int): PhoneCall(phonenumber, duration_of_call, dateoftalk, citycode)
{
    private var result: Double = 0.0
    private var total: Double = 0.0
    fun RegionName()
    {
        println("Вы звоните в регион $region!")
    }
    fun Callprice(): Double
    {
        while(true)
        {
            try
            {
                var price_of_call: Double = CallMinute()
                when{
                    (region == "Москва" || region == "москва") -> {
                        result = duration_of_call  * price_of_call * 2
                        println("Цена за разговор в вашем регионе = $result")
                        return result
                    }
                    (region == "Питер" || region == "питер") ->
                    {
                        result = duration_of_call  * price_of_call * 1.5
                        println("Цена за разговор в вашем регионе = $result")
                        return result
                    }
                    (region == "Другое" || region == "другое") ->
                    {
                        result = duration_of_call  * price_of_call
                        println("Цена за разговор в вашем регионе = $result")
                        return result
                    }
                    else -> throw Exception("Неправильный ввод")
                }
                break
            }
            catch (e:Exception){
                println(e.message)
            }

        }
    }
    fun CostPerHour()
    {
        total = Callprice()
        result = (total / duration_of_call) * 60
        println("количество рублей за час разговора = $result")

    }
}