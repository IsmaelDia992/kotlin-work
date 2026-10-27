// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account1 = SavingsAccount("Ismael", 1.08)
    account1.deposit(1250)
    account1.applyInterest()
    account1.withdraw(50)
    
    val balance1 = account1.balance
    println(balance1)
}
