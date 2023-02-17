package Phone

import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class PhoneCall(_phonenumber:String)
{
    var phonenumber = _phonenumber
    var dateoftalk: String = "12.05.2022"
    var duration_of_call: Int = 10
    var citycode: Int = 777

    constructor(_phonenumber: String, _duration_of_call: Int): this(_phonenumber)
    {
        duration_of_call = _duration_of_call
    }
    constructor(_phonenumber: String, _duration_of_call: Int, _dateoftalk: String, _citycode: Int): this(_phonenumber)
    {
        phonenumber = _phonenumber
        duration_of_call = _duration_of_call
        dateoftalk = _dateoftalk
        citycode = _citycode
    }

    fun Input() {
        println("введите номер телефона без +7")
        while (true) {
            var correct: Boolean = true
            phonenumber = readLine()!!.toString()
            if (phonenumber.length != 10)
                println("номер должен состоять всего из 12 символов с учетом +7")
            else {
                for (i in 0..phonenumber.length - 1) {
                    if (!phonenumber[i].isDigit()) {
                        correct = false
                    }
                }
                if (correct == false) {
                    println("номер должен состоять только из цифр")
                } else
                    break
            }
        }
        println("введите дату разговора в формате dd.MM.yyyy")
        while (true) {
            try {
                dateoftalk = readLine()!!.toString()
                val dateFormatInput1 = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                val date1: LocalDate = LocalDate.parse(dateoftalk, dateFormatInput1)
                dateoftalk = date1.toString()
                break
            } catch (e: Exception) {
                println("Введите дату правильно")
            }
        }
        println("Введите продолжительность звонка в минутах")
        while (true) {
            try {
                duration_of_call = readLine()!!.toInt()
                if (duration_of_call < 0)
                    println("Продолжительность звонка не может быть меньше нуля")
                else
                    break
            } catch (e: Exception) {
                println("Введите число")
            }
        }
        println("Введите код города")
        while (true) {
            try {
                citycode = readLine()!!.toInt()
                while (citycode !in 100..999) {
                    println("Код города в диапозоне от 0 до 999")
                }
                break

            } catch (e: Exception){
                println("код - трехзначное число")
            }


        }
    }

    fun Output()
    {
        println("Номер Телефона +7${phonenumber}")
        println("Дата разговора: ${dateoftalk}")
        println("Продолжительность разговора: ${duration_of_call}")
        println("Код региона: ${citycode}")

    }

    fun CallMinute(): Double
    {
        println("Введите стоимость за минуту звонка в рублях")
        var price: Double
        while(true)
        {
            try
            {
                price = readLine()!!.toDouble()
                if(price<0)
                {
                    println("стоимость не может быть меньше нуля")
                }
                else
                {

                    println("Стоимость минуты звонка = $price")
                    return price
                }

            }
            catch (e:Exception)
            {
                println("Вы ввели не число")
            }
        }
    }

    fun WhereDoICall()
    {
        println("Вы звоните на номер $phonenumber")
    }
}