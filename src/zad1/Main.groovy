/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad1;

new URL('http://wiki.puzzlers.org/pub/wordlists/unixdict.txt').getText().split("\n").collect { it.trim() }
        .groupBy { word -> word.iterator().countBy { it } }
        .collectMany { _, allAnagrams ->
            allAnagrams.collect { [it, (allAnagrams - it).sort()] }
        }
        .collectEntries()
        .findAll { it.value.size() > 0 } // remove words which don't have anagrams
        .sort { a1, a2 ->
            a1.value.size() == a2.value.size() ? a1.key.compareTo(a2.key) : a2.value.size() - a1.value.size() }
        .each { println("$it.key: ${it.value.join(' ')}") }
