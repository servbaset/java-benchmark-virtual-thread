package app.raiko.benchmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class BenchMarkResource {
  private final RestClient restClient;

  @Autowired
  public BenchMarkResource(RestClient restClient) {
    this.restClient = restClient;
  }

  @GetMapping("/")
  public BenchMarkResponse startOnVirtualThread() {
    var message = restClient.get().retrieve().body(String.class);
    return new BenchMarkResponse(message);
  }
}
