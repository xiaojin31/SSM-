package util;

public class DBContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setDataSource(String dbType){
        contextHolder.set(dbType);
    }
    public static String getDataSource(){
        return ((String) contextHolder.get());
    }
    public static void clearDataSource(){
        contextHolder.remove();
    }
}
