package br.com.vieirarodrigo.company.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.company.DTO.CompanyDTO;
import br.com.vieirarodrigo.company.business.object.CompanyBO;
import br.com.vieirarodrigo.company.repository.vo.CompanyVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class CompanyController {
	@Autowired
	private CompanyBO companyBO;
	@ApiOperation(value="This service creates a new Company in the database.")
	@PostMapping(path = "/v1/Companys")
	public @ResponseBody CompanyVO save(@RequestBody CompanyDTO Company) {
		return companyBO.save(Company);
	}
	@ApiOperation(value="This service seeks to Company by CompanyId.")
	@GetMapping(path = "/v1/Companys/{id}")
	public @ResponseBody Optional<CompanyVO> findByCompanyId(@PathVariable int id) {
		return companyBO.findById(id);
	}
}