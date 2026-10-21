fun main() {
    // Create a mutable list for the deck
    val deck = mutableListOf<Card>()

    // Populate with 52 standard playing cards
    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck.add(Card(rank, suit))
        }
    }

    // Shuffle the deck randomly
    deck.shuffle()

    // Print the full name of each card
    for (card in deck) {
        println(card.fullName)
    }
}