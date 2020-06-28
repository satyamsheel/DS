import java.io.*;
class satyam
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter number of  Processes");
int n=sc.nextInt();
int[] process=new int[n];
int[] arivalTime=new int[n];
int[] burstTime=new int[n];
int[] turnAround=new int[n];
int[] waitingTime=new int[n];
int[] processCompletetTime=new int[n];
int temp,avgWait=0,avgTurnTime=0;

for(int i=0;i<n;i++)
{
System.out.println("Enter arrival time of process"+i+1);
arrivalTime[i]=sc.nextInt();

System.out.println("Enter Burst time of process"+i+1);
burstTime[i]=sc.nextInt();
process[i]=i+1;
}

for(int i = 0 ; i <n; i++)
{
for(int  j=0;  j < n-(i+1) ; j++)
{
if( ar[j] > ar[j+1] )
{
temp = arrivalTime[j];
arrivalTime[j] = arrivalTime[j+1];
arrivalTime[j+1] = temp;
temp = burstTime[j];
burstTime[j] = burstTime[j+1];
burstTime[j+1] = temp;
temp = process[j];
process[j] =process[j+1];
process[j+1] = temp;
}
}
}
System.out.println("Enter 1 for FCFS  Enter 2 for SJF  Enter 3 for priority scheduling Enter 4 for Round Robin");
int t=sc.nextInt();
switch(t)
{
case 1:
	FCFS();
	break;
default:System.out.println("Enter correct choice");
}
}
public void FCFS()
{
for(int  i = 0 ; i < n; i++)
{
if( i == 0)
{
processCompletetTime[i] = arrivalTime[i] + burstTime[i];
}
else
{
if( arrivalTime[i] > processCompletetTime[i-1])
{
processCompletetTime[i] = arrivalTime[i] + burstTime[i];
}
else
processCompletetTime[i] = processCompletetTime[i-1] + burstTime[i];
}
turnAround[i] =processCompletetTime[i] - arrivalTime[i] ;
waitingTime[i] = turnAround[i] -burstTime[i] ;
avgWait += waitingTime[i] ;
avgTurnTime += turnAround[i] ;

System.out.println("Process"+"\t"+"Arrival"+"\t"+"Burst"+"\t"+"Waiting"+"\t"+"turn/t");
for(int i=0;i<n;i++)
{
System.out.println(process[i] + " \t " + arrivalTime[i] + "\t" + burstTime[i] + "\t" + processCompletetTime[i] + "\t" + turnAround[i] + "\t"  + waitingTime[i] ) ;
}
System.out.println("Average waiting time "+(avgWait/n));
System.out.println("Average turn arount time "+(avgTurnTime/n));
}
}
}
