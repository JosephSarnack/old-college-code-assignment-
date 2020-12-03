/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package purge;

class chance{
    public static boolean Hit(int UserHit,int Randomnum) {
        boolean strike = false;
        if(Randomnum == 0)
            return strike = false;
        else{
        if(UserHit > 0 || UserHit <=10){
            if(Randomnum %10 == 0)
               return strike = true;  
            else
                return strike = false;
    }
        if(UserHit > 10 || UserHit <=20){
            if(Randomnum %5 == 0)
                return strike = true;  
            else
                return strike = false;
    }
        if(UserHit > 20 || UserHit <=30){
            if(Randomnum %4 == 0 ||Randomnum %4.5 == 0)
                return strike = true;
            else
                return strike = false;
    }
        if(UserHit > 30 || UserHit <=40){
            if(Randomnum %4 == 0)
                return strike = true;
            else
                return strike = false;
    }
        if(UserHit > 40 || UserHit <=50){
            if(Randomnum %3.5 == 0 || Randomnum %3 == 0)
                return strike = true;
            else
              return strike = false;
    }
        if(UserHit > 50 || UserHit <=60){
            if(Randomnum %3 == 0)
                return strike = true;
            else
                return strike = false;
    }
        if(UserHit > 60 || UserHit <=70){
            if(Randomnum %2.5 == 0 || Randomnum %3 == 0)
                return strike = true;
            else
                return strike = false;
    }
        if(UserHit > 70 || UserHit <=80){
            if(Randomnum %2 == 0)
                return strike = true;
            else
                return strike = false;
    }
        if(UserHit > 80 || UserHit <=90){
            if(Randomnum %2.5 == 0 || Randomnum %2 == 0)
                strike = true;
            else
                return strike = false;
    }
        if(UserHit > 90 || UserHit <=100){
            if(Randomnum %1 == 0)
               return strike = true;
            else
                return strike = false;
        }
    }
    return strike;
    }
     public static boolean Dodge(double UserDodge,double Randomnum){
        boolean Evade = false;
        if(UserDodge > 0 || UserDodge <=10){
            if(Randomnum %10 == 0)
               return Evade = true;  
            else
                return Evade = false;
    }
        if(UserDodge > 10 || UserDodge <=20){
            if(Randomnum %5 == 0)
                return Evade = true;  
            else
                return Evade = false;
    }
        if(UserDodge > 20 || UserDodge <=30){
            if(Randomnum %4.5 == 0)
                return Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 30 || UserDodge <=40){
            if(Randomnum %4 == 0)
                return Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 40 || UserDodge <=50){
            if(Randomnum %3.5 == 0)
                return Evade = true;
            else
              return Evade = false;
    }
        if(UserDodge > 50 || UserDodge <=60){
            if(Randomnum %3 == 0)
                return Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 60 || UserDodge <=70){
            if(Randomnum %2.5 == 0)
                return Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 70 || UserDodge <=80){
            if(Randomnum %2 == 0)
                return Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 80 || UserDodge <=90){
            if(Randomnum %1.5 == 0)
                Evade = true;
            else
                return Evade = false;
    }
        if(UserDodge > 90 || UserDodge <=100){
            if(Randomnum %1 == 0)
               return Evade = true;
            else
                return Evade = false;
    }
    return Evade;
    }
    public static boolean EnemyHit(int EnemyHit,int Randomnum) {
        boolean EStrike = false;
        if(Randomnum == 0)
            return EStrike = false;
        else{
        if(EnemyHit > 0 || EnemyHit <=10){
            if(Randomnum %10 == 0)
               return EStrike = true;  
            else
                return EStrike = false;
    }
        if(EnemyHit > 10 || EnemyHit <=20){
            if(Randomnum %9 == 0)
                return EStrike = true;  
            else
                return EStrike = false;
    }
        if(EnemyHit > 20 || EnemyHit <=30){
            if(Randomnum %8 == 0)
                return EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 30 || EnemyHit <=40){
            if(Randomnum %7 == 0)
                return EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 40 || EnemyHit <=50){
            if(Randomnum %6 == 0)
                return EStrike = true;
            else
              return EStrike = false;
    }
        if(EnemyHit > 50 || EnemyHit <=60){
            if(Randomnum %5 == 0)
                return EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 60 || EnemyHit <=70){
            if(Randomnum %4 == 0)
                return EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 70 || EnemyHit <=80){
            if(Randomnum %3 == 0)
                return EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 80 || EnemyHit <=90){
            if(Randomnum %2 == 0)
                EStrike = true;
            else
                return EStrike = false;
    }
        if(EnemyHit > 90 || EnemyHit <=100){
            if(Randomnum %1 == 0)
               return EStrike = true;
            else
                return EStrike = false;
    }
        }
    return EStrike;
    }
     public static boolean EnemyDodge(double EnemyDodge,double Randomnum){
        boolean EnemyEvade = false;
        if(Randomnum == 0)
            return EnemyEvade = false;
        else{
        if(EnemyDodge > 0 || EnemyDodge <=10){
            if(Randomnum %10 == 0)
               return EnemyEvade = true;  
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 10 || EnemyDodge <=20){
            if(Randomnum %9 == 0)
                return EnemyEvade = true;  
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 20 || EnemyDodge <=30){
            if(Randomnum %8 == 0)
                return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 30 || EnemyDodge <=40){
            if(Randomnum %7 == 0)
                return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 40 || EnemyDodge <=50){
            if(Randomnum %6 == 0)
                return EnemyEvade = true;
            else
              return EnemyEvade = false;
    }
        if(EnemyDodge > 50 || EnemyDodge <=60){
            if(Randomnum %5 == 0)
                return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 60 || EnemyDodge <=70){
            if(Randomnum %4 == 0)
                return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 70 || EnemyDodge <=80){
            if(Randomnum %3 == 0)
                return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 80 || EnemyDodge <=90){
            if(Randomnum %2 == 0)
                EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        if(EnemyDodge > 90 || EnemyDodge <=100){
            if(Randomnum %1 == 0)
               return EnemyEvade = true;
            else
                return EnemyEvade = false;
    }
        }
    return EnemyEvade;
    }
}

class ExpereienceCheck{
    //public int ExpCheck(int )
    
}


/**
 *
 * @author Yusif
 */
public class Chances {


    
}
