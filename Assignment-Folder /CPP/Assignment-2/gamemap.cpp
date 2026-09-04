#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){
   // srand(time(0));
    int row,col;
    int Legend = 0;
    int Grass = 0;
    int Water = 0;
    int Mountain = 0;
    int Forest = 0;
    int Dungeon = 0;
    cout<<"Enter rows and cols "<<endl;
    cin>>row>>col;

     int** maparr = new int*[row];
     for(int i=0; i<row; i++){
     maparr[i]=new int[col];
     }

cout<<"Enter Tiles "<<endl;
for(int i=0; i<row; i++){
    for(int j=0; j<col; j++){
        cin>>maparr[i][j];
    }
}

 cout<<"===============GAME MAP======================="<<endl;
 for(int i=0; i<row; i++){
    for(int j=0; j<col; j++){
        maparr[i][j] = rand() % 5;
        cout<<maparr[i][j]<<" "; 
    }
    cout<<endl;
}

for(int i=0; i<row; i++){
    for(int j=0; j<col; j++){
        if(maparr[i][j]==0){
            Legend++;
        }
        else if (maparr[i][j]==1){
            Water++;
        }
        else if (maparr[i][j]==2){
            Mountain++;
        }
        else if (maparr[i][j]==3){
            Forest++;
        }
        else 
            Dungeon++;

    }
}

cout<<"Legend : "<<Legend<<"  ";
cout<<"Water : "<<Water<<"  ";
cout<<"Mountain : "<<Mountain<<"  ";
cout<<"Forest : "<<Forest<<"  "<<"Dungeon : "<<Dungeon;




    for(int i=0; i<row; ++i){
        delete[] maparr[i];
    }
    delete[] maparr;
    
    maparr = nullptr;
    return 0;
}