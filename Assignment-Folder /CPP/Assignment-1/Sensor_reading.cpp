#include<iostream>
#include<string>
using namespace std;

int main(){
  
    double Temp;

    cout<<"Enter the Temperature in c  :"<<endl;
    cin>>Temp;

    double fahrenheit = (Temp * 9.0 / 5.0) + 32;

    cout<<"Temperature : "<<Temp<<" c"<<" / "<<fahrenheit<<" f"<<endl;
    int range;
    int statuscode;
    if(Temp<0){
        statuscode = -1;    
    }
    else if(Temp>=0 && Temp<29){
        statuscode = 0;
    }
    else if(Temp >= 30 &&  Temp <44){
        statuscode = 1;
    }
    else if(Temp >= 45 &&  Temp <59){
        statuscode = 2;
    }
    else if (Temp >=60){
        statuscode = 3;
    }
    else{
        cout<<"Not a valid Temperature "<<endl;
    }
        
    

    switch(statuscode){
        case -1:
        cout<<"status : SENSOR_ERROR"<<endl<<" Action : Sensor fault - check wiring "<<endl;
        break;
        case 0:
        cout<<"status :   : NORMAL "<<endl<<" Action : No action required"<<endl;
        break;
        case 1:
        cout<<"status :   WARNING"<<endl<<" Action :Alert sent to supervisor"<<endl;
        break;
        case 2:
        cout<<"status :  CRITICAL "<<endl<<" Action : Cooling System Triggered"<<endl;
        break;
        case 3:
        cout<<"status :  SHUTDOWN"<<endl<<" Action : Emergency shutdown initiated"<<endl;
        break;
        default:
        cout<<"check the temperature again";
    }

    string reading = (Temp>=25) ? "Above average": "Below Average ";
    cout<<"Reading : "<<reading<<endl;

    return 0;

}