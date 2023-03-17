fun main() {


    val contaAlex = Conta(titular = "Alex", numero = 2432)
    contaAlex.deposita(valor=655.6)

    val contaFran = Conta(titular = "Fran", numero = 5336)
    contaFran.deposita(valor=441.1)

    println("Nome titular: ${contaFran.titular}")
    println("Numero da conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
    println("---------------------------------------")

    println("Nome titular: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println("---------------------------------------")

    println("Depositando conta Alex")
    contaAlex.deposita(valor = 21.12)
    println(contaAlex.saldo)
    println("---------------------------------------")

    println("depositando conta Fran")
    contaFran.deposita(valor = 64.23)
    println(contaFran.saldo)
    println("---------------------------------------")

    println("Sacando conta Alex")
    contaAlex.saca(valor = 200.0)
    println("---------------------------------------")

    println("Sacando conta Fran")
    contaFran.saca(valor = 233.5)
    println("---------------------------------------")

    println("Saldo conta Alex ${contaAlex.saldo}")
    println("Saldo conta Fran ${contaFran.saldo}")
    println("---------------------------------------")

    println("Transferencia conta fran pra alex")
    if (contaFran.transfere(valor=1100.0, contaAlex)){
        println("Sucesso")
    }else{
        println("Falha")
    }
    println("---------------------------------------")

    println("Saldo conta Alex ${contaAlex.saldo}")
    println("Saldo conta Fran ${contaFran.saldo}")

    println("---------------------------------------")

}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }
    fun deposita(valor: Double) {
        this.saldo += valor
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        } else {
            return false
        }
    }
//    fun getSaldo(): Double{
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        if (valor > 0){
//        saldo = valor
//        }
//    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta(titular = "João", numero = 4588)
    var contaMaria = Conta(titular = "Maria", numero = 8744)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

}

fun testaLacos() {
    var i = 0
    while (i < 0) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + 1
        var saldo = i + 10

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo $saldo")
        println()
    }
}