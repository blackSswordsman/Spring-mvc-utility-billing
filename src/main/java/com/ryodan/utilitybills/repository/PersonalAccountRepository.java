package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.PersonalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalAccountRepository extends JpaRepository<PersonalAccount,Long> {
}
