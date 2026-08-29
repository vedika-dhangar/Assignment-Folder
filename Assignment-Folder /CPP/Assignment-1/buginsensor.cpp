#include<iostream>
using namespace std;
void resetSensorv1(int reading1, int reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorv2(int &reading1 , int &reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorv3(int *reading1 , int *reading2){
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}

int main(){
    int a = 55 ;
    int b = 12 ;

     cout<<"//call By Value "<<endl;;
     cout<<"Before swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;
     resetSensorv1(a,b);
     cout<<"After swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;
    
     cout<<"//call By Reference "<<endl;;
     cout<<"Before swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;
     resetSensorv2(a,b);
     cout<<"After swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;

     cout<<"//call By Pointer "<<endl;;
     cout<<"Before swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;
     resetSensorv3(&a, &b);
     cout<<"After swapping : "<<"a: "<<a<<" "<<"b: "<<b<<endl;

    return 0;
}