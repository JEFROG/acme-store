import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import {  mergeMap, take } from 'rxjs/operators';

var of = require('rxjs/observable/of').of
var EMPTY = require('rxjs/observable/empty').empty;


import { Product } from '../entity/product';
import { ProductsService } from './products.service';

@Injectable()
export class PageResolver implements Resolve<Product[]> {

    constructor(private api: ProductsService) {
    }

    resolve(

        route: ActivatedRouteSnapshot,

        state: RouterStateSnapshot

    ): Observable<any> | Promise<any> | any {

        return this.api.getPage().pipe(

            take(1),

            mergeMap(page => {

                if (page) {

                    return of(page);

                } else {

                    return EMPTY;

                }

            })

        );

    }

}
