#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
int display();
int compx();
int compx1();
int compo();
int compo1();
int check();
int i,j,a[3][3],k,l,T=0,b[3][3],q,w,z,y=0;
char ch;
int main()
{
	srand(time(0));
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			b[i][j]=0;
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]='$';
		}
    }
    	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",b[i][j]);
		}
		printf("\n");	
	}		
	printf("select X or O\n");
	scanf("%c",&ch);
		for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
	      printf("%c\t",a[i][j]);
		}
		printf("\n");
	}
	switch(ch)
	{
		case 'x':for(T=0;T!=5;T++)
		       {
		        printf("enter place to fill");
		       scanf("%d%d",&k,&l);
		       a[k][l]='X';
		       b[k][l]=1;
		       if(T==0)
		       {
		       	 compx();
		       	 display(); 
		       }
		      
		       if(T>=1)
		       {
		       compx1(); 
			  
		       display();  
		       }
		       
		       }
		       break;
		case 'o':do
		        {
		        printf("enter place to fill\n");
		       scanf("%d%d",&k,&l);
		       a[k][l]='O';
		       b[k][l]=1;
		       if(T==0)
		       {
		       	compo();
			   }
			   T++;
			   compo1();
		       }while(T!=5);
			   break;
		default:printf("plz choose between x and o");	        
	}
}
int display()
{
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%c\t",a[i][j]);
		}
		printf("\n");	
	}
		for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",b[i][j]);
		}
		printf("\n");	
	}		
	}
