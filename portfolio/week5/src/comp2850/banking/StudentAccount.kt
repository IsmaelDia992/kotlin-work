package comp2850.banking
const val MAX_OVERDRAFT = 100


class StudentAccount( holder: String, overdraft: Int = 0) : BankAccount(holder) {

    var overdraft: Int = 0
        set(value){
            require(value in 0..MAX_OVERDRAFT) {"Invalid overdraft amount"}            
            field = value
        }
    init {
        require(overdraft in 0..MAX_OVERDRAFT) {"Invalid overdraft amount"}  
        this.overdraft = overdraft
        }

    override fun withdraw(amount: Int){
        require(amount > 0) {"Withdrawal amount must be greater than 0"}
        var total_funds = balance + overdraft
        if (total_funds - amount < 0){
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        else{
            balance -= amount
        }
    }

    fun withdrawalsAllowed(amount: Int = 1): Boolean {
        return balance + overdraft >= amount && amount > 0
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}







