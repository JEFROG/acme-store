import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';

import {Product} from "../../entity/product";
import {ProductsService} from "../../control/products.service";

@Component({
	selector: 'app-product-delete',
	template: `

		<app-product-delete-ui [product]="product" (delete)="delete($event)"></app-product-delete-ui>
	`,
	styles: []
})
export class ProductDeleteContainer implements OnDestroy, OnInit {

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

	delete(productId: number): void {

		if(productId !== this.product.id) {

			return;

		}

		const deleteSub = this.api.delete(productId).subscribe({

			next: () => {

				this.router.navigate(['/productsPage']);

			}

		});

		this._unsubscribe.add(deleteSub);
	}

	ngOnDestroy(): void {

		this._unsubscribe.unsubscribe();

	}

}