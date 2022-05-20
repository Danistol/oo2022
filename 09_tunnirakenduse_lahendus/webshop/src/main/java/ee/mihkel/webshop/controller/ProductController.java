package ee.mihkel.webshop.controller;

import ee.mihkel.webshop.model.Product;
import ee.mihkel.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("products")
    public List<Product> getProduct(){
        return strings;
    }

    @Autowired
    ProductRepository productRepository;


    @GetMapping("products/{index}")
    public String getProduct(@PathVariable int index){
        return strings.get(index);

    }

    @DeleteMapping("products/{index}")
    public String deleteProduct(@PathVariable int index){
        return strings.remove(index);
    }

    @DeleteMapping("products")
    public String deleteAllProduct(){
        strings.clear();
        return "Kõik tooted kustutatud";
    }

    @PostMapping("products")
    public void addProduct(@RequestBody String string){
        strings.add(string);
    }

    @PutMapping("products")
    public void editProduct(@PathVariable int index, @RequestBody String string){
        strings.set(index, string);
    }
}
