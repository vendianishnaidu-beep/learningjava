package day4;

public class MethodsExample {

    static void main() {

        showGreetings("Krish");
        int sumRes = sum(90, 60);
        System.out.println(sumRes);
        int big = biggest(3,4,2);
        System.out.println(big);
        showSystemInfo();

    }
    private static void showGreetings(String name){
        System.out.println("Hi "+name+", \n\n\t Welcome to java world");
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }

    private static int biggest(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else if(num2 > num3 ){
            return num2;
        }else{
            return num3;
        }
    }

    private static void showSystemInfo() {
        System.out.println("========== SYSTEM INFORMATION ==========");

        // Operating system
        System.out.println("OS Name         : " + System.getProperty("os.name"));
        System.out.println("OS Version      : " + System.getProperty("os.version"));
        System.out.println("OS Architecture : " + System.getProperty("os.arch"));

        // Java runtime
        System.out.println("Java Version    : " + System.getProperty("java.version"));
        System.out.println("Java Vendor     : " + System.getProperty("java.vendor"));
        System.out.println("Java Home       : " + System.getProperty("java.home"));

        // User details
        System.out.println("User Name       : " + System.getProperty("user.name"));
        System.out.println("User Home       : " + System.getProperty("user.home"));
        System.out.println("Working Dir     : " + System.getProperty("user.dir"));

        // Hardware / memory
        Runtime runtime = Runtime.getRuntime();
        long mb = 1024 * 1024;
        System.out.println("CPU Cores       : " + runtime.availableProcessors());
        System.out.println("Max Memory      : " + runtime.maxMemory() / mb + " MB");
        System.out.println("Total Memory    : " + runtime.totalMemory() / mb + " MB");
        System.out.println("Free Memory     : " + runtime.freeMemory() / mb + " MB");

        System.out.println("========================================");
    }

}
