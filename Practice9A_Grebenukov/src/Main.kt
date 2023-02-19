
import Phone.PhoneCall as NewPhoneCall
import Cars.Car as NewCar
fun main()
{
    println("Введите с каким классом хотите работать(car/phone)")
    var vibor: String = readLine()!!.toString()
    while(vibor != "car" && vibor != "phone")
    {
        println("Введите с каким классом хотите работать(car/phone)")
        vibor = readLine()!!.toString()
    }
    when
    {
        (vibor == "phone") ->
        {
            var my_intercity_call: IntercityCall = IntercityCall("Москва", "9536095630", 180, "14.02.2023", 777)
            my_intercity_call.RegionName()
            my_intercity_call.Callprice()
            my_intercity_call.CostPerHour()
            println("\n")
            var my_internet_call: InternetCall = InternetCall(50.0, "Telegram", 0.01, "9536095630", 70)
            my_internet_call.CallApp()
            my_internet_call.GigabytesSpent()
            my_internet_call.RemainingGigabytes()
            println("\n")
            var phonecall1: NewPhoneCall = NewPhoneCall("9536095630")
            var phonecall2: NewPhoneCall = NewPhoneCall("9536095630", 100)
            var phonecall3: NewPhoneCall = NewPhoneCall("9536095630", 100, "13.02.2023", 333 )
            println("Номер телефона ${phonecall1.phonenumber}")
            println("Номер телефона ${phonecall2.phonenumber}, время разговора ${phonecall2.duration_of_call}")
            println("Номер телефона ${phonecall3.phonenumber}, время разговора в минутах ${phonecall3.duration_of_call}, Дата разговора ${phonecall3.dateoftalk}, код города ${phonecall3.citycode}")
            println("\n")
            var my_phonecall: NewPhoneCall = NewPhoneCall("9536095630")
            my_phonecall.Input()
            my_phonecall.Output()
            my_phonecall.CallMinute()
            my_phonecall.WhereDoICall()
        }
        (vibor == "car") ->
        {
            var my_passenger_car: PassengerCar = PassengerCar(0.2, "X5M", "BMW", 625)
            my_passenger_car.BrandAndModel()
            my_passenger_car.ConsumptionPerHundredKm()
            my_passenger_car.Power_Category()
            println("\nГрузовая машина")
            var my_truck_car: TruckCar = TruckCar(7000.500, "Германия", "MAN", 450)
            my_truck_car.OccupancyPercentage()
            my_truck_car.Capacity_Category()
            my_truck_car.WhereIsItMade()
            println("\n")
            var car1: NewCar = NewCar("Mercedes-Benz")
            var car2: NewCar = NewCar("Porsche", 550)
            var car3: NewCar = NewCar("Lada", 200, 500000.0)
            println("Бренд ${car1.brand}")
            println("Бренд ${car2.brand}, Мощность ${car2.power} ")
            println("Бренд ${car3.brand}, Мощность ${car3.power}, Цена ${car3.price} ")
            println("\nЛегковая машина")
            var my_car: NewCar = NewCar("BMW")
            my_car.Input()
            my_car.Output()
            my_car.Price_Category()
        }
    }
}