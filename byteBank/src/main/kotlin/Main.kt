fun main() {
    println("Bem vindo ao byteBank, qual é o seu nome?")
    //dados da conta 1readLine().toString()
    val conta1 = Conta(readLine().toString(), 123)
    conta1.titular
    conta1.numero
    conta1.saldo = 321.00

    println("Bem vindo ao byteBank, qual é o seu nome?")
    println("bem vindo ${conta1.titular} seu numero de conta é ${conta1.numero} seu saldo é ${conta1.saldo}")
    //testa a condição da conta 1
    // deposito conta 1
    conta1.deposito(valor = 10.00)
    println("novo saldo ${conta1.saldo}")
    //saque conta 1
    conta1.saque(saca = 400.00)
    println("novo saldo ${conta1.saldo}")
    //transferencia de conta1 para conta 1
    if (conta1.transfere(valor = 40.00, destino = conta1)) {
        println("sucesso")
    } else {
        println("não deu")
    }

    println("Bem vindo ao byteBank, qual é o seu nome?")
    //dados conta 2
    val conta2 = Conta(readLine().toString(), 321)
    conta2.titular
    conta2.numero
    conta2.saldo = 123.00

    println("bem vindo ${conta2.titular} seu numero de conta é ${conta2.numero} seu saldo é ${conta2.saldo}")
    //testa condição conta 2
    conta2.testaCondicoes(saldo = conta2.saldo)
    //deposito conta 2
    conta2.deposito(valor = 1.00)
    println("novo saldo ${conta2.saldo}")
    //saque conta 2
    conta2.saque(saca = 1.00)
    println("novo saldo ${conta1.saldo}")
    //trasferencia de conta2 para conta1
    if (conta2.transfere(valor = 40.00, destino = conta1)) {
        println("sucesso")
    } else {
        println("não deu")
    }

}




