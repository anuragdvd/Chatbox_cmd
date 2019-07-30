import java.util.*;
import java.util.Date;
import java.io.*;
import java.sql.*;
class Project
{

	static String name,username,home,city,edu,pass,dob,number,gender,id,Pswrd,pswrd,fr,quesm,ans;
	static Scanner sc=new Scanner(System.in);
	static Connection con;
	static String q1="Who is your favorite actor, musician, or artist?";
	static String q2="In what city were you born?";
	static String q3="What is your father's middle name?";
	static
	{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}

	public static void login() throws Exception
	{
		cls();
		/*
		System.out.println("1. Login");
		System.out.println("2. Signup");
		System.out.println("3. Forgot Password");*/
				System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$ :-Choose:- $$$$$$$$$$$$\n\n\n");
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t1) Login\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		System.out.print("\t\t\t\t ");
		
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t2) Sign Up\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		System.out.print("\t\t\t\t ");
		
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t3)Forgot Password\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}

		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t4) Exit\t\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		System.out.print("\t\t\t\t ");

		boolean b=true;
		int co=0;
		while(b)
		{
			try
			{
										          System.out.print("\t\t\t\t\t\t\t: ");

				co=sc.nextInt();
				b=false;
				sc.nextLine();
				cls();
			}
			catch(Exception E)
			{
				System.out.println("oops something went wrong");
				sc.nextLine();
				login();
			}
			switch(co)
			{
				case 4: System.exit(0);
						break;
				case 1: 
									System.out.println("\n\n\n\n\t\t\t\t\t$$$$$$$$$$$$ :-LogIn Page:- $$$$$$$$$$$$\n");
		System.out.print("\n\n\t\t\t\t_____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Username\t|\t");
			id=sc.nextLine();
				System.out.print("\t\t\t\t________________________|____________________________________");

		System.out.print("\n\t\t\t\t_____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Password\t|\t");
			//String pswrd = PasswordField.readPassword("");
		Console cns=System.console();
			char[] ch=cns.readPassword();
				pswrd=String.valueOf(ch);
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.print("\t\t\t\t ");

							//System.out.print("Enter Username \t:\t");
							//id=sc.nextLine();
						
						//	System.out.print("Enter Password \t:\t");
							//Console cns=System.console();
							//char[] ch=cns.readPassword();
							//pswrd=String.valueOf(ch);
							//pswrd=sc.nextLine();
							PreparedStatement pstt=con.prepareStatement("select * from menu1 where username=? and password=?");
							pstt.setString(1,id);

							pstt.setString(2,decrypt(pswrd));
							ResultSet rs=pstt.executeQuery();
							if(rs.next())
							{	
								cls();
								//System.out.print("\n\n\n\t\t\t\t\t\tWelcome,");
								System.out.println("\n\n\n\n\n");
								String aa=rs.getString(2).toUpperCase();
											String[] aaa = aa.split("\\ ");

								pattern(aaa[0],5,1);
								System.out.println("Press any key to continue");
							   sc.nextLine();
								aftersign();
							}
							else
							{
								cls();
								System.out.println("Wrong username or password");
								System.out.println("Press any key to go back");
								sc.nextLine();
								login();
							}
							break;
//	static String name,username,home,city,edu,pass,dob,number,gender,Id,Pswrd,pswrd,fr;

				case 2: 


System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$ Sign Up $$$$$$$$$$$$");
							System.out.print("\t\t\t\t ");
							for(int i=1;i<=30;i++)
							{
								System.out.print("__");
							}
							System.out.print("\n\t\t\t\t\t Name   \t|\t");
							name=sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
							System.out.print("\t\t\t\t ");
							
							System.out.print("\n\t\t\t\t\t Username\t|\t");
							username=sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
		
							System.out.print("\n\t\t\t\t Password(min length 6) |\t");
							String pass =sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
							
							System.out.print("\n\t\t\t\t\t DOB(dd/mm/yyyy)|\t");
							String dob =sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
							
							System.out.print("\n\t\t\t\t\t Contact No.    |\t");
							number=sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
							
							System.out.print("\n\t\t\t\t What's your Gender \t|\t");
							System.out.print("\n\t\t\t\t\t<M> Male \t|\t");
							System.out.print("\n\t\t\t\t\t<F> Female \t|\t");
							String gender =sc.nextLine();
							System.out.print("\t\t\t\t _______________________|____________________________________");
							
							System.out.print("\n\n");
							System.out.println("\t\t\t\tSet Security Question\t\n");
							
							System.out.println("\t\t\t\t ____________________________________________________________");
							System.out.println("\t\t\t\t|1.  "+q1+"\t     |");
							System.out.println("\t\t\t\t|2.  "+q2+"   \t\t\t     |");
							System.out.println("\t\t\t\t|3.  "+q3+" \t\t     |");
							System.out.println("\t\t\t\t|____________________________________________________________|");
							System.out.print("\t\t\t\t\t\t\t\t\t\t\t   :");
							int w=sc.nextInt();
							sc.nextLine();
							if(w>3||w<0)
							{	
								cls();
								System.out.println("Oops Wrong Choice");
								System.out.println("Press any key to continue");
								sc.nextLine();
								login();
							}
							else
							{
							System.out.print("\n");
							System.out.println("\t\t\t\t __________________________________________________________");
							System.out.print("\t\t\t\t  Enter your answer \t|\t");
							ans=sc.nextLine();	
							System.out.println("\t\t\t\t|_______________________|____________________________________");
							}
																
							System.out.println("\n");
							
							PreparedStatement ps=con.prepareStatement("Select * from menu1 where username=?");
							//System.out.println("1");
							ps.setString(1,username);
							ResultSet rst=ps.executeQuery();
							//System.out.println("1");
							if(rst.next())
							{
								cls();
								System.out.println("\n\n\t\t\t\tUsername already exists...");
								System.out.println("\t\t\t\tPress any key to continue");
								System.out.print("\t\t\t\t");
								sc.nextLine();
								login();
							}
							else
							{
								if(pass.length()>=6)
								{
									//	System.out.println("2");

									PreparedStatement pst=con.prepareStatement("Insert into menu1 (username,name,Password,dob,Contact_Info,Gender,ques,ans) values(?,?,?,?,?,?,?,?)");
									pst.setString(1,username);
									pst.setString(2,name);
									pst.setString(3,encrypt(pass));
									pst.setString(4,dob);
									pst.setString(5,number);
									pst.setString(6,gender);
									pst.setInt(7,w);
									pst.setString(8,encrypt(ans));
									if(pst.executeUpdate()>0)
									{
										cls();
										System.out.println("\n\n\t\t\t\tYou are Successfully signed up ");
										System.out.println("\t\t\t\tPress any key to continue");
										System.out.print("\t\t\t\t");
										sc.nextLine();
										cls();
										login();
									}
								}
								else
								{
									//System.out.println("3");

									cls();
									System.out.println("\n\t\t\t\tPassword must be 6 length long");
									System.out.println("\t\t\t\tPress any key to continue");
																	System.out.print("\t\t\t\t");

									sc.nextLine();
									login();

								}
							}

				break;
					case 3:
							cls();

		System.out.println("\n\n\n\n\t\t\t\t\t$$$$$$$$$$$$ :-Forgot Password:- $$$$$$$$$$$$\n");
		
		System.out.print("\n\n\t\t\t\t _____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Username\t|\t");
		String temp =sc.nextLine();
		System.out.print("\t\t\t\t _______________________|_____________________________________");
		System.out.print("\t\t\t\t ");
		
		String qq="";
									PreparedStatement pst=con.prepareStatement("select ques from menu1 where username=?");
							pst.setString(1,temp);
							ResultSet rse=pst.executeQuery();
							if(rse.next())
							{
								int u=rse.getInt(1);
								if(u==1)
								{	
									qq=q1;
								}
								else if(u==2)
								{	
									qq=q2;
								}
								else if(u==3)
								{
									qq=q3;
								}		
	



		System.out.print("\n\n\t\t\t\t _____________________________________________________________");
		System.out.print("\n\t\t\t\t\t"+ qq+"      |\t");
		System.out.print("\n\t\t\t\t_____________________________________________________________");
				System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t:");
		String anss=sc.nextLine();
		anss=encrypt(anss);
		
								PreparedStatement pse=con.prepareStatement("select ans from menu1 where username=?");
								pse.setString(1,temp);
								//System.out.println("1");
								ResultSet rsss=pse.executeQuery();
								//System.out.println("1");
								while(rsss.next())
								{
								if(rsss.getString(1).equals(anss))
								{
									

System.out.print("\n\n\t\t\t\t _____________________________________________________________");
		System.out.print("\n\t\t\t\t Enter your new password (min 6 characters) \t|");
		String passs =sc.nextLine();
		System.out.print("\t\t\t\t _______________________|_____________________________________");

									if(passs.length()>=6)
									{
									PreparedStatement psss=con.prepareStatement("update menu1 set Password=? where username=?");
									psss.setString(2,temp);
									psss.setString(1,encrypt(passs));
										if(psss.executeUpdate()>0)
										{
										System.out.println("\n\t\t\t\tPassword Updated");
										System.out.print("\n \n");
										System.out.println("\t\t\t\tPress any key to continue");
										System.out.print("\t\t\t\t");
										sc.nextLine();
										login();
										} 
										else
										{
										System.out.println("\n\n\n\n\n\t\t\t\tSomething went wrong!!!\n Please try again.");
										System.out.print("\n \n");
										System.out.println("\t\t\t\tPress any key to continue");
																	          System.out.print("\t\t\t\t\t ");

										sc.nextLine();
										login();
										}
									}
									else
									{
										System.out.println("\n\n\t\t\t\tPassword must be minimum 6 characters.");
										System.out.print("\n \n");
										System.out.println("\t\t\t\tPress any key to continue");
										System.out.print("\t\t\t\t");
										sc.nextLine();

										login();										
									}
								}
								else
								{
									System.out.println("\n\n\t\t\t\tWrong Answer.");
										System.out.print("\n \n");
										System.out.println("\t\t\t\tPress any key to continue");
										System.out.print("\t\t\t\t");
										sc.nextLine();

										login();		
								}
							}
							}
							else
							{
								System.out.println("\n\n\t\t\t\tUsername doesn't exist.");
								System.out.println("\n\t\t\t\tPress any key to continue");
																		System.out.print("\t\t\t\t");
sc.nextLine();
								login();

							}
							break;
				default:
						cls();
						System.out.println("\t\t\t\tOops Wrong choice");
									System.out.println("\t\t\t\tPress any key to continue");
																			System.out.print("\t\t\t\t");

									sc.nextLine();
									login();
			}
		}

	}


	public static void aftersign() throws Exception
	{
		cls();
		//Scanner sc=new Scanner(System.in);
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t1) View Complete Profile\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t2) Setting\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t3) Find New Friends\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");

		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t4) Friend Request\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");
		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t5) Friend List\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");
		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t6) Chat With Friends\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");
		}
		//Next Option Yaha se hai
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t7)Log Out\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");
		}
		
		        //  System.out.print("\t\t\t\t\t ");
		 System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\t8) Exit\t\t\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
			if(i==30)
				System.out.println("|");
		}

		System.out.print("\n\t\t\t\tEnter your Choice :-");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: 
			view();
			break;
			case 2:
			{
				cls();
				System.out.println("\t\t\t\t\t\t$$$$$$$$$$$$ SETTING $$$$$$$$$$$$");
				System.out.print("\t\t\t\t ");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
				}
				System.out.println("\n\t\t\t\t|\t1) Edit Your Profile\t\t\t\t     |");
				System.out.print("\t\t\t\t|");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
					if(i==30)
						System.out.println("|");
				}
				//Next Option Yaha se hai
				System.out.print("\t\t\t\t ");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
				}
				System.out.println("\n\t\t\t\t|\t2) Delete Your Id\t\t\t\t     |");
				System.out.print("\t\t\t\t|");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
					if(i==30)
						System.out.println("|");
				}
				System.out.print("\t\t\t\t ");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
				}
				System.out.println("\n\t\t\t\t|\t3) Previous Menu\t\t\t\t     |");
				System.out.print("\t\t\t\t|");
				for(int i=1;i<=30;i++)
				{
					System.out.print("__");
					if(i==30)
						System.out.println("|");
				}
				System.out.print("\t\t\t\tEnter your Choice :-");
				          System.out.print("\t\t\t\t\t ");

				int choice1=sc.nextInt();
				switch(choice1)
				{
					case 1: 
							cls(); 
							UpdateProfile();
							break;
					case 2: 
							cls();
							sc.nextLine();
							System.out.println("\t\t\t\tDo you want to delete your account? Yes/No");
							
							String del=sc.nextLine();
							if(del.equalsIgnoreCase("yes"))
							{	//System.out.println("1");
								PreparedStatement pp=con.prepareStatement("delete from menu1 where username=?");
								//System.out.println("1");
								pp.setString(1,id);
								//System.out.println("1");
								if(pp.executeUpdate()>0)
									{
										System.out.println("\t\t\t\tYour ID has been deleted Successfully");
										System.out.println("\t\t\t\tPress any key to continue");
										          System.out.print("\t\t\t\t\t ");

										sc.nextLine();
										//sc.nextLine();
										login();
									}
								else
								{									
									System.out.println("\t\t\t\tSomething went wrong");
									System.out.println("\t\t\t\tPress any key to continue");
									          System.out.print("\t\t\t\t\t ");

									sc.nextLine();
									login();
								}

							}
							else
							{
								aftersign();

							}
							break;
						case 3:
							aftersign();
							break;
					default:
						System.out.println("\t\t\t\tInvalid choice");
						System.out.println("\t\t\t\tPress any key to continue");
						          System.out.print("\t\t\t\t\t ");

						sc.nextLine();
						aftersign();
				}
				break;
			}
			case 3: 
			sc.nextLine();
			explore(); 
			break;

			case 4: req(); 
			break;

			case 5:  friends();
			break;

			case 6:
				chat();
			 break;

			case 7: 
					cls();
					System.out.println("Thank you for using CHATBOX"); 
					System.out.println("Press any key to continue");
					login();
					break;
			case 8:
			System.exit(0);
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}

	public static void cls()
	{
	 	try{
	   		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	  	}
	  	catch(Exception e){
		}
	}

	public static void UpdateProfile() throws Exception
	{


		
		cls();
		System.out.print("\t\t\t\t ");
		for(int i=1;i<=30;i++)
		{
			System.out.print("__");
		}
		System.out.println("\n\t\t\t\t|\tUPDATE PROFIE ::\t\t\t\t     |");
		System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");
			}
		PreparedStatement pst=con.prepareStatement("Select * from menu1 where username=?");
		
		pst.setString(1,id);
		ResultSet res=pst.executeQuery();
		if(res.next())
		{
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t1. User_Name \t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t2. Name \t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t3. Date of Birth \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t4. Current City \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t5. Education \t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t6. Occupation \t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t7. Relationship \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t8. Bio \t\t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t9. Previous Menu \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");
			}
			System.out.println(" \n\t\t\t\t Enter the field no. :-");
			System.out.print("\t\t\t\t");
		}
	

			int a=0;
			
				
				a=sc.nextInt();
				switch(a)
				{
					case 1: char ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set username=? where username=?");
								System.out.println("\t\t\t\tEnter new User_Name :");
								System.out.print("\t\t\t\t");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);
								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tUser_Name Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
																	aftersign();

								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
																	aftersign();

								}
							}
								break;
					case 2:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set name=? where username=?");
								System.out.println("\t\t\t\tEnter new Name :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tName Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();

								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								}

							}
							break;
						case 3:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set dob=? where username=?");
								System.out.println("\t\t\t\tEnter new Date  of Birth :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tDate of Birth Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
																aftersign();

								}
							}
							break;
						case 4:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set city=? where username=?");
								System.out.println("\t\t\t\tEnter new Current city :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tName Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								}
							}
							
							break;
						
						case 5:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set Education=? where username=?");
								System.out.println("\t\t\t\tEnter new Education :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tEducation Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								}
							}
							
							break;
						case 6:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("Update menu1 set occupation=? where username=?");
								System.out.println("\t\t\t\tEnter new Occupation :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tOccupation Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								}
							}
							
							break;
						case 7:  ch='a';
							while( ch=='A'||ch=='a')
							{
								pst=con.prepareStatement("\t\t\t\tUpdate menu1 set relationship=? where Username=?");
								System.out.println("\t\t\t\tEnter new Relationship Status :");
								sc.nextLine();
								pst.setString(1,sc.nextLine());
								pst.setString(2,id);

								if(pst.executeUpdate()>0)
								{
									System.out.println("\t\t\t\tRelationship Status Updated....");
									ch='b';
									System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								} 
								else
								{
									System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
								}
							}
							
							break;
						case 8:  ch='a';
								while( ch=='A'||ch=='a')
								{
									pst=con.prepareStatement("\t\t\t\tUpdate menu1 set bio=? where username=?");
									System.out.println("\t\t\t\tEnter new bio :");
									sc.nextLine();
									pst.setString(1,sc.nextLine());
									pst.setString(2,id);

									if(pst.executeUpdate()>0)
									{
										System.out.println("\t\t\t\tBio Updated....");
										ch='b';
										System.out.print("\n\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
									} 
									else
									{
										System.out.println("\t\t\t\tSomething went wrong!!!\n Please try again.");
									System.out.print("\n");
									System.out.println("\t\t\t\tPress any key to continue");
									sc.nextLine();
									aftersign();
									}
								}
								
								break;
						case 9: 
								aftersign();
								break;
						default: 
						System.out.println("\t\t\t\tWrong Choice Selected...please try again");
									System.out.println("\t\t\t\tPress any key to continue");
									System.out.print("\t\t\t\t");
									sc.nextLine();
									aftersign();
									break;
				
			

			}
		
	/*	else
		{
			System.out.println("OOPS Something went wrong!!");
			System.out.println("Press any key to continue");
			sc.nextLine();
			aftersign();
		} */

}
	public static void explore() throws Exception
	{
		cls();
		int c=0;
		String chck="";
      	PreparedStatement pst=con.prepareStatement("select username,name from menu1");
      	ResultSet rs=pst.executeQuery();
      	System.out.print("\t\t\t\t\t\t\t$$$$$$ Find New People $$$$$$\n\n");
      	System.out.println("\n\t\t\t\t _____________________________________________________________________________");
      	System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.no","|","Username","|","Name","|");
      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");

      	while(rs.next())
      	{
      		if(rs.getString(1).equals(id))
      		continue;
      		c++;
      		System.out.println("\t\t\t\t _____________________________________________________________________________");
      		System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs.getString(1),"|",rs.getString(2),"|");
	      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");

      	}
      	++c;
      	System.out.print("\n \n");
      	System.out.println("\t\t\t\t\t"+c+"\t Previous menu");
      	if(c==0)
      	{
      		System.out.println("\t \t No one has joined yet. Maybe call your friends to join.");
      		System.out.println("\t \t Press any key to continue");
      		          System.out.print("\t\t\t\t\t ");

      		sc.nextLine();
      		aftersign();
      	}
      	else
      	{
      				System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
      		System.out.println("\t\t\t\t\t  Press "+c+" to go to previous menu");
      		System.out.println("\t\t\t\t\t  Enter UserID to add new people");
      		          System.out.print("\t\t\t\t\t ");

      		//sc.nextLine();
      		
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String hmm = br.readLine(); 
      		          //sc.nextLine();
	//String hmm=sc.nextLine();     		
      		int o=0; int m=0;
      		if(hmm.equalsIgnoreCase(String.valueOf(c)))
      		{
      			aftersign();
      		}
      		
      		else
      		{
      			PreparedStatement h=con.prepareStatement("Select username from menu1");
      			ResultSet rh=h.executeQuery();
      			while(rh.next())
      			{
      				if(hmm.equals(rh.getString(1)))
      				{
      					o++;
      				}
      			}
      			if(o==0)
      			{
      			System.out.println("\t\t\t\t\t  Username not found");
				System.out.println("\t\t\t\t\t  Press any key to continue...");
				          System.out.print("\t\t\t\t\t ");

				sc.nextLine();
				cls();
				explore();
      			}
      			else{
        		PreparedStatement pst3=con.prepareStatement("select s1,s2 from menu2 where user1='"+id+"' and user2='"+hmm+"'");
          		ResultSet rs1=pst3.executeQuery();
          		while(rs1.next())
          		{
            	if(rs1.getString(1).equals("false") && rs1.getString(2).equals("false"))
            	m=0;
            	else
            	m++;
          		}
          if(m==0){
        			PreparedStatement pst1=con.prepareStatement("insert into menu2 values(?,?,?,?,?,?)");
        			pst1.setString(1,id);
       				 pst1.setString(2,hmm);
       				 pst1.setString(3,"false");
       					 pst1.setString(4,"true");
      				  pst1.setString(5,"false");
      					  pst1.setString(6,"");
       			 PreparedStatement pst2=con.prepareStatement("insert into menu2 values(?,?,?,?,?,?)");
       			 pst2.setString(1,hmm);
       			 pst2.setString(2,id);
       				 pst2.setString(3,"false");
       			 pst2.setString(4,"false");
       				 pst2.setString(5,"false");
      			  pst2.setString(6,"");
        if(pst1.executeUpdate()>0 && pst2.executeUpdate()>0)
        {
          System.out.println("\t\t\t\t\t  Request sent Successfully.....");
          System.out.println("\t\t\t\t\t  Press any key to continue....");
          //sc.nextLine();
          System.out.print("\t\t\t\t\t ");
          sc.nextLine();
          cls();
          explore();
        }
        else{
          System.out.println("\t\t\t\t\t  Something went wrong.....");
          System.out.println("\t\t\t\t\t  Press any key to continue....");
          sc.nextLine();
        	 cls();
          explore();
        }
        }
        else{
          System.out.println("\t\t\t\t\t  Already Request Sent or you are already friend");
					System.out.println("\t\t\t\t\t  Press any key to continue...");
					sc.nextLine();
					cls();
					explore();
        }
      }
    } 
      		}

      	}

