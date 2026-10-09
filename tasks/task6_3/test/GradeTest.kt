// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    //pass
    fun `Mark of 55 gives a Pass`() {

        assertEquals("Pass", grade(55))
    }   

    fun `Mark of 40 gives a Pass`() {

        assertEquals("Pass", grade(40))
    }

    fun `Mark of 69 gives a Pass`() {

        assertEquals("Pass", grade(69))
    }
    //fail
    fun `Mark of 39 gives a Fail`() {

        assertEquals("Fail", grade(39))
    }

    fun `Mark of 20 gives a Fail`() {

        assertEquals("Fail", grade(20))
    }
    
    fun `Mark of 1 gives a Fail`() {

        assertEquals("Fail", grade(1))
    }
    //distinction
    fun `Mark of 70 gives a Distinction`() {

        assertEquals("Distinction", grade(70))
    }

    fun `Mark of 85 gives a Distinction`() {

        assertEquals("Distinction", grade(85))
    }

    fun `Mark of 99 gives a Distinction`() {

        assertEquals("Distinction", grade(99))
    }

    //boundary
    fun `Mark of 100 gives a Distinction`() {

        assertEquals("Distinction", grade(100))
    }

    fun `Mark of 0 gives a Fail`() {

        assertEquals("Fail", grade(0))
    }

    //errors
    fun `Mark of 101 gives a ?`() {

        assertEquals("?", grade(101))
    }

    fun `Mark of -1 gives a ?`() {

        assertEquals("?", grade(-1))
    }
    
    

    
    














}

