package com.hibernet.cruddemo;

import com.hibernet.cruddemo.dao.StudentDAO;
import com.hibernet.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return args -> {
//			createStudent(studentDAO);

			createMultipleStudent(studentDAO);

//			readStudent(studentDAO);

//			getAllStudents(studentDAO);

//			getByLastName(studentDAO);

//			updateStudentsLastName(studentDAO,2,"Patil");

//			deleteStudent(studentDAO,3);

//			deleteAllStudent(studentDAO);

		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Number of Students deleted: "+studentDAO.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDAO,int id) {
		System.out.println("Deleting "+ studentDAO.findById(id));
		studentDAO.delete(id);
		System.out.println("Deleted successfully...");
	}

	private void updateStudentsLastName(StudentDAO studentDAO,Integer id, String lastName) {
		Student theStudent = studentDAO.findById(id);

		System.out.println("Updating "+ theStudent+"...");
		theStudent.setLastName(lastName);
		studentDAO.update(theStudent);
		System.out.println("Update Successfull..."+studentDAO.findById(id));
	}

	private void getByLastName(StudentDAO studentDAO) {
		List<Student> allStudentsByLastName = studentDAO.findByLastName("Patil");
		System.out.println("Printing all found students\n....");
		for(Student st: allStudentsByLastName){
			System.out.println(st);
		}
	}

	private void getAllStudents(StudentDAO studentDAO) {
		List<Student> allStudents = studentDAO.findAll();
		System.out.println("Printing all found students\n....");
		for(Student st: allStudents){
			System.out.println(st);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object");
		Student tempStudent = new Student("Chetan","patil","chetanpatil@gmail.com");
		System.out.println("Saving std ...");
		studentDAO.save(tempStudent);
		System.out.println("Saved stdId: " + tempStudent.getId());

		System.out.println("\nRetriving the student info...");
		Student std = studentDAO.findById(tempStudent.getId());
        if (std != null) {
            System.out.println("Student found: " + std);
        } else {
            System.out.println("Not found...");
        }
    }

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student...");
		Student tempStudent1 = new Student("raj","Patil","ae@gmail.com");
		Student tempStudent2 = new Student("harry","test","bf@gmail.com");
		Student tempStudent3 = new Student("gin","g","cg@gmail.com");
		Student tempStudent4 = new Student("spring","Patil","dh@gmail.com");
		//save the student object
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

		System.out.println("Saved successfully...");
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student...");
		Student tempStudent = new Student("Chetan","Patil","patilchetan@gmail.com");
		//save the student object
		System.out.println("Saving the objects...");
		studentDAO.save(tempStudent);
		System.out.println("Saved succefull");
	}
}