public static void req()throws Exception
{
	int o=0,c=1; //count
	cls();
System.out.print("\t\t\t\t\t\t\t****** Friend Requests ******\n\n");
      	System.out.println("\n\t\t\t\t _____________________________________________________________________________");
      	System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.no","|","Username","|","Name","|");
      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
;
	PreparedStatement pst=con.prepareStatement("select s1,s2,user2 from menu2 where user1='"+id+"'");     
    ResultSet rs=pst.executeQuery();
    System.out.print("\n");
    while(rs.next())
    {
        o++;
        if(rs.getString(1).equals("false") && rs.getString(2).equals("false"))
        {
          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(3)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
          	System.out.println("\t\t\t\t _____________________________________________________________________________");
      		System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs1.getString(1),"|",rs1.getString(2),"|");
	      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
        // System.out.printf("\n\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs1.getString(1),"|",rs1.getString(2),"|");
         c++;
     }
 }
}
		System.out.println("\n\n\n\t\t\t\t\t"+c+") \tPrevious Menu");
		o=0;
		System.out.println("\n\n");
		System.out.println("\t\t\t\tType the User ID to check other people profile else press "+c+" to Go to previous page");
		System.out.print("\t\t\t\t");
		//sc.nextLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String usr = br.readLine(); 
		// String usr=sc.nextLine();
			Integer y=new Integer(c);
			String s=y.toString();
		if(s.equalsIgnoreCase(usr))
			aftersign();
		else
		{
			PreparedStatement f=con.prepareStatement("select username from menu1 where username=?");
			f.setString(1,usr);
			ResultSet rst=f.executeQuery();
			if(rst.next())
			{
				submenu(usr,id);
			}
			else
			{
				System.out.println("\t\t\t\t\t  Username is not in database!");
				System.out.print("\t\t\t\t\t  Press any key to continue");
				sc.nextLine();
				req();
			}
		}
}


