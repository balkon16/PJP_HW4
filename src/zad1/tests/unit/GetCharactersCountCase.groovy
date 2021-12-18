package zad1.tests.unit

import groovy.test.GroovyTestCase

import zad1.Main

class GetCharactersCountCase extends GroovyTestCase {

    void testAssertions() {
        assertEquals(Main.getCharactersCount("Hello hello"), ["H": 1, "e": 2, "l": 4, "o": 2, "h": 1, " ": 1])
        assertEquals(Main.getCharactersCount(""), [:])
        assertEquals(Main.getCharactersCount("Groovy ."), [".": 1, " ": 1, "o": 2, "v": 1, "y": 1, "r": 1, "G": 1])
    }
}
