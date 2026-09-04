#include<iostream>
using namespace std;
class Patient{
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;
 public:
      Patient(): patientId(0),
        name("unknown"),
        age(0),
        ward("general"),
        bloodGroup("o+"){
            cout<<"Default patient Registered."<<endl;
      }
      Patient(int id, const string& name):patientId(id),
              name(name)
            //   age(0),
            //   ward("Emergency Ward "),
            //   bloodGroup("o+")
           {
            cout<<"Emergency Admission "<<endl;
         }

         Patient(int id, const string& name,int age,const string& ward, const string& bg):patientId(id),
         name(name),
         age(age),
         ward(ward),
         bloodGroup(bg){
            cout<<"Full Admission Details "<<endl;
         }

        ~Patient(){
            cout<<"Patient "<<name<<" is Discharged."<<endl;
        }

         void displayRecord()const{
            cout<<"Patient Record : "<<endl;
            cout<<"ID : "<<patientId<<endl;
            cout<<"Name : "<<name<<endl;
            cout<<"Age : "<<age<<endl;
            cout<<"Ward : "<<ward<<endl;
            cout<<"BloodGroup : "<<bloodGroup<<endl;
         }
         void wardTransfer(const string& newward){
               ward = newward;

         }

};

int main(){
    Patient p;
    Patient p2(101,"Sidhharth");
    Patient p3(102, "Neha",23,"ICU","A+" );
    cout<<"Patient Records!"<<endl;

    p.displayRecord();
    p2.displayRecord();
    p3.displayRecord();
 
    Patient* patients = new Patient[4];
    cout<<"Patient Details "<<endl;

    for(int i=0; i<4; i++){
        patients[i].displayRecord();
    }
    patients[2].wardTransfer("operation");
    cout<<"after ward transfer:"<<endl;
    patients[2].displayRecord();

    delete[] patients;
    return 0;
}