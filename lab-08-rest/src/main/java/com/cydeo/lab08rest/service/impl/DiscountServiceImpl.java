package com.cydeo.lab08rest.service.impl;

import com.cydeo.lab08rest.dto.DiscountDTO;
import com.cydeo.lab08rest.entity.Discount;
import com.cydeo.lab08rest.mapper.MapperUtil;
import com.cydeo.lab08rest.repository.DiscountRepository;
import com.cydeo.lab08rest.service.DiscountService;
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
    public List<DiscountDTO> listAllDiscountByName(String name) {
        return null;
    }

    @Override
    public DiscountDTO updateDiscount(DiscountDTO dto) {
        return null;
    }

    @Override
    public DiscountDTO createDiscount(DiscountDTO dto) {
        return null;
    }
}
