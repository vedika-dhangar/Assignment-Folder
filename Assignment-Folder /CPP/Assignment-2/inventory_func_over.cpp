#include<iostream>
using namespace std;

double reordercost(int qty, double unitprice){
    return qty*unitprice;
}

double reordercost(double qty, double unitprice){
    return qty*unitprice;
}

double reordercost(int qty, double unitprice,double taxRate){
    double cost = qty*unitprice;
    double tax = cost*taxRate/100;
    return cost+tax;
}

double applyDiscount(double price, double discountPercent = 10.0)
{
    double discount = price * discountPercent / 100;

    return price - discount;
}


int main(){

    cout<<"Integer quantity cost : "<<reordercost(10,50.0)<<endl;
    cout<<"Fractional quantity : "<<reordercost(15.0,50.0)<<endl;
    cout<<" Quantity cost with Tax : "<<reordercost(10,50.0,18.0 )<<endl;
    cout<<"Default Discount : "<<applyDiscount(1000)<<endl;
    cout<<"20% Discount : "<<applyDiscount(1000, 20.0)<<endl;
   
    return 0;
}