import Phone.*
class InternetCall(var count_gigabyte: Double, var app: String, var gigabyte_per_minute: Double, phonenumber: String, duration_of_call: Int): PhoneCall(phonenumber, duration_of_call)
{
    private var result: Double = 0.0

    fun CallApp()
    {
        println("Вы звоните в приложении под названием $app на номер $phonenumber")
    }
    fun GigabytesSpent(): Double
    {
          result = gigabyte_per_minute * duration_of_call
          println("Вы потратили ${String.format("%.2f", result)} ГБ")
          return result
    }
    fun RemainingGigabytes()
    {
        result = count_gigabyte - GigabytesSpent()
        if(result < 0)
            println("Вы в долгах! У вас осталось $result ГБ")
        else
            println("У вас осталось $result ГБ")
    }
}