import Phone.PhoneCall
import Phone.PhoneCall as NewPhoneCall

fun main()
{
    var my_intercity_call: IntercityCall = IntercityCall("Москва", "9536095630", 180, "14.02.2023", 777)
    my_intercity_call.Output()
    my_intercity_call.RegionName()
    my_intercity_call.Callprice()
    my_intercity_call.CostPerHour()
    println("\n")
    var my_internet_call: InternetCall = InternetCall(50.0, "Telegram", 0.01, "9536095630", 70)
    my_internet_call.CallApp()
    my_internet_call.GigabytesSpent()
    my_internet_call.RemainingGigabytes()
    println("\n")
    var phonecall1: PhoneCall = PhoneCall("9536095630")
    var phonecall2: PhoneCall = PhoneCall("9536095630", 100)
    var phonecall3: PhoneCall = PhoneCall("9536095630", 100, "13.02.2023", 333 )
    println("Номер телефона ${phonecall1.phonenumber}")
    println("Номер телефона ${phonecall2.phonenumber}, время разговора ${phonecall2.duration_of_call}")
    println("Номер телефона ${phonecall3.phonenumber}, время разговора в минутах ${phonecall3.duration_of_call}, Дата разговора ${phonecall3.dateoftalk}, код города ${phonecall3.citycode}")
    println("\n")
    var my_phonecall: PhoneCall = PhoneCall("9536095630")
    my_phonecall.Input()
    my_phonecall.Output()
    my_phonecall.CallMinute()
    my_phonecall.WhereDoICall()
}