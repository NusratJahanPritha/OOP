#include <iostream>
#include <string>
using namespace std;

class human{
 private:
    int age;
    string name;


public:
human(){
    age=24;
    name="nusrat";
    cout<<"constructor called"<<endl;
}
void display(){
    cout<<name<<endl<<age<<endl;
}
};

int main(){
    human nusrat;
    nusrat.display();

    
return 0;
}


