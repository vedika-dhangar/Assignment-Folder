#include<iostream>
#include<memory>
using namespace std;
class AudioClip{
    string name;
    double size;
public:
    AudioClip(string n, double s){
        name = n;
        size = s;

        cout<<"AudioClip Compiled "<<endl;
    }
    ~AudioClip(){
        cout<<"AudioClip Destroyed"<<endl;
    }
    string getname(){
  
        return name;
        
      }
   
};
int main(){
    auto audio  = make_shared<AudioClip>("explosion", 3.5);
    weak_ptr<AudioClip> observer = audio;

    if(auto clip = observer.lock())
    cout<<"Clip alive : "<<clip->getname()<<endl;
    
    audio.reset();

    if(observer.expired())
    cout<<"Clip ALready unloaded "<<endl;
    return 0;

}