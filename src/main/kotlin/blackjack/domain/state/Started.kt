package blackjack.domain.state

import blackjack.domain.Card
import blackjack.domain.Cards
import blackjack.domain.Score

open class Started(
    override val cards: Cards = Cards()
) : State {
    override fun draw(card: Card): State {
        return Hit(cards + card)
    }

    override fun stand(): State {
        return Stand(cards)
    }

    override fun scoring(): Score {
        return Score(cards)
    }
}
