#include<iostream>
using namespace std;

enum class HttpStatus{
    Ok = 200, Created = 201, BadRequest = 400, Unauthorized = 401, NotFound = 404, ServerError = 500
};

void handleResponse(HttpStatus status, const string& endpoint){
    int statusCode =  static_cast<int>(status);
    switch(statusCode){
        case 200:
        cout<<endpoint <<" : "<< statusCode <<" : Request successful ";
        break;
        case 201:
        cout<<endpoint <<" : "<< statusCode<<": Created successfully!";
        break;
        case 400:
        cout<<endpoint <<" : "<< statusCode<<": Bad Request!";
        break;
        case 401:
        cout<<endpoint <<" : "<< statusCode<<": Authentication Required";
        break;                
        case 404:
        cout<<endpoint <<" : "<< statusCode<<": endpoint does Not Exist!";
        break;
        case 500:
        cout<<endpoint <<" : "<< statusCode <<": Internal Server Error - retry later";
        break;      
        default:
        cout<<"Something went wrong";  
    }
}

int main(){

    handleResponse(HttpStatus::Ok,"GET /api/users");
    cout<<endl;
    handleResponse(HttpStatus::ServerError,"GET /api/server");
    cout<<endl;
    
     handleResponse(HttpStatus::NotFound,"GET /api/server");
    return 0;
}