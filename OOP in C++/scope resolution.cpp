#include <iostream>
#include <string>
using namespace std;

class human{
 public:
    string name;
    //we can also define the variable name here, 
    string name2="rakib";
    //then it will be overwritten if further defined, 
    //otherwise rakib will be shown
    void display(){
            cout<<"hello "<<name<<endl;
            }
    void intro();        

};

// we can only define functions outside the class using scope resolution, 
//not any variable if its not static variable like if we write
//string human::name="adri" it will give an error becz name is not static variable here

void human :: intro(){
    cout<<"hi "<<human :: name2<<endl;
}

int main(){
    human nusrat;
    nusrat.name="nusrat";
    nusrat.display();
    
    
    human *pritha=new human();
    pritha->name="pritha";
    pritha->display();
    
    human adrita;
    // adrita.name="adrita";
    adrita.intro();
    
    human adrita2;
    adrita.name2="adrita";
    adrita.intro();
    return 0;
}


