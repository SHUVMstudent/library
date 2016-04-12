package com.library

class Book {
String title
String author
String dateBorrowed
String returnDate
Student student

String toString(){
"$title,$author,$dateBorrowed"
}

    static constraints = {
title()
author()
dateBorrowed()
returnDate()
student()
    }
}
