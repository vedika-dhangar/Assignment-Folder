#include<iostream>
using namespace std;
class Product{
    int productId;
    string name;
    double price;
    int quantity;

  public:
        void acceptDetails(){
             cout << "Enter productId : "<<endl;
             cin >> productId;
             cout << "Enter Name : "<<endl;
             cin >> name;
             cout << "Enter price : "<<endl;
             cin >> price;
             cout << "Enter quantity : "<<endl;
             cin >> quantity;
        }  
        double totalValue() const{
            //   double total=quantity*price;
            //   cout<<"Total Value "<< total;
              return quantity*price;

        } 

        void displayDetails() const{
            cout <<productId<<"      "
            <<name<<"      "
             <<price<<"      "
           <<quantity<<"      "<<totalValue()<<"       "<<endl;
            //cout<<endl;

        }

        bool isLowstock(int threshold) const{
            return quantity<threshold;
            
          
        }
};
int main(){
    Product p[5];
     int threshold;
    cout << "\nEnter stock threshold: ";
    cin >> threshold;

    for(int i=0; i<5; i++){
        p[i].acceptDetails();
    }
      cout<<"======INVENTORY REPORT======="<<endl;
     cout<<"ProductId:      "<<"Name      "<<"Price       " <<"quantity    "<<endl;
    for(int i=0; i<5; i++){
         p[i].displayDetails();
    }
    int max=0;
   
    for(int i=0; i<5; i++){
        if(p[i].totalValue()>p[max].totalValue())
           max=i;
    }

    cout<<"Product with highest total :"<<endl;
    p[max].displayDetails();


    cout<<"======Low Stock======="<<endl;
    for(int i=0; i<5; i++){
            if (p[i].isLowstock(threshold))
            p[i].displayDetails();
    }
   
    return 0;
}