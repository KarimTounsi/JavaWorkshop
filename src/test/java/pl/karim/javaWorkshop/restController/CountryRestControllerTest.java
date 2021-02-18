package pl.karim.javaWorkshop.restController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import pl.karim.javaWorkshop.country.repository.CountryRepository;
import pl.karim.javaWorkshop.country.service.CountryService;
import pl.karim.javaWorkshop.country_language.service.CountryLanguageService;
import pl.karim.javaWorkshop.exceptions.ObjectNotFoundException;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CountryRestController.class)
@AutoConfigureMockMvc(addFilters = false)
class CountryRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CountryService countryService;
    @MockBean
    private CountryRepository countryRepository;
    @MockBean
    private CountryLanguageService countryLanguageService;

    private String code;

    @BeforeEach
    void init() {
      code = "AAA";
    }

    @Test
    void shouldReturn500WhenObjectFindByCodeNotFound() throws Exception {
        when(countryService.getByCode(code)).thenThrow(ObjectNotFoundException.class);
        mockMvc.perform(get("/{code}", code))
                .andExpect(status().isInternalServerError());
    }


}