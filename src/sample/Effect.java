/*
James Kahle

The effect class is used to denote which stat will be affected
and by how much it will be effected.

Acceptable targets are 
CLG_LOY  clergy loyalty
CLG_INF  cleagy influence
NOB_LOY  nobility
NOB_INF
COM_LOY  commoners
COM_INF
WLTH     wealth
ARMY     army strength
HLTH     personal health

*/
package sample;
import java.util.*;

public class Effect {
   private String target;
   private int value;
   
   public Effect(String target, int value) {
      this.target = target;
      this.value = value;
   }
   
   public String getTarget() {
      return target;
   }
   
   public int getValue() {
      return value;
   }
}