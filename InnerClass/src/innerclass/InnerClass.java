
package innerclass;

import java.util.Scanner;


public class InnerClass {
    
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    
    public static void main(String[] args) {
    
        class ClickListener implements Button.OnClickListener{
            
            public ClickListener(){
                System.out.println("I've been attacehd");
            }
            @Override
            public void onClick(String title){
                System.out.println(title+" was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }
    
    private static void listen(){
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                   
            }
        }   
    }
}
        
//        GearBox mohammad = new GearBox(6);
//        mohammad.operateClutch(true);
//        mohammad.changeGear(1);
//        mohammad.operateClutch(false);
//        System.out.println(mohammad.WheelSpeed(1000));
//        mohammad.changeGear(2);
//        System.out.println(mohammad.WheelSpeed(3000));
//        mohammad.operateClutch(true);
//        mohammad.changeGear(3);
//        mohammad.operateClutch(false);
//        System.out.println(mohammad.WheelSpeed(6000));

   
    

