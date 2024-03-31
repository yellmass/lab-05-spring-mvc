package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart-list")
    public String cartInfo(Model model){

        List<Cart> cartList = cartService.retrieveCartList();

        model.addAttribute("cartList", cartList);

        return "cart/cart-list";
    }


    @RequestMapping("/cart-list/{cartId}")
    public String cartInfo(Model model, @PathVariable UUID cartId){

        List<CartItem> cartItemList = cartService.retrieveCartDetail(cartId);

        model.addAttribute("cartItemList", cartItemList);

        return "cart/cart-detail";
    }

}
