#include<iostream>
using namespace std;

int main()
{
	int rows, columns, i, j, flag = 1;

	cin >> rows >> columns;
	
	int arr[rows][columns];
	
	for(i = 0; i < rows; i++)	{
		for(j = 0; j < columns; j++) {
			cin >> arr[i][j];
		}		
	}

 	for(i = 0; i < rows; i++)
  	{
   		for(j = 0; j < columns; j++)
    	{
    		if(arr[i][j] != 1 && arr[j][i] != 0)
    		{
    			flag = 0;
    			break;
			}
   	 	}
  	}
  	if(flag == 1)
  	{
  		cout << "Identity Matrix";
	}
	else
	{
		cout << "Not an Identity Matrix";
	}  	

 	return 0;
}