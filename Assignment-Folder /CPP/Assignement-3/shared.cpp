#include<iostream>
#include<memory>
using namespace std;
class Shader{
    string name;
    string type;
public:
    Shader(string n, string t){
        name = n;
        type = t;

        cout<<"Shader Compiled "<<endl;
    }
    ~Shader(){
        cout<<"Shader Destroyed"<<endl;
    }
   
};
int main(){
    auto Sh = make_shared<Shader>("Main vert", "Vertex");
    cout<<"Ref count : "<<Sh.use_count()<<endl;
    {
        auto renderRef = Sh;
        cout<<"Ref Count = "<<Sh.use_count()<<endl;
        auto editorRef = Sh;
        cout<<"ref count = "<<Sh.use_count()<<endl;
    }
    cout<<"Ref_count = "<<Sh.use_count()<<endl;
    return 0;

}