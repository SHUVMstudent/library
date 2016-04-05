package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A book has a title, author, and dateBorrowed"

def book=new Book(

title:'Web Design 101',
author:'Dave Apples',
dateBorrowed:'18/05/2016')

then:"the to String method will merge them."

book.toString()=='Web Design 101,Dave Apples,18/05/2016'
        expect:"fix me"
            
    }
}
