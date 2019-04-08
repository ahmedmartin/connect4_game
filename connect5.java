import java.util.Scanner;
import javax.swing.JOptionPane;
public class connect5{
  public static void main(String[]a)
    {
     Scanner f=new Scanner(System.in);
     int [][]c=new int[7][7];
      boolean b=true;
      for(int i=0;i<7;i++){
         c[0][i]=i;
      }

     while(b){
		 show(c);
         System.out.print("the first playr:  ");
         int x=f.nextInt();
			for(int i=6;i>=1;i--){

				if(c[i][x]==0){
				c[i][x]=1;
			    break;
			    }
			}

			show(c);
            b=(chick(c)&&row(c)&&column(c)&&chick2(c));
            if(b==false){
	              //JOptionPane.showMessageDialog(null,"the winner is the first");
				  break;}
          System.out.print("the scound playr:  ");
          int y=f.nextInt();
            for(int j=6;j>=1;j--){

				if(c[j][y]==0){
				c[j][y]=2;
				break;
			    }
			}
            b=(chick(c)&&row(c)&&column(c)&&chick2(c));

       }



  }

public static void show(int [][]x){


		 		  for(int j=0;j<7;j++){

					  System.out.print("|"+x[0][j]+"|");
				  }
				  	System.out.println("");

	           for(int i=1;i<7;i++){
	              for(int j=0;j<7;j++){
		 			if(x[i][j]==0  ){
		 			 System.out.print("| |");
				     }else if(x[i][j]==1){
						 System.out.print("|x|");
						 }else if(x[i][j]==2){
							System.out.print("|o|");
							 }


		 			  }
		 			  	System.out.println("");
		 	    	//System.out.println("\n---------------------");
	 		}

	}


public static boolean chick(int [][]x){
	boolean b=false;
	boolean c=true;
	for(int i=6;i>=4;i--){
		int t=i;
		int v=i-1;
		int s=i-2;
		int d=i-3;
		for(int j=0;j<=3;j++){
			int e=j;
			int q=j+1;
			int w=j+2;
			int z=j+3;
			if(x[t][e]==1)
			   if(x[t][e]==x[v][q]&&x[t][e]==x[s][w]&&x[t][e]==x[d][z]){
					JOptionPane.showMessageDialog(null,"the winner is the first");
                       show(x);
                     return b;

			   }

			if(x[t][e]==2)
			   if(x[t][e]==x[v][q]&&x[t][e]==x[s][w]&&x[t][e]==x[d][z]){
							JOptionPane.showMessageDialog(null,"the winner is the secund");
			                       show(x);
			                     return b;

			   }
		}
	 }
       return true;
   }
   public static boolean row(int[][]x){
 	  for(int i=6;i>=1;i--){
		 for(int j=0;j<=3;j++){
			int e=j;
			int q=j+1;
			int w=j+2;
			int z=j+3;
			if(x[i][e]==1)
			  if(x[i][e]==x[i][q]&&x[i][e]==x[i][w]&&x[i][e]==x[i][z]){
JOptionPane.showMessageDialog(null,"the winner is the first");
			            show(x);
			          return false;
			  }

			if(x[i][e]==2)
			  if(x[i][e]==x[i][q]&&x[i][e]==x[i][w]&&x[i][e]==x[i][z]){
					JOptionPane.showMessageDialog(null,"the winner is the second");
			            show(x);
			          return false;
			  }
		 }

	 }
	 return true;
 }
	 public static boolean chick2(int[][]x){
	 for(int i=6;i>=4;i--){
	 		int t=i;
	 		int v=i-1;
	 		int s=i-2;
	 		int d=i-3;
	 		for(int j=6;j>=3;j--){
	 			int e=j;
	 			int q=j-1;
	 			int w=j-2;
	 			int z=j-3;
	 			if(x[t][e]==1)
	 			   if(x[t][e]==x[v][q]&&x[t][e]==x[s][w]&&x[t][e]==x[d][z]){
	 					JOptionPane.showMessageDialog(null,"the winner is the first");
	                       show(x);
	                     return false;
	 			   }
	 			if(x[t][e]==2)
	 			   if(x[t][e]==x[v][q]&&x[t][e]==x[s][w]&&x[t][e]==x[d][z]){
	 								JOptionPane.showMessageDialog(null,"the winner is the secund");
	 			                      show(x);
	 			                    return false;
	 			   }
	 		}
       }
       return true;
   }
   public static boolean column(int[][]x){
	 	for(int i=0;i<7;i++){
			for(int j=6;j>3;j--){
				int b=j-1;
				int c=j-2;
				int d=j-3;
				if(x[j][i]==1)
				   if(x[j][i]==x[b][i]&&x[j][i]==x[c][i]&&x[j][i]==x[d][i]){
					   System.out.println("the winner is the first");
					   return false;
				   }
			    if(x[j][i]==2)
			       if(x[j][i]==x[b][i]&&x[j][i]==x[c][i]&&x[j][i]==x[d][i]){
					  System.out.println("the winner is the second");
					  return false;
				   }
			}
		}
        return true;
   }




 }