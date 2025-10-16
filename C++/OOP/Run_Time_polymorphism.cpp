#include<iostream>
using namespace std;

class Vehicle
{
protected :
	string type;
	int modelNo;

public :
	virtual void start()
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
	void start() override
	{
		cout << "start from car derived" << endl;
	}
};

int main()
{
	Vehicle *v1 = new Car();
	v1->start();
	return 0;
}

/*
o/p
start from car derived
*/