int compx()
{
	int p;
	printf("%d\n",T);
	if(b[1][1]==1)//if centre is entered output is at corner
	{
		p=rand()%4;
		if(p==0)
		{
			a[0][0]='O';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[0][2]='O';
			b[0][2]=2;
		}
		else if(p==2)
		{
			a[2][0]='O';
			b[2][0]=2;
		}
		else if(p==3)
		    a[2][2]='O';
		    b[2][2]=2;
	}
	   else if(b[0][0]==1 || b[0][2]==1 || b[2][0]==1 || b[2][2]==1)//for corners
	{
		if(b[0][0]==1)                                               //for a[0][0]
		{
		p=rand()%3;
		if(p==0)
		{
			a[0][2]='O';
			b[0][2]=2;
		}
		else if(p==1)
		{
			a[2][0]='O';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[2][2]='O';
			b[2][2]=2;
		}
	   }                                                            //end of a[0][0]
	   else if(b[0][2]==1)                                          //begin a[0][2]
	   {
	   	p=rand()%3;
	   	if(p==0)
		{
			a[0][0]='O';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][0]='O';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[2][2]='O';
			b[2][2]=2;
		}		
	  }                                                           //end of a[0][2]
	    else if(b[2][2]==1)                                       //start of [2][2]
	   {
	   	    p=rand()%3;
	     	if(p==0)
		{
			a[0][0]='O';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][0]='O';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[0][2]='O';
			b[0][2]=2;
		}		
	   }                                                          //end of [2][2]
	    else if(b[2][0]==1)                                       //start of [2][0]
	   {
	   	    p=rand()%3;
	     	if(p==0)
		{
			a[0][0]='O';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][2]='O';
			b[2][2]=2;
		}
		else if(p==2)
		{
			a[0][2]='O';
			b[0][2]=2;
		}		
	   }                                                              //end of [2][0]	   
	}
	else if(b[0][1]==1 || b[1][2]==1 || b[2][1]==1 || b[1][0]==1)    //middle parts
	{
		a[1][1]='O';
		b[1][1]=2;
	}
	return 0;
}
int compo()
{
	int p;
	if(b[1][1]==1)                                                    //if centre is entered output is at corner
	{
		p=rand()%4;
		if(p==0)
		{
			a[0][0]='X';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[0][2]='X';
			b[0][2]=2;
		}
		else if(p==2)
		{
			a[2][0]='X';
			b[2][0]=2;
		}
		else if(p==3)
		    a[2][2]='X';
		    b[2][2]=2;
	}
	   else if(b[0][0]==1 || b[0][2]==1 || b[2][0]==1 || b[2][2]==1)//for corners
	{
		if(b[0][0]=1)                                               //for a[0][0]
		{
		p=rand()%3;
		if(p==0)
		{
			a[0][2]='X';
			b[0][2]=2;
		}
		else if(p==1)
		{
			a[2][0]='X';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[2][2]='X';
			b[2][2]=2;
		}
	   }                                                            //end of a[0][0]
	   else if(b[0][2]==1)                                          //begin a[0][2]
	   {
	   	p=rand()%3;
	   	if(p==0)
		{
			a[0][0]='X';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][0]='X';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[2][2]='X';
			b[2][2]=2;
		}		
	  }                                                           //end of a[0][2]
	    else if(b[2][2]==1)                                       //start of [2][2]
	   {
	   	    p=rand()%3;
	     	if(p==0)
		{
			a[0][0]='X';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][0]='X';
			b[2][0]=2;
		}
		else if(p==2)
		{
			a[0][2]='X';
			b[0][2]=2;
		}		
	   }                                                          //end of [2][2]
	    else if(b[2][0]==1)                                       //start of [2][0]
	   {
	   	    p=rand()%3;
	     	if(p==0)
		{
			a[0][0]='X';
			b[0][0]=2;
		}
		else if(p==1)
		{
			a[2][2]='X';
			b[2][2]=2;
		}
		else if(p==2)
		{
			a[0][2]='X';
			b[0][2]=2;
		}		
	   }                                                              //end of [2][0]	   
	}
	else if(b[0][1]==1 || b[1][2]==1 || b[2][1]==1 || b[1][0]==1)    //middle parts
	{
		a[1][1]='X';                                                //solution in centre 
		b[1][1]=2;
	}
	
}
int compx1()
{
	printf("%d\n",T);
	if(b[0][1]==1 & b[0][2]==1)                            //column 1
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='O';
		y=1;
	    }
	}
	else if(b[0][0]==1 & b[0][1]==1)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
		y=1;
	    }
	}
	else if(b[0][2]==1 & b[0][0]==1)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='O';
		y=1;
	    }
	}
		else if(b[1][0]==1 & b[1][1]==1)                    //column 2 
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='O';
		y=1;
	    }
	}
		else if(b[1][1]==1 & b[1][2]==1)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='O';
		y=1;
	    }
	}
		else if(b[1][0]==1 & b[1][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
		y=1;
	    }
	}
		else if(b[2][0]==1 & b[2][1]==1)                 //column 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
		y=1;
	    }
	}
		else if(b[2][1]==1 & b[2][2]==1)
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='O';
		y=1;
	    }
	}
		else if(b[2][0]==1 & b[2][2]==1)
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='O';
		y=1;
	    }
	}
		else if(b[2][0]==1 & b[1][1]==1)                  //diagonal from left
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
		y=1;
	    }
	}
		else if(b[1][1]==1 & b[0][2]==1)
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='O';
		y=1;
	    }
	}
		else if(b[2][0]==1 & b[0][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
		y=1;
	    }
	}
		else if(b[0][0]==1 & b[1][1]==1)                //diagonal from right
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
		y=1;
	    }
	}
		else if(b[1][1]==1 & b[2][2]==1)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='O';
		y=1;
	    }
	}
		else if(b[0][0]==1 & b[2][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
		y=1;
	    }
	}
		else if(b[0][0]==1 & b[0][1]==1)                //row 1
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='O';
		y=1;
	    }
	}
		else if(b[1][0]==1 & b[2][0]==1)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='O';
		y=1;
	    }
	}
		else if(b[0][0]==1 & b[2][0]==1)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='O';
		y=1;
	    }
	}
		else if(b[0][1]==1 & b[1][1]==1)                //row 2
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='O';
		y=1;
	    }
	}
		else if(b[1][1]==1 & b[2][1]==1)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='O';
		y=1;
	    }
	}
		else if(b[0][1]==1 & b[2][1]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
		y=1;
	    }
	}
		else if(b[0][2]==1 & b[1][2]==1)               //row 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
		y=1;
	    }
	}
		else if(b[1][2]==1 & b[2][2]==1)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
		y=1;
	    }
	}
		else if(b[0][2]==1 & b[2][2]==1)
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='O';
		y=1;
	   }
	}
 

	if(y==0)
	{
for(z=0;z>-1;z++)
{
	
	q=rand()%3;
	w=rand()%3;
	if(b[q][w]==0)
	{
		b[q][w]=2;
		a[q][w]='O';
		break;
	}
}
}
y=0;
	check();
}

