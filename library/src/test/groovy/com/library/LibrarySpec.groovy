package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString () {
when: "library has Location and opening hours"

def library=new Library(
location:'Sheffield',
openingHours:'09:00-17:00')

then:"the to String metod will merge them"

library.toString()=='Sheffield, 09:00-17:00'    

expect:"fix me"
            true == false
    }
}
