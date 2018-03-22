#include <stdio.h>
#include <conio.h>
#include <locale.h>
#include <math.h>
#include <windows.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>


using namespace std;

int main(void)
{
	SetConsoleCP(1251);
	SetConsoleOutputCP(1251);
	

	int n=0, i, sw1, sw2, m;
	char **s=NULL, *temp;
	
	do {
		printf("Ìåíþ äëÿ ðàáîòû ñî ñïèñêîì èìåí\n");
		printf("1) Äîáàâëåíèå èìåíè\n");
		printf("2) Âûâîä ñïèñêà èìåí\n");
		printf("3) Ïîèñê\n");
		printf("4) Ðåäàêòèðîâàíèå\n");
		printf("5) Ñîðòèðîâêà èìåí\n");
		printf("6) Óäàëåíèå\n");
		printf("7) Âûõîä\n");
		printf("Âûáåðèòå ïóíêò ìåíþ: ");
		scanf("%d", &sw1);
		switch(sw1){
				case 1:
				s=(char**)realloc(s,(n+1)*sizeof(char*));
				s[n]=(char*)malloc(256*sizeof(char));
				puts("Ââåäèòå èìÿ\n");
				fflush(stdin);
				fgets(s[n], 256, stdin);
				if(s[n][strlen(s[n]-1)]=='\n'){
					s[n][strlen(s[n]-1)]='\0';
				}
				s[n]=(char*)realloc(s[n],(strlen(s[n])+1)*sizeof(char));
				n++;
				printf ("Íàæìèòå ëþáóþ êëàâèøó");
				getch();
				system("cls");
				break;
				
				case 2:
					if(s!=NULL){
						puts("\nÑïèñîê èìåí\n");
						
						for(i=0; i<n; i++){
							printf("%d. %s", i+1, s[i]);
						}
					}
					else puts("Ñïèñîê èìåí ïóñò");
				printf ("Íàæìèòå ëþáóþ êëàâèøó");
				getch();
				system("cls");
				break;
				case 3:
					temp=(char*)malloc(256*sizeof(char));
					puts("Ââåäèòå ñòðîêó äëÿ ôèëüòðàöèè");
					fflush(stdin);
					fgets(temp, 256, stdin);
					if(temp[strlen(temp)-1]=='\n'){
						temp[strlen(temp)-1]='\0';
					}
					temp=(char*)realloc(temp,(strlen(temp)+1)*sizeof(char));
					puts("Ñïèñîê ïîñëå ôèëüòðàöèè");
					for(i=0; i<n; i++){
						if (strstr(s[i],temp)!=NULL){
							printf("%d. %s", i+1, s[i]);
						}
					}
					printf ("Íàæìèòå ëþáóþ êëàâèøó");
				getch();
				system("cls");
				break;
				case 4:
					//Ðåäàêòèðîâàíèå ïî íîìåðó
					puts("Ââåäèòå íîìåð ");
					scanf("%d", &m);
					m--;
					if (m<=n){
									
						puts("Ââåäèòå èìÿ\n");
						fflush(stdin);
						fgets(s[m], 256, stdin);
						if(s[m][strlen(s[m]-1)]=='\n'){
							s[m][strlen(s[m]-1)]='\0';
						}
						s[m]=(char*)realloc(s[m],(strlen(s[m])+1)*sizeof(char));
						
					}
					else puts("Íåò òàêîãî íîìåðà â ñïèñêå");
						printf ("Íàæìèòå ëþáóþ êëàâèøó");
				getch();
				system("cls");
				break;					
				
				break;
				case 5:
				break;
				case 6:
				break;
				case 7:
				break;
				default: puts("Íåâåðíûé âûáîð");
		}
	}while (sw1!=7);
	
	
	
	
	return(0);
}
