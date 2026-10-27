// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double): BankAccount(holder){

    init {
        require(rate > 0) {"Interest rate must be > 0"}
    }

    fun applyInterest() {
        println("How many years of interest")
        var years = readln().toIntOrNull()

        if(years != null && years >=0){

            for (n in 1..years){
                val interest = ((balance * rate) - balance).toInt()
                deposit(interest)
            }
        println(balance)
        }
    }
}

