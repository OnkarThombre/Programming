#include <iostream>
#include<string>
using namespace std;

class Student
{
public :
	string name;
	int age;
	float* marks;
	
	
	Student()
	{
		name = "onkar";
		age = 23;
		marks = new float();
		*marks = 90.90;
	}

	Student(Student &obj) 
	{
		
		this->name = obj.name;
		this->age = obj.age;
		this->marks = obj.marks;  //(*this).marks // so okay
	}

	void display()
	{
		cout << "name : " << name << "\nage : " << age << "\nmarks : " << *marks << endl;//(*this).marks <<endl;
		
	}

	void specialDisplay()
	{
		cout << "specialDisplay()";
		cout << *(this->marks);
	}
};

int main1()
{
	Student s1;
	s1.display();
	
	cout << "----\n";
	Student s2(s1);  // default copy ctor is given by compiler 
	
	s2.display();
	*(s2.marks) = 100;

	cout << "--\n";
	s2.specialDisplay();
	

	/*cout << "----\n";
	s1.display();
	cout << endl;
	cout << "----\n";
	s2.display();*/
	return 0;
}

/*
	(*this).marks  == addrewss
	this->marks == addresss
	cout << s1.marks;   also gives address because marks is also a pointer 
	cout << s1.age; age is not poniter so works well
*/
