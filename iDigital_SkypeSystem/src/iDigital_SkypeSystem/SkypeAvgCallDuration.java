package iDigital_SkypeSystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

class SkypeCall{
    public static int call_id;
    public static long starttime;
    public long endtime;
    long duration;
    
    public long calculate_duration(long starttime, long endtime) throws Exception {
        if(starttime>endtime) {
            throw new Exception("Endtime cannot be before starttime");
        }
        duration=endtime-starttime;
         return duration;
    }
    
}
public class SkypeAvgCallDuration {

    private static final String KEY = "today";
     
    public static int total_sessions=0;
    public static  int total_duration=0;
    public int avgDurationperDay;
    HashMap<String, LinkedHashMap<Integer, SkypeCall>> sessions;
    Random rand = new Random();
    
    public SkypeAvgCallDuration() {
        sessions = new HashMap<>();
        avgDurationperDay=0;
    }
    public SkypeCall makeACall() {
        System.out.println("Call has started....");
        SkypeCall skypecall = new SkypeCall();
         SkypeCall.call_id= rand.nextInt(1);
         SkypeCall.starttime = System.currentTimeMillis();
            LinkedHashMap<Integer, SkypeCall> sess = sessions.get(KEY);
            if (sess == null) {
                sess = new LinkedHashMap<>();
            }
            sess.put(SkypeCall.call_id, skypecall);
            sessions.put(KEY, sess);
            //update total session
            total_sessions += 1;
            return skypecall;    
    }
    
    public void endCall(int call_id) throws Exception {
        LinkedHashMap<Integer, SkypeCall> sess = sessions.get(KEY);
        // find the call with id
        SkypeCall skypecall = sess.get(call_id);
        // update the end time and duration
        skypecall.endtime = System.currentTimeMillis();
        skypecall.duration = skypecall.calculate_duration(skypecall.starttime, skypecall.endtime);
        System.out.println("Call Disconnected");
        total_duration += total_duration + skypecall.duration; 
    }
    
    public int calculate_avg() { 
        avgDurationperDay = total_duration / total_sessions;
        return avgDurationperDay;
    }
    
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        while(true) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Welcome! Please select a option:");
        System.out.println("1.) Make a Call");
        System.out.println("2.) Calculate Average Call Duration");
        System.out.println("3.) Exit");
        
        int choice=sc.nextInt();
        
        SkypeAvgCallDuration obj=new SkypeAvgCallDuration();
        boolean isExited = false;
     
        switch(choice) {
        case 1:
            SkypeCall call= obj.makeACall();
            System.out.println("Enter \"end\" to disconnect the call");
            String option=sc.next();
            switch(option) {
            case "end":
                obj.endCall(call.call_id);

            }
            break;
        case 2:
            if(total_sessions==0) {
            System.out.println("No call has been made yet.");
            }
            else {
            int temp=(obj.calculate_avg());
            System.out.println("Call Duration: "+temp/1000+"seconds");
            }
            break;
            
        case 3:
            isExited = true;
            System.out.println("Exited Successfully. Thank You");
        default:
            break;
        }

        if (isExited) {
            isExited = false;
            break;
        } else
            continue;
  
        }

    }

}
 