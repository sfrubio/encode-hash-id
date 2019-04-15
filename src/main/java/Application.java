import org.hashids.Hashids;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private final static String SALT = "my-salt";
    private final static String ALPHABET = "ABCDEFGHJKLMNPQRSTUVWXYZ123456789";
    private final static int LENGTH = 8;

    public static void main(String[] args) throws IOException {
        HashIdsConfig hashIdsConfig = new HashIdsConfig(SALT, LENGTH, ALPHABET);
        Hashids hashids = new Hashids(hashIdsConfig.getSalt(), hashIdsConfig.getLength(), hashIdsConfig.getAlphabet());
        System.out.println("Please provide the vehicleId: ");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String vehicleId = reader.readLine();
        System.out.println(hashids.encode(Long.valueOf(vehicleId)));
    }
}
