package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest
public class BerrRestControllerIT extends BaseIT{

    @Test
    void findBeer() throws Exception {
        mockMvc.perform(get("/api/v1/beer"))
                .andExpect(status().isOk());
    }

    @Test
    void findBerrById() throws Exception {
        mockMvc.perform(get("/api/v1/beer/spring"))
                .andExpect(status().isOk());
    }
}
