package com.example.bankaccountprogram

fun main(){
    val alpysBankAccount = BankAccount("Alpy", 1178.12)
    println(alpysBankAccount.accountHolder)
    alpysBankAccount.deposit(1.0)
    println(alpysBankAccount.balance)
    alpysBankAccount.displayTransactionHistory()
    alpysBankAccount.withdraw(2.0)
    alpysBankAccount.displayTransactionHistory()
    println("${alpysBankAccount.accountHolder}'s balance is ${alpysBankAccount.balance}")
}
