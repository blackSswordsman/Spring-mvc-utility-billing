package com.ryodan.utilitybills.contoller.rest;

import com.ryodan.utilitybills.pojo.AccommodationType;
import com.ryodan.utilitybills.repository.AccommodationTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accommodationTypes")
@RequiredArgsConstructor
public class AccommodationTypeRestController {
    private final AccommodationTypeRepository accommodationTypeRepository;

    @GetMapping("/{typeId}")
    public ResponseEntity<AccommodationType> getAccommodationTypeById(@PathVariable("typeId") Long id) {
        AccommodationType accommodationType = accommodationTypeRepository.getByPrimaryKey(id, AccommodationType.class);
        return new ResponseEntity<>(accommodationType, HttpStatus.OK);
    }
}
