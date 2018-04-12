#include <stdio.h>
#include <conio.h>
#include <locale.h>
#include <math.h>
#include <windows.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>


using namespace std;

struct Rectangle{
	int A;
	int B;
};
int Perimeter(struct Rectangle);
int main(void)
{
	SetConsoleCP(1251);
	SetConsoleOutputCP(1251);
	struct Rectangle R1;
	puts("Ââåäèòå ðàçìåðû ñòîðîí ïðÿìîóãîëüíèêà");
	scanf("%d%d", &R1.A, &R1.B);
	int P;
	P=Perimeter (R1);
	printf("Ïåðèìåòð ðàâåí %d\n", P);
	getch();
	
	
	return(0);
}
int Perimeter (struct Rectangle rectangle){
	return(()rectangle.A+rectangle.B)*2);
}
