class Conta(
    var titular: String,
    val numero: Int = 0
) {

    var saldo = 0.0
        internal set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun testaCondicoes(saldo: Double) {


        if (saldo > 0.0) {
            println("Saldo positivo")
        } else if (saldo == 0.0) {
            println("conta zerada")
        } else {
            println("cheque especial")
        }
    }

    fun deposito(valor: Double) {
        this.saldo += valor
    }

    fun saque(saca: Double) {
        this.saldo -= saca
        if (saldo < 0) {
            println("cheque especial")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true

        }
        return false
    }

}
