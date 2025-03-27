package com.example.bankaccountprogram

fun main(){
    val sarahsBankAccount = BankAccount("Sarah", 0.0)
    sarahsBankAccount.deposit(100.0)
    sarahsBankAccount.acctBalance()
    sarahsBankAccount.withdraw((10.0))
    sarahsBankAccount.acctBalance()
    sarahsBankAccount.deposit(300.0)
    sarahsBankAccount.acctBalance()
    sarahsBankAccount.displayTransactionHistory()
    sarahsBankAccount.acctBalance()
}
