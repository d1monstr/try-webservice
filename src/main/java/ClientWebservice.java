import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;


public class ClientWebservice {

    static String sURL = "https://speller.yandex.net/services/spellservice";

    public static void main(String[] args) {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(sURL + "/checkTexts?text=синхрафазатрон&text=в+дубне");

        try {
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            System.out.println(EntityUtils.toString(response1.getEntity()));
            response1.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
