package com.cydeo.lab09rest.service.impl;

import com.cydeo.lab09rest.dto.DiscountDTO;
import com.cydeo.lab09rest.entity.Discount;
import com.cydeo.lab09rest.exception.DiscountNotFoundException;
import com.cydeo.lab09rest.mapper.MapperUtil;
import com.cydeo.lab09rest.repository.DiscountRepository;
import com.cydeo.lab09rest.service.DiscountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepository discountRepository;
    private final MapperUtil mapperUtil;

    public DiscountServiceImpl(DiscountRepository discountRepository, MapperUtil mapperUtil) {
        this.discountRepository = discountRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<DiscountDTO> listAllDiscount() {

        List<Discount> discounts =discountRepository.findAll();
        return discounts.stream().map(discount -> mapperUtil.convert(discount,new DiscountDTO())).collect(Collectors.toList());
    }

    @Override
    public DiscountDTO listAllDiscountByName(String name) {
        Discount discounts =discountRepository.findFirstByName(name);
        return mapperUtil.convert(discounts,new DiscountDTO());
    }

    @Override
    public DiscountDTO updateDiscount(DiscountDTO dto) {
        Discount find = discountRepository.findById(dto.getId()).orElseThrow(() -> new DiscountNotFoundException("No Discount Found!"));
        Discount convert = mapperUtil.convert(dto,new Discount());
        convert.setId(find.getId());
        discountRepository.save(convert);
        return dto;
    }

    @Override
    public DiscountDTO createDiscount(DiscountDTO dto) {
        discountRepository.save(mapperUtil.convert(dto,new Discount()));
        return dto;
    }
}
