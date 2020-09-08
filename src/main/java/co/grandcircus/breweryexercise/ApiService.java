package co.grandcircus.breweryexercise;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiService {

	RestTemplate rt;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	public List<Brewery> getAllBreweries(){
		String url = "https://api.openbrewerydb.org/breweries";
		Brewery[] breweries = rt.getForObject(url, Brewery[].class);
		return Arrays.asList(breweries);
	}
	

	public Brewery getBreweryById(Integer id) {
		String url = "https://api.openbrewerydb.org/breweries/" + id;
		
		return rt.getForObject(url, Brewery.class);
	}
	
	

}
