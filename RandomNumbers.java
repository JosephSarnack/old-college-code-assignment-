/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package purge;

import java.text.DecimalFormat;
import java.util.Random;

 class Rand{
    public static int Randnum(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
       // double randomNum = rand.nextDouble((max - min) + 1) * s.nextDouble();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        DecimalFormat df = new DecimalFormat("#.00");
      //  df.format(randomNum);
       // randomNum = Math.floor(randomNum * 100) / 100;
        return randomNum;
    }
}


/**
 *
 * @author yusif
 */
class RandomNumbers {
    
}
