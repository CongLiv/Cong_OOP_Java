#include <bits/stdc++.h>

using namespace std;

class Person {
public:
    string name;
    int age;

    Person(){}
    Person(string name)
    {
        cout<<"heslo "<<name<<endl;
    }
    Person(string n, int a){
        name = n;
        age = a;
    }
    void display()
    {
        cout<<"Name: "<<this->name<<endl;
        cout<<"Age: "<<age;
    }
    void getInformation(string name, int age)
    {
        this->name = name;
        this->age = age;
    }



};
int main()
{
    Person a("Duong", 19);

    a.display();

}