public static void submenu(String user,String id) throws Exception
{
	cls();

System.out.print("\t\t\t\t\t\t\tRespond to Request");
		System.out.print("\n\n");
		System.out.print("\t\t\t\t ");
			
			
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t1. Accept Request \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t2. Delete Request \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t3. View User Profile \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}

			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t4. Previous Menu \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}


			/*System.out.print("\n\n\t\t\t\t _____________________________________________________________");
	System.out.print("\n\t\t\t\t|\t 1. Accept Request\t\t\t\t|");
		System.out.print("\t\t\t\t ____________________________________________________________");
			System.out.print("\n\n\t\t\t\t _____________________________________________________________");
	System.out.println("\t\t\t\t 2. Decline Request");
		System.out.print("\t\t\t\t _______________________|_____________________________________");
			System.out.print("\n\n\t\t\t\t _____________________________________________________________");
	System.out.println("\t\t\t\t 3. Previous Menu");
		System.out.print("\t\t\t\t _______________________|_____________________________________");
		System.out.print("\t\t\t\t");*/

	PreparedStatement pst1=con.prepareStatement("select * from menu1 where username='"+user+"'");
      ResultSet rs1=pst1.executeQuery();
						          System.out.print("\t\t\t\t\t ");

		int k=sc.nextInt();
		/*if(k!=1||k!=2||k!=3)
		{
			System.out.println("\t\t\t\t Wrong Choice....");
			System.out.println("\t\t\t\t Press any key to continue");
			sc.nextLine(); 
			sc.nextLine();
			req();
		}*/
		switch(k)
		{
			case 1: 
			while(rs1.next())
			{
            PreparedStatement pst=con.prepareStatement("update menu2 set s1='true',s2='true' where user1='"+user+"' and user2='"+id+"'");
            PreparedStatement pst2=con.prepareStatement("update menu2 set s1='true',s2='true' where user1='"+id+"' and user2='"+user+"'");
            if(pst.executeUpdate()>0 && pst2.executeUpdate()>0)
            System.out.println("\t\t\t\t  You are Friends Now! Enjoy Talking!");
						System.out.print("\t\t\t\t  Press any key to continue.....");
						sc.nextLine();
						sc.nextLine();
						req();
          }
          break;
          case 2:
          while(rs1.next())
          {
            PreparedStatement pst=con.prepareStatement("delete from menu2 where user1='"+user+"' and user2='"+id+"'");
            PreparedStatement pst2=con.prepareStatement("delete from menu2 where user1='"+id+"' and user2='"+user+"'");
            if(pst.executeUpdate()>0 && pst2.executeUpdate()>0)
				System.out.print("\n\t\t\t\t\t ");
            System.out.print("\t\t\t\tRequest Deleted");
						System.out.print("\n\t\t\t\t\t  Press any key to continue...");
						System.out.print("\n\t\t\t\t");
							sc.nextLine();
						sc.nextLine();
						req();
		} break;
		case 4:
		req();
		break;
		case 3:
		viewff(id,user);

		break;

		default: System.out.println("\t\t\t\t You entered wrong choice..");
		System.out.println("\t\t\t\t Press any key to continue..");
		sc.nextLine();
		submenu(user,id);


	}

}

