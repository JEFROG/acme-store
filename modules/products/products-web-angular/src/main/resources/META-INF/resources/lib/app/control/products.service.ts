import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CrudService } from './crud.service';
import { Product } from '../entity/product';
import { config } from "../config";

@Injectable()
export class ProductsService extends CrudService<Product, number> {

    constructor(protected http: HttpClient) {

        super(http, `${config.apiUrl}`);

    }
}
