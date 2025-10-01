package com.ankit.mgvector.services;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import com.ankit.mgvector.response.EmbeddingResponse;
import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Mono;

/**
 * @author Ankit.Kumar
 * @since 16-01-2025
 */
public class XAIService {
  private static final String X_API_URL = "https://api.x.com";

  @Value("${spring.ai.x.api-key}")
  private String XAI_API_KEY;

  private WebClient webClient;

  @PostConstruct
  void init() {
    this.webClient = WebClient.builder().clientConnector(new ReactorClientHttpConnector())
        .baseUrl(X_API_URL)
        .defaultHeader("Content-Type", org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader("Authorization", "Bearer" + XAI_API_KEY).build();
  }

  public Mono<List<Double>> ceateEmbedding(String text) {
    Map<String, Object> body = Map.of("model", "text-embedding-ada-002");
    return webClient.post().uri("/v1/embeddings").bodyValue(body).retrieve()
        .bodyToMono(EmbeddingResponse.class).map(EmbeddingResponse::getEmbedding);
  }
}
