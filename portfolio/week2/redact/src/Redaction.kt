// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, target: String, redactionChar: Char = 'X'): String {

    val replacement = redactionChar.toString().repeat(target.length)
    return document.replace(target, replacement)






}

