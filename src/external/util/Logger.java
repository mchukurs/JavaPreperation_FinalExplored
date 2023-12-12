package external.util;

import java.time.LocalDateTime;

public class Logger {
    public static void logToConsole(CharSequence message){
        LocalDateTime dt =LocalDateTime.now();
        System.out.printf("%1$tD %1$tT : %2$s%n",dt,message);
        //$ 12.12.2023 12:24:30  : textPassed
        //
        if(message instanceof StringBuilder sb){
            sb.setLength(0);
        }




    }
}
