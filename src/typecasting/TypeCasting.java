/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;

import java.util.Scanner;

public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
        Scanner keyedInput = new Scanner(System.in);
        
        int step1In,step2Out,step5In,step5Out;
        double step1Out,step2In,step6In,step6Out;
        String step3In ,step3Out,step4In,step5Hold,step6Hold;
        char step4Out,step3Hold ;
        
        System.out.println("Enter a Whole Number");
        step1In = keyedInput.nextInt();
        step1Out = (double)step1In;
        System.out.println("Step 1: " + step1Out);
        
        System.out.println("Enter a Decimal Number");
        step2In = keyedInput.nextDouble();
        step2Out = (int)step2In;
        System.out.println("Step 2: " + step2Out);
        
        System.out.println("Enter one character");
        step3In = keyedInput.nextLine(); 
        step3In = keyedInput.nextLine(); 
        step3Hold = step3In.charAt(step3In.length()- 1);
        step3Out = String.valueOf(step3Hold);
        System.out.println("Step 3: " + step3Out);
        
        System.out.println("Enter a Name");
        step4In = keyedInput.nextLine();
        step4Out = step4In.charAt(0);
        System.out.println("Step 4: " + step4Out);
        
        System.out.println("Enter a Whole Number");
        step5In = Integer.parseInt(keyedInput.nextLine());
        step5Hold = Integer.toString(step5In);
        step5Out = Integer.parseInt(step5Hold);
        System.out.println("Step 5: " + step5Out);
        
        System.out.println("Enter a Decimal Number");
        step6In = Double.parseDouble(keyedInput.nextLine());
        step6Hold = Double.toString(step5In);
        step6Out = Double.parseDouble(step5Hold);
        System.out.println("Step 6: " + step6Out);
        
    }
    
   
}
