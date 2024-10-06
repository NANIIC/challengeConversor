import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {
    public Moneda buscaMoneda(String monedaAConvertir ){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2ff7392c8ecf59b99207107a/latest/"+moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
            String json = response.body();
            System.out.println(json);
            Moneda miMoneda = busqueda
            System.out.println(miMoneda);
        }catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda");

        }
    }
}
