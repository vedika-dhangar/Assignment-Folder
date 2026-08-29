#include<iostream>
using namespace std;
int main(){
    int statusreg = 100;
    int datareg = 50;
    const int* regptr1  = &statusreg;
    cout<<"Statusreg : "<<*regptr1<<endl;
     *regptr1 = 01210011;  //assignment of read-only location '* statusreg'
      regptr1 = &datareg;
     cout<<"datareg : "<<regptr1<<endl;
     *regptr1 = &datareg;
     cout<<"datareg : "<<*regptr1<<endl;  // assignment of read-only location '* regptr1'

     int controlreg = 55;
     int* const regptr2 = &controlreg;
     cout<<"regptr2 : "<<*regptr2<<endl;
     *regptr2 = 654;       
     cout<<"regptr2 : "<<*regptr2<<endl;

     *regptr2 = &statusreg; //error: invalid conversion from 'int*' to 'int' [-fpermissive]
                                        //  *regptr2 = &statusreg;
      
      regptr2 = &statusreg;  //error: assignment of read-only variable 'regptr2'
      cout<<"regptr2 : "<<regptr2;    
      
      const int* const regptr3 = &statusreg;
      cout<<"regptr2 : "<<*regptr3<<endl;
       *regptr3 = 654; // error: assignment of read-only location '*(const int*)regptr3'
       regptr3 = &datareg;  // error: assignment of read-only variable 'regptr3'
       return 0;
}