// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of list size=1 is correct" {
        val oneItem = listOf(1.0f)
        median(oneItem) shouldBe (1.0f)
    }
    //this is to test whether it correctly finds the median of a list of size 1

    "Median of list size=2 is correct" {
        val twoItems = listOf(1.0f, 3.0f)
        median(twoItems) shouldBe (2.0f)
    }
    //this is to test whether it correctly finds the median of a list with an even number of elements, taking the average down the middle

    "Median of list size=3 is correct" {
        val threeItems = listOf(1.0f, 3.0f, 5.0f)
        median(threeItems) shouldBe (3.0f)
    }
    //this is to test whether it correctly finds the median of a list with an odd number of elements, taking the middle element

    "Median of list size=4 is correct" {
        val fourItems = listOf(3.0f, 7.0f, 1.0f, 5.0f)
        median(fourItems) shouldBe (4.0f)
    }
    //this is to test whether it correctly finds the median of an even list where the elements are unsorted

    
})
