fun main(){
    println(workersSalary(12, 2300))
    println(workersSalary(6,1000))
    println(workersSalary(4,500))
}
fun workersSalary(hours :Int, rate : Int ) : Int{
    return hours * rate

}
