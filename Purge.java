/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package purge;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


class Stats{
    int Attack;
    int Dodge;
    int Hit;
    int HP;
    int EXP;

    public Stats(int Attack, int Dodge, int Hit, int HP, int EXP) {
        this.Attack = Attack;
        this.Dodge = Dodge;
        this.Hit = Hit;
        this.HP = HP;
        this.EXP = EXP;
    }

    @Override
    public String toString() {
        return "Stats{" + "Attack=" + Attack + ", Dodge=" + Dodge + ", Hit=" + Hit + ", HP=" + HP + ", EXP=" + EXP + '}';
    }    
}

    class Warrior extends Stats{
    public Warrior(int Attack, int Dodge, int Hit, int HP, int EXP) {
        super(Attack, Dodge, Hit, HP, EXP);
    }
    public static int AttackPower(int Attack){
        int AttackPower = (int) (Attack * .9);
        return AttackPower;
    }
    public static int Health(int HP){
        int Health = (int) (HP * 2.5);
        return Health;
    }
    public static int DodgeRate(int Dodge){
        int DodgeRate = (int) (Dodge * 11);
        return DodgeRate;
    }
    public static int HitRate(int Hit){
        int HitRate = (int) (Hit * 9.5);
        return HitRate;
    }
    public static int ExpChange(int old, int recent){
        int EXP = old + recent;
        return EXP;
    }
    public static int HPChange(int OldHP, int Hit){
        int NewHp = OldHP - Hit;
        return NewHp;
    }
}

class Wizard extends Stats{
public Wizard(int Attack, int Dodge, int Hit, int HP, int EXP) {
        super(Attack, Dodge, Hit, HP, EXP);
    }

public static int AttackPower(int Attack){
   int AttackPower = (int) (Attack * 1);
   return AttackPower;
}
    public static int Health(int HP){
        int Health = (int) (HP * 1.2);
                return Health;
    }
    public static int DodgeRate(int Dodge){
        int DodgeRate = (int) (Dodge * 8);
        return DodgeRate;
    }
    public static int HitRate(int Hit){
        int HitRate = (int) ( Hit * 9);
        return HitRate;
    }    
    public static int ExpChange(int old, int recent){
        int EXP = old + recent;
        return EXP;
    }
    public static int HPChange(int OldHP, int Hit){
        int NewHp = OldHP - Hit;
        return NewHp;
    }
}


class Enemy extends Stats{

    public Enemy(int Attack, int Dodge, int Hit, int HP, int EXP) {
        super(Attack, Dodge, Hit, HP, EXP);
    }
    public static int EAttackPower(int Attack){
        int EAttackPower = (int) (Attack * .6);
        return EAttackPower;
    }
    public static int EHealth(int HP){
        int EHealth = (int) (HP * 1.5);
        return EHealth;
    }
    public static int EDodgeRate(int Dodge){
        int EDodgeRate = (int) (Dodge * 4);
        return EDodgeRate;
    }
    public static int EHitRate(int Hit){
        int EHitRate = (int) (Hit * 6);
        return EHitRate;
    }    
    public static int HPChange(int OldHP, int Hit){
        int NewHp = OldHP - Hit;
        return NewHp;
    }
    public static int EnemyEXP(int points){
        int Exp = points * 2;
        return Exp;
    }
}




/**
 *
 * @author yusif
 */
