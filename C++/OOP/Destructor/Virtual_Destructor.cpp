#include<iostream>
using namespace std;

class Device
{
public :
	double length;
	string dName;

	Device()
	{
		cout << " Base class Ctor called" << endl;
	}

	virtual ~Device()
	{
		cout << " Base class Dtor called " << endl;
	}


};

class Laptop : public Device
{
public :
	Laptop()
	{
		cout << " derived class ctor called" << endl;
	}

	~Laptop()
	{
		cout << " derived class Dtor called " << endl;
	}
};

int main()
{
	Device *d = new Laptop();
	
	delete d;
	d = nullptr;     //NULL means 0 here;  null is compile time error so keep nullptr
	return 0;

	//Laptop l;

}

/* o/p 
when no virtual destructor so due to  Pointer it can see only Base class dtor

 Base class Ctor called
 derived class ctor called
 Base class Dtor called

*/

/* o/p

 Since your base class destructor is not virtual, only the base class destructor runs:

Base class Ctor called
Derived class Ctor called
Base class Dtor called   <-- derived dtor NOT called

The Laptop destructor is skipped, which can cause resource leaks if the derived class allocated memory or other resources.
(as our reference is of base* type so it can see only base class dtor at time of object deletion so that time derived class dtor is get skipped
so we need to make base class dtor as virtual
virtual ~Device()
	{
		cout << " Base class Dtor called " << endl;
	}
	
so we need to make base class destructor as virtual so then it gives correct sequence of destructor calling sequence

 Base class Ctor called
 derived class ctor called
 derived class Dtor called
 Base class Dtor called
*/

/* o/p for  

Key points:
Stack-allocated objects always call all destructors in reverse order of construction automatically.
Virtual keyword is not relevant here because the compiler knows the exact type (Derived) at compile time.
Virtual destructors matter only when deleting objects via base class pointer.

Laptop l;   

Base class Ctor called
 derived class ctor called
 derived class Dtor called
 Base class Dtor called
*/
