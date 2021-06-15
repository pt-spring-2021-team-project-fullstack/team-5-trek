package com.jackr.trek.jackrtrekproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private TrekTypeRepository trekTypeRepo;

    @MockBean
    private TrekRepository trekRepo;

    @MockBean
    private ContinentRepository continentRepo;

    @MockBean
    private RegionRepository regionRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void trekTypesShouldBeOkAndReturnTrekTypesViewWithTrekTypesModelAttribute() throws Exception {
        mockMvc.perform(get("/trek-types"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("trekTypesView"))
                .andExpect(model().attributeExists("trek-types"));
    }

    @Test
    public void treksShouldBeOkAndReturnTreksViewWithBooksModelAttribute() throws Exception {
        mockMvc.perform(get("/treks"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("treksView"))
                .andExpect(model().attributeExists("treks"));
    }

    @Test
    public void continentsShouldBeOkAndReturnContinentsViewWithContinentsModelAttribute() throws Exception {
        mockMvc.perform(get("/continents"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("continentsView"))
                .andExpect(model().attributeExists("continents"));
    }

    @Test
    public void regionsShouldBeOkAndReturnRegionsViewWithRegionsModelAttribute() throws Exception {
        mockMvc.perform(get("/regions"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("regionsView"))
                .andExpect(model().attributeExists("regions"));
    }

    @Test
    public void shouldBeOkForASingleTrekTypeEndpointWithTrekTypeViewAndTrekTypeModelAttribute() throws Exception {
        TrekType testTrekType = new TrekType("Easy");
        when(trekTypeRepo.findTrekTypeByDifficultyLevel("Easy")).thenReturn(testTrekType);
        mockMvc.perform(get("/trek-types/Easy"))
                .andExpect(status().isOk())
                .andExpect(view().name("trekTypeView"))
                .andExpect(model().attributeExists("trek-type"));
    }

    @Test
    public void shouldBeOkForASingleTrekEndpointWithTrekViewAndTrekModelAttribute() throws Exception {
        TrekType testTrekType = new TrekType("Easy");
        Continent testContinent = new Continent("Antarctica");
        Region testRegion = new Region("Ross Sea");
        Trek testTrek = new Trek("Name", testTrekType, testContinent, testRegion, "Cold", true,
                "ice", "tent", "sled", "skiing", "$500", "3 days", "fun");
        when(trekRepo.findById(1L)).thenReturn(java.util.Optional.of(testTrek));
        mockMvc.perform(get("/treks/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("trekView"))
                .andExpect(model().attributeExists("trek"));
    }
}
