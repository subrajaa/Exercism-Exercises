public class LogLevels {

    public static String[] splitLog(String logLine) {
        String[] split = logLine.split(":", 2);
        split[0] = split[0].replaceAll("\\[", "");
        split[0] = split[0].replaceAll("\\]", "");
        split[0] = split[0].toLowerCase();
        split[0] = split[0].trim();
        split[1] = split[1].trim();
        return split;
    }
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        String[] logSplit = splitLog(logLine);
        return logSplit[1];
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        String[] logSplit = splitLog(logLine);
        return logSplit[0];
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        String[] logSplit = splitLog(logLine);
        String reformedLog = logSplit[1] + " (" + logSplit[0] + ")";
        return reformedLog;
    }
}
