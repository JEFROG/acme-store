import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { Subscription } from 'rxjs';
import { map, switchMap } from 'rxjs/operators';

import { Product } from "../../entity/product";
import { Page } from "../../entity/page";
import { ProductsService } from "../../control/products.service";
import { ProductPresenter } from "../../control/product.presenter";

@Component({
    selector: 'app-product-table',
    template: `
        <span *ngIf="loading" aria-hidden="true" class="loading-animation loading-animation"></span>
        <app-search-bar></app-search-bar>
        <app-product-table-ui [page]="page"></app-product-table-ui>
    `,
    styles: []
})
export class ProductTableContainer implements OnDestroy, OnInit {
    loading = false;

    page: Page<Product>;

    private _unsubscribe: Subscription = new Subscription();

    constructor(private api: ProductsService, private route: ActivatedRoute, private presenter: ProductPresenter) {
    }

    ngOnInit(): void {

        // load data from resolver, no need to unsubscribe

        this.route.data.subscribe((response: any) => {

            this.page = response.page;

        });

        const searchSub = this.presenter.query$

            .pipe(

                // switch stream to the query request

                switchMap(query => {
                    this.loading = true;
                    return this.api.query(query)

                    // Combine the query and the resolved page to a single object

                    .pipe(map(page => ({query, page})));
            }))
            .subscribe(({query, page}) => {

                // Update the view with the matching information

                if (query.filter) {

                    let items = page.items.filter(item => item.stocked);

                    page.items = items;

                }

                this.page = page;
                this.loading = false;
            });
        this._unsubscribe.add(searchSub);

    }

    ngOnDestroy(): void {
        this._unsubscribe.unsubscribe();
    }
}