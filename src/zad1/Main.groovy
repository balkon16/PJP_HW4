/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad1;

static getCharactersCount(String word) {
    def res = [:]
    word.each { res.merge(it, 1, Integer::sum) }
    return res
}

def data = new URL('http://wiki.puzzlers.org/pub/wordlists/unixdict.txt').getText().split("\n").collect { it.trim() }

//data = ["hello",  "abc", "heoll", "def", "olehl"]
def res = data
        .groupBy { getCharactersCount(it) }
        .collect { it.value }

//        .collect {anagrams -> anagrams.each {[it: "abc"]}}
//        .each {map -> map.value.each {println("$it, ${map.value.toSet().minus(it)}")}}
//        .collect {bigMap -> bigMap.each {map -> map.value.each {"$it, ${map.value.toSet().minus(it)}"} }}
//        .collect()
//        .collect {it}
//        .sort {-it.value.size()}
//
//        .collect {it.value }
// TODO: cześć z anagramMap trzeba zmienić na .collect itp.
def anagramMap = [:]
res.each {
    anagrams ->
        anagrams.each {
            anagramMap[it] = anagrams.toSet().minus(it)
        }
}
//println(anagramMap)
//def comp = [ compare: { o1, o2 -> ... } ] as Comparator
// TODO: dla słów o takiej samej liczbie anagramów kolejność alfabetyczna -> Comparator
def comp = [compare: { a1, a2 -> a1.value.size() - a2.value.size() } ] as Comparator

anagramMap
//        .sort(comp)
        .sort { a1, a2 ->
            // TODO: to porównanie jest do kitu
            a1.value.size() == a2.value.size() ? (a1.key > a2.key) <=> false : a2.value.size() - a1.value.size() }
//        .sort { comp}
//        .sort {it.key}
        .each { println("$it.key: $it.value") }


//print(getCharactersCount("hello!"))