#include <iostream>
using namespace std;

void callByPominter(int *a , int *b)
{
	*a = 500;
	*b = 800;
}

void callByReference(int &p , int &q)
{
	p = 2000000;
	q = 2000000;
}
void callByValue(int a , int b)
{
	a = 50000;
	b = 5000000;
}

int main()
{
	cout << "-------------callByPominter------------------" << endl;
	int a = 10, b = 20;
	cout << "before call function \n a = " <<a <<"\n b = " <<b << endl;
	callByPominter(&a , &b);
	cout << "AFTER call function \n a = " << a << "\n b = " << b << endl;

	cout << "---------------callByReference----------------"<<endl;

	a = 10, b = 20;
	cout << "before call function \n a = " << a << "\n b = " << b << endl;
	callByReference(a , b);
	cout << "AFTER call function \n a = " << a << "\n b = " << b << endl;

	cout << "---------------CallByValue----------------" << endl;
	a = 10, b = 20;
	cout << "before call function \n a = " << a << "\n b = " << b << endl;
	callByValue(a, b);
	cout << "AFTER call function \n a = " << a << "\n b = " << b << endl;
	return 0;
}

