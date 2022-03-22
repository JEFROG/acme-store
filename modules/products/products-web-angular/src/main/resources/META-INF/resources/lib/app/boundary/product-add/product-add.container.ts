import { Component, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';

import { Product } from "../../entity/product";
import { ProductsService } from "../../control/products.service";

@Component({
	selector: 'app-product-add',
	template: `

		<app-product-add-ui (add)="add($event)"></app-product-add-ui>
		
	`,
	styles: []
})
export class ProductAddContainer implements OnDestroy {

	private _unsubscribe: Subscription = new Subscription();

	constructor(private router:Router, private api: ProductsService) {
	}

	/**
	 * Gets emitted output from product-add-component and then
	 * sends request to api to add a new product.  Navigates to
	 * the main product table
	 * @param product
	 */
	add(product: Product): void {

		// subscribe to the api

		const addSub = this.api.post(product).subscribe({

			next: (added: Product) => {

				// route to main page

				this.router.navigate(['/productsPage']);

			}

		});

		// add this local subscription to the main subscription

		this._unsubscribe.add(addSub);

	}

	ngOnDestroy(): void {

		// unregister the subscription

		this._unsubscribe.unsubscribe();

	}

}