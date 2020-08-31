package satyamPractise;

import java.util.*;
public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tt=sc.nextInt();
		while(tt-->=0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n+1];
			Map<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
			
			
			
			
			 int ans=0,vc=0,t=1;
		        for(int i=0;i<n;i++)
		            a[i]=sc.nextInt();
		        //int col[n+1][n+1]={0};
		        int col[][]=new int[n+1][n+1];
		        for(int i=0;i<n+1;i++) {
			    	for(int j=0;j<n+1;j++) {
			    		col[i][j]=0;
			    	}
			    }
		        for(int i=0;i<n;i++)
		        {
		            for(int j=0;j<n;j++)
		                col[i][j]=0;
		        }
		        for(int i=0;i<n;i++)
		        {
		            mp.clear();
		            for(int j=i;j<n;j++)
		            {
		                col[i][j]=(j==0)?0:col[i][j-1];
		                if(mp.containsKey(a[j]))
		                {
		                	//
		                    if(mp.containsValue(a[j]))
		                    {
		                         col[i][j]++;
		                    }
		                    col[i][j]++;
		                }
		               // mp[a[j]]++;
		                mp.put(a[j], a[j]++);
		 
		            }
		 
		        }
		 
		    ans=1000000000;
		    int table=100;
		    //int dp[101][1001]={0};
		    int dp[][]=new int[101][1001];
		    for(int i=0;i<101;i++) {
		    	for(int j=0;j<1001;j++) {
		    		dp[i][j]=0;
		    	}
		    }
		    for(int i=0;i<=table;i++)
		    {
		        for(int  j=0;j<=table;j++)
		        {
		            dp[i][j]=0;
		        }
		    }
		    for(int i=0;i<n+1;i++)
		        dp[1][i]=col[0][i-1];
		    for(int i=2;i<=table;i++)
		    {
		        dp[i][1]=0;
		    }
		    for(int i=2;i<=table;i++)
		    {
		        for(int j=2;j<=n;j++)
		        {
		            int best=1000000000;
		            for(int p=1;p<j;p++)
		            {
		                best=Math.min(best,dp[i-1][p]+col[p][j-1]);
		            }
		            dp[i][j]=best;
		        }
		    }
		    for(table =1;table<=100;table++)
		    {
		        ans=Math.min(table*k+dp[table][n],ans);
		    }
		   System.out.println(ans);
		 
		    }
		}

	}

