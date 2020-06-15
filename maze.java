//maze 2.0 the easy and hard levels are left!!
import java.io.*;
class maze
{
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    String a[][]=new String [27][27];
    int b[][];
    String ch="";
    char chh;
    int level;
    void main()throws IOException//ready
    {
        intro();
        try
        {
           System.out.println("\n\tEnter 1 to continue, 2 to exit:");
           int begin=Integer.parseInt(ob.readLine());
           if(begin==1)
           {
            System.out.println("\f\n\nSelect the level:\n\t\t1.Easy\n\t\t2.Medium\n\t\t3.Hard\n\n\nEnter your choice:");
            level=Integer.parseInt(ob.readLine());
            maze();
            move();
           }
           else if(begin==2)
           {
                System.exit(0);
           }
           else
           {
               System.out.print("Faulty input!\nRestarting");            
               for(int i=0;i<999999999;i++);
               System.out.print(".");            
               for(int i=0;i<999999999;i++);
               System.out.print(".");
               for(int i=0;i<999999999;i++);
               System.out.print(".");
               for(int i=0;i<999999999;i++);
               System.out.print(".");
               for(int i=0;i<999999999;i++);
               System.out.print(".");
               for(int i=0;i<999999999;i++);
               main();
            }
        }
        catch(Exception e)
        {
            System.out.print("Faulty input!\nRestarting");            
            for(int i=0;i<999999999;i++);
            System.out.print(".");            
            for(int i=0;i<999999999;i++);
            System.out.print(".");
            for(int i=0;i<999999999;i++);
            System.out.print(".");
            for(int i=0;i<999999999;i++);
            System.out.print(".");
            for(int i=0;i<999999999;i++);
            System.out.print(".");
            for(int i=0;i<999999999;i++);
            main();
        }
    }
    private void intro()//ready
    {
        System.out.println("\f\t\t\tWelcome to The Maze!\n\nRules:\n\n");
        System.out.println("1.You would have to enter the x and y co-ordinates of the point you want to move to on different lines\n\n");
        System.out.println("2.Once you press the enter key, the co-ordinate cannot be changed\n\n");
        System.out.println("3.You can move only one block at a time\n\n");
        System.out.println("4.You may enter the co-ordinate of any position around the point your pointer (:) has been to or is at now\n\n");
        System.out.println("5.The co-ordinate must not be that of a block (|||) or a star (*)\n\n");
        System.out.println("6.In case rule 4 is not satisfied, you lose and new game starts\n\n");
        System.out.println("7.Neither of the co-ordinates should be greater than 27, or else you lose and new game starts\n\n");
        System.out.println("8.The co-ordinates should be in only numeric form. Any character, if wrongly entered results in defeat\n\n");
        System.out.println("\n\t\t(For more excitement, try solving the maze without backtracing the path, and try completing the game within self-set time limits");
    }
    private void maze()//ready
    {
        for(int i=0;i<27;i++)
        {
            for(int j=0;j<27;j++)
            {
                if(i==0||j==0||i==26||j==26)
                {
                    a[i][j]=" * ";
                }
                else if(blocks(i,j)==true)
                {
                    a[i][j]="|||";
                }
                else if(blocks(i,j)==false)
                {
                    a[i][j]="   ";
                }
            }
        }
        a[1][0]=" *";
        a[1][2]="Home";
        a[25][25]="END";
    }
    private boolean blocks(int p,int q)//executable in level 2
    {
        boolean value=false;
        switch (level)
        {
            case 1: int temp[][]={{},{9,14,15,20,25},
                              {2,3,4,5,6,7,11,12,17,18,22,23},
                              {8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24},
                              {2,3,4,5,6,7,21},
                              {2,3,5,10,11,12,13,14,15,16,17,18,19,21,23},
                              {2,3,5,6,7,8,10,11,12,13,14,15,16,17,18,19,21,22,24},
                              {8},
                              {1,2,3,4,6,7,8,9,10,12,16,17,19,21,22,23},
                              {1,2,3,4,10,13,15,18,24},
                              {7,10,12,14,15,17,19,21},
                              {1,3,5,8,10,16,20,22},
                              {1,4,6,11,17},
                              {9,12,18,21,23},
                              {2,3,4,5,6,7,11,13,14,17,20,22},
                              {2,3,4,5,6,7,9,10,16,21,23,24,25},
                              {2,3,12,13,14,15,16,17,18,25},
                              {2,3,7,9,19,20,21,22,23,25},
                              {2,3,7,10,11,12,13,14,15,16,17,22,23,25},
                              {2,3,7,9,18,20,23,25},
                              {2,3,7,9,12,13,14,15,16,19,22,23,25},
                              {2,3,23,25},
                              {2,3,4,5,6,7,8,13,15,16,17,18,19,20,21,22,23,25},
                              {2,3,4,5,6,10,11,12,13,25},
                              {8,10,14,15,16,17,18,19,20,21,22,23,24,25},
                              {1,2,3,4,5,6,7,8,12},{}};
                    b=temp;
                    break;
            case 2: int temp1[][]={{},{1,3,7,10,15},
                              {1,3,4,5,9,12,15,17,19,21,22,23,24},
                              {1,3,7,10,12,13,17,19},
                              {1,3,5,6,9,10,12,13,14,15,16,17,18,19,21,23,24},
                              {12,23,24},
                              {2,3,5,6,7,8,11,12,14,15,16,17,18,19,20,21,22,24},
                              {3,9,10,12,24},
                              {5,7,12,13,15,16,22,24},
                              {1,2,3,4,5,6,7,8,9,10,11,12,14,17,18,19,20,21,22,24},
                              {2,24},
                              {4,8,9,12,14,16,17,18,19,20,21,22,23},
                              {2,5,6,7,15,23,25},
                              {2,8,10,11,12,13,14,15,17,18,19,20,23,25},
                              {2,4,8,9,17,19,23,25},
                              {2,4,9,13,16,17,20,23,25},
                              {2,5,6,9,11,12,14,15,19,21,23},
                              {2,7,9,14,23},
                              {1,5,7,9,11,14,16,21,22,23},
                              {2,7,9,13,16,18,20,22,23},
                              {1,2,4,6,9,12,16,17,18,19,24},
                              {4,6,9,12,13,14,22,24},
                              {2,6,8,15,16,17,18,19,20,21,22,24},
                              {4,5,7,8,9,11,13,15,24},
                              {2,13,15,16,18,19,20,21,22,23,24,25},
                              {1,2,3,4,5,6,7,8,9,10,15},{}};
                    b=temp1;
                    break;
            case 3: int temp2[][]={{},{9,14,15,20,25},
                              {2,3,4,5,6,7,11,12,17,18,22,23},
                              {8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24},
                              {2,3,4,5,6,7,21},
                              {2,3,5,10,11,12,13,14,15,16,17,18,19,21,23},
                              {2,3,5,6,7,8,10,11,12,13,14,15,16,17,18,19,21,22,24},
                              {8},
                              {1,2,3,4,6,7,8,9,10,12,16,17,19,21,22,23},
                              {1,2,3,4,10,13,15,18,24},
                              {7,10,12,14,15,17,19,21},
                              {1,3,5,8,10,16,20,22},
                              {1,4,6,11,17},
                              {9,12,18,21,23},
                              {2,3,4,5,6,7,11,13,14,17,20,22},
                              {2,3,4,5,6,7,9,10,16,21,23,24,25},
                              {2,3,8,12,13,14,15,16,17,18,25},
                              {2,3,7,9,19,20,21,22,23,25},
                              {2,3,7,10,11,12,13,14,15,16,17,22,23,25},
                              {2,3,7,9,18,20,23,25},
                              {2,3,7,9,12,13,14,15,16,19,22,23,25},
                              {2,3,14,23,25},
                              {2,3,4,5,6,7,8,13,15,16,17,18,19,20,21,22,23,25},
                              {2,3,4,5,6,8,10,11,12,13,25},
                              {8,10,14,15,16,17,18,19,20,21,22,23,24,25},
                              {1,2,3,4,5,6,7,8,12},{}};
                    b=temp2;
                    break;
            default:System.out.println("Error encountered in level selection. Please restart the game.");
                    break;
        }
        for(int i=0;i<b[p].length;i++)
        {
            if(b[p][i]==q)
            {
                value=true;
            }
        }
        return value;
    }
    private void move()throws IOException//left
    {
        try
        {
            disp();
            System.out.println("Enter the x and y co-ordinates of the point where you want to move on separate lines:");
            int x=Integer.parseInt(ob.readLine());
            int y=Integer.parseInt(ob.readLine());
            if(a[y][x].equals("|||")==false&&a[y][x].equals(" * ")==false)
            {
                if(a[y][x+1].equals(" : ")||a[y+1][x].equals(" : ")||a[y][x-1].equals(" : ")||a[y-1][x].equals(" : ")||a[y-1][x].equals("Home")||a[y][x+1].equals("Home")||a[y][x-1].equals("Home")||(a[y][x+1].equals("END")&&a[y][x-1].equals(":")))
                {
                    if(a[x][y].equals("END"))
                    {
                        win();
                    }
                    else
                    {
                        a[y][x]=" : ";
                        System.out.println("\f");
                        move();
                    }
                }                
                else
                {
                    System.out.println("Move one block at a time!!");
                    System.out.println("\n\nEnter n to continue....");
                    ch=ob.readLine();
                    ch=ch.toLowerCase();
                    ch=ch.trim();
                    chh=ch.charAt(0);
                    if(chh=='n')
                    {
                        System.out.println("\f");
                        move();
                    }    
                    else
                    {
                        System.out.println("NEW game will begin shortly...");
                        for(int i=0;i<999999999;i++);
                        for(int i=0;i<999999999;i++);
                        System.out.println("\f");
                        main();
                    }
                }
            }
            else
            {
                loss();
            }
        }
        catch(Exception e)
        {
            loss();
        }          
    }
    private void disp()//complete
    {
        System.out.println("\f");
        for(int i=0;i<27;i++)
        {
            for(int j=0;j<27;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    private void win()throws IOException//to be improved
    {
        try{
        System.out.println("\fCongratulations!!\n\nYOU WIN!!");
        System.out.println("\n\n\n\nEnter n to start new game, anything else to exit:");
        ch=ob.readLine();
        ch=ch.toLowerCase();
        ch=ch.trim();
        chh=ch.charAt(0);
        if(chh=='n')
        {
            System.out.println("\f");
            main();
        }
        else
        {
            System.exit(0);
        }}
        catch(Exception e)
        {
            win();
        }
    }
    private void loss()throws IOException//complete
    {
        try{
        System.out.println("\f");
        for(int i=0;i<999999999;i++);
        System.out.println("**         **       ****       **       **      **            ****             ***      *************");
        for(int i=0;i<999999999;i++);
        System.out.println(" **       **     ***     ***   **       **      **         ***    ***       ***   ***   *************");
        for(int i=0;i<999999999;i++);
        System.out.println("  **     **     ***       ***  **       **      **        ***       ***    ***          **");
        for(int i=0;i<999999999;i++);
        System.out.println("   **   **     ***         *** **       **      **       ***         ***   ***          ** ");
        for(int i=0;i<999999999;i++);
        System.out.println("    ** **      ***         *** **       **      **       ***         ***       ***      *************");
        for(int i=0;i<999999999;i++);
        System.out.println("     ***        ***       ***  **       **      **        ***       ***           ***   *************");
        for(int i=0;i<999999999;i++);
        System.out.println("     ***         ***      ***   **     **       **         ***     ***             ***  **");
        for(int i=0;i<999999999;i++);
        System.out.println("     ***          ***    ***      **  **        **********   ***  ***     ***     ***   *************");
        for(int i=0;i<999999999;i++);
        System.out.println("     ***             ****          ****         **********     ****          ****       *************");
        for(int i=0;i<999999999;i++);
        System.out.println("\n\n\n\nEnter n to start new game, anything else to exit:");
        ch=ob.readLine();
        ch=ch.toLowerCase();
        ch=ch.trim();
        chh=ch.charAt(0);
        if(chh=='n')
        {
            System.out.println("\f");
            main();
        }
        else
        {
            System.exit(0);
        }}
        catch(Exception e)
        {
            loss();
        }
    }
}