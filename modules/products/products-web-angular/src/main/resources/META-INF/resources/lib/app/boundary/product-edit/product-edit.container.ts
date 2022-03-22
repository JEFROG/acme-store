import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';

import {Product} from "../../entity/product";
import {ProductsService} from "../../control/products.service";

@Component({
	selector: 'app-product-edit',
	template: `

		<app-product-edit-ui [product]="product" (update)="update($event)"></app-product-edit-ui>
	`,
	styles: []
})
export class ProductEditContainer implements OnDestroy, OnInit {

	product: Product;

	private _unsubscribe: Subscription = new Subscription();

	constructor(private route: ActivatedRoute, private router:Router, private api: ProductsService) {
	}

	ngOnInit(): void {

		// load data from resolver, no need to unsubscribe

		this.route.data.subscribe((response: any) => {

			this.product = response.product;

		});

	}

	update(product: Product): void {

		const updateSub = this.api.update(this.product.id, product).subscribe({

			next: (updated: Product) => {

				this.router.navigate(['/productsPage']);

			}

		});

		this._unsubscribe.add(updateSub);

	}

	ngOnDestroy(): void {

		this._unsubscribe.unsubscribe();

	}

}