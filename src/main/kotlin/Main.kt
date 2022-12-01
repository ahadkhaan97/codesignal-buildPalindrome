fun main() {
    print(solution("abcdc"))
}

fun solution(st: String): String {
    var toBeAdded = ""
    for (i in st.indices) {
        val substring = st.substring(i, st.length)
        if (substring == substring.reversed()) {
            break
        } else {
            toBeAdded += st[i]
        }
    }
    return st + toBeAdded.reversed()
}