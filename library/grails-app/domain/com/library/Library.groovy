package com.library

class Library {
String location
String openingHours
Book book
Student student
Librarian librarian

static hasMany=[librarians:Librarian, books:Book, students:Student]

String toString(){
"$location, $openingHours"
}

    static constraints = {
location()
openingHours()
book()
student()
librarian()
    }
}
