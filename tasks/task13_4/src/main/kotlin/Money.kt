// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int){
operator fun plus(other: Money): Money = Money(
    euros = euros + other.euros + (cents + other.cents) / 100,
    cents = (cents + other.cents) % 100
)

    init {
        require(euros >= 0) {"Euros must be greater than 0"}
    }


    init {
        require(cents >= 0) {"Cents must be greater than 0"}
    }


    init {
        require(cents <= 99) {"Cents cannot be greater than 99"}
    }



}
