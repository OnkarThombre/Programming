#include<iostream>
#include<string>
using namespace std;

class Person {
public:
	string name;
	int age;

	Person(string name , int age)
	{
		this->name = name;
		this->age = age;
	}

	void display()
	{
		cout << "Display from Person \n name = " <<name << " age = " <<age << endl;
	}
};

class Teacher : Person
{
public :
	//string name;
	string dept;
	string sub;
	//int age;
private:
	double sal;
public :
	Teacher(string name, int age , string dept = "unknown" , string sub = "unknown") : Person(name , age)
	{
		this->dept = dept;
		this->sub = sub;
	}
	
	void display()
	{
		cout << "from derived Teacher " << endl;
		cout << "name : " << name << "\nage : " << age << "\ndept " << dept << "\nsub " <<sub << endl;
	}
};

int main4()
{
	Teacher t1("Boss", 23); // , "CSE" , "java");
	//t1.display();
	//t1.display();
	//cout << t1.name << t1.dept << t1.sub << t1.age;  // shadowing
	//cout  << t1.dept << t1.sub <<endl;
	Teacher t2(t1);
	t2.display();
	
	return 0;
}