public static void friends() throws Exception
{
	int o=0,c=1;
	cls();
	System.out.print("\t\t\t\t\t\t\t***** Friends *****\n\n");
      	System.out.println("\n\t\t\t\t _____________________________________________________________________________");
      	System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.no","|","Username","|","Name","|");
      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
	//System.out.print("\t\t\t\t");
	//for(int i=1;i<=77;i++)
	//	System.out.print("_");
	PreparedStatement pst=con.prepareStatement("select s1,user2 from menu2 where user1='"+id+"'");
    ResultSet rs=pst.executeQuery();
    while(rs.next())
    {
    	if(rs.getString(1).equals("true"))
    	{
    		PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username=?");
    		pst1.setString(1,rs.getString(2));
         	ResultSet rs1=pst1.executeQuery();
         	while(rs1.next())
         	{
         		System.out.println("\t\t\t\t _____________________________________________________________________________");
      		System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs1.getString(1),"|",rs1.getString(2),"|");
	      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
            	//System.out.printf("\n\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs1.getString(1),"|",rs1.getString(2),"|");
				//System.out.print("\n\t\t\t\t\t ");

            }
            o++;
            c++;
    	}

    }
    if(o==0)
    {
    	System.out.println("\n\n");
    	System.out.println("\t\t\t\t No Friends Found! Try making new freinds");
    	System.out.println("\t\t\t\t Press any key to go back to previous menu");
    	sc.nextLine();
    	sc.nextLine();
    	aftersign();
    }
    else
    {
    	System.out.println("\n\n");
    	System.out.println("\t\t\t\t\t Press 1 to check friend profile");
    	System.out.println("\t\t\t\t\t Press 2 to remove friend");
    	System.out.println("\t\t\t\t\t Press 3 to go to Previous menu");
    							          System.out.print("\t\t\t\t\t ");

    	int co=sc.nextInt();
    	switch(co)
    	{

    		case 1 : 
    				System.out.println("\t\t\t\t\t Enter your friend ID");
    				System.out.print("\t\t\t\t\t");
    				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String umm = br.readLine(); 

					PreparedStatement y=con.prepareStatement("Select * from menu1 where username=?");
					y.setString(1,umm);
					ResultSet yy=y.executeQuery();
					if(yy.next())
    				viewf(umm); 
    				else
    				{
    					System.out.println("\t\t\t\t Please enter a valid ID");
    					System.out.println("\t\t\t\t Press any key to continue");
    					System.out.print("\t\t\t\t");
    					sc.nextLine();
    					friends();
    					    				}
    				break;
    		case 2 :  
    		System.out.print("\n\n");
    		System.out.println("\t\t\t\t  Enter the username of your friend: ");
    		System.out.print("\t\t\t\t ");
	 		sc.nextLine();
	 		String fr=sc.nextLine();

	 		PreparedStatement pst2=con.prepareStatement("delete from menu2 where user1='"+id+"' and user2='"+fr+"'");
         	PreparedStatement pst1=con.prepareStatement("delete from menu2 where user1='"+fr+"' and user2='"+id+"'");
       		if(pst2.executeUpdate()>0 && pst1.executeUpdate()>0)
        	  System.out.println("\t\t\t\t  You are no longer friends with "+fr);
					System.out.print("\t\t\t\t Press any key to continue...");
					sc.nextLine();
					friends();
    		break;
    		case 3 : aftersign(); 
    		break;
    		default : System.out.println("\t\t\t\t Wrong Choice");
    		System.out.println("\t\t\t\t Press any key to continue");		
    		sc.nextLine();
    		friends();
    	}
    }


}



	public static void view() throws Exception
	{
		cls();
		PreparedStatement ps=con.prepareStatement("select username,name,dob,Contact_Info,Gender,Education,city,relationship,occupation,bio from menu1 where username=?");
		ps.setString(1,id);
		ResultSet rs=ps.executeQuery();
		System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$ Your Profile $$$$$$$$$$$$\n");
		if(rs.next())
		{
		System.out.print("\n\n\n\n\t\t\t\t_____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Username\t|\t");
		System.out.println(rs.getString(1));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.print("\t\t\t\t ");
		
		System.out.print("\n\t\t\t\t\t Name\t\t|\t");
		System.out.println(rs.getString(2));
		System.out.print("\t\t\t\t________________________|____________________________________");

		System.out.print("\n\t\t\t\t    DOB(dd/mm/yyyy)     |\t");
		System.out.println(rs.getString(3));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Contact No. \t|\t");
		System.out.println(rs.getString(4));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Gender \t|\t");
		System.out.println(rs.getString(5));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Education \t|\t");
		System.out.println(rs.getString(6));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t City \t\t|\t");
		System.out.println(rs.getString(7));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Relationship \t|\t");
		System.out.println(rs.getString(8));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Occupation \t|\t");
		System.out.println(rs.getString(9));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Bio \t\t|\t");
		System.out.println(rs.getString(10));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.println("\n\t\t\t\t\t Press any key to go back");
		System.out.print("\t\t\t\t");
		sc.nextLine();
		sc.nextLine();
		aftersign();
		}
		else
		{
			System.out.println("\t\t\t\t Something Went Wrong");
			System.out.println("\t\t\t\t Press any key to continue");
			System.out.print("\t\t\t\t");
			sc.nextLine();
			aftersign();
		}

	}

	public static void viewf(String idd) throws Exception
	{
		cls();
		PreparedStatement pss=con.prepareStatement("select username,name,dob,Contact_Info,Gender,Education,city,relationship,occupation,bio from menu1 where username=?");
		pss.setString(1,idd);
		ResultSet rs=pss.executeQuery();
		System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$"+idd+" Profile $$$$$$$$$$$$\n");
		if(rs.next())
		{
		System.out.print("\n\n\n\n\t\t\t\t_____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Username\t|\t");
		System.out.println(rs.getString(1));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.print("\t\t\t\t ");
		
		System.out.print("\n\t\t\t\t\t Name\t\t|\t");
		System.out.println(rs.getString(2));
		System.out.print("\t\t\t\t________________________|____________________________________");

		System.out.print("\n\t\t\t\t    DOB(dd/mm/yyyy)     |\t");
		System.out.println(rs.getString(3));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Contact No. \t|\t");
		System.out.println(rs.getString(4));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Gender \t|\t");
		System.out.println(rs.getString(5));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Education \t|\t");
		System.out.println(rs.getString(6));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t City \t\t|\t");
		System.out.println(rs.getString(7));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Relationship \t|\t");
		System.out.println(rs.getString(8));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Occupation \t|\t");
		System.out.println(rs.getString(9));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Bio \t\t|\t");
		System.out.println(rs.getString(10));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.println("\n\t\t\t\t\t Press any key to go back");
				sc.nextLine();
//	sc.nextLine();	sc.nextLine();	sc.nextLine();	sc.nextLine();
		sc.nextLine();
		friends();
		}
		else
		{
			System.out.println("\t\t\t\t Something Went Wrong");
			System.out.println("\t\t\t\t Press any key to continue");
			sc.nextLine();
			sc.nextLine();
			aftersign();
		}

	}	



	public static void viewff(String user,String idd) throws Exception
	{
		cls();
		PreparedStatement pss=con.prepareStatement("select username,name,dob,Contact_Info,Gender,Education,city,relationship,occupation,bio from menu1 where username=?");
		pss.setString(1,idd);
		ResultSet rs=pss.executeQuery();
		System.out.println("\n\n\n\n\t\t\t\t\t\t$$$$$$$$$$$$"+idd+" Profile $$$$$$$$$$$$\n");
		if(rs.next())
		{
		System.out.print("\n\n\n\n\t\t\t\t_____________________________________________________________");
		System.out.print("\n\t\t\t\t\t Username\t|\t");
		System.out.println(rs.getString(1));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.print("\t\t\t\t ");
		
		System.out.print("\n\t\t\t\t\t Name\t\t|\t");
		System.out.println(rs.getString(2));
		System.out.print("\t\t\t\t________________________|____________________________________");

		System.out.print("\n\t\t\t\t    DOB(dd/mm/yyyy)     |\t");
		System.out.println(rs.getString(3));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Contact No. \t|\t");
		System.out.println(rs.getString(4));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Gender \t|\t");
		System.out.println(rs.getString(5));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Education \t|\t");
		System.out.println(rs.getString(6));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t City \t\t|\t");
		System.out.println(rs.getString(7));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Relationship \t|\t");
		System.out.println(rs.getString(8));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Occupation \t|\t");
		System.out.println(rs.getString(9));
		System.out.print("\t\t\t\t________________________|____________________________________");
		
		System.out.print("\n\t\t\t\t\t Bio \t\t|\t");
		System.out.println(rs.getString(10));
		System.out.print("\t\t\t\t________________________|____________________________________");
		System.out.println("\n\t\t\t\t\t Press any key to go back");
				sc.nextLine();
//	sc.nextLine();	sc.nextLine();	sc.nextLine();	sc.nextLine();
		sc.nextLine();
		submenu(user,idd);

		}
		else
		{
			System.out.println("\t\t\t\t Something Went Wrong");
			System.out.println("\t\t\t\t Press any key to continue");
			sc.nextLine();
			sc.nextLine();
			aftersign();
		}

	}	


