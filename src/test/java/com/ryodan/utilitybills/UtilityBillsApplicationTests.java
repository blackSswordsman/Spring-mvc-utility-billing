package com.ryodan.utilitybills;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.repository.AccommodationRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
@RequiredArgsConstructor
class UtilityBillsApplicationTests {
    @Autowired
    private final AccommodationRepository accommodationRepository;


    @Test
    void contextLoads() {
    }


//    @Test
//    void testAccomodationRepoGetAll() {
//        List<Accommodation> accomodations = accommodationRepository.getAccommodations();
//        Accommodation accommodation = accomodations.get(0);
//        assertEquals("abc",accommodation.getId(), 1L);
//    }

}
