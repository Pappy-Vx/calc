import java.util.*;

import javax.swing.JOptionPane;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map=new HashMap<String,Integer>();//Creating HashMap.
		map.put("A", 1); //Put elements in Map.
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		System.out.println(map);
		
		
		for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
	   }
		 
	
		
		
		
		
		
		
		
		
		String names = JOptionPane.showInputDialog("Enter your name");
	    String  p1 = JOptionPane.showInputDialog("Enter Course1 less than 5 ");	
	   //integer.parseint converts string number to integer number
		int num1 = Integer.parseInt(p1);
		
//		HashMap<String,Integer> maps=new HashMap<String,Integer>();//Creating HashMap.
//		maps.put(p1, 1); //Put elements in Map.
//		maps.put(p1, 2);
//		maps.put("C", 3);
//		maps.put("D", 4);
//		System.out.println(map);
		
			
		if (num1 > 5) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
		}
	else if (num1 <=5) {
	String p11 = JOptionPane.showInputDialog("Enter course unit1 less than 4");
		int cu1 = Integer.parseInt(p11);
		if (cu1 > 4) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
		}
		else if (cu1 <=4) {
		int s1 = num1 * cu1;
		String p2 = JOptionPane.showInputDialog("Enter Course2 less than 5 ");		
		//integer.parseint converts string number to integer number
		int num2 = Integer.parseInt(p2);
		if (num2 > 5) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
		}
		else if (num2 <=5) {
		String p22 = JOptionPane.showInputDialog("Enter course unit2 less than 4");
				int cu2 = Integer.parseInt(p22);
				if (cu2 > 4) {
					JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
				}
				else if (cu2 <=4) {
				int s2 = num2 * cu2;
				String p3 = JOptionPane.showInputDialog("Enter Course3 less than 5 ");		
				//integer.parseint converts string number to integer number
				int num3 = Integer.parseInt(p3);
				if (num3 > 5) {
				JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
				}
			else if (num3 <=5) {
			String p33 = JOptionPane.showInputDialog("Enter course unit3 less than 4");
			int cu3 = Integer.parseInt(p33);
			if (cu3 > 4) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
			else if (cu3 <=4) {
		    int s3 = num3 * cu3;
		
		   String p4 = JOptionPane.showInputDialog("Enter Course4 less than 5 ");		
		  //integer.parseint converts string number to integer number
			int num4 = Integer.parseInt(p4);
		if (num4 > 5) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
		else if (num4 <=5) {
		String p44 = JOptionPane.showInputDialog("Enter course unit4 less than 4");
		int cu4 = Integer.parseInt(p44);
		if (cu4 > 4) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
		else if (cu4 <=4) {
		int s4 = num4 * cu4;

		String p5 = JOptionPane.showInputDialog("Enter Course5 less than 5 ");		
			//integer.parseint converts string number to integer number
	   int num5 = Integer.parseInt(p5);
	if (num5 > 5) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
		else if (num5 <=5) {
		String p55 = JOptionPane.showInputDialog("Enter course unit5 less than 4");
		int cu5 = Integer.parseInt(p55);
			if (cu5 > 4) {
		JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
					}
			else if (cu5 <=5) {
		int s5 = num5 * cu5;

		String p6 = JOptionPane.showInputDialog("Enter Course6 less than 5 ");		
							//integer.parseint converts string number to integer number
		int num6 = Integer.parseInt(p6);
		if (num6 > 5) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
				}
		  else if (num6 <=5) {
			String p66 = JOptionPane.showInputDialog("Enter course unit6 less than 4");
		int cu6 = Integer.parseInt(p66);
		if (cu6 > 4) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
				}
			else if (cu6 <=4) {
			int s6 = num6 * cu6;

			String p7 = JOptionPane.showInputDialog("Enter Course7 less than 5 ");		
			//integer.parseint converts string number to integer number
			int num7 = Integer.parseInt(p7);
			if (num7 > 5) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
					}
	else if (num7 <=5) {
					String p77 = JOptionPane.showInputDialog("Enter course unit7 less than 4");
				int cu7 = Integer.parseInt(p77);
				if (cu7 > 4) {
					JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
						}
			else if (cu7 <=4) {
			int s7 = num4 * cu4;

			String p8 = JOptionPane.showInputDialog("Enter Course8 less than 5 ");		
				//integer.parseint converts string number to integer number
				int num8 = Integer.parseInt(p8);
				if (num8 > 5) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
						}
		   else if (num8 <=5) {
			String p88 = JOptionPane.showInputDialog("Enter course unit8 less than 4");
		    int cu8 = Integer.parseInt(p88);
			if (cu8 > 4) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
					}
			else if (cu8 <=4) {
			int s8 = num8 * cu8;

			String p9 = JOptionPane.showInputDialog("Enter Course9 less than 5 ");		
			//integer.parseint converts string number to integer number
			int num9 = Integer.parseInt(p9);
			if (num9 > 5) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
					}
			else if (num9 <=5) {
			String p99 = JOptionPane.showInputDialog("Enter course unit9 less than 4");
			int cu9 = Integer.parseInt(p99);
		   if (cu9 > 4) {
		   JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
					}
			else if (cu9 <=4) {
			int s9 = num9 * cu9;

			String p10 = JOptionPane.showInputDialog("Enter Course10 less than 5 ");		
			//integer.parseint converts string number to integer number
			int num10 = Integer.parseInt(p3);
			if (num10 > 5) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 5 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
		    else if (num10 <=5) {
			String p110 = JOptionPane.showInputDialog("Enter course unit10 less than 4");
			int cu10 = Integer.parseInt(p110);
			if (cu10 > 4) {
			JOptionPane.showMessageDialog(null,"please put in a digit less than 4 and restart", "Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
			else if (cu10 <=4) {
			int s10 = num10 * cu10;


						
			double st = s1  + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10;
			double cu = cu1 + cu2 + cu3 + cu4 + cu5 + cu6 + cu7 + cu8 + cu9 + cu10;
			double gpa = st / cu;
			if (gpa >= 4.5000 && cu >=18) {
				JOptionPane.showMessageDialog(null,"Congratulations " +names+ " Your GPA is "+gpa+ " which is FIRST CLASS HONOUR, you registered for "+cu+" units" ,"Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
			else if (gpa < 0.5 && cu >=18  ) {
				JOptionPane.showMessageDialog(null,"Sorry "+names+" you are adviced to Withdraw. Try next year, you registered for "+cu+" units" ,"Calculator",JOptionPane.PLAIN_MESSAGE  );
			}
			else if (gpa < 2.5000 && cu >=18) {
				JOptionPane.showMessageDialog(null,"Sorry "+names+" Your GPA is "+gpa+ " which is THIRD CLASS, you registered for "+cu+" units"  ,"Calculator",JOptionPane.PLAIN_MESSAGE  );
			}	
			else if (gpa < 3.5000 && cu >=18) {
				JOptionPane.showMessageDialog(null,names+" Your GPA is "+gpa+ " which is SECOND CLASS LOWER, you registered for "+cu+" units"  ,"Calculator",JOptionPane.PLAIN_MESSAGE  );
			}		  
			else if (gpa < 4.5000 && cu >=18) {
				JOptionPane.showMessageDialog(null,"Congrats "+names+" your GPA is "+gpa+ " which is SECOND CLASS UPPER, you registered for "+cu+" units","Calculator",JOptionPane.PLAIN_MESSAGE  );
				
			}

		
		
		}
		}
		}
		}
	}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
	}

	}

}