public static void chat() throws Exception
{
	cls();
	System.out.print("\t\t\t\t\t\t\tCHAT");
		System.out.print("\n\n");
		System.out.print("\t\t\t\t ");
			
			
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t1.Talk To A New Friend \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t2. Recent Chat \t\t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
			}
			System.out.println("\n\t\t\t\t|\t3. Previous Menu \t\t\t\t     |");
			System.out.print("\t\t\t\t|");
			for(int i=1;i<=30;i++)
			{
				System.out.print("__");
				if(i==30)
				System.out.println("|");

			}

			int c=0;
			int op=0;
			System.out.print("\n\t\t\t\t");
			try
			{
			op=sc.nextInt();
		}
			catch(Exception E)
			{
				System.out.println("\n\t\t\t\tSomething went wrong");
				System.out.println("\n\t\t\t\tPress any key to continue");
							System.out.print("\n\t\t\t\t");
							sc.nextLine();
							chat();

			}
			switch(op)
			{
				case 1:
						newchat();
						break;
				case 2:
						sc.nextLine();
						recent();
						break;
				case 3:
						aftersign();
						break;
				default:
					System.out.println("\n\t\t\t\tWrong Input");
				System.out.println("\n\t\t\t\tPress any key to continue");
							System.out.print("\n\t\t\t\t");
							sc.nextLine();
							chat();
			}

	}

