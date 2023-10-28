package kot.CodeWars

fun decodeMorse(code: String): String {
    val listStr = code
        .trim()
        .replace("   ", "  ")
        .split(" ")
    var result = ""
    for(str in listStr){
        if(str.isEmpty()){
            result = "$result "
            continue
        }
            result = "$result${MorseCode[str] ?: ""}"
    }
    return result
}