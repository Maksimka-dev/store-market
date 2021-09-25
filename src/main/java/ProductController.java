

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("catalog/products")
public class ProductController {
    ProductRepository productRepository;


    @GetMapping("list")
    ModelAndView list (){
        return new ModelAndView("catalog/products/list", Map.of("products",
                this.productRepository.findAll() ),HttpStatus.OK);
    }
}

