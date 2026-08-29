#include<iostream>
#include<cmath>
using namespace std;
inline double distanceBetween(double x1, double y1, double x2, double y2 ){
    double result = sqrt(pow(x2-x1, 2)+pow(y2-y1, 2));
    return result;
}

inline double toRadian(double degrees){
    double result = degrees *(M_PI / 180.0);
    return result;
}
inline double clamp(double value, double minVal, double maxVal){
    if(value<minVal){
        return minVal;
    }
    else if(value>maxVal){
        return maxVal;
    }
   
    return value;

}
inline bool isInSafeZone(double x,double y,double cx,double cy,double radius){
    double distance = distanceBetween(x, y, cx, cy);
    if(distance<=radius){
        cout<<"You are in safe zone !!"<<endl;
        return true;
    }
    else{
        cout<<"You are not in safe zone !!"<<endl;
        return false;
    }
}


int main(){
    double center =(0,0);
   double radius = 50.0;

    cout<<"square root is : "<<distanceBetween(25,64 , 49, 100   )<<endl; 
    cout<<"degree to radian : "<<toRadian(30)<<endl;
    cout<<"Value : "<<clamp(25.5,33.7,78.6)<<endl;
    cout<<"To check is it is in safezone or not: "<<isInSafeZone(30, 40, 0, 0, 50);
    return 0;
}