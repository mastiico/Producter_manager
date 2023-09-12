package br.com.marcio.productms.service;

import br.com.marcio.productms.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<ProductDTO> create(ProductDTO request);

    List<ProductDTO> getAll();

    Optional<ProductDTO> getById(Long id);

    boolean inactive(Long id);

    boolean actived(Long id);

    Optional<ProductDTO> update(Long id, ProductDTO request);
}
