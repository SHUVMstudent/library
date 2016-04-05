package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when: "Librarian has a name, username"

def librarian=new Librarian(name:'Noah Dell',
			userName:'Ndell')

then:"the to String method will merge them."
librarian.toString()=='Noah Dell,Ndell'

        expect:"fix me"
            
    }
}