public class Purge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int StatPoints = 25;
        int TempAttackpower =0;
        int TempHealth = 0;
        int TempDodge = 0;
        int TempHit = 0;
        int TempExp = 0;
        int HP = 0;
        int AttackPower = 0;
        int Dodge = 0;
        int Hit = 0;
        int Exp = 0;
        int EHP = 0;
        int EAttackPower = 0;
        int EDodge = 0;
        int EHit = 0;
        int TotalExp = 0;
        int ETempAttackpower = 4;
        int ETempDodge = 4 ;
        int ETempHit = 4;
        int ETempHealth = 4;
        int EExp = 4;
        int KillCount = 0;
        String UserClass = null;
        String UserAction = null;
        String UserAction2 = null;
        String UserAction3 = null;
        String UserAction4 = null;
        String UserAction5 = null;
        String UserAction6 = null;
        String UserAction7 = null;
        String UserAction8 = null;
        
        
        
          //Rand.Randnum(0,101);
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
//        System.out.println(Rand.Randnum(0,100));
        
        System.out.println("Welcome to the new world brave adventurer.");
        System.out.println("You seem confused as to your capabilities.");
        System.out.println("What class are you if you can remeber? Wizard or Warrior.");
        UserClass = s.next();
       // System.out.println("You Picked: " + UserClass);
        System.out.println("A skilled explorer such as yourself should only worry,\nabout his/hers Health, Hit, Dodge, and Strength");
        System.out.println("You have 25 points to assign to these stats,");
        System.out.println("Lets take care of this first. \nHow many points do you want to put in each?");
        System.out.println("Remeber no stat can have more than 10 points in it.\nAnd it obviously cannot have less than 0 for simple reasons");
        System.out.println("Starting with Attack. ");
        System.out.println("How many points do you wish to put into Attack?");
        
        
        
        TempAttackpower = s.nextInt();
        if(TempAttackpower > 10 || TempAttackpower <= 0 ){
            //System.out.println("if loop");
        do{
            System.out.println("That is too high, try again.");    
            //System.out.println("do loop");
            TempAttackpower = s.nextInt();
            }while(TempAttackpower > 10 || TempAttackpower <= 0 );
        }
        StatPoints = StatPoints - TempAttackpower;
        
        
        System.out.println("Your points left are: " + StatPoints);
        System.out.println("Now Health. ");
        TempHealth = s.nextInt();
        if(TempHealth > 10|| TempHealth <= 0){
            System.out.println("banana");
        do{
            System.out.println("That doesnt seem right, pick a different number. ");
            TempHealth = s.nextInt();
            }while (TempHealth > 10 || TempHealth <= 0);
        }
        StatPoints = StatPoints - TempHealth;
        
        
        System.out.println(StatPoints + " Points left still.");
        System.out.println("Now how about your dodge?");
        TempDodge = s.nextInt();
        if(TempDodge > StatPoints){
          do{
            System.out.println("thats too much, or too little, \nTRY AGAIN.");
            TempDodge = s.nextInt();
            }while (TempDodge > StatPoints - 1);
        }
        
        
        else if(TempDodge > 10 || TempDodge <= 0){
        do{
            System.out.println("thats too much want, pick a different number");
            TempDodge = s.nextInt();
            }while (TempDodge > 10 || TempDodge <= 0);
        }
        StatPoints = StatPoints - TempDodge;        
        
        System.out.println("You have: " + StatPoints + " left to use.");
        System.out.println("And finally your hit.");
       // TempHit = s.nextInt();
        if(StatPoints == 0){
            System.out.println("You ran out of Points. \n You Died walking out the door...");
            s.nextLine();
            System.exit(0);
        }
         TempHit = s.nextInt();
         if(TempHit > StatPoints || TempHit <= 0){
            do{
            System.out.println("You are fizzeled, you don't have enough points. \n Try again.");
            TempHit = s.nextInt();
            }while(TempHit>StatPoints || TempHit <= 0);
        }
        
        
        if(UserClass.equalsIgnoreCase("Warrior")){
            //Warrior.AttackPower(TempAttackpower);
            AttackPower = Warrior.AttackPower(TempAttackpower);
            System.out.println("Your attack power is: " + AttackPower);

           // Warrior.Health(TempHealth);
            HP = Warrior.Health(TempHealth);
            System.out.println("your total health is: " + HP );

            //Warrior.DodgeRate(TempDodge);
            Dodge = Warrior.DodgeRate(TempDodge);
            System.out.println("Your dodge is: " + Dodge);


            //Warrior.HitRate(TempHit);
            Hit = Warrior.HitRate(TempHit);
            System.out.println("Your Hit is: " + Hit);
            
            Warrior.ExpChange(0,0);
            
            
            }
        
        if(UserClass.equalsIgnoreCase("Wizard")){
           // Wizard.AttackPower(TempAttackpower);
            AttackPower = Wizard.AttackPower(TempAttackpower);
            System.out.println("Your attack power is: " + AttackPower);

            //Wizard.Health(TempHealth);
            HP = Wizard.Health(TempHealth);
            System.out.println("your total health is: " + HP );

           // Wizard.DodgeRate(TempDodge);
            Dodge = Wizard.DodgeRate(TempDodge);
            System.out.println("Your dodge is: " + Dodge);


            //Wizard.HitRate(TempHit);
            Hit = Wizard.HitRate(TempHit);
            System.out.println("Your Hit is: " + Hit);
            
            Wizard.ExpChange(0,0);
            }
        
        
        
            //Enemy.EAttackPower(ETempAttackpower);
            EAttackPower = Enemy.EAttackPower(ETempAttackpower);
            System.out.println("Your enemies attack power is: " + EAttackPower);

           // Enemy.EHealth(ETempHealth);
            EHP = Enemy.EHealth(ETempHealth);
            System.out.println("your enemies total health is: " + EHP );

            //Enemy.EDodgeRate(ETempDodge);
            EDodge = Enemy.EDodgeRate(ETempDodge);
            System.out.println("Your enemies dodge is: " + EDodge);


           // Enemy.EHitRate(ETempHit);
            EHit = Enemy.EHitRate(ETempHit);
            System.out.println("Your enemies hit is: " + EHit);
            
            Enemy.EnemyEXP(EExp);
            
            EExp = Enemy.EnemyEXP(EExp);
            System.out.println(EExp);
            System.out.println("The enemy has " + EExp + " Which will be yours if you kill it");
            
        Enemy Enemy = new Enemy(ETempAttackpower,ETempDodge,ETempHit,ETempHealth,EExp);       
        Wizard UserWizard = new Wizard(TempAttackpower,TempDodge,TempHit,TempHealth,Exp);
        Warrior UserWarrior = new Warrior(TempAttackpower,TempDodge,TempHit,TempHealth,Exp);
        
