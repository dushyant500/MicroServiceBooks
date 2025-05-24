package com.issuer.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.issuer.model.IssuerMO;
import com.issuer.model.IssuerMoCompositeKey;

@Repository
public interface IssuerRepositry extends JpaRepository<IssuerMO,IssuerMoCompositeKey>{

}
