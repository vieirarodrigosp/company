package br.com.vieirarodrigo.company.business.object;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.company.DTO.CompanyDTO;
import br.com.vieirarodrigo.company.repository.CompanyRepository;
import br.com.vieirarodrigo.company.repository.vo.CompanyVO;

@Component
public class CompanyBO {
	@Autowired
	private CompanyRepository repository;
	public CompanyVO save(CompanyDTO company) {
		return repository.save(CompanyVO.builder()
					.name(company.getName())
					.slug(company.getSlug())
					.created(company.getCreated())
					.build());
	}
	public Optional<CompanyVO> findById(int id) {
		return repository.findById(id);
	}
}