//        if(UserClass.equalsIgnoreCase("Warrior")){
//        System.out.println(UserWarrior);
//        }
//        
//        if(UserClass.equalsIgnoreCase("Wizard")){
//        System.out.println(UserWizard);
//        }
//        
        // going to be used to send into the attakc chance method

        
        System.out.println("Your first Enemy is a simple one.");
//        Enemy e = new Enemy(4,4,4,4);       
//        System.out.println("Enemy stats are" + e);        
        System.out.println("What would You like to do?\n Attack? \t OR \t Run?");
        UserAction = s.next();
        if(UserAction.equalsIgnoreCase("Run")){
            System.out.println("You Decied to run before the battle even Started");
           // s.next();
            System.exit(0);
        }
        int NewEHP = 0;
        String again = null;
        // Rand.Randnum(0,101)
        boolean Strike = false;
        boolean Evade = false;
        boolean EnemyEvade = false;
        boolean EnemyStrike = false;
        if(UserClass.equalsIgnoreCase("Warrior")|| UserClass.equalsIgnoreCase("Wizard") ){
            if(UserAction.equalsIgnoreCase("Attack")){
            //Hit then Randnum
                do{
                    chance.Hit(Hit,Rand.Randnum(0,100));
                    Strike = chance.Hit(Hit,Rand.Randnum(0,100));
                    Evade = chance.Dodge(Dodge,Rand.Randnum(0,100));
                    EnemyStrike = chance.Hit(EHit,Rand.Randnum(0,100));
                    EnemyEvade = chance.Hit(EDodge,Rand.Randnum(0,100));
                    System.out.println(EHP + "<= Enemy health");
                    //System.out.println(Strike);
                    if(Strike == true && EnemyEvade == false){
                        System.out.println("You Hit him.");
                       EHP = Enemy.HPChange(EHP, AttackPower);
                        System.out.println("The enemy's health: " + EHP);
                            
                    }
                    else if (Strike == false || EnemyEvade == true){
                        System.out.println("you missed. Rule #XCVI AIM!");
                    }
                    if(EnemyStrike == true && Evade == false){
                        System.out.println("The Enemy hit you.");
                       HP = Warrior.HPChange(HP, EAttackPower);
                        System.out.println("Your Health is :" + HP);
                            
                    }
                    else if (EnemyStrike == false || Evade == true){
                        System.out.println("The Enemy missed you, This time.");
                    }
                    System.out.println(EHP + "<= Enemy health");
                    if(EHP < 1 || HP <= 0){
                        break;
                    }
                    
                    System.out.println("Would you like to try to strike again?");
                    
                    s.next();
                    again = s.nextLine();
                    if (again.equalsIgnoreCase("run")|| again.equalsIgnoreCase("no")){
                        break;}
                }while(again.equalsIgnoreCase("yes")|| HP > 0 || again.equalsIgnoreCase("yea") || again.equalsIgnoreCase("yeah")
                        ||again.equalsIgnoreCase("sure")||again.equalsIgnoreCase("attack") || again.equalsIgnoreCase("y")) ;
                
            }
            if(HP<= 0){
                System.out.println("You died in your adventures.");
                System.exit(0);
            }
            if(EHP < 1){
                System.out.println("The enemy died, Great Job!");
                KillCount++;
                System.out.println("You have defeated " + KillCount + " Eneimes so far.");
                if(UserClass.equalsIgnoreCase("Warrior")){
                    System.out.println("Enemy Exp " + EExp + " Your exp is: " + Exp);
                    Exp = Warrior.ExpChange(0,EExp);
                    System.out.println(Exp);
                }
                        
                else if(UserClass.equalsIgnoreCase("Wizard")){        
                    System.out.println("Enemy Exp " + EExp + " Your exp is: " + Exp);
                    Exp = Wizard.ExpChange(0, EExp);
                    
                    System.out.println(Exp);
                 }
            }
            System.out.println("Would you like to rest after this encounter, or do you wish to face another enemy?");
            UserAction2 = s.next();
            if(UserAction2.equalsIgnoreCase("rest") || UserAction2.equalsIgnoreCase("yes") || UserAction2.equalsIgnoreCase("yea")
                    || UserAction2.equalsIgnoreCase("yeah") || UserAction2.equalsIgnoreCase("sleep") || UserAction2.equalsIgnoreCase("why not")){
                if(UserClass.equalsIgnoreCase("Warrior")){
                     HP = Warrior.Health(TempHealth);
                     System.out.println("You have some drinks at a tavern, and rest up for the night." + HP );
                }
                else if (UserClass.equalsIgnoreCase("Wizard")){
                    HP = Wizard.Health(TempHealth);
                    System.out.println("You rested in the shade of a tree, your Health is now back to full.    " + HP );
                }
            }
            
            System.out.println("would you like to try another enemy?");
            UserAction3 = s.next();
            if(UserAction3.equalsIgnoreCase("No")){
                System.exit(0);
                System.out.println("You decied to flee before the battle.");
                System.out.println("you manage to survive " + KillCount + " enimies before the end.");
            }
            else if(UserAction3.equalsIgnoreCase("Another") || UserAction3.equalsIgnoreCase("yes") || UserAction3.equalsIgnoreCase("again") || UserAction3.equalsIgnoreCase("yeah") || UserAction3.equalsIgnoreCase("more") ){
                ETempAttackpower = 6;
                ETempDodge = 6 ;
                ETempHit = 6;
                ETempHealth = 6;
                EExp = 6;
                
                EAttackPower = Enemy.EAttackPower(ETempAttackpower);
                System.out.println("Your enemies attack power is: " + EAttackPower);

                EHP = Enemy.EHealth(ETempHealth);
                System.out.println("your enemies total health is: " + EHP );

                EDodge = Enemy.EDodgeRate(ETempDodge);
                System.out.println("Your enemies dodge is: " + EDodge);

                EHit = Enemy.EHitRate(ETempHit);
                System.out.println("Your enemies hit is: " + EHit);

                int EEXP = Enemy.EnemyEXP(EExp);
                System.out.println("He is worth " + EEXP);
                Enemy Enemy2 = new Enemy(ETempAttackpower,ETempDodge,ETempHit,ETempHealth,EExp);
                
                do{
                    chance.Hit(Hit,Rand.Randnum(0,100));
                    Strike = chance.Hit(Hit,Rand.Randnum(0,100));
                    Evade = chance.Dodge(Dodge,Rand.Randnum(0,100));
                    EnemyStrike = chance.Hit(EHit,Rand.Randnum(0,100));
                    EnemyEvade = chance.Hit(EDodge,Rand.Randnum(0,100));
                    System.out.println(EHP + "<= Enemy health");
                    //System.out.println(Strike);
                    if(Strike == true && EnemyEvade == false){
                        System.out.println("You Hit him.");
                       EHP = Enemy.HPChange(EHP, AttackPower);
                        System.out.println("The enemy's health: " + EHP);
                            
                    }
                    else if (Strike == false || EnemyEvade == true){
                        System.out.println("you missed. Rule #XCVI AIM!");
                    }
                    if(EnemyStrike == true && Evade == false){
                        System.out.println("The Enemy hit you.\n Why didn't you dodge?");
                       HP = Warrior.HPChange(HP, EAttackPower);
                        System.out.println("Your Health is :" + HP);
                            
                    }
                    else if (EnemyStrike == false || Evade == true){
                        System.out.println("The Enemy missed you, This time.");
                    }
                    System.out.println(EHP + "<= Enemy health");
                    if(EHP < 1 || HP <= 0){
                        break;
                    }
                    
                    System.out.println("Would you like to try to strike again?");
                    
                    s.next();
                    again = s.nextLine();
                }while(again.equalsIgnoreCase("yes")|| HP > 0 || again.equalsIgnoreCase("yea") || again.equalsIgnoreCase("yeah")
                        ||again.equalsIgnoreCase("sure")||again.equalsIgnoreCase("attack") || again.equalsIgnoreCase("y")) ;
            }
            if(HP<= 0){
                System.out.println("You died in your adventures.");
                System.out.println(KillCount);
                System.exit(0);
            }
            if(EHP < 1){
                System.out.println("The enemy died, Great Job!");
                KillCount++;
                System.out.println("You have defeated " + KillCount + " Eneimes so far.");
                if(UserClass.equalsIgnoreCase("Warrior")){
                    System.out.println("Enemy Exp " + EExp + " Your exp is: " + Exp);
                    Exp = Warrior.ExpChange(Exp,EExp);
                    System.out.println(Exp);
                }
                        
                else if(UserClass.equalsIgnoreCase("Wizard")){        
                    System.out.println("Enemy Exp " + EExp + " Your exp is: " + Exp);
                    Exp = Wizard.ExpChange(Exp, EExp);
                    
                    System.out.println(Exp);
                 }
            }
            System.out.println("Would you like to rest after this encounter, or do you wish to face another enemy?");
            UserAction2 = s.next();
            if(UserAction2.equalsIgnoreCase("rest") || UserAction2.equalsIgnoreCase("yes") || UserAction2.equalsIgnoreCase("yea")
                    || UserAction2.equalsIgnoreCase("yeah") || UserAction2.equalsIgnoreCase("sleep") || UserAction2.equalsIgnoreCase("why not")){
                if(UserClass.equalsIgnoreCase("Warrior")){
                     HP = Warrior.Health(TempHealth);
                     System.out.println("You make a fire just off the road and rest for the night. " + HP );
                }
                else if (UserClass.equalsIgnoreCase("Wizard")){
                    HP = Wizard.Health(TempHealth);
                    System.out.println("You meditate in a silent part of town and rest up. " + HP );
                }
            }
            
                
            
     }
  }
    
    
}