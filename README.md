#include <iostream>
#include <stdio.h>
#include <string.h>
#include <conio.h>

using namespace std;
int main()
{
    char str1[5]="ABCD",str2[5]="abcd",str3[5]="BCDE",str4[5]="BCda";
    int hasil;

    cout<<"str1[5]=ABCD,str2[5]=abcd,str3[5]=BCDE,str4[5]=BCda"<<endl;
    hasil=strcmp(str1,str2);
    printf("Hasil STRCMP : ");
    if(hasil==0) printf("String1 sama dengan String2\n"); else
    if(hasil>0) printf("String1 lebih besar dari String2\n"); else
    if(hasil<0) printf("String1 lebih kecil dari String2\n");

    hasil=strcmpi(str1,str2);
    printf("Hasil STRCMPI : ");

    if(hasil==0) printf("String1 sama dengan String2\n"); else
    if(hasil>0) printf("String1 lebih besar dari String2\n"); else
    if(hasil<0) printf("String1 lebih kecil dari String2\n");

    hasil=strncmp(str3,str4,3);
    printf("Hasil STRNCMP : ");

    if(hasil==0) printf("String3 sama dengan String4\n"); else
    if(hasil>0) printf("String3 lebih besar dari String4\n"); else
    if(hasil<0) printf("String3 lebih kecil dari String4\n");

    return 0;
}
