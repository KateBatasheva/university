package ru.geekbrains.spring.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring.shop.model.DTOs.CartDTO;
import ru.geekbrains.spring.shop.model.DTOs.ProductDTO;
import ru.geekbrains.spring.shop.model.entities.Cart;
import ru.geekbrains.spring.shop.model.entities.Product;
//import ru.geekbrains.spring.shop.repository.CartRepository;

@Service
public class CartService {

     private Cart cart = Cart.getCart();
//     private CartRepository cartRepository;

    public Cart addProduct (Product product){
       cart.getCart().getProducts().add(product);
       return cart;
    }

    public Cart deleteProduct (Product product){
        cart.getCart().getProducts().remove(product);
        return cart;
    }

    public String showCart (){
//    public Page<CartDTO> showCart (){
        CartDTO cartDTO = new CartDTO(cart.getCart());
//        return new PageRequest(0, 10, Sort.by(cartDTO.getName()));
        return cartDTO.toString();
    }

}