int compo1()
{
	if(T==2 || T==4)
	{
	if(b[0][1]==1 & b[0][2]==1)                            //column 1
	{
		if(b[0][3]==0)
		{
		b[0][3]=2;
		a[0][3]='X';
	    }
	}
	else if(b[0][0]==1 & b[0][1]==1)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='X';
	    }
	}
	else if(b[0][2]==1 & b[0][0]==1)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='X';
	    }
	}
		else if(b[1][0]==1 & b[1][1]==1)                    //column 2 
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='X';
	    }
	}
		else if(b[1][1]==1 & b[1][2]==1)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='X';
	    }
	}
		else if(b[1][0]==1 & b[1][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='X';
	    }
	}
		else if(b[2][0]==1 & b[2][1]==1)                 //column 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='X';
	    }
	}
		else if(b[2][1]==1 & b[2][2]==1)
	{
		b[2][0]=2;
		a[2][0]='X';
	}
		else if(b[2][0]==1 & b[2][2]==1)
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='X';
	    }
	}
		else if(b[2][0]==1 & b[1][1]==1)                  //diagonal from left
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='X';
	    }
	}
		else if(b[1][1]==1 & b[0][2]==1)
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='X';
	    }
	}
		else if(b[2][0]==1 & b[0][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='X';
	    }
	}
		else if(b[0][0]==1 & b[1][1]==1)                //diagonal from right
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='X';
	    }
	}
		else if(b[1][1]==1 & b[2][2]==1)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='X';
	    }
	}
		else if(b[0][0]==1 & b[2][2]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='X';
	    }
	}
		else if(b[0][0]==1 & b[0][1]==1)                //row 1
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='X';
	    }
	}
		else if(b[1][0]==1 & b[2][0]==1)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='X';
	    }
	}
		else if(b[0][0]==1 & b[2][0]==1)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='X';
	    }
	}
		else if(b[0][1]==1 & b[1][1]==1)                //row 2
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='X';
	    }
	}
		else if(b[1][1]==1 & b[2][1]==1)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='X';
	    }
	}
		else if(b[0][1]==1 & b[2][1]==1)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='X';
	    }
	}
		else if(b[0][2]==1 & b[1][2]==1)               //row 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='X';
	    }
	}
		else if(b[1][2]==1 & b[2][2]==1)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='X';
	    }
	}
}
   else if(T==3 || T==5)
   {
	    if(b[0][2]==1 & b[2][2]==1)
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='O';
	   }
	}
		if(b[0][1]==2 & b[0][2]==2)                            //column 1
	{
		if(b[0][3]==0)
		{
		b[0][3]=2;
		a[0][3]='O';
	    }
	}
	else if(b[0][0]==2 & b[0][1]==2)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
	    }
	}
	else if(b[0][2]==2 & b[0][0]==2)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='O';
	    }
	}
		else if(b[1][0]==2 & b[1][1]==2)                    //column 2 
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='O';
	    }
	}
		else if(b[1][1]==2 & b[1][2]==2)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='O';
	    }
	}
		else if(b[1][0]==2 & b[1][2]==2)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
	    }
	}
		else if(b[2][0]==2 & b[2][1]==2)                 //column 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
	    }
	}
		else if(b[2][1]==2 & b[2][2]==2)
	{
		b[2][0]=2;
		a[2][0]='O';
	}
		else if(b[2][0]==2 & b[2][2]==2)
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='O';
	    }
	}
		else if(b[2][0]==2 & b[1][1]==2)                  //diagonal from left
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
	    }
	}
		else if(b[1][1]==2 & b[0][2]==2)
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='O';
	    }
	}
		else if(b[2][0]==2 & b[0][2]==2)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
	    }
	}
		else if(b[0][0]==2 & b[1][1]==2)                //diagonal from right
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
	    }
	}
		else if(b[1][1]==2 & b[2][2]==2)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='O';
	    }
	}
		else if(b[0][0]==2 & b[2][2]==2)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
	    }
	}
		else if(b[0][0]==2 & b[0][1]==2)                //row 1
	{
		if(b[2][0]==0)
		{
		b[2][0]=2;
		a[2][0]='O';
	    }
	}
		else if(b[1][0]==2 & b[2][0]==2)
	{
		if(b[0][0]==0)
		{
		b[0][0]=2;
		a[0][0]='O';
	    }
	}
		else if(b[0][0]==2 & b[2][0]==2)
	{
		if(b[1][0]==0)
		{
		b[1][0]=2;
		a[1][0]='O';
	    }
	}
		else if(b[0][1]==2 & b[1][1]==2)                //row 2
	{
		if(b[2][1]==0)
		{
		b[2][1]=2;
		a[2][1]='O';
	    }
	}
		else if(b[1][1]==2 & b[2][1]==2)
	{
		if(b[0][1]==0)
		{
		b[0][1]=2;
		a[0][1]='O';
	    }
	}
		else if(b[0][1]==2 & b[2][1]==2)
	{
		if(b[1][1]==0)
		{
		b[1][1]=2;
		a[1][1]='O';
	    }
	}
		else if(b[0][2]==2 & b[1][2]==2)            //row 3
	{
		if(b[2][2]==0)
		{
		b[2][2]=2;
		a[2][2]='O';
	    }
	}
		else if(b[1][2]==2 & b[2][2]==2)
	{
		if(b[0][2]==0)
		{
		b[0][2]=2;
		a[0][2]='O';
	    }
	}
		else if(b[0][2]==2 & b[2][2]==2)
	{
		if(b[1][2]==0)
		{
		b[1][2]=2;
		a[1][2]='O';
	   }
	}
}
for(z=0;z>-1;z++)
{
	
	q=rand()%3;
	w=rand()%3;
	if(b[q][w]==0)
	{
		b[q][w]=2;
		a[q][w]='X';
		break;
	}
}
	
	check();
}
  int check()
  {
  	if(b[0][1]==1 & b[0][0]==1 & b[0][2]==1)                     //for user     // along column 
  	{
  		printf("YOU won\n");
  		
	}
	  	if(b[1][0]==1 & b[1][1]==1 & b[1][2]==1)
  	{
  		printf("YOU won\n");
  	
	}
	  	if(b[2][0]==1 & b[2][1]==1 & b[2][2]==1)
  	{
  		printf("YOU won\n");
  		  
    }
    	  	if(b[0][0]==1 & b[1][0]==1 & b[2][0]==1)        //along row
  	{
  		printf("YOU won\n");
  		  
    }
    	  	if(b[0][1]==1 & b[1][1]==1 & b[2][1]==1)
  	{
  		printf("YOU won\n");
  		  
    }
    	  	if(b[0][2]==1 & b[1][2]==1 & b[2][2]==1)
  	{
  		printf("YOU won\n");
  		  
    }
    	  	if(b[0][0]==1 & b[1][1]==1 & b[2][2]==1)       // left diagonal
  	{
  		printf("YOU won\n");
  		  
    }
    	  	if(b[0][2]==1 & b[1][1]==1 & b[2][0]==1)          //right diagonal
  	{
  		printf("YOU won\n");
  		  
    }
    	if(b[0][1]==2 & b[0][0]==2 & b[0][2]==2)           //for computer               // along column 
  	{
  		printf("COMP won\n");
  		  
	}
	  	if(b[1][0]==2 & b[1][1]==2 & b[1][2]==2)
  	{
  		printf("COMP won\n");
  		  
	}
	  	if(b[2][0]==2 & b[2][1]==2 & b[2][2]==2)
  	{
  		printf("COMP won\n");
  		  
    }
    	  	if(b[0][0]==2 & b[1][0]==2 & b[2][0]==2)          //along row
  	{
  		printf("COMP won\n");
  		  
    }
    	  	if(b[0][1]==2 & b[1][1]==2 & b[2][1]==2)
  	{
  		printf("COMP won\n");
  		  
    }
    	  	if(b[0][2]==2 & b[1][2]==2 & b[2][2]==2)
  	{
  		printf("COMP won\n");
  		  
    }
    	  	if(b[0][0]==2 & b[1][1]==2 & b[2][2]==2)          // left diagonal
  	{
  		printf("COMP won\n");
  		  
    }
    	  	if(b[0][2]==2 & b[1][1]==2 & b[2][0]==2)          //right diagonal
  	{
  		printf("COMP won\n");
  		  
    }
    return 0;
}	

