#include<bits/stdc++.h>
using namespace std;
int main(){
        int num,co = 0;
        string sis;
        cin >> num;
        cin >> sis;
        for(int i = num - 1; i >= 0; i--){
            if(sis[i] == '1'){
               cout << co << endl;
                break;
            }
            co++;
        }
    return 0;
}
