package io.github.komidawi.pccbackend.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class SampleRestApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void whenVisitingHelloWorldPage_returnHelloWorld() {
        // given
        String url = "http://localhost:" + port + "/sample/hello";

        // when
        String responseBody = testRestTemplate.getForObject(url, String.class);

        // then
        assertThat(responseBody).isEqualTo("Hello World!");
    }
}