static public void newchat()throws Exception
{
		cls();
		int c=1,o=0;
		System.out.print("\t\t\t\t\t\t\t$$$$$$ Friend $$$$$$\n\n");
      	System.out.println("\n\t\t\t\t _____________________________________________________________________________");
      	System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.no","|","Username","|","Name","|");
      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");

      	PreparedStatement pst=con.prepareStatement("select s1,user2 from menu2 where user1='"+id+"'");
   		 ResultSet rs=pst.executeQuery();
    	while(rs.next())
    	{
    	if(rs.getString(1).equals("true"))
    	{
    		PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username=?");
    		pst1.setString(1,rs.getString(2));
         	ResultSet rs1=pst1.executeQuery();
         	while(rs1.next())
         	{
      		System.out.println("\t\t\t\t _____________________________________________________________________________");
      		System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rs1.getString(1),"|",rs1.getString(2),"|");
	      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");

            }
            o++;
            c++;
    	}
    }
    String fr="";
    	if(o==0)
    	{
    		sc.nextLine();
    		System.out.println("\n\n\t\t\t\tNo Friends in your ID");
    		System.out.println("\t\t\t\tPress any key to continue");
    		sc.nextLine();
    		chat();
    	}
    	
    	else
    	{
    		      	System.out.print("\n \n");
      	System.out.println("\t\t\t\t\t"+c+"\t Previous menu");
      	
    		int i=0;
    		
    		   System.out.println("\n\t\t\t\tEnter the username of your friend or Press "+c+"for Previous Menu");
    		   System.out.print("\t\t\t\t");
    		   sc.nextLine();

    		 fr=sc.nextLine();
    		 if(fr.equalsIgnoreCase(String.valueOf(c)))
    		{
    		chat();
    		}
    		else{
    		 PreparedStatement pstt=con.prepareStatement("select * from menu1 where username=?");
    		 pstt.setString(1,fr);
    		 ResultSet rss=pst.executeQuery();
    		 while(rss.next())
    		 {
    		 	i++;
    		 }
    		 if(i==0)
    		 {
    		 	System.out.println("\n\n");
    		 	System.out.println("\n\t\t\t\tUsername Not found");
    		 	System.out.println("\n\t\t\t\tPress any key to continue");
    		 	sc.nextLine();
    		 	chat();

    		 }
    		 else
    		 {
    		 	PreparedStatement ps1=con.prepareStatement("select s3 from menu2 where user1=? and user2=?");
    		 	ps1.setString(1,id);
    		 	ps1.setString(2,fr);
    		 	ResultSet r1=ps1.executeQuery();
    		 	PreparedStatement ps2=con.prepareStatement("select s3 from menu2 where user1=? and user2=?");
    		 	ps2.setString(1,fr);
    		 	ps2.setString(2,id);
    		 	ResultSet r2=ps2.executeQuery();
    		 	while(r1.next())
    		 {
    		 	while(r2.next())
    		 	{
    		 		 if(r1.getString(1).equals("false") && r2.getString(1).equals("false"))
    		 		 {
    		 		 	PreparedStatement ps3=con.prepareStatement("update menu2 set s3='true' where user1=? and user2=?");
    		 		 	ps3.setString(1,id);
    		 		 	ps3.setString(2,fr);
    		 		 	ps3.executeUpdate();
    		 		 	cls();
    		 		 	System.out.print("\t\t\t\t\t\t\t$$$$$$ Enjoy Chat $$$$$$\n\n");
    		 		 	mainchat(id,fr);
    		 		 }
    		 		 else
    		 		 {
    		 		 	recent();
    		 		 }

    		 	}
    		 }
    		 }}
    	}


     
}


public static void mainchat(String user1,String user2)throws Exception
{
		String root="";
		String stn="";
		String old="";
		String end="____ ";

		PreparedStatement pst=con.prepareStatement("select s3 from menu2 where user1='"+user1+"' and user2='"+user2+"'");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			if(rs.getString(1).equals("true")){
				PreparedStatement pst1=con.prepareStatement("select chat from menu2 where user1='"+user1+"' and user2='"+user2+"'");
				ResultSet rs1=pst1.executeQuery();
				while(rs1.next())
				{
				old=rs1.getString(1);
				}
				String chatt=sc.nextLine();
				stn=user1 + end + " ";
					root= old + stn + chatt;
				PreparedStatement ps2=con.prepareStatement("update menu2 set chat='"+root+"' where user1='"+user1+"' and user2='"+user2+"'");
				ps2.executeUpdate();


			}
			else
			{
				PreparedStatement pst1=con.prepareStatement("select chat from menu2 where user1='"+user2+"' and user2='"+user1+"'");
				ResultSet rs1=pst1.executeQuery();
				while(rs1.next())
				{
				old=rs1.getString(1);
				}
				String chatt=sc.nextLine();
				stn=user1 + end + " ";
					root= old + stn + chatt;
				
				PreparedStatement ps2=con.prepareStatement("update menu2 set chat='"+root+"' where user1='"+user2+"' and user2='"+user1+"'");
				ps2.executeUpdate();

			}
		}
		chat();
}

