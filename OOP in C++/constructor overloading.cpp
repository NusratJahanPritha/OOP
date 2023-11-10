#include <iostream>
#include <string>
using namespace std;

class human{
 private:
    int age;
    string name;


public:
human(){ //default constructor
    age=24;
    name="nusrat";
    cout<<"constructor called"<<endl;
}
// when there is any parameterized constructor and default constructor is not defined,
// then it will not be called automatically
human(string xname){
    cout<<"takes name as param"<<endl;
    age=21;
    name=xname;
    
}
human(int xage){
    cout<<"takes age as param"<<endl;
    name="nusrat";
    age=xage;
}
human(string xname, int xage){
    cout<<"takes name and age as param"<<endl;
    name=xname;
    age=xage;
}
void display(){
    cout<<name<<endl<<age<<endl;
}
};

int main(){
    human nusrat;
    nusrat.display();
    
    human avi("avi");
    avi.display();
    
    human asif(11);
    asif.display();
    
    human robi("robi",13);
    robi.display();

return 0;
}


