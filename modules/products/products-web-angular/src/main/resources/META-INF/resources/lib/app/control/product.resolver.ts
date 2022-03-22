import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { catchError, mergeMap, take } from 'rxjs/operators';

var of = require('rxjs/observable/of').of
var EMPTY = require('rxjs/observable/empty').empty;

import { Product } from '../entity/product';
import { ProductsService } from "./products.service";

@Injectable()
export class ProductResolver implements Resolve<Product> {

    constructor(private api: ProductsService) {
    }

    resolve(

        route: ActivatedRouteSnapshot,

        state: RouterStateSnapshot

    ): Observable<any> | Promise<any> | any {

        const productId = Number(route.paramMap.get('productId'));

        return this.api.get(productId).pipe(

            take(1),

            mergeMap(product => {

                if (product) {

                    return of(product);

                } else {

                    return EMPTY;

                }

            }),

            catchError(error => {

                return EMPTY;

            })

        );

    }

}
