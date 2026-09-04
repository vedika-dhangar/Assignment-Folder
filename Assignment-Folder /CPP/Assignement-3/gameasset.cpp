#include<iostream>
#include<memory>
using namespace std;
class Texture{
    string name;
    int width;
    int height;

    public:
    // Texture(){

    // }
    Texture(string n, int w, int h){
        name=n;
        width=w;
        height=h;
        cout<<"[Texture Loaded]"<<endl;
    }


    ~Texture(){
        cout<<"[Texture Released]"<<endl;
    }

    void display()const{
        cout<<"Name :"<<name<<"  "<<"Width : "<<width<<"  "<<"Height : "<<height<<endl;
    }

};
int main(){
    auto t1 = make_unique<Texture>("Player sprite",512,512);
    t1->display();
    // unique_ptr<Texture>t2 = t1; 
                                   // error: use of deleted function 'std::unique_ptr<_Tp, _Dp>::unique_ptr(const std::unique_ptr<_Tp, _Dp>&) [with _Tp = Texture; _Dp = std::default_delete<Texture>]'
    
    unique_ptr<Texture>t2=move(t1);
    cout<<"Text1 is null : "<<(t1==nullptr ? "yes" : "No")<<endl;
    return 0;

}