import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  message: string;
  products: string;

  constructor(private productService: ProductService) {
    this.getProducts();
   }

  getProducts() {
    this.productService.getData().subscribe(response => {
      console.log(response);
      this.products = response;
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
