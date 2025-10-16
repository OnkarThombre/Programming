#include<iostream>
using namespace std;

class Vehicle
{
protected :
	string type;
	int modelNo;

public :
	void start()
	{
		cout << "start from base vehicle" << endl;
	}

	void goodQuality()
	{
		cout << "good quality" << endl;
	}
};

class Car : public Vehicle
{
public : 
	void start()
	{
		cout << "start from car derived" << endl;
	}
};

int main()
{
	Car c1;

	c1.start();  // derived class start() method get called
	c1.Vehicle::start();  // to call base class method on derived class object Interview Question

	c1.goodQuality();
	return 0;
}

/* output
start from car derived
start from base vehicle
good quality

*/
