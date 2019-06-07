package com.farzoom.lime.adapter.cbs.config;

import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EsConfig {
    @Bean
    public EsRepository esRepository(AppConfig config) {
        return new EsRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public AddressRepository addressRepository(AppConfig config) {
        return new AddressRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public CommentRepository commentRepository(AppConfig config) {
        return new CommentRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public CompanyBuhRepository companyBuhRepository(AppConfig config) {
        return new CompanyBuhRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public CompanyRepository companyRepository(AppConfig config) {
        return new CompanyRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public ContractRepository contractRepository(AppConfig config) {
        return new ContractRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public OrderRepository orderRepository(AppConfig config) {
        return new OrderRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public PersonRepository personRepository(AppConfig config) {
        return new PersonRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public ProductRepository productRepository(AppConfig config) {
        return new ProductRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public RelationRepository relationRepository(AppConfig config) {
        return new RelationRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public WorkGroupRepository workGroupRepository(AppConfig config) {
        return new WorkGroupRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public ScoringRepository scoringRepository(AppConfig config) {
        return new ScoringRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public AttributeRepository attributeRepository(AppConfig config) {
        return new AttributeRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public GroupRepository groupRepository(AppConfig config) {
        return new GroupRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public ParamRepository paramRepository(AppConfig config) {
        return new ParamRepository(config.getElasticsearchBaseUrl());
    }

    @Bean
    public RefService refService(EsRepository esRepository) {
        return new RefServiceImpl(esRepository);
    }

    @Bean
    public GenParamService genParamService(
            AttributeRepository attributeRepository,
            GroupRepository groupRepository,
            ParamRepository paramRepository,
            RefService refService
    ) {
        return new GenParamServiceImpl(attributeRepository, groupRepository, paramRepository, refService);
    }
}