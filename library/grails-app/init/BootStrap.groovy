import com.library*
class BootStrap {

    def init = { servletContext ->

		def librarian1=new Librarian(	name:'Noah Dell',
						email:'NDell@library.co.uk',
						userName:'NDell1',
						password:'ndlibrary',
						telephone:'01850123457').save()

		def library1=new Library(	location:'Sheffield',
						openingHours:'09:00-18:00',
						book:'How to animate 101',
						student:'Jane Armando',
						librarian:'Noah Dell',
						library1.addTolibrarians(Librarian)).save()


		def book1=new Book(		title:'How to animate 101',
						author:'Dr R.Wright',
						isbn:'12qwerty',
						dateBorrowed:'12/04/2016',
						returnDate:'22/04/2016',
						student:'Jane Armando').save()

			
		def student1=new Student(	name:'Jane Armando',
						email:'JaneArmando@student.ac.uk',
						studentid:'JA212',
						course:'Interactive media with Animation').save()



		def course1=new Course(		title:'Interactive media with Animation',
						department:'Computing',
						description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
						tutor:'Joe Jojo',
						code:'IMA101'.save()
					
    }


    def destroy = {
    }
}
