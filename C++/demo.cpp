
#include <iostream>
using namespace std;
class Person
{
    private :
        string name;
        int age;
    public :
    
        Person()
        {
            name = "onkar";
            this->age = 23;
        }
        void display()
        {
            cout<<"name : " << name <<"age : " <<age;
        }
};

int main()
{
    cout<<"Hello World";
    
    Person *p = new Person();
    p->display();
    
    return 0;
}
