package br.com.vieirarodrigo.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.company.repository.vo.CompanyVO;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyVO, Integer>{ }