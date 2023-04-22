package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry,Long> {

}