public static void recent()throws Exception
{
	int o=0,c=1;
	cls();
	System.out.print("\t\t\t\t\t\t\t$$$$$$ Recent Chat $$$$$$\n\n");
      	System.out.println("\n\t\t\t\t _____________________________________________________________________________");
      	System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.no","|","Username","|","Name","|");
      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
	//System.out.print("\t\t\t\t");
	//for(int i=1;i<=77;i++)
	//	System.out.print("_");
	PreparedStatement pst=con.prepareStatement("select s3,user2 from menu2 where user1=?");
	pst.setString(1,id);
    ResultSet rs=pst.executeQuery();
   //int a=0;
    while(rs.next())
    {
    
    	
    		PreparedStatement pst1=con.prepareStatement("select s3,user1 from menu2 where user2=?");
    		pst1.setString(1,id);
         	ResultSet rs1=pst1.executeQuery();
         	while(rs1.next())
         	{
         		
			if(rs.getString(1).equals("true") || rs1.getString(1).equals("true")){
         	 PreparedStatement pstt1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(2)+"'");
         	 ResultSet rss1=pstt1.executeQuery();
         	 while(rss1.next()){
         	 	
 			System.out.println("\t\t\t\t _____________________________________________________________________________");
      		System.out.printf("\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",c,"|",rss1.getString(1),"|",rss1.getString(2),"|");
	      	System.out.println("\n\t\t\t\t|_______________________|___________________________|_________________________|");
          
            }
           
            o++;
            c++;
    	}}}
      	System.out.print("\n \n");
      	System.out.println("\t\t\t\t\t"+c+"\t Previous menu");
      	
      	
    
    if(o==0)
    {
    	System.out.println("\n\n");
    	System.out.println("\t\t\t\t No Friends Found! Try making new freinds");
    	System.out.println("\t\t\t\t Press any key to go back to previous menu");
    	sc.nextLine();
    
    	chat();
    }
    else
    {
    	System.out.println("\n\n");
    	 //System.out.println("\t\t\t\t\tPress "+c+" to go to previous menu");

    	System.out.println("\t\t\t\tEnter the username of the person you want to chat with or press "+c+" to go to previous menu");
    	System.out.print("\t\t\t\t");
    	//sc.nextLine();
    	String frnd=sc.nextLine();
    	if(frnd.equalsIgnoreCase(String.valueOf(c)))
    	{
    		chat();
    	}
    	else
    	{
    	chatscreen(frnd);
    	mainchat(id,frnd);
    }}
}


