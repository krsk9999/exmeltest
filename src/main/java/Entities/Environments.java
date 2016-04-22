package Entities;

/**
 * Created by kramirez on 4/9/16.
 */
import Core.Utils;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by msiles on 4/11/15.
 */
public final class Environments {
    private static Map<String, String> envs = new HashMap<String,String>();
    private static String environment;

    static {
        envs.put("qa", "http://localhost/");

    }

    private Environments() {
    }

    public static String get() {
        environment = System.getenv("server");
        System.out.println("Server Environment Value: " + System.getenv("server"));
        String lowerEnv = (environment == null ? Utils.getProperty("api.environment") : environment).toLowerCase();
        return envs.get(lowerEnv);
    }

    public static String get(String environment) {
        return envs.get(environment);
    }

    public static void set(String environment) {
        Environments.environment = environment;
    }
}
