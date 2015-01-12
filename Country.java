import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ADMIN on 1/12/2015.
 */
public class Country {
    private String countryName;
    private String currencyName;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void getCountry() throws IOException {
        System.out.println("Country:: ");
        String str = br.readLine();
        if (str.equals("India")) {
            Rupee rupee = new Rupee();
        }
        if (str.equals("U.K")) {
            Pound pound = new Pound();
        }
        if (str.equals("U.S.A")) {
            Dollar dollar = new Dollar();
        }
    }

}
