package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when:"A student has a name, studentid, and email"

def student=new Student(name:'Barron Red',
studentid:'BR00001',
email:'BarronRed@student.ac.uk')

then:"the String method will merge them."

student.toString()=='Barron Red, BR00001, BarronRed@student.ac.uk'
        
expect:"fix me"
            true == false
    }
}
