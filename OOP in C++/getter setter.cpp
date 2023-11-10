#include <iostream>
#include <string>
using namespace std;

class human{
 private:
    int age;
    int getage(){
        return age-5;
    }

public:
// void display(){
//     cout<<age<<endl;
// }

void display(){
    cout<<getage()<<endl;
}

void setage(int value){
    age=value;
}


};

int main(){
    human nusrat;
    nusrat.setage(25);
    nusrat.display();
    
return 0;
}