public static void chatscreen(String frnd)throws Exception
{
	cls();
		int i=1;
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Enjoy Chat      !!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		     
	for(i=1;i<=32;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
		String st=new String("");
		int o=0,sum=0;
		PreparedStatement pst=con.prepareStatement("select chat from menu2 where user1='"+id+"' and user2='"+frnd+"'");
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			st=rs.getString(1);
			if(st.equals(""))
			{
				pst=con.prepareStatement("select chat from menu2 where user1='"+frnd+"' and user2='"+id+"'");
				rs=pst.executeQuery();
				while(rs.next()){
					st=rs.getString(1);}
			}
		}
		String sp1=new String("");
		String sp2=new String("");
		sp1=sp1.concat(id);
		sp2=sp2.concat(frnd);
			sp1=sp1.concat("____ ");
			sp2=sp2.concat("____ ");
			
		String[] s=st.split(sp1);

		//for(String ss: s)
		//{
	//		System.out.print(ss);
		


						//System.out.println("\t\t\t\t\t Logged in as "+id);

		for(String s1 : s){
			String[] s4=s1.split(sp2);
			for(String s2 : s4){
				PreparedStatement pst1=con.prepareStatement("select s3 from menu2 where user1='"+id+"' and user2='"+frnd+"'");
				ResultSet rs1=pst1.executeQuery();
				if(sum==0){
				while(rs1.next()){
					if(rs1.getString(1).equals("true")){
						sum++;
						//if(s2.equalsIgnoreCase("____ "))
						//	continue;
						System.out.println("\t\t\t\t\t  "+id+" : "+s2);

						o++;
					}
					else{
					//	if(s2.equalsIgnoreCase("____ "))
					//		continue;
						System.out.println("\t\t\t\t\t  "+id+" : "+s2);
						sum++;
					}

				}  
			}   
			else{
				PreparedStatement pst4=con.prepareStatement("select s3 from menu2 where user1='"+id+"' and user2='"+frnd+"'");
				ResultSet rs4=pst4.executeQuery();
				while(rs4.next()){
					if(rs4.getString(1).equals("true")){
						System.out.println("\t\t\t\t\t  "+frnd+" : "+s2);
						o++;
					}
					else{
						System.out.println("\t\t\t\t\t  "+frnd+" : "+s2);
					}

				}   
			}
			}   
			sum=0;
		}  
		System.out.print("\t\t\t\t\t  ");
}


	static void pattern(String str,int n,int h)throws Exception
	{ 
			//String arr[]=str1.split(" ");
			//String str=arr[0];
            int a=n/2+1;//This variable is use by all pattern
            int m=1,Qfreq=0;//This variable is use by 'Q' pattern
            int k2=1,Rfreq=0;//This variable is used by 'R' pattern
            int s=-a,l=n+a-1,Vfreq=0;//This variablE is used by 'V' pattern
            int k4=0,Xfreq=0;//This variable is use by 'X' pattern
            int WW=0,Wfreq=0;//This variable is use by 'W' pattern
            int EE=0,Mfreq=0;//This variable is use by 'M' pattern
            int k5=n,Yfreq=0;//This variable is used by 'Y' pattern
            int s1=n,t=1,s2=3,t2=a+1,Kfreq=0;
            char ar[]=new char[str.length()];
            for(int i=0;i<str.length();i++)
            {
                ar[i]=str.charAt(i);
            }
            //Now,here we count the frequecy of variables 'K','M','Q','R','V','W','X','Y'
            System.out.println("\n");
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='K')
                    Kfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='M')
                    Mfreq++;
            }

            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='Q')
                    Qfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='R')
                    Rfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='V')
                    Vfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='W')
                    Wfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='X')
                    Xfreq++;
            }
            for(int i=0;i<str.length();i++)
            {
                if(ar[i]=='Y')
                    Yfreq++;
            }
            //Created By Puneet Uttam
            for(int i=1;i<n*n*str.length()-6;i++)
                System.out.print("$");
            System.out.println("\n");
            for(int i=1;i<=n;i++)
            {
                int k=0,c1=1,c2=1,c3=1,c4=1,c5=1,c6=1,c7=1,c8=1;
                while(k<str.length())
                {
                    if(k<str.length()&&ar[k]=='A')
                    {    
                        for(int j=1;j<=n;j++)
                        {
                            if(j==n &&i==1)
                                continue;
                            if((j==1 && i>1)||(i==1 && j>1)||i==(n/2)+1||j==n)
                                System.out.print("A ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    //Created By Puneet Uttam
                    if(k<str.length()&&ar[k]=='B')   
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1|| (i==1 && j!=n)||(i==n && j!=n)||(i>1 &&i<n &&j==n)||i==a)
                                System.out.print("B ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    int ce=0;
                    if(k<str.length()&&ar[k]=='C')
                    {
                        for(int j=1;j<=n;j++)
                        {	if(ce==0&&h==0)
                        	{	System.out.print("\t\t\t"); ++ce; } // adding extra space here
                            if(j==1||i==1||i==n)
                                System.out.print("C ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='D')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1|| (i==1 && j!=n)||(i==n && j!=n)||(i>1 &&i<n &&j==n))
                                System.out.print("D ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='E')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||i==1||i==(n/2)+1||i==n)
                                System.out.print("E ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='F')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||i==1||i==(n/2)+1)
                                System.out.print("F ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='G')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1 || i==n || i==1 || i>=a && ((j==n) || (i==a && j>=a)))
                                System.out.print("G ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='H')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||i==(n/2)+1||j==n)
                                System.out.print("H ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='I')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(i==1||i==n||j==(n/2)+1)
                                System.out.print("I ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='J')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==n || i==n || (i>n/2 ) && (j==1))
                                System.out.print("J ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    //Created By Puneet Uttam
                    if(k<str.length()&&ar[k]=='K')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||(i==t && j==s1)||(i==t2 && j==s2)||(j==2&&i==a))
                                System.out.print("K ");
                            else
                                System.out.print("  ");
                        }
                        if(c7==Kfreq)
                        {
                            s1=s1-2;t++;
                            if(i>=a+1)
                            {
                                s2=s2+2;t2++;
                            }
                        }
                        if(c7<Kfreq)
                        {
                            c7++;
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='L')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||i==n)
                                System.out.print("L ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='M')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||j==n ||((i<=a) &&  ((i==j)||(j==n-EE))))
                                System.out.print("M ");
                            else
                                System.out.print("  ");
                        }
                        if(c5==Mfreq)
                        {
                            EE++;
                        }
                        if(c5<Mfreq)
                        {
                            c5++;
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='N') 
                    //Created By Puneet Uttam
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||j==n||j==i)
                                System.out.print("N ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='O')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(i==1||j==1||j==n||i==n)
                                System.out.print("O ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='P')
                    {
                        for(int j=1;j<=n;j++)
                        {               
                            if(j==n &&i==1)
                                continue;
                            if((i==1&&j!=n)||i==a||(j==n && i<a)||j==1)
                                System.out.print("P ");
                            else
                                System.out.print("  ");
                        } 
                        k++;
                        System.out.print("\t");
                    }
                    if(k<str.length()&&ar[k]=='Q')
                    {                    
                        for(int j=1;j<=n;j++)
                        {
                            if(((j==1||j==n||i==1||i==n)) ||(i>=a && j==m))
                                System.out.print("Q ");
                            else
                                System.out.print("  ");
                        }
                        if(c4==Qfreq)
                        {
                            m++;
                        }
                        if(c4<Qfreq)
                        {
                            c4++;
                        }
                        if(i==n)
                            System.out.print("Q Q   ");
                        else
                            System.out.print("\t");
                        k++;
                    }
                    if(k<str.length()&&ar[k]=='R')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if((j==1||i==1||i==a)||(i>a && j==k2)||(j==n && i<=a))
                                System.out.print("R ");
                            else    
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                        if(c1==Rfreq)
                        {
                            k2++;
                        }
                        if(c1<Rfreq)
                        {
                            c1++;
                        }
                    }
                    if(k<str.length()&&ar[k]=='S')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(i==1||i<a && j==1||i==n||i==a||i>=a && j==n)
                                System.out.print("S ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='T')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(i==1||j==(n/2)+1)
                                System.out.print("T ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='U')
                    {

                        for(int j=1;j<=n;j++)
                        {
                            if(j==n &&i==n)
                                continue;
                            if(j==1 && i!=n||(j==n&&i!=n)||(i==n &&j>1))
                                System.out.print("U ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }

                    if(k<str.length()&&ar[k]=='V')
                    {

                        for(int j=1;j<=n;j++)
                        {
                            if((i<=a && (j==1||j==n)) || i>=a && j==s+2 || j==l )
                                System.out.print("V ");
                            else
                                System.out.print("  ");
                        }
                        if(c3==Vfreq)
                        {
                            s++;l--;
                        }
                        if(c3<Vfreq)
                        {
                            c3++;
                        }
                        System.out.print("\t");k++;  
                        //Created By Puneet Uttam
                    }
                    if(k<str.length()&&ar[k]=='W')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(j==1||j==n ||((i==j || j==n-WW) && i>=a))
                                System.out.print("W ");
                            else
                                System.out.print("  ");
                        }
                        if(c6==Wfreq)
                        {
                            WW++;
                        }
                        if(c6<Wfreq)
                        {
                            c6++;
                        }

                        System.out.print("\t");k++; 
                        //Created By Puneet Uttam
                    }
                    if(k<str.length()&&ar[k]=='X')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if(i==j||j==n-k4)
                                System.out.print("X ");
                            else
                                System.out.print("  ");
                        }
                        if(c2==Xfreq)
                        {
                            k4++;
                        }
                        if(c2<Xfreq)
                        {
                            c2++;
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]=='Y')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            if((i==j && i<=a)|| (j==a)&& i>=a || (j==k5 && j<=k5 && i<a)) 
                                System.out.print("Y ");
                            else
                                System.out.print(" ");
                        }
                        System.out.print("\t\t");
                        if(c8==Yfreq)
                        {
                            k5--;
                        }
                        if(c8<Yfreq)
                        {
                            c8++;
                        }                
                        k++;
                    }
                    if(k<str.length()&&ar[k]=='Z')
                    {
                        for(int j=n;j>0;j--)
                        {
                            if(i==1||i==n||j==i)
                                System.out.print("Z ");
                            else
                                System.out.print("  ");
                        }
                        System.out.print("\t");k++;
                    }
                    if(k<str.length()&&ar[k]==' ')
                    {
                        for(int j=1;j<=n;j++)
                        {
                            System.out.print("  ");
                        }
                        k++;
                    }
                }
                System.out.println();
            }
            System.out.println();
            for(int i=1;i<n*n*str.length()-6 ;i++)
                System.out.print("$");
           System.out.println("\n\n\t\t\t\t\t\t$$$$$ = Welcome to ChatBox = $$$$$");
        //System.out.println("\n\t\t\t$$$$$ = AND HOPE THAT YOU HAVE LIKE THIS PROGRAM = $$$$$");
    }


//Method to Encrypt the password
	public static String encrypt(String ee)
	{
		int l=ee.length();
		String enct="";
		for(int i=0;i<l;i++)
		{
			int e=(int)(ee.charAt(i))+4;
			enct=enct+(char)e;
		}
		return(enct);
	}
		//Method to Decrypt the password
	public static String decrypt(String dd)
	{
		int l=dd.length();
		String dect="";
		for(int i=0;i<l;i++)
		{
			int d=(int)(dd.charAt(i))+4;
			dect=dect+(char)d;
		}
		//System.out.println(dect);
		//sc.nextLine();
		return(dect);

	}



	public static void main(String[] args) throws Exception
	{
		try
		{	
			cls();
			pattern("CHATBOX",5,0);
			System.out.println("\n\n\t\t\t\t\t\t\tPress any key to continue");
			sc.nextLine();
			login();
		}
		catch(Exception E)
		{
			FileWriter fw=new FileWriter("log.txt",true);
			String s=E.toString()+(new Date()).toString();
			fw.write(s,0,s.length());
			fw.close();
		}
	}
